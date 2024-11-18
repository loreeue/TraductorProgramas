// Generated from /Users/loretouzquiano/Desktop/PracticaPL/src/Gramatica.g4 by ANTLR 4.13.1

    import Traduccion.*;
    import java.util.ArrayList;
    import java.util.List;
    import java.io.PrintWriter;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#axioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxioma(GramaticaParser.AxiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#defines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefines(GramaticaParser.DefinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(GramaticaParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#partes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartes(GramaticaParser.PartesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(GramaticaParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lcond1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcond1(GramaticaParser.Lcond1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lcond2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcond2(GramaticaParser.Lcond2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#opl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpl(GramaticaParser.OplContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(GramaticaParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(GramaticaParser.OprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#restpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestpart(GramaticaParser.RestpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listparam1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparam1(GramaticaParser.Listparam1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listparam2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListparam2(GramaticaParser.Listparam2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(GramaticaParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(GramaticaParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sent1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent1(GramaticaParser.Sent1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ident1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent1(GramaticaParser.Ident1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ident2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent2(GramaticaParser.Ident2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lid1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLid1(GramaticaParser.Lid1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lid2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLid2(GramaticaParser.Lid2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lexp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexp1(GramaticaParser.Lexp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#lexp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexp2(GramaticaParser.Lexp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1(GramaticaParser.Exp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(GramaticaParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(GramaticaParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#factor1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor1(GramaticaParser.Factor1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#factor2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor2(GramaticaParser.Factor2Context ctx);
}