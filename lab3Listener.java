// Generated from C:/Users/jmk07/Desktop/lab3\lab3.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lab3Parser}.
 */
public interface lab3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lab3Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(lab3Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(lab3Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(lab3Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(lab3Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(lab3Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(lab3Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(lab3Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(lab3Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(lab3Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(lab3Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(lab3Parser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(lab3Parser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(lab3Parser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(lab3Parser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(lab3Parser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(lab3Parser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(lab3Parser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(lab3Parser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(lab3Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(lab3Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(lab3Parser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(lab3Parser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(lab3Parser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(lab3Parser.InitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(lab3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(lab3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(lab3Parser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(lab3Parser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(lab3Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(lab3Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(lab3Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(lab3Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(lab3Parser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(lab3Parser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(lab3Parser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(lab3Parser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(lab3Parser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(lab3Parser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(lab3Parser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(lab3Parser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(lab3Parser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(lab3Parser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(lab3Parser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(lab3Parser.FuncRParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#add_Sub}.
	 * @param ctx the parse tree
	 */
	void enterAdd_Sub(lab3Parser.Add_SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#add_Sub}.
	 * @param ctx the parse tree
	 */
	void exitAdd_Sub(lab3Parser.Add_SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#mul_Div}.
	 * @param ctx the parse tree
	 */
	void enterMul_Div(lab3Parser.Mul_DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#mul_Div}.
	 * @param ctx the parse tree
	 */
	void exitMul_Div(lab3Parser.Mul_DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link lab3Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(lab3Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link lab3Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(lab3Parser.NumberContext ctx);
}