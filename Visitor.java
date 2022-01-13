public class Visitor extends lab1BaseVisitor<Void>{
    @Override
    public Void visitCompUnit(lab1Parser.CompUnitContext context){
        return super.visitCompUnit(context);
    }
    public Void visitFuncDef(lab1Parser.FuncDefContext context){
        System.out.printf("define dso_local i32 @main()");
        return super.visitFuncDef(context);
    }

    public Void visitBlock(lab1Parser.BlockContext context){
        System.out.println("{");
        visit(context.stmt());
        System.out.println("\n}");
        return null;
    }
    public Void visitStmt(lab1Parser.StmtContext context){
        System.out.print("\tret ");
        return super.visitStmt(context);
    }

    public Void visitNumber(lab1Parser.NumberContext context){

        int number = 0;
        if (context.Decimal_const() != null) {
            number = Integer.parseInt(context.Decimal_const().toString());
        }
        else if (context.Octal_const() != null) {
            String oct = context.Octal_const().toString();
            number = Integer.valueOf(oct,8);
        }
        else {
            String hex = context.Hexadecimal_const().toString().substring(2);
            number = Integer.valueOf(hex,16);
        }
        System.out.print("i32 " + number);
        return super.visitNumber(context);
    }
}
