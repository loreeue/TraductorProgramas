// Generated from /Users/loretouzquiano/Desktop/PracticaPL/src/Gramatica.g4 by ANTLR 4.13.1

    import Traduccion.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.io.PrintWriter;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#axioma}.
	 * @param ctx the parse tree
	 */
	void enterAxioma(GramaticaParser.AxiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#axioma}.
	 * @param ctx the parse tree
	 */
	void exitAxioma(GramaticaParser.AxiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#defines}.
	 * @param ctx the parse tree
	 */
	void enterDefines(GramaticaParser.DefinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#defines}.
	 * @param ctx the parse tree
	 */
	void exitDefines(GramaticaParser.DefinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(GramaticaParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(GramaticaParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#partes}.
	 * @param ctx the parse tree
	 */
	void enterPartes(GramaticaParser.PartesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#partes}.
	 * @param ctx the parse tree
	 */
	void exitPartes(GramaticaParser.PartesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(GramaticaParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(GramaticaParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lcond1}.
	 * @param ctx the parse tree
	 */
	void enterLcond1(GramaticaParser.Lcond1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lcond1}.
	 * @param ctx the parse tree
	 */
	void exitLcond1(GramaticaParser.Lcond1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lcond2}.
	 * @param ctx the parse tree
	 */
	void enterLcond2(GramaticaParser.Lcond2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lcond2}.
	 * @param ctx the parse tree
	 */
	void exitLcond2(GramaticaParser.Lcond2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#opl}.
	 * @param ctx the parse tree
	 */
	void enterOpl(GramaticaParser.OplContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#opl}.
	 * @param ctx the parse tree
	 */
	void exitOpl(GramaticaParser.OplContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(GramaticaParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(GramaticaParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(GramaticaParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(GramaticaParser.OprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#restpart}.
	 * @param ctx the parse tree
	 */
	void enterRestpart(GramaticaParser.RestpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#restpart}.
	 * @param ctx the parse tree
	 */
	void exitRestpart(GramaticaParser.RestpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listparam1}.
	 * @param ctx the parse tree
	 */
	void enterListparam1(GramaticaParser.Listparam1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listparam1}.
	 * @param ctx the parse tree
	 */
	void exitListparam1(GramaticaParser.Listparam1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listparam2}.
	 * @param ctx the parse tree
	 */
	void enterListparam2(GramaticaParser.Listparam2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listparam2}.
	 * @param ctx the parse tree
	 */
	void exitListparam2(GramaticaParser.Listparam2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(GramaticaParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(GramaticaParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GramaticaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(GramaticaParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(GramaticaParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sent1}.
	 * @param ctx the parse tree
	 */
	void enterSent1(GramaticaParser.Sent1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sent1}.
	 * @param ctx the parse tree
	 */
	void exitSent1(GramaticaParser.Sent1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ident1}.
	 * @param ctx the parse tree
	 */
	void enterIdent1(GramaticaParser.Ident1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ident1}.
	 * @param ctx the parse tree
	 */
	void exitIdent1(GramaticaParser.Ident1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ident2}.
	 * @param ctx the parse tree
	 */
	void enterIdent2(GramaticaParser.Ident2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ident2}.
	 * @param ctx the parse tree
	 */
	void exitIdent2(GramaticaParser.Ident2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lid1}.
	 * @param ctx the parse tree
	 */
	void enterLid1(GramaticaParser.Lid1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lid1}.
	 * @param ctx the parse tree
	 */
	void exitLid1(GramaticaParser.Lid1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lid2}.
	 * @param ctx the parse tree
	 */
	void enterLid2(GramaticaParser.Lid2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lid2}.
	 * @param ctx the parse tree
	 */
	void exitLid2(GramaticaParser.Lid2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lexp1}.
	 * @param ctx the parse tree
	 */
	void enterLexp1(GramaticaParser.Lexp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lexp1}.
	 * @param ctx the parse tree
	 */
	void exitLexp1(GramaticaParser.Lexp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lexp2}.
	 * @param ctx the parse tree
	 */
	void enterLexp2(GramaticaParser.Lexp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lexp2}.
	 * @param ctx the parse tree
	 */
	void exitLexp2(GramaticaParser.Lexp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(GramaticaParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(GramaticaParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(GramaticaParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(GramaticaParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(GramaticaParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(GramaticaParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#factor1}.
	 * @param ctx the parse tree
	 */
	void enterFactor1(GramaticaParser.Factor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#factor1}.
	 * @param ctx the parse tree
	 */
	void exitFactor1(GramaticaParser.Factor1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#factor2}.
	 * @param ctx the parse tree
	 */
	void enterFactor2(GramaticaParser.Factor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#factor2}.
	 * @param ctx the parse tree
	 */
	void exitFactor2(GramaticaParser.Factor2Context ctx);
}