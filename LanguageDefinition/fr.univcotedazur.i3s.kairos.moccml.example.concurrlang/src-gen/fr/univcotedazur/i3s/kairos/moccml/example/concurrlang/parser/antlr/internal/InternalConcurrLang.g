/*
 * generated by Xtext 2.25.0
 */
grammar InternalConcurrLang;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.services.ConcurrLangGrammarAccess;

}

@parser::members {

 	private ConcurrLangGrammarAccess grammarAccess;

    public InternalConcurrLangParser(TokenStream input, ConcurrLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ConcurrLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementsParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatements
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ConcurrLang.Statements");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatements
entryRuleStatements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementsRule()); }
	iv_ruleStatements=ruleStatements
	{ $current=$iv_ruleStatements.current; }
	EOF;

// Rule Statements
ruleStatements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStatementsAccess().getActionParserRuleCall_0_0());
			}
			this_Action_0=ruleAction
			{
				$current = $this_Action_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementsAccess().getForkParserRuleCall_0_1());
			}
			this_Fork_1=ruleFork
			{
				$current = $this_Fork_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementsAccess().getJoinParserRuleCall_0_2());
			}
			this_Join_2=ruleJoin
			{
				$current = $this_Join_2.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getStatementsAccess().getSemicolonKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleJoin
entryRuleJoin returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJoinRule()); }
	iv_ruleJoin=ruleJoin
	{ $current=$iv_ruleJoin.current; }
	EOF;

// Rule Join
ruleJoin returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_name_0_0=RULE_ID
					{
						newLeafNode(lv_name_0_0, grammarAccess.getJoinAccess().getNameIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getJoinRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_0_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getColonKeyword_0_1());
			}
		)?
		otherlv_2='join'
		{
			newLeafNode(otherlv_2, grammarAccess.getJoinAccess().getJoinKeyword_1());
		}
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getJoinAccess().getLeftParenthesisKeyword_2());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getJoinRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getJoinAccess().getForkForkCrossReference_3_0());
				}
			)
		)
		(
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getJoinAccess().getRightParenthesisKeyword_4());
			}
		)?
	)
;

// Entry rule entryRuleFork
entryRuleFork returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForkRule()); }
	iv_ruleFork=ruleFork
	{ $current=$iv_ruleFork.current; }
	EOF;

// Rule Fork
ruleFork returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fork'
		{
			newLeafNode(otherlv_0, grammarAccess.getForkAccess().getForkKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getForkAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getForkRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getForkAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForkAccess().getForkedBlocksBlockParserRuleCall_3_0());
				}
				lv_forkedBlocks_3_0=ruleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForkRule());
					}
					add(
						$current,
						"forkedBlocks",
						lv_forkedBlocks_3_0,
						"fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ConcurrLang.Block");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleBlock
entryRuleBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlockRule()); }
	iv_ruleBlock=ruleBlock
	{ $current=$iv_ruleBlock.current; }
	EOF;

// Rule Block
ruleBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='|'
		{
			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getVerticalLineKeyword_0());
		}
		(
			otherlv_1='->'
			{
				newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getHyphenMinusGreaterThanSignKeyword_1());
			}
		)?
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementsParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleStatements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlockRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ConcurrLang.Statements");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getActionRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
