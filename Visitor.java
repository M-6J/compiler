import java.util.Objects;

public class Visitor extends lab2BaseVisitor<Void> {
    public int n = 1;

    @Override
    public Void visitCompUnit(lab2Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(lab2Parser.FuncDefContext ctx) {
        System.out.print("define dso_local i32 @main()");
        visit(ctx.block());
        return null;
    }

    @Override
    public Void visitFuncType(lab2Parser.FuncTypeContext ctx) {
        return super.visitFuncType(ctx);
    }

    @Override
    public Void visitIdent(lab2Parser.IdentContext ctx) {
        return super.visitIdent(ctx);
    }

    @Override
    public Void visitBlock(lab2Parser.BlockContext ctx) {
        System.out.println(" {");
        visit(ctx.stmt());
        System.out.println("}");
        return null;
    }

    @Override
    public Void visitStmt(lab2Parser.StmtContext ctx) {
        visit(ctx.exp());
        System.out.println("\tret i32 %" + (n - 1));
        return null;
    }

    @Override
    public String visitExp(lab2Parser.ExpContext ctx) {
        return visitAddExp(ctx.addExp());
    }

    @Override
    public String visitAddExp(lab2Parser.AddExpContext ctx) {
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
    public Void visitAdd_Sub(lab2Parser.Add_SubContext ctx) {
        return super.visitAdd_Sub(ctx);
    }

    @Override
    public String visitMulExp(lab2Parser.MulExpContext ctx) {
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
    public Void visitMul_Div(lab2Parser.Mul_DivContext ctx) {
        return super.visitMul_Div(ctx);
    }

    @Override
    public String visitUnaryExp(lab2Parser.UnaryExpContext ctx) {
        if (ctx.children.size() == 1) {
            return visitPrimaryExp(ctx.primaryExp());
        } else {
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
        }
        return null;
    }

    @Override
    public String visitPrimaryExp(lab2Parser.PrimaryExpContext ctx) {
        if (ctx.number() != null) {
            return String.valueOf(visit(ctx.number()));
        } else {
            return String.valueOf(visit(ctx.exp()));
        }
    }

    @Override
    public String visitNumber(lab2Parser.NumberContext ctx) {

        if (ctx.Decimal_const() != null) {
            return ctx.Decimal_const().getText();
        } else if (ctx.Octal_const() != null) {
            String oct = ctx.Octal_const().getText().substring(1);
            return String.valueOf(Integer.parseInt(oct, 8));
        } else {
            String hex = ctx.Hexadecimal_const().toString().substring(2);
            return String.valueOf(Integer.parseInt(hex, 16));
        }
    }

}
