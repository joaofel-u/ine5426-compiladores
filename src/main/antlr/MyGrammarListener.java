// Generated from /home/joao/ine5426-compiladores/src/main/antlr/MyGrammar.g4 by ANTLR 4.9.1

    package main.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#funclist}.
	 * @param ctx the parse tree
	 */
	void enterFunclist(MyGrammarParser.FunclistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#funclist}.
	 * @param ctx the parse tree
	 */
	void exitFunclist(MyGrammarParser.FunclistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#funclistaux}.
	 * @param ctx the parse tree
	 */
	void enterFunclistaux(MyGrammarParser.FunclistauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#funclistaux}.
	 * @param ctx the parse tree
	 */
	void exitFunclistaux(MyGrammarParser.FunclistauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(MyGrammarParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(MyGrammarParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(MyGrammarParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(MyGrammarParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#paramlistaux}.
	 * @param ctx the parse tree
	 */
	void enterParamlistaux(MyGrammarParser.ParamlistauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#paramlistaux}.
	 * @param ctx the parse tree
	 */
	void exitParamlistaux(MyGrammarParser.ParamlistauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(MyGrammarParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(MyGrammarParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#vardeclaux}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaux(MyGrammarParser.VardeclauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#vardeclaux}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaux(MyGrammarParser.VardeclauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#vartype}.
	 * @param ctx the parse tree
	 */
	void enterVartype(MyGrammarParser.VartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#vartype}.
	 * @param ctx the parse tree
	 */
	void exitVartype(MyGrammarParser.VartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void enterAtribstat(MyGrammarParser.AtribstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#atribstat}.
	 * @param ctx the parse tree
	 */
	void exitAtribstat(MyGrammarParser.AtribstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#atribstataux}.
	 * @param ctx the parse tree
	 */
	void enterAtribstataux(MyGrammarParser.AtribstatauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#atribstataux}.
	 * @param ctx the parse tree
	 */
	void exitAtribstataux(MyGrammarParser.AtribstatauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(MyGrammarParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(MyGrammarParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#paramlistcall}.
	 * @param ctx the parse tree
	 */
	void enterParamlistcall(MyGrammarParser.ParamlistcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#paramlistcall}.
	 * @param ctx the parse tree
	 */
	void exitParamlistcall(MyGrammarParser.ParamlistcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#paramlistcallaux}.
	 * @param ctx the parse tree
	 */
	void enterParamlistcallaux(MyGrammarParser.ParamlistcallauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#paramlistcallaux}.
	 * @param ctx the parse tree
	 */
	void exitParamlistcallaux(MyGrammarParser.ParamlistcallauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#printstat}.
	 * @param ctx the parse tree
	 */
	void enterPrintstat(MyGrammarParser.PrintstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#printstat}.
	 * @param ctx the parse tree
	 */
	void exitPrintstat(MyGrammarParser.PrintstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#readstat}.
	 * @param ctx the parse tree
	 */
	void enterReadstat(MyGrammarParser.ReadstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#readstat}.
	 * @param ctx the parse tree
	 */
	void exitReadstat(MyGrammarParser.ReadstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void enterReturnstat(MyGrammarParser.ReturnstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#returnstat}.
	 * @param ctx the parse tree
	 */
	void exitReturnstat(MyGrammarParser.ReturnstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#breakstat}.
	 * @param ctx the parse tree
	 */
	void enterBreakstat(MyGrammarParser.BreakstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#breakstat}.
	 * @param ctx the parse tree
	 */
	void exitBreakstat(MyGrammarParser.BreakstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(MyGrammarParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(MyGrammarParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#elsestat}.
	 * @param ctx the parse tree
	 */
	void enterElsestat(MyGrammarParser.ElsestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#elsestat}.
	 * @param ctx the parse tree
	 */
	void exitElsestat(MyGrammarParser.ElsestatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#forstat}.
	 * @param ctx the parse tree
	 */
	void enterForstat(MyGrammarParser.ForstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#forstat}.
	 * @param ctx the parse tree
	 */
	void exitForstat(MyGrammarParser.ForstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#statelist}.
	 * @param ctx the parse tree
	 */
	void enterStatelist(MyGrammarParser.StatelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statelist}.
	 * @param ctx the parse tree
	 */
	void exitStatelist(MyGrammarParser.StatelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#statelistaux}.
	 * @param ctx the parse tree
	 */
	void enterStatelistaux(MyGrammarParser.StatelistauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statelistaux}.
	 * @param ctx the parse tree
	 */
	void exitStatelistaux(MyGrammarParser.StatelistauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#allocexpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocexpression(MyGrammarParser.AllocexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#allocexpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocexpression(MyGrammarParser.AllocexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#allocexpressionaux}.
	 * @param ctx the parse tree
	 */
	void enterAllocexpressionaux(MyGrammarParser.AllocexpressionauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#allocexpressionaux}.
	 * @param ctx the parse tree
	 */
	void exitAllocexpressionaux(MyGrammarParser.AllocexpressionauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#allocexpressionaux2}.
	 * @param ctx the parse tree
	 */
	void enterAllocexpressionaux2(MyGrammarParser.Allocexpressionaux2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#allocexpressionaux2}.
	 * @param ctx the parse tree
	 */
	void exitAllocexpressionaux2(MyGrammarParser.Allocexpressionaux2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expressionaux}.
	 * @param ctx the parse tree
	 */
	void enterExpressionaux(MyGrammarParser.ExpressionauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expressionaux}.
	 * @param ctx the parse tree
	 */
	void exitExpressionaux(MyGrammarParser.ExpressionauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(MyGrammarParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(MyGrammarParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numexpression}.
	 * @param ctx the parse tree
	 */
	void enterNumexpression(MyGrammarParser.NumexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numexpression}.
	 * @param ctx the parse tree
	 */
	void exitNumexpression(MyGrammarParser.NumexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#numexpressionaux}.
	 * @param ctx the parse tree
	 */
	void enterNumexpressionaux(MyGrammarParser.NumexpressionauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#numexpressionaux}.
	 * @param ctx the parse tree
	 */
	void exitNumexpressionaux(MyGrammarParser.NumexpressionauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MyGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MyGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#termaux}.
	 * @param ctx the parse tree
	 */
	void enterTermaux(MyGrammarParser.TermauxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#termaux}.
	 * @param ctx the parse tree
	 */
	void exitTermaux(MyGrammarParser.TermauxContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#minusplus}.
	 * @param ctx the parse tree
	 */
	void enterMinusplus(MyGrammarParser.MinusplusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#minusplus}.
	 * @param ctx the parse tree
	 */
	void exitMinusplus(MyGrammarParser.MinusplusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(MyGrammarParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(MyGrammarParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpr(MyGrammarParser.UnaryexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpr(MyGrammarParser.UnaryexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MyGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MyGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(MyGrammarParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(MyGrammarParser.LvalueContext ctx);
}