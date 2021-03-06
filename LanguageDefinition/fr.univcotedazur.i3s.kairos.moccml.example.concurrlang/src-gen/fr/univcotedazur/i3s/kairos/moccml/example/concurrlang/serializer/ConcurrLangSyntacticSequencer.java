/*
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.serializer;

import com.google.inject.Inject;
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.services.ConcurrLangGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ConcurrLangSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ConcurrLangGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Block_HyphenMinusGreaterThanSignKeyword_1_q;
	protected AbstractElementAlias match_Join_LeftParenthesisKeyword_2_q;
	protected AbstractElementAlias match_Join_RightParenthesisKeyword_4_q;
	protected AbstractElementAlias match_Statements_SemicolonKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ConcurrLangGrammarAccess) access;
		match_Block_HyphenMinusGreaterThanSignKeyword_1_q = new TokenAlias(false, true, grammarAccess.getBlockAccess().getHyphenMinusGreaterThanSignKeyword_1());
		match_Join_LeftParenthesisKeyword_2_q = new TokenAlias(false, true, grammarAccess.getJoinAccess().getLeftParenthesisKeyword_2());
		match_Join_RightParenthesisKeyword_4_q = new TokenAlias(false, true, grammarAccess.getJoinAccess().getRightParenthesisKeyword_4());
		match_Statements_SemicolonKeyword_1_q = new TokenAlias(false, true, grammarAccess.getStatementsAccess().getSemicolonKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Block_HyphenMinusGreaterThanSignKeyword_1_q.equals(syntax))
				emit_Block_HyphenMinusGreaterThanSignKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Join_LeftParenthesisKeyword_2_q.equals(syntax))
				emit_Join_LeftParenthesisKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Join_RightParenthesisKeyword_4_q.equals(syntax))
				emit_Join_RightParenthesisKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Statements_SemicolonKeyword_1_q.equals(syntax))
				emit_Statements_SemicolonKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '->'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '|' (ambiguity) '{' statements+=Statements
	 */
	protected void emit_Block_HyphenMinusGreaterThanSignKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'join' (ambiguity) fork=[Fork|ID]
	 *     name=ID ':' 'join' (ambiguity) fork=[Fork|ID]
	 */
	protected void emit_Join_LeftParenthesisKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ')'?
	 *
	 * This ambiguous syntax occurs at:
	 *     fork=[Fork|ID] (ambiguity) ';'? (rule end)
	 *     fork=[Fork|ID] (ambiguity) (rule end)
	 */
	protected void emit_Join_RightParenthesisKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     fork=[Fork|ID] ')'? (ambiguity) (rule end)
	 *     forkedBlocks+=Block (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Statements_SemicolonKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
