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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConcurrLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "':'", "'join'", "'('", "')'", "'fork'", "'|'", "'->'", "'{'", "'}'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalConcurrLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConcurrLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConcurrLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalConcurrLang.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalConcurrLang.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalConcurrLang.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalConcurrLang.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalConcurrLang.g:71:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatements ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalConcurrLang.g:77:2: ( ( (lv_statements_0_0= ruleStatements ) )* )
            // InternalConcurrLang.g:78:2: ( (lv_statements_0_0= ruleStatements ) )*
            {
            // InternalConcurrLang.g:78:2: ( (lv_statements_0_0= ruleStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConcurrLang.g:79:3: (lv_statements_0_0= ruleStatements )
            	    {
            	    // InternalConcurrLang.g:79:3: (lv_statements_0_0= ruleStatements )
            	    // InternalConcurrLang.g:80:4: lv_statements_0_0= ruleStatements
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatements();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ConcurrLang.Statements");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatements"
    // InternalConcurrLang.g:100:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalConcurrLang.g:100:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalConcurrLang.g:101:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalConcurrLang.g:107:1: ruleStatements returns [EObject current=null] : ( (this_Action_0= ruleAction | this_Fork_1= ruleFork | this_Join_2= ruleJoin ) (otherlv_3= ';' )? ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Action_0 = null;

        EObject this_Fork_1 = null;

        EObject this_Join_2 = null;



        	enterRule();

        try {
            // InternalConcurrLang.g:113:2: ( ( (this_Action_0= ruleAction | this_Fork_1= ruleFork | this_Join_2= ruleJoin ) (otherlv_3= ';' )? ) )
            // InternalConcurrLang.g:114:2: ( (this_Action_0= ruleAction | this_Fork_1= ruleFork | this_Join_2= ruleJoin ) (otherlv_3= ';' )? )
            {
            // InternalConcurrLang.g:114:2: ( (this_Action_0= ruleAction | this_Fork_1= ruleFork | this_Join_2= ruleJoin ) (otherlv_3= ';' )? )
            // InternalConcurrLang.g:115:3: (this_Action_0= ruleAction | this_Fork_1= ruleFork | this_Join_2= ruleJoin ) (otherlv_3= ';' )?
            {
            // InternalConcurrLang.g:115:3: (this_Action_0= ruleAction | this_Fork_1= ruleFork | this_Join_2= ruleJoin )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==12) ) {
                    alt2=3;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==11||LA2_1==13||LA2_1==16||LA2_1==20) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalConcurrLang.g:116:4: this_Action_0= ruleAction
                    {

                    				newCompositeNode(grammarAccess.getStatementsAccess().getActionParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Action_0=ruleAction();

                    state._fsp--;


                    				current = this_Action_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalConcurrLang.g:125:4: this_Fork_1= ruleFork
                    {

                    				newCompositeNode(grammarAccess.getStatementsAccess().getForkParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_Fork_1=ruleFork();

                    state._fsp--;


                    				current = this_Fork_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalConcurrLang.g:134:4: this_Join_2= ruleJoin
                    {

                    				newCompositeNode(grammarAccess.getStatementsAccess().getJoinParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_4);
                    this_Join_2=ruleJoin();

                    state._fsp--;


                    				current = this_Join_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalConcurrLang.g:143:3: (otherlv_3= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalConcurrLang.g:144:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,11,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatementsAccess().getSemicolonKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleJoin"
    // InternalConcurrLang.g:153:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalConcurrLang.g:153:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalConcurrLang.g:154:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalConcurrLang.g:160:1: ruleJoin returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? otherlv_2= 'join' (otherlv_3= '(' )? ( (otherlv_4= RULE_ID ) ) (otherlv_5= ')' )? ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalConcurrLang.g:166:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? otherlv_2= 'join' (otherlv_3= '(' )? ( (otherlv_4= RULE_ID ) ) (otherlv_5= ')' )? ) )
            // InternalConcurrLang.g:167:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? otherlv_2= 'join' (otherlv_3= '(' )? ( (otherlv_4= RULE_ID ) ) (otherlv_5= ')' )? )
            {
            // InternalConcurrLang.g:167:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? otherlv_2= 'join' (otherlv_3= '(' )? ( (otherlv_4= RULE_ID ) ) (otherlv_5= ')' )? )
            // InternalConcurrLang.g:168:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )? otherlv_2= 'join' (otherlv_3= '(' )? ( (otherlv_4= RULE_ID ) ) (otherlv_5= ')' )?
            {
            // InternalConcurrLang.g:168:3: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConcurrLang.g:169:4: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
                    {
                    // InternalConcurrLang.g:169:4: ( (lv_name_0_0= RULE_ID ) )
                    // InternalConcurrLang.g:170:5: (lv_name_0_0= RULE_ID )
                    {
                    // InternalConcurrLang.g:170:5: (lv_name_0_0= RULE_ID )
                    // InternalConcurrLang.g:171:6: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getJoinAccess().getNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJoinRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getJoinAccess().getJoinKeyword_1());
            		
            // InternalConcurrLang.g:196:3: (otherlv_3= '(' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalConcurrLang.g:197:4: otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getJoinAccess().getLeftParenthesisKeyword_2());
                    			

                    }
                    break;

            }

            // InternalConcurrLang.g:202:3: ( (otherlv_4= RULE_ID ) )
            // InternalConcurrLang.g:203:4: (otherlv_4= RULE_ID )
            {
            // InternalConcurrLang.g:203:4: (otherlv_4= RULE_ID )
            // InternalConcurrLang.g:204:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_4, grammarAccess.getJoinAccess().getForkForkCrossReference_3_0());
            				

            }


            }

            // InternalConcurrLang.g:215:3: (otherlv_5= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConcurrLang.g:216:4: otherlv_5= ')'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getJoinAccess().getRightParenthesisKeyword_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleFork"
    // InternalConcurrLang.g:225:1: entryRuleFork returns [EObject current=null] : iv_ruleFork= ruleFork EOF ;
    public final EObject entryRuleFork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFork = null;


        try {
            // InternalConcurrLang.g:225:45: (iv_ruleFork= ruleFork EOF )
            // InternalConcurrLang.g:226:2: iv_ruleFork= ruleFork EOF
            {
             newCompositeNode(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFork=ruleFork();

            state._fsp--;

             current =iv_ruleFork; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // InternalConcurrLang.g:232:1: ruleFork returns [EObject current=null] : (otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_forkedBlocks_3_0= ruleBlock ) )+ ) ;
    public final EObject ruleFork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_forkedBlocks_3_0 = null;



        	enterRule();

        try {
            // InternalConcurrLang.g:238:2: ( (otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_forkedBlocks_3_0= ruleBlock ) )+ ) )
            // InternalConcurrLang.g:239:2: (otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_forkedBlocks_3_0= ruleBlock ) )+ )
            {
            // InternalConcurrLang.g:239:2: (otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_forkedBlocks_3_0= ruleBlock ) )+ )
            // InternalConcurrLang.g:240:3: otherlv_0= 'fork' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_forkedBlocks_3_0= ruleBlock ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getForkAccess().getForkKeyword_0());
            		
            // InternalConcurrLang.g:244:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConcurrLang.g:245:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConcurrLang.g:245:4: (lv_name_1_0= RULE_ID )
            // InternalConcurrLang.g:246:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getForkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getForkAccess().getColonKeyword_2());
            		
            // InternalConcurrLang.g:266:3: ( (lv_forkedBlocks_3_0= ruleBlock ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalConcurrLang.g:267:4: (lv_forkedBlocks_3_0= ruleBlock )
            	    {
            	    // InternalConcurrLang.g:267:4: (lv_forkedBlocks_3_0= ruleBlock )
            	    // InternalConcurrLang.g:268:5: lv_forkedBlocks_3_0= ruleBlock
            	    {

            	    					newCompositeNode(grammarAccess.getForkAccess().getForkedBlocksBlockParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_forkedBlocks_3_0=ruleBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"forkedBlocks",
            	    						lv_forkedBlocks_3_0,
            	    						"fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ConcurrLang.Block");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleBlock"
    // InternalConcurrLang.g:289:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalConcurrLang.g:289:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalConcurrLang.g:290:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalConcurrLang.g:296:1: ruleBlock returns [EObject current=null] : (otherlv_0= '|' (otherlv_1= '->' )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) )+ otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalConcurrLang.g:302:2: ( (otherlv_0= '|' (otherlv_1= '->' )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) )+ otherlv_4= '}' ) )
            // InternalConcurrLang.g:303:2: (otherlv_0= '|' (otherlv_1= '->' )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) )+ otherlv_4= '}' )
            {
            // InternalConcurrLang.g:303:2: (otherlv_0= '|' (otherlv_1= '->' )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) )+ otherlv_4= '}' )
            // InternalConcurrLang.g:304:3: otherlv_0= '|' (otherlv_1= '->' )? otherlv_2= '{' ( (lv_statements_3_0= ruleStatements ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getVerticalLineKeyword_0());
            		
            // InternalConcurrLang.g:308:3: (otherlv_1= '->' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConcurrLang.g:309:4: otherlv_1= '->'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getHyphenMinusGreaterThanSignKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalConcurrLang.g:318:3: ( (lv_statements_3_0= ruleStatements ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==13||LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalConcurrLang.g:319:4: (lv_statements_3_0= ruleStatements )
            	    {
            	    // InternalConcurrLang.g:319:4: (lv_statements_3_0= ruleStatements )
            	    // InternalConcurrLang.g:320:5: lv_statements_3_0= ruleStatements
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_statements_3_0=ruleStatements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ConcurrLang.Statements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAction"
    // InternalConcurrLang.g:345:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalConcurrLang.g:345:47: (iv_ruleAction= ruleAction EOF )
            // InternalConcurrLang.g:346:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalConcurrLang.g:352:1: ruleAction returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalConcurrLang.g:358:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalConcurrLang.g:359:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalConcurrLang.g:359:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalConcurrLang.g:360:3: (lv_name_0_0= RULE_ID )
            {
            // InternalConcurrLang.g:360:3: (lv_name_0_0= RULE_ID )
            // InternalConcurrLang.g:361:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getActionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000012012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000112010L});

}