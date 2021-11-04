package fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.services.ConcurrLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConcurrLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'join'", "'('", "')'", "':'", "'fork'", "'|'", "'->'", "'{'", "'}'"
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

    	public void setGrammarAccess(ConcurrLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalConcurrLang.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalConcurrLang.g:54:1: ( ruleModel EOF )
            // InternalConcurrLang.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalConcurrLang.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:66:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // InternalConcurrLang.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            {
            // InternalConcurrLang.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            // InternalConcurrLang.g:68:3: ( rule__Model__StatementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalConcurrLang.g:69:3: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalConcurrLang.g:69:4: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatements"
    // InternalConcurrLang.g:78:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // InternalConcurrLang.g:79:1: ( ruleStatements EOF )
            // InternalConcurrLang.g:80:1: ruleStatements EOF
            {
             before(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalConcurrLang.g:87:1: ruleStatements : ( ( rule__Statements__Group__0 ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:91:2: ( ( ( rule__Statements__Group__0 ) ) )
            // InternalConcurrLang.g:92:2: ( ( rule__Statements__Group__0 ) )
            {
            // InternalConcurrLang.g:92:2: ( ( rule__Statements__Group__0 ) )
            // InternalConcurrLang.g:93:3: ( rule__Statements__Group__0 )
            {
             before(grammarAccess.getStatementsAccess().getGroup()); 
            // InternalConcurrLang.g:94:3: ( rule__Statements__Group__0 )
            // InternalConcurrLang.g:94:4: rule__Statements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleJoin"
    // InternalConcurrLang.g:103:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // InternalConcurrLang.g:104:1: ( ruleJoin EOF )
            // InternalConcurrLang.g:105:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getJoinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalConcurrLang.g:112:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:116:2: ( ( ( rule__Join__Group__0 ) ) )
            // InternalConcurrLang.g:117:2: ( ( rule__Join__Group__0 ) )
            {
            // InternalConcurrLang.g:117:2: ( ( rule__Join__Group__0 ) )
            // InternalConcurrLang.g:118:3: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // InternalConcurrLang.g:119:3: ( rule__Join__Group__0 )
            // InternalConcurrLang.g:119:4: rule__Join__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleFork"
    // InternalConcurrLang.g:128:1: entryRuleFork : ruleFork EOF ;
    public final void entryRuleFork() throws RecognitionException {
        try {
            // InternalConcurrLang.g:129:1: ( ruleFork EOF )
            // InternalConcurrLang.g:130:1: ruleFork EOF
            {
             before(grammarAccess.getForkRule()); 
            pushFollow(FOLLOW_1);
            ruleFork();

            state._fsp--;

             after(grammarAccess.getForkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFork"


    // $ANTLR start "ruleFork"
    // InternalConcurrLang.g:137:1: ruleFork : ( ( rule__Fork__Group__0 ) ) ;
    public final void ruleFork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:141:2: ( ( ( rule__Fork__Group__0 ) ) )
            // InternalConcurrLang.g:142:2: ( ( rule__Fork__Group__0 ) )
            {
            // InternalConcurrLang.g:142:2: ( ( rule__Fork__Group__0 ) )
            // InternalConcurrLang.g:143:3: ( rule__Fork__Group__0 )
            {
             before(grammarAccess.getForkAccess().getGroup()); 
            // InternalConcurrLang.g:144:3: ( rule__Fork__Group__0 )
            // InternalConcurrLang.g:144:4: rule__Fork__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFork"


    // $ANTLR start "entryRuleBlock"
    // InternalConcurrLang.g:153:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalConcurrLang.g:154:1: ( ruleBlock EOF )
            // InternalConcurrLang.g:155:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalConcurrLang.g:162:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:166:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalConcurrLang.g:167:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalConcurrLang.g:167:2: ( ( rule__Block__Group__0 ) )
            // InternalConcurrLang.g:168:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalConcurrLang.g:169:3: ( rule__Block__Group__0 )
            // InternalConcurrLang.g:169:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAction"
    // InternalConcurrLang.g:178:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalConcurrLang.g:179:1: ( ruleAction EOF )
            // InternalConcurrLang.g:180:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalConcurrLang.g:187:1: ruleAction : ( ( rule__Action__NameAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:191:2: ( ( ( rule__Action__NameAssignment ) ) )
            // InternalConcurrLang.g:192:2: ( ( rule__Action__NameAssignment ) )
            {
            // InternalConcurrLang.g:192:2: ( ( rule__Action__NameAssignment ) )
            // InternalConcurrLang.g:193:3: ( rule__Action__NameAssignment )
            {
             before(grammarAccess.getActionAccess().getNameAssignment()); 
            // InternalConcurrLang.g:194:3: ( rule__Action__NameAssignment )
            // InternalConcurrLang.g:194:4: rule__Action__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__Statements__Alternatives_0"
    // InternalConcurrLang.g:202:1: rule__Statements__Alternatives_0 : ( ( ruleAction ) | ( ruleFork ) | ( ruleJoin ) );
    public final void rule__Statements__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:206:1: ( ( ruleAction ) | ( ruleFork ) | ( ruleJoin ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==15) ) {
                    alt2=3;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||(LA2_1>=11 && LA2_1<=12)||LA2_1==16||LA2_1==20) ) {
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
            case 12:
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
                    // InternalConcurrLang.g:207:2: ( ruleAction )
                    {
                    // InternalConcurrLang.g:207:2: ( ruleAction )
                    // InternalConcurrLang.g:208:3: ruleAction
                    {
                     before(grammarAccess.getStatementsAccess().getActionParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getActionParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalConcurrLang.g:213:2: ( ruleFork )
                    {
                    // InternalConcurrLang.g:213:2: ( ruleFork )
                    // InternalConcurrLang.g:214:3: ruleFork
                    {
                     before(grammarAccess.getStatementsAccess().getForkParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFork();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getForkParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalConcurrLang.g:219:2: ( ruleJoin )
                    {
                    // InternalConcurrLang.g:219:2: ( ruleJoin )
                    // InternalConcurrLang.g:220:3: ruleJoin
                    {
                     before(grammarAccess.getStatementsAccess().getJoinParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleJoin();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getJoinParserRuleCall_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Alternatives_0"


    // $ANTLR start "rule__Statements__Group__0"
    // InternalConcurrLang.g:229:1: rule__Statements__Group__0 : rule__Statements__Group__0__Impl rule__Statements__Group__1 ;
    public final void rule__Statements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:233:1: ( rule__Statements__Group__0__Impl rule__Statements__Group__1 )
            // InternalConcurrLang.g:234:2: rule__Statements__Group__0__Impl rule__Statements__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Statements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group__0"


    // $ANTLR start "rule__Statements__Group__0__Impl"
    // InternalConcurrLang.g:241:1: rule__Statements__Group__0__Impl : ( ( rule__Statements__Alternatives_0 ) ) ;
    public final void rule__Statements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:245:1: ( ( ( rule__Statements__Alternatives_0 ) ) )
            // InternalConcurrLang.g:246:1: ( ( rule__Statements__Alternatives_0 ) )
            {
            // InternalConcurrLang.g:246:1: ( ( rule__Statements__Alternatives_0 ) )
            // InternalConcurrLang.g:247:2: ( rule__Statements__Alternatives_0 )
            {
             before(grammarAccess.getStatementsAccess().getAlternatives_0()); 
            // InternalConcurrLang.g:248:2: ( rule__Statements__Alternatives_0 )
            // InternalConcurrLang.g:248:3: rule__Statements__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group__0__Impl"


    // $ANTLR start "rule__Statements__Group__1"
    // InternalConcurrLang.g:256:1: rule__Statements__Group__1 : rule__Statements__Group__1__Impl ;
    public final void rule__Statements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:260:1: ( rule__Statements__Group__1__Impl )
            // InternalConcurrLang.g:261:2: rule__Statements__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group__1"


    // $ANTLR start "rule__Statements__Group__1__Impl"
    // InternalConcurrLang.g:267:1: rule__Statements__Group__1__Impl : ( ( ';' )? ) ;
    public final void rule__Statements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:271:1: ( ( ( ';' )? ) )
            // InternalConcurrLang.g:272:1: ( ( ';' )? )
            {
            // InternalConcurrLang.g:272:1: ( ( ';' )? )
            // InternalConcurrLang.g:273:2: ( ';' )?
            {
             before(grammarAccess.getStatementsAccess().getSemicolonKeyword_1()); 
            // InternalConcurrLang.g:274:2: ( ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalConcurrLang.g:274:3: ';'
                    {
                    match(input,11,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStatementsAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group__1__Impl"


    // $ANTLR start "rule__Join__Group__0"
    // InternalConcurrLang.g:283:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:287:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalConcurrLang.g:288:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Join__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0"


    // $ANTLR start "rule__Join__Group__0__Impl"
    // InternalConcurrLang.g:295:1: rule__Join__Group__0__Impl : ( ( rule__Join__Group_0__0 )? ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:299:1: ( ( ( rule__Join__Group_0__0 )? ) )
            // InternalConcurrLang.g:300:1: ( ( rule__Join__Group_0__0 )? )
            {
            // InternalConcurrLang.g:300:1: ( ( rule__Join__Group_0__0 )? )
            // InternalConcurrLang.g:301:2: ( rule__Join__Group_0__0 )?
            {
             before(grammarAccess.getJoinAccess().getGroup_0()); 
            // InternalConcurrLang.g:302:2: ( rule__Join__Group_0__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalConcurrLang.g:302:3: rule__Join__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Join__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoinAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0__Impl"


    // $ANTLR start "rule__Join__Group__1"
    // InternalConcurrLang.g:310:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:314:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalConcurrLang.g:315:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Join__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1"


    // $ANTLR start "rule__Join__Group__1__Impl"
    // InternalConcurrLang.g:322:1: rule__Join__Group__1__Impl : ( 'join' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:326:1: ( ( 'join' ) )
            // InternalConcurrLang.g:327:1: ( 'join' )
            {
            // InternalConcurrLang.g:327:1: ( 'join' )
            // InternalConcurrLang.g:328:2: 'join'
            {
             before(grammarAccess.getJoinAccess().getJoinKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getJoinKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1__Impl"


    // $ANTLR start "rule__Join__Group__2"
    // InternalConcurrLang.g:337:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:341:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalConcurrLang.g:342:2: rule__Join__Group__2__Impl rule__Join__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Join__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2"


    // $ANTLR start "rule__Join__Group__2__Impl"
    // InternalConcurrLang.g:349:1: rule__Join__Group__2__Impl : ( ( '(' )? ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:353:1: ( ( ( '(' )? ) )
            // InternalConcurrLang.g:354:1: ( ( '(' )? )
            {
            // InternalConcurrLang.g:354:1: ( ( '(' )? )
            // InternalConcurrLang.g:355:2: ( '(' )?
            {
             before(grammarAccess.getJoinAccess().getLeftParenthesisKeyword_2()); 
            // InternalConcurrLang.g:356:2: ( '(' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalConcurrLang.g:356:3: '('
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJoinAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2__Impl"


    // $ANTLR start "rule__Join__Group__3"
    // InternalConcurrLang.g:364:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:368:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // InternalConcurrLang.g:369:2: rule__Join__Group__3__Impl rule__Join__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Join__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__3"


    // $ANTLR start "rule__Join__Group__3__Impl"
    // InternalConcurrLang.g:376:1: rule__Join__Group__3__Impl : ( ( rule__Join__ForkAssignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:380:1: ( ( ( rule__Join__ForkAssignment_3 ) ) )
            // InternalConcurrLang.g:381:1: ( ( rule__Join__ForkAssignment_3 ) )
            {
            // InternalConcurrLang.g:381:1: ( ( rule__Join__ForkAssignment_3 ) )
            // InternalConcurrLang.g:382:2: ( rule__Join__ForkAssignment_3 )
            {
             before(grammarAccess.getJoinAccess().getForkAssignment_3()); 
            // InternalConcurrLang.g:383:2: ( rule__Join__ForkAssignment_3 )
            // InternalConcurrLang.g:383:3: rule__Join__ForkAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Join__ForkAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getForkAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__3__Impl"


    // $ANTLR start "rule__Join__Group__4"
    // InternalConcurrLang.g:391:1: rule__Join__Group__4 : rule__Join__Group__4__Impl ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:395:1: ( rule__Join__Group__4__Impl )
            // InternalConcurrLang.g:396:2: rule__Join__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__4"


    // $ANTLR start "rule__Join__Group__4__Impl"
    // InternalConcurrLang.g:402:1: rule__Join__Group__4__Impl : ( ( ')' )? ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:406:1: ( ( ( ')' )? ) )
            // InternalConcurrLang.g:407:1: ( ( ')' )? )
            {
            // InternalConcurrLang.g:407:1: ( ( ')' )? )
            // InternalConcurrLang.g:408:2: ( ')' )?
            {
             before(grammarAccess.getJoinAccess().getRightParenthesisKeyword_4()); 
            // InternalConcurrLang.g:409:2: ( ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalConcurrLang.g:409:3: ')'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJoinAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__4__Impl"


    // $ANTLR start "rule__Join__Group_0__0"
    // InternalConcurrLang.g:418:1: rule__Join__Group_0__0 : rule__Join__Group_0__0__Impl rule__Join__Group_0__1 ;
    public final void rule__Join__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:422:1: ( rule__Join__Group_0__0__Impl rule__Join__Group_0__1 )
            // InternalConcurrLang.g:423:2: rule__Join__Group_0__0__Impl rule__Join__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Join__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group_0__0"


    // $ANTLR start "rule__Join__Group_0__0__Impl"
    // InternalConcurrLang.g:430:1: rule__Join__Group_0__0__Impl : ( ( rule__Join__NameAssignment_0_0 ) ) ;
    public final void rule__Join__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:434:1: ( ( ( rule__Join__NameAssignment_0_0 ) ) )
            // InternalConcurrLang.g:435:1: ( ( rule__Join__NameAssignment_0_0 ) )
            {
            // InternalConcurrLang.g:435:1: ( ( rule__Join__NameAssignment_0_0 ) )
            // InternalConcurrLang.g:436:2: ( rule__Join__NameAssignment_0_0 )
            {
             before(grammarAccess.getJoinAccess().getNameAssignment_0_0()); 
            // InternalConcurrLang.g:437:2: ( rule__Join__NameAssignment_0_0 )
            // InternalConcurrLang.g:437:3: rule__Join__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Join__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group_0__0__Impl"


    // $ANTLR start "rule__Join__Group_0__1"
    // InternalConcurrLang.g:445:1: rule__Join__Group_0__1 : rule__Join__Group_0__1__Impl ;
    public final void rule__Join__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:449:1: ( rule__Join__Group_0__1__Impl )
            // InternalConcurrLang.g:450:2: rule__Join__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group_0__1"


    // $ANTLR start "rule__Join__Group_0__1__Impl"
    // InternalConcurrLang.g:456:1: rule__Join__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Join__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:460:1: ( ( ':' ) )
            // InternalConcurrLang.g:461:1: ( ':' )
            {
            // InternalConcurrLang.g:461:1: ( ':' )
            // InternalConcurrLang.g:462:2: ':'
            {
             before(grammarAccess.getJoinAccess().getColonKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group_0__1__Impl"


    // $ANTLR start "rule__Fork__Group__0"
    // InternalConcurrLang.g:472:1: rule__Fork__Group__0 : rule__Fork__Group__0__Impl rule__Fork__Group__1 ;
    public final void rule__Fork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:476:1: ( rule__Fork__Group__0__Impl rule__Fork__Group__1 )
            // InternalConcurrLang.g:477:2: rule__Fork__Group__0__Impl rule__Fork__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Fork__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fork__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__0"


    // $ANTLR start "rule__Fork__Group__0__Impl"
    // InternalConcurrLang.g:484:1: rule__Fork__Group__0__Impl : ( 'fork' ) ;
    public final void rule__Fork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:488:1: ( ( 'fork' ) )
            // InternalConcurrLang.g:489:1: ( 'fork' )
            {
            // InternalConcurrLang.g:489:1: ( 'fork' )
            // InternalConcurrLang.g:490:2: 'fork'
            {
             before(grammarAccess.getForkAccess().getForkKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getForkAccess().getForkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__0__Impl"


    // $ANTLR start "rule__Fork__Group__1"
    // InternalConcurrLang.g:499:1: rule__Fork__Group__1 : rule__Fork__Group__1__Impl rule__Fork__Group__2 ;
    public final void rule__Fork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:503:1: ( rule__Fork__Group__1__Impl rule__Fork__Group__2 )
            // InternalConcurrLang.g:504:2: rule__Fork__Group__1__Impl rule__Fork__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Fork__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fork__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__1"


    // $ANTLR start "rule__Fork__Group__1__Impl"
    // InternalConcurrLang.g:511:1: rule__Fork__Group__1__Impl : ( ( rule__Fork__NameAssignment_1 ) ) ;
    public final void rule__Fork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:515:1: ( ( ( rule__Fork__NameAssignment_1 ) ) )
            // InternalConcurrLang.g:516:1: ( ( rule__Fork__NameAssignment_1 ) )
            {
            // InternalConcurrLang.g:516:1: ( ( rule__Fork__NameAssignment_1 ) )
            // InternalConcurrLang.g:517:2: ( rule__Fork__NameAssignment_1 )
            {
             before(grammarAccess.getForkAccess().getNameAssignment_1()); 
            // InternalConcurrLang.g:518:2: ( rule__Fork__NameAssignment_1 )
            // InternalConcurrLang.g:518:3: rule__Fork__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fork__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__1__Impl"


    // $ANTLR start "rule__Fork__Group__2"
    // InternalConcurrLang.g:526:1: rule__Fork__Group__2 : rule__Fork__Group__2__Impl rule__Fork__Group__3 ;
    public final void rule__Fork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:530:1: ( rule__Fork__Group__2__Impl rule__Fork__Group__3 )
            // InternalConcurrLang.g:531:2: rule__Fork__Group__2__Impl rule__Fork__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Fork__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fork__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__2"


    // $ANTLR start "rule__Fork__Group__2__Impl"
    // InternalConcurrLang.g:538:1: rule__Fork__Group__2__Impl : ( ':' ) ;
    public final void rule__Fork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:542:1: ( ( ':' ) )
            // InternalConcurrLang.g:543:1: ( ':' )
            {
            // InternalConcurrLang.g:543:1: ( ':' )
            // InternalConcurrLang.g:544:2: ':'
            {
             before(grammarAccess.getForkAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getForkAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__2__Impl"


    // $ANTLR start "rule__Fork__Group__3"
    // InternalConcurrLang.g:553:1: rule__Fork__Group__3 : rule__Fork__Group__3__Impl ;
    public final void rule__Fork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:557:1: ( rule__Fork__Group__3__Impl )
            // InternalConcurrLang.g:558:2: rule__Fork__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fork__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__3"


    // $ANTLR start "rule__Fork__Group__3__Impl"
    // InternalConcurrLang.g:564:1: rule__Fork__Group__3__Impl : ( ( ( rule__Fork__ForkedBlocksAssignment_3 ) ) ( ( rule__Fork__ForkedBlocksAssignment_3 )* ) ) ;
    public final void rule__Fork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:568:1: ( ( ( ( rule__Fork__ForkedBlocksAssignment_3 ) ) ( ( rule__Fork__ForkedBlocksAssignment_3 )* ) ) )
            // InternalConcurrLang.g:569:1: ( ( ( rule__Fork__ForkedBlocksAssignment_3 ) ) ( ( rule__Fork__ForkedBlocksAssignment_3 )* ) )
            {
            // InternalConcurrLang.g:569:1: ( ( ( rule__Fork__ForkedBlocksAssignment_3 ) ) ( ( rule__Fork__ForkedBlocksAssignment_3 )* ) )
            // InternalConcurrLang.g:570:2: ( ( rule__Fork__ForkedBlocksAssignment_3 ) ) ( ( rule__Fork__ForkedBlocksAssignment_3 )* )
            {
            // InternalConcurrLang.g:570:2: ( ( rule__Fork__ForkedBlocksAssignment_3 ) )
            // InternalConcurrLang.g:571:3: ( rule__Fork__ForkedBlocksAssignment_3 )
            {
             before(grammarAccess.getForkAccess().getForkedBlocksAssignment_3()); 
            // InternalConcurrLang.g:572:3: ( rule__Fork__ForkedBlocksAssignment_3 )
            // InternalConcurrLang.g:572:4: rule__Fork__ForkedBlocksAssignment_3
            {
            pushFollow(FOLLOW_11);
            rule__Fork__ForkedBlocksAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForkAccess().getForkedBlocksAssignment_3()); 

            }

            // InternalConcurrLang.g:575:2: ( ( rule__Fork__ForkedBlocksAssignment_3 )* )
            // InternalConcurrLang.g:576:3: ( rule__Fork__ForkedBlocksAssignment_3 )*
            {
             before(grammarAccess.getForkAccess().getForkedBlocksAssignment_3()); 
            // InternalConcurrLang.g:577:3: ( rule__Fork__ForkedBlocksAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalConcurrLang.g:577:4: rule__Fork__ForkedBlocksAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Fork__ForkedBlocksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getForkAccess().getForkedBlocksAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalConcurrLang.g:587:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:591:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalConcurrLang.g:592:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalConcurrLang.g:599:1: rule__Block__Group__0__Impl : ( '|' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:603:1: ( ( '|' ) )
            // InternalConcurrLang.g:604:1: ( '|' )
            {
            // InternalConcurrLang.g:604:1: ( '|' )
            // InternalConcurrLang.g:605:2: '|'
            {
             before(grammarAccess.getBlockAccess().getVerticalLineKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalConcurrLang.g:614:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:618:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalConcurrLang.g:619:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalConcurrLang.g:626:1: rule__Block__Group__1__Impl : ( ( '->' )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:630:1: ( ( ( '->' )? ) )
            // InternalConcurrLang.g:631:1: ( ( '->' )? )
            {
            // InternalConcurrLang.g:631:1: ( ( '->' )? )
            // InternalConcurrLang.g:632:2: ( '->' )?
            {
             before(grammarAccess.getBlockAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            // InternalConcurrLang.g:633:2: ( '->' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalConcurrLang.g:633:3: '->'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalConcurrLang.g:641:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:645:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalConcurrLang.g:646:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalConcurrLang.g:653:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:657:1: ( ( '{' ) )
            // InternalConcurrLang.g:658:1: ( '{' )
            {
            // InternalConcurrLang.g:658:1: ( '{' )
            // InternalConcurrLang.g:659:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalConcurrLang.g:668:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:672:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalConcurrLang.g:673:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalConcurrLang.g:680:1: rule__Block__Group__3__Impl : ( ( ( rule__Block__StatementsAssignment_3 ) ) ( ( rule__Block__StatementsAssignment_3 )* ) ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:684:1: ( ( ( ( rule__Block__StatementsAssignment_3 ) ) ( ( rule__Block__StatementsAssignment_3 )* ) ) )
            // InternalConcurrLang.g:685:1: ( ( ( rule__Block__StatementsAssignment_3 ) ) ( ( rule__Block__StatementsAssignment_3 )* ) )
            {
            // InternalConcurrLang.g:685:1: ( ( ( rule__Block__StatementsAssignment_3 ) ) ( ( rule__Block__StatementsAssignment_3 )* ) )
            // InternalConcurrLang.g:686:2: ( ( rule__Block__StatementsAssignment_3 ) ) ( ( rule__Block__StatementsAssignment_3 )* )
            {
            // InternalConcurrLang.g:686:2: ( ( rule__Block__StatementsAssignment_3 ) )
            // InternalConcurrLang.g:687:3: ( rule__Block__StatementsAssignment_3 )
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_3()); 
            // InternalConcurrLang.g:688:3: ( rule__Block__StatementsAssignment_3 )
            // InternalConcurrLang.g:688:4: rule__Block__StatementsAssignment_3
            {
            pushFollow(FOLLOW_3);
            rule__Block__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementsAssignment_3()); 

            }

            // InternalConcurrLang.g:691:2: ( ( rule__Block__StatementsAssignment_3 )* )
            // InternalConcurrLang.g:692:3: ( rule__Block__StatementsAssignment_3 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_3()); 
            // InternalConcurrLang.g:693:3: ( rule__Block__StatementsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==12||LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalConcurrLang.g:693:4: rule__Block__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Block__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStatementsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalConcurrLang.g:702:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:706:1: ( rule__Block__Group__4__Impl )
            // InternalConcurrLang.g:707:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalConcurrLang.g:713:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:717:1: ( ( '}' ) )
            // InternalConcurrLang.g:718:1: ( '}' )
            {
            // InternalConcurrLang.g:718:1: ( '}' )
            // InternalConcurrLang.g:719:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalConcurrLang.g:729:1: rule__Model__StatementsAssignment : ( ruleStatements ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:733:1: ( ( ruleStatements ) )
            // InternalConcurrLang.g:734:2: ( ruleStatements )
            {
            // InternalConcurrLang.g:734:2: ( ruleStatements )
            // InternalConcurrLang.g:735:3: ruleStatements
            {
             before(grammarAccess.getModelAccess().getStatementsStatementsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__Join__NameAssignment_0_0"
    // InternalConcurrLang.g:744:1: rule__Join__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Join__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:748:1: ( ( RULE_ID ) )
            // InternalConcurrLang.g:749:2: ( RULE_ID )
            {
            // InternalConcurrLang.g:749:2: ( RULE_ID )
            // InternalConcurrLang.g:750:3: RULE_ID
            {
             before(grammarAccess.getJoinAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__NameAssignment_0_0"


    // $ANTLR start "rule__Join__ForkAssignment_3"
    // InternalConcurrLang.g:759:1: rule__Join__ForkAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Join__ForkAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:763:1: ( ( ( RULE_ID ) ) )
            // InternalConcurrLang.g:764:2: ( ( RULE_ID ) )
            {
            // InternalConcurrLang.g:764:2: ( ( RULE_ID ) )
            // InternalConcurrLang.g:765:3: ( RULE_ID )
            {
             before(grammarAccess.getJoinAccess().getForkForkCrossReference_3_0()); 
            // InternalConcurrLang.g:766:3: ( RULE_ID )
            // InternalConcurrLang.g:767:4: RULE_ID
            {
             before(grammarAccess.getJoinAccess().getForkForkIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getForkForkIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getJoinAccess().getForkForkCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__ForkAssignment_3"


    // $ANTLR start "rule__Fork__NameAssignment_1"
    // InternalConcurrLang.g:778:1: rule__Fork__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fork__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:782:1: ( ( RULE_ID ) )
            // InternalConcurrLang.g:783:2: ( RULE_ID )
            {
            // InternalConcurrLang.g:783:2: ( RULE_ID )
            // InternalConcurrLang.g:784:3: RULE_ID
            {
             before(grammarAccess.getForkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__NameAssignment_1"


    // $ANTLR start "rule__Fork__ForkedBlocksAssignment_3"
    // InternalConcurrLang.g:793:1: rule__Fork__ForkedBlocksAssignment_3 : ( ruleBlock ) ;
    public final void rule__Fork__ForkedBlocksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:797:1: ( ( ruleBlock ) )
            // InternalConcurrLang.g:798:2: ( ruleBlock )
            {
            // InternalConcurrLang.g:798:2: ( ruleBlock )
            // InternalConcurrLang.g:799:3: ruleBlock
            {
             before(grammarAccess.getForkAccess().getForkedBlocksBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getForkAccess().getForkedBlocksBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fork__ForkedBlocksAssignment_3"


    // $ANTLR start "rule__Block__StatementsAssignment_3"
    // InternalConcurrLang.g:808:1: rule__Block__StatementsAssignment_3 : ( ruleStatements ) ;
    public final void rule__Block__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:812:1: ( ( ruleStatements ) )
            // InternalConcurrLang.g:813:2: ( ruleStatements )
            {
            // InternalConcurrLang.g:813:2: ( ruleStatements )
            // InternalConcurrLang.g:814:3: ruleStatements
            {
             before(grammarAccess.getBlockAccess().getStatementsStatementsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsStatementsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementsAssignment_3"


    // $ANTLR start "rule__Action__NameAssignment"
    // InternalConcurrLang.g:823:1: rule__Action__NameAssignment : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConcurrLang.g:827:1: ( ( RULE_ID ) )
            // InternalConcurrLang.g:828:2: ( RULE_ID )
            {
            // InternalConcurrLang.g:828:2: ( RULE_ID )
            // InternalConcurrLang.g:829:3: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000011010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});

}