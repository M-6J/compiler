public class Visitor extends lab3BaseVisitor<Void> {
    public int n = 1;
    public boolean isconst = false;

    @Override
    public Void visitCompUnit(lab3Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(lab3Parser.FuncDefContext ctx) {
        System.out.println("declare i32 @getint()");
        System.out.println("declare void @putint(i32)");
        System.out.println("declare i32 @getch()");
        System.out.println("declare void @putch(i32)");
        System.out.print("define dso_local i32 @main()");
        visit(ctx.block());
        return null;
    }

    @Override
    public Void visitFuncType(lab3Parser.FuncTypeContext ctx) {
        return super.visitFuncType(ctx);
    }

    @Override
    public Void visitIdent(lab3Parser.IdentContext ctx) {
        return super.visitIdent(ctx);
    }

    @Override
    public Void visitDecl(lab3Parser.DeclContext ctx) {
        if (ctx.constDecl() != null) {
            isconst = true;
            visit(ctx.constDecl());
            isconst = false;
        } else {
            visit(ctx.varDecl());
        }
        return null;
    }

    @Override
    public Void visitConstDecl(lab3Parser.ConstDeclContext ctx) {
        return super.visitConstDecl(ctx);
    }

    @Override
    public Void visitConstDef(lab3Parser.ConstDefContext ctx) {
        System.out.println("\t%" + n + " = alloca i32");
        String ident = ctx.Digit_const().getText();
        if (VarList.getInstance().getVar(ident) != null) {
            System.exit(-1);
        }
        Var var = new Var();
        var.setName(ident);
        var.setNum("%" + n);
        var.setInit(true);
        var.setIsconst(true);
        VarList list = VarList.getInstance();
        list.add(var);
        n++;
        String temp = visitConstInitVal(ctx.constInitVal());
        String loc = list.getVar(ctx.Digit_const().getText()).getNum();
        System.out.println("\tstore i32 " + temp + ", i32* " + loc);
        return null;
    }

    @Override
    public String visitConstInitVal(lab3Parser.ConstInitValContext ctx) {
        return visitConstExp(ctx.constExp());
    }

    @Override
    public String visitConstExp(lab3Parser.ConstExpContext ctx) {
        return visitAddExp(ctx.addExp());
    }

    @Override
    public Void visitVarDecl(lab3Parser.VarDeclContext ctx) {
        return super.visitVarDecl(ctx);
    }

    @Override
    public Void visitVarDef(lab3Parser.VarDefContext ctx) {
       if(ctx.initVal() == null) {
                System.out.println("\t%" + n + " = alloca i32");
                String ident = ctx.Digit_const().getText();
                if (VarList.getInstance().getVar(ident) != null) {
                    System.exit(-1);
                }
                Var var = new Var();
                var.setName(ident);
                var.setNum("%" + n);
                var.setIsconst(false);
                var.setInit(false);
                VarList list = VarList.getInstance();
                list.add(var);
                n++;
       } else {
                System.out.println("\t%" + n + " = alloca i32");
                String ident = ctx.Digit_const().getText();
                if (VarList.getInstance().getVar(ident) != null) {
                    System.exit(-1);
                }
                Var var = new Var();
                var.setName(ident);
                var.setNum("%" + n);
                var.setInit(true);
                var.setIsconst(false);
                VarList list = VarList.getInstance();
                list.add(var);
                n++;
                String temp = visitInitVal(ctx.initVal());
                String loc = list.getVar(ctx.Digit_const().getText()).getNum();
                System.out.println("\tstore i32 " + temp + ", i32* " + loc);
        }
        return null;
    }

    @Override
    public String visitInitVal(lab3Parser.InitValContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public Void visitBlock(lab3Parser.BlockContext ctx) {
        System.out.println(" {");
        for (lab3Parser.BlockItemContext e : ctx.blockItem()) {
            visit(e);
        }
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitBlockItem(lab3Parser.BlockItemContext ctx) {
        return super.visitBlockItem(ctx);
    }

    @Override
    public Void visitStmt(lab3Parser.StmtContext ctx) {
        if (ctx.lVal() != null) {
            String s = visitExp(ctx.exp());
            VarList list = VarList.getInstance();
            if (list.getVar(ctx.lVal().getText()).isIsconst() && list.getVar(ctx.lVal().getText()).isInit()) {
                System.exit(-1);
            }
            list.getVar(ctx.lVal().getText()).setInit(true);
            System.out.println("\tstore i32 " + s + ", i32* " + list.getVar(ctx.lVal().getText()).getNum());
        } else if (ctx.getText().startsWith("return")) {
            String s = visitExp(ctx.exp());
            System.out.println("\tret i32 " + s);
        } else {
            if (ctx.exp() != null) {
                visit(ctx.exp());
            }
        }
        return null;
    }

    @Override
    public String visitLVal(lab3Parser.LValContext ctx) {
        Var var = VarList.getInstance().getVar(ctx.getText());
        if (!var.isIsconst() && isconst) {
            System.exit(-1);
        }
        if (var.isInit()) {
            System.out.println("\t%" + n + " = load i32, i32* " + var.getNum());
            n++;
        }
        return "%" + (n - 1);
    }

    @Override
    public String visitExp(lab3Parser.ExpContext ctx) {
        return visitAddExp(ctx.addExp());
    }

    @Override
    public String visitAddExp(lab3Parser.AddExpContext ctx) {
        if (ctx.children.size() == 1) {
            return visitMulExp(ctx.mulExp());
        } else {
            String left = visitAddExp(ctx.addExp());
            String right = visitMulExp(ctx.mulExp());
            switch (ctx.add_Sub().getText()) {
                case "+": {
                    System.out.println("\t%" + n + " = add i32 " + left + ", " + right);
                    n++;
                    return "%" + (n - 1);
                }
                case "-": {
                    System.out.println("\t%" + n + " = sub i32 " + left + ", " + right);
                    n++;
                    return "%" + (n - 1);
                }
                default:
                    System.exit(1);
                    break;
            }
        }
        return null;
    }

    @Override
    public String visitMulExp(lab3Parser.MulExpContext ctx) {
        if (ctx.children.size() == 1) {
            return visitUnaryExp(ctx.unaryExp());
        } else {
            String left = visitMulExp(ctx.mulExp());
            String right = visitUnaryExp(ctx.unaryExp());
            switch (ctx.mul_Div().getText()) {
                case "*": {
                    System.out.println("\t%" + n + " = mul i32 " + left + ", " + right);
                    n++;
                    return "%" + (n - 1);
                }
                case "/": {
                    System.out.println("\t%" + n + " = sdiv i32 " + left + ", " + right);
                    n++;
                    return "%" + (n - 1);
                }
                case "%": {
                    System.out.println("\t%" + n + " = srem i32 " + left + ", " + right);
                    n++;
                    return "%" + (n - 1);
                }
            }
        }
        return null;
    }

    @Override
    public String visitUnaryExp(lab3Parser.UnaryExpContext ctx) {
        if (ctx.children.size() == 1) {
            return visitPrimaryExp(ctx.primaryExp());
        } else if (ctx.children.size() == 2) {
            String right = visitUnaryExp(ctx.unaryExp());
            switch (ctx.add_Sub().getText()) {
                case "+": {
                    System.out.println("\t%" + n + " = add i32 0, " + right);
                    n++;
                    return "%" + (n - 1);
                }
                case "-": {
                    System.out.println("\t%" + n + " = sub i32 0, " + right);
                    n++;
                    return "%" + (n - 1);
                }
            }
        } else {
            if (ctx.Digit_const() != null) {
                String s = ctx.Digit_const().getText();
                switch (s) {
                    case "getint":
                        System.out.println("\t%" + n + " = call i32 @getint()");
                        n++;
                        return "%" + (n - 1);
                    case "putint": {
                        String tt = visitFuncRParams(ctx.funcRParams());
                        System.out.println("\tcall void @putint(i32 " + tt + ")");
                        return null;
                    }
                    case "getch":
                        System.out.println("\t%" + n + " = call i32 @getch()");
                        n++;
                        return "%" + (n - 1);
                    case "putch": {
                        String tt = visitFuncRParams(ctx.funcRParams());
                        System.out.println("\tcall void @putch(i32 " + tt + ")");
                        return null;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String visitFuncRParams(lab3Parser.FuncRParamsContext ctx) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < ctx.exp().size(); i++) {
            s.append(visitExp(ctx.exp(i)));
        }
        return s.toString();
    }

    @Override
    public String visitPrimaryExp(lab3Parser.PrimaryExpContext ctx) {
        switch (ctx.children.size()) {
            case 1:
                if (ctx.number() != null) {
                    return String.valueOf(visit(ctx.number()));
                } else {
                    return visitLVal(ctx.lVal());
                }
            case 3:
                return visitExp(ctx.exp());
        }
        return null;
    }

    @Override
    public String visitNumber(lab3Parser.NumberContext ctx) {
        if (ctx.Decimal_const() != null) {
            return ctx.Decimal_const().getText();
        } else if (ctx.Octal_const() != null) {
            if (ctx.Octal_const().getText().equals("0")) {
                return "0";
            } else {
                String oct = ctx.Octal_const().getText().substring(1);
                return String.valueOf(Integer.parseInt(oct, 8));
            }
        } else {
            String hex = ctx.Hexadecimal_const().toString().substring(2);
            return String.valueOf(Integer.parseInt(hex, 16));
        }
    }
}