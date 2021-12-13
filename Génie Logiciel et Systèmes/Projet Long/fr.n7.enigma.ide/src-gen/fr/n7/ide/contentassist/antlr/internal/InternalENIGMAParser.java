package fr.n7.ide.contentassist.antlr.internal;

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
import fr.n7.services.ENIGMAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalENIGMAParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jeu'", "'{'", "'}'", "'joueur'", "'objets'", "'objet'", "'de'", "'taille'", "'territoire'", "'debut'", "'fin'", "'chemins'", "'choix'", "'interaction'", "'personne'", "'lieu'", "'chemin'", "'a'", "'action'", "'reponse'", "'>>'", "'avec'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalENIGMAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalENIGMAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalENIGMAParser.tokenNames; }
    public String getGrammarFileName() { return "InternalENIGMA.g"; }


    	private ENIGMAGrammarAccess grammarAccess;

    	public void setGrammarAccess(ENIGMAGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleJeu"
    // InternalENIGMA.g:53:1: entryRuleJeu : ruleJeu EOF ;
    public final void entryRuleJeu() throws RecognitionException {
        try {
            // InternalENIGMA.g:54:1: ( ruleJeu EOF )
            // InternalENIGMA.g:55:1: ruleJeu EOF
            {
             before(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            ruleJeu();

            state._fsp--;

             after(grammarAccess.getJeuRule()); 
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
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalENIGMA.g:62:1: ruleJeu : ( ( rule__Jeu__Group__0 ) ) ;
    public final void ruleJeu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:66:2: ( ( ( rule__Jeu__Group__0 ) ) )
            // InternalENIGMA.g:67:2: ( ( rule__Jeu__Group__0 ) )
            {
            // InternalENIGMA.g:67:2: ( ( rule__Jeu__Group__0 ) )
            // InternalENIGMA.g:68:3: ( rule__Jeu__Group__0 )
            {
             before(grammarAccess.getJeuAccess().getGroup()); 
            // InternalENIGMA.g:69:3: ( rule__Jeu__Group__0 )
            // InternalENIGMA.g:69:4: rule__Jeu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getGroup()); 

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
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRuleJoueur"
    // InternalENIGMA.g:78:1: entryRuleJoueur : ruleJoueur EOF ;
    public final void entryRuleJoueur() throws RecognitionException {
        try {
            // InternalENIGMA.g:79:1: ( ruleJoueur EOF )
            // InternalENIGMA.g:80:1: ruleJoueur EOF
            {
             before(grammarAccess.getJoueurRule()); 
            pushFollow(FOLLOW_1);
            ruleJoueur();

            state._fsp--;

             after(grammarAccess.getJoueurRule()); 
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
    // $ANTLR end "entryRuleJoueur"


    // $ANTLR start "ruleJoueur"
    // InternalENIGMA.g:87:1: ruleJoueur : ( ( rule__Joueur__Group__0 ) ) ;
    public final void ruleJoueur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:91:2: ( ( ( rule__Joueur__Group__0 ) ) )
            // InternalENIGMA.g:92:2: ( ( rule__Joueur__Group__0 ) )
            {
            // InternalENIGMA.g:92:2: ( ( rule__Joueur__Group__0 ) )
            // InternalENIGMA.g:93:3: ( rule__Joueur__Group__0 )
            {
             before(grammarAccess.getJoueurAccess().getGroup()); 
            // InternalENIGMA.g:94:3: ( rule__Joueur__Group__0 )
            // InternalENIGMA.g:94:4: rule__Joueur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getGroup()); 

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
    // $ANTLR end "ruleJoueur"


    // $ANTLR start "entryRuleObjet"
    // InternalENIGMA.g:103:1: entryRuleObjet : ruleObjet EOF ;
    public final void entryRuleObjet() throws RecognitionException {
        try {
            // InternalENIGMA.g:104:1: ( ruleObjet EOF )
            // InternalENIGMA.g:105:1: ruleObjet EOF
            {
             before(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getObjetRule()); 
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
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalENIGMA.g:112:1: ruleObjet : ( ( rule__Objet__Group__0 ) ) ;
    public final void ruleObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:116:2: ( ( ( rule__Objet__Group__0 ) ) )
            // InternalENIGMA.g:117:2: ( ( rule__Objet__Group__0 ) )
            {
            // InternalENIGMA.g:117:2: ( ( rule__Objet__Group__0 ) )
            // InternalENIGMA.g:118:3: ( rule__Objet__Group__0 )
            {
             before(grammarAccess.getObjetAccess().getGroup()); 
            // InternalENIGMA.g:119:3: ( rule__Objet__Group__0 )
            // InternalENIGMA.g:119:4: rule__Objet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getGroup()); 

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
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleTerritoire"
    // InternalENIGMA.g:128:1: entryRuleTerritoire : ruleTerritoire EOF ;
    public final void entryRuleTerritoire() throws RecognitionException {
        try {
            // InternalENIGMA.g:129:1: ( ruleTerritoire EOF )
            // InternalENIGMA.g:130:1: ruleTerritoire EOF
            {
             before(grammarAccess.getTerritoireRule()); 
            pushFollow(FOLLOW_1);
            ruleTerritoire();

            state._fsp--;

             after(grammarAccess.getTerritoireRule()); 
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
    // $ANTLR end "entryRuleTerritoire"


    // $ANTLR start "ruleTerritoire"
    // InternalENIGMA.g:137:1: ruleTerritoire : ( ( rule__Territoire__Group__0 ) ) ;
    public final void ruleTerritoire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:141:2: ( ( ( rule__Territoire__Group__0 ) ) )
            // InternalENIGMA.g:142:2: ( ( rule__Territoire__Group__0 ) )
            {
            // InternalENIGMA.g:142:2: ( ( rule__Territoire__Group__0 ) )
            // InternalENIGMA.g:143:3: ( rule__Territoire__Group__0 )
            {
             before(grammarAccess.getTerritoireAccess().getGroup()); 
            // InternalENIGMA.g:144:3: ( rule__Territoire__Group__0 )
            // InternalENIGMA.g:144:4: rule__Territoire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getGroup()); 

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
    // $ANTLR end "ruleTerritoire"


    // $ANTLR start "entryRuleChoix"
    // InternalENIGMA.g:153:1: entryRuleChoix : ruleChoix EOF ;
    public final void entryRuleChoix() throws RecognitionException {
        try {
            // InternalENIGMA.g:154:1: ( ruleChoix EOF )
            // InternalENIGMA.g:155:1: ruleChoix EOF
            {
             before(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getChoixRule()); 
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
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalENIGMA.g:162:1: ruleChoix : ( ( rule__Choix__Group__0 ) ) ;
    public final void ruleChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:166:2: ( ( ( rule__Choix__Group__0 ) ) )
            // InternalENIGMA.g:167:2: ( ( rule__Choix__Group__0 ) )
            {
            // InternalENIGMA.g:167:2: ( ( rule__Choix__Group__0 ) )
            // InternalENIGMA.g:168:3: ( rule__Choix__Group__0 )
            {
             before(grammarAccess.getChoixAccess().getGroup()); 
            // InternalENIGMA.g:169:3: ( rule__Choix__Group__0 )
            // InternalENIGMA.g:169:4: rule__Choix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getGroup()); 

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
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleInteraction"
    // InternalENIGMA.g:178:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalENIGMA.g:179:1: ( ruleInteraction EOF )
            // InternalENIGMA.g:180:1: ruleInteraction EOF
            {
             before(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getInteractionRule()); 
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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalENIGMA.g:187:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:191:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalENIGMA.g:192:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalENIGMA.g:192:2: ( ( rule__Interaction__Group__0 ) )
            // InternalENIGMA.g:193:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalENIGMA.g:194:3: ( rule__Interaction__Group__0 )
            // InternalENIGMA.g:194:4: rule__Interaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getGroup()); 

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRulePersonne"
    // InternalENIGMA.g:203:1: entryRulePersonne : rulePersonne EOF ;
    public final void entryRulePersonne() throws RecognitionException {
        try {
            // InternalENIGMA.g:204:1: ( rulePersonne EOF )
            // InternalENIGMA.g:205:1: rulePersonne EOF
            {
             before(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getPersonneRule()); 
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
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalENIGMA.g:212:1: rulePersonne : ( ( rule__Personne__Group__0 ) ) ;
    public final void rulePersonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:216:2: ( ( ( rule__Personne__Group__0 ) ) )
            // InternalENIGMA.g:217:2: ( ( rule__Personne__Group__0 ) )
            {
            // InternalENIGMA.g:217:2: ( ( rule__Personne__Group__0 ) )
            // InternalENIGMA.g:218:3: ( rule__Personne__Group__0 )
            {
             before(grammarAccess.getPersonneAccess().getGroup()); 
            // InternalENIGMA.g:219:3: ( rule__Personne__Group__0 )
            // InternalENIGMA.g:219:4: rule__Personne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getGroup()); 

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
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRuleLieu"
    // InternalENIGMA.g:228:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalENIGMA.g:229:1: ( ruleLieu EOF )
            // InternalENIGMA.g:230:1: ruleLieu EOF
            {
             before(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getLieuRule()); 
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
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalENIGMA.g:237:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:241:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalENIGMA.g:242:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalENIGMA.g:242:2: ( ( rule__Lieu__Group__0 ) )
            // InternalENIGMA.g:243:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalENIGMA.g:244:3: ( rule__Lieu__Group__0 )
            // InternalENIGMA.g:244:4: rule__Lieu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getGroup()); 

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
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRuleChemin"
    // InternalENIGMA.g:253:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalENIGMA.g:254:1: ( ruleChemin EOF )
            // InternalENIGMA.g:255:1: ruleChemin EOF
            {
             before(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getCheminRule()); 
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
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalENIGMA.g:262:1: ruleChemin : ( ( rule__Chemin__Group__0 ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:266:2: ( ( ( rule__Chemin__Group__0 ) ) )
            // InternalENIGMA.g:267:2: ( ( rule__Chemin__Group__0 ) )
            {
            // InternalENIGMA.g:267:2: ( ( rule__Chemin__Group__0 ) )
            // InternalENIGMA.g:268:3: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalENIGMA.g:269:3: ( rule__Chemin__Group__0 )
            // InternalENIGMA.g:269:4: rule__Chemin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getGroup()); 

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
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRuleQualification"
    // InternalENIGMA.g:278:1: entryRuleQualification : ruleQualification EOF ;
    public final void entryRuleQualification() throws RecognitionException {
        try {
            // InternalENIGMA.g:279:1: ( ruleQualification EOF )
            // InternalENIGMA.g:280:1: ruleQualification EOF
            {
             before(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getQualificationRule()); 
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
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalENIGMA.g:287:1: ruleQualification : ( ( rule__Qualification__QualificationAssignment ) ) ;
    public final void ruleQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:291:2: ( ( ( rule__Qualification__QualificationAssignment ) ) )
            // InternalENIGMA.g:292:2: ( ( rule__Qualification__QualificationAssignment ) )
            {
            // InternalENIGMA.g:292:2: ( ( rule__Qualification__QualificationAssignment ) )
            // InternalENIGMA.g:293:3: ( rule__Qualification__QualificationAssignment )
            {
             before(grammarAccess.getQualificationAccess().getQualificationAssignment()); 
            // InternalENIGMA.g:294:3: ( rule__Qualification__QualificationAssignment )
            // InternalENIGMA.g:294:4: rule__Qualification__QualificationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Qualification__QualificationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQualificationAccess().getQualificationAssignment()); 

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
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleAction"
    // InternalENIGMA.g:303:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalENIGMA.g:304:1: ( ruleAction EOF )
            // InternalENIGMA.g:305:1: ruleAction EOF
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
    // InternalENIGMA.g:312:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:316:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalENIGMA.g:317:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalENIGMA.g:317:2: ( ( rule__Action__Group__0 ) )
            // InternalENIGMA.g:318:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalENIGMA.g:319:3: ( rule__Action__Group__0 )
            // InternalENIGMA.g:319:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleReponse"
    // InternalENIGMA.g:328:1: entryRuleReponse : ruleReponse EOF ;
    public final void entryRuleReponse() throws RecognitionException {
        try {
            // InternalENIGMA.g:329:1: ( ruleReponse EOF )
            // InternalENIGMA.g:330:1: ruleReponse EOF
            {
             before(grammarAccess.getReponseRule()); 
            pushFollow(FOLLOW_1);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getReponseRule()); 
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
    // $ANTLR end "entryRuleReponse"


    // $ANTLR start "ruleReponse"
    // InternalENIGMA.g:337:1: ruleReponse : ( ( rule__Reponse__Group__0 ) ) ;
    public final void ruleReponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:341:2: ( ( ( rule__Reponse__Group__0 ) ) )
            // InternalENIGMA.g:342:2: ( ( rule__Reponse__Group__0 ) )
            {
            // InternalENIGMA.g:342:2: ( ( rule__Reponse__Group__0 ) )
            // InternalENIGMA.g:343:3: ( rule__Reponse__Group__0 )
            {
             before(grammarAccess.getReponseAccess().getGroup()); 
            // InternalENIGMA.g:344:3: ( rule__Reponse__Group__0 )
            // InternalENIGMA.g:344:4: rule__Reponse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getGroup()); 

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
    // $ANTLR end "ruleReponse"


    // $ANTLR start "rule__Jeu__Group__0"
    // InternalENIGMA.g:352:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:356:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalENIGMA.g:357:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Jeu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__1();

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
    // $ANTLR end "rule__Jeu__Group__0"


    // $ANTLR start "rule__Jeu__Group__0__Impl"
    // InternalENIGMA.g:364:1: rule__Jeu__Group__0__Impl : ( 'jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:368:1: ( ( 'jeu' ) )
            // InternalENIGMA.g:369:1: ( 'jeu' )
            {
            // InternalENIGMA.g:369:1: ( 'jeu' )
            // InternalENIGMA.g:370:2: 'jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getJeuKeyword_0()); 

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
    // $ANTLR end "rule__Jeu__Group__0__Impl"


    // $ANTLR start "rule__Jeu__Group__1"
    // InternalENIGMA.g:379:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:383:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalENIGMA.g:384:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Jeu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__2();

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
    // $ANTLR end "rule__Jeu__Group__1"


    // $ANTLR start "rule__Jeu__Group__1__Impl"
    // InternalENIGMA.g:391:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:395:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalENIGMA.g:396:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:396:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalENIGMA.g:397:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:398:2: ( rule__Jeu__NameAssignment_1 )
            // InternalENIGMA.g:398:3: rule__Jeu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Jeu__Group__1__Impl"


    // $ANTLR start "rule__Jeu__Group__2"
    // InternalENIGMA.g:406:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:410:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalENIGMA.g:411:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Jeu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__3();

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
    // $ANTLR end "rule__Jeu__Group__2"


    // $ANTLR start "rule__Jeu__Group__2__Impl"
    // InternalENIGMA.g:418:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:422:1: ( ( '{' ) )
            // InternalENIGMA.g:423:1: ( '{' )
            {
            // InternalENIGMA.g:423:1: ( '{' )
            // InternalENIGMA.g:424:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Jeu__Group__2__Impl"


    // $ANTLR start "rule__Jeu__Group__3"
    // InternalENIGMA.g:433:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:437:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalENIGMA.g:438:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Jeu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__4();

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
    // $ANTLR end "rule__Jeu__Group__3"


    // $ANTLR start "rule__Jeu__Group__3__Impl"
    // InternalENIGMA.g:445:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__TerritoireAssignment_3 ) ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:449:1: ( ( ( rule__Jeu__TerritoireAssignment_3 ) ) )
            // InternalENIGMA.g:450:1: ( ( rule__Jeu__TerritoireAssignment_3 ) )
            {
            // InternalENIGMA.g:450:1: ( ( rule__Jeu__TerritoireAssignment_3 ) )
            // InternalENIGMA.g:451:2: ( rule__Jeu__TerritoireAssignment_3 )
            {
             before(grammarAccess.getJeuAccess().getTerritoireAssignment_3()); 
            // InternalENIGMA.g:452:2: ( rule__Jeu__TerritoireAssignment_3 )
            // InternalENIGMA.g:452:3: rule__Jeu__TerritoireAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__TerritoireAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getTerritoireAssignment_3()); 

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
    // $ANTLR end "rule__Jeu__Group__3__Impl"


    // $ANTLR start "rule__Jeu__Group__4"
    // InternalENIGMA.g:460:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl rule__Jeu__Group__5 ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:464:1: ( rule__Jeu__Group__4__Impl rule__Jeu__Group__5 )
            // InternalENIGMA.g:465:2: rule__Jeu__Group__4__Impl rule__Jeu__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Jeu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jeu__Group__5();

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
    // $ANTLR end "rule__Jeu__Group__4"


    // $ANTLR start "rule__Jeu__Group__4__Impl"
    // InternalENIGMA.g:472:1: rule__Jeu__Group__4__Impl : ( ( rule__Jeu__JoueurAssignment_4 ) ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:476:1: ( ( ( rule__Jeu__JoueurAssignment_4 ) ) )
            // InternalENIGMA.g:477:1: ( ( rule__Jeu__JoueurAssignment_4 ) )
            {
            // InternalENIGMA.g:477:1: ( ( rule__Jeu__JoueurAssignment_4 ) )
            // InternalENIGMA.g:478:2: ( rule__Jeu__JoueurAssignment_4 )
            {
             before(grammarAccess.getJeuAccess().getJoueurAssignment_4()); 
            // InternalENIGMA.g:479:2: ( rule__Jeu__JoueurAssignment_4 )
            // InternalENIGMA.g:479:3: rule__Jeu__JoueurAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__JoueurAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJeuAccess().getJoueurAssignment_4()); 

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
    // $ANTLR end "rule__Jeu__Group__4__Impl"


    // $ANTLR start "rule__Jeu__Group__5"
    // InternalENIGMA.g:487:1: rule__Jeu__Group__5 : rule__Jeu__Group__5__Impl ;
    public final void rule__Jeu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:491:1: ( rule__Jeu__Group__5__Impl )
            // InternalENIGMA.g:492:2: rule__Jeu__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__5__Impl();

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
    // $ANTLR end "rule__Jeu__Group__5"


    // $ANTLR start "rule__Jeu__Group__5__Impl"
    // InternalENIGMA.g:498:1: rule__Jeu__Group__5__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:502:1: ( ( '}' ) )
            // InternalENIGMA.g:503:1: ( '}' )
            {
            // InternalENIGMA.g:503:1: ( '}' )
            // InternalENIGMA.g:504:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Jeu__Group__5__Impl"


    // $ANTLR start "rule__Joueur__Group__0"
    // InternalENIGMA.g:514:1: rule__Joueur__Group__0 : rule__Joueur__Group__0__Impl rule__Joueur__Group__1 ;
    public final void rule__Joueur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:518:1: ( rule__Joueur__Group__0__Impl rule__Joueur__Group__1 )
            // InternalENIGMA.g:519:2: rule__Joueur__Group__0__Impl rule__Joueur__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Joueur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__1();

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
    // $ANTLR end "rule__Joueur__Group__0"


    // $ANTLR start "rule__Joueur__Group__0__Impl"
    // InternalENIGMA.g:526:1: rule__Joueur__Group__0__Impl : ( 'joueur' ) ;
    public final void rule__Joueur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:530:1: ( ( 'joueur' ) )
            // InternalENIGMA.g:531:1: ( 'joueur' )
            {
            // InternalENIGMA.g:531:1: ( 'joueur' )
            // InternalENIGMA.g:532:2: 'joueur'
            {
             before(grammarAccess.getJoueurAccess().getJoueurKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getJoueurKeyword_0()); 

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
    // $ANTLR end "rule__Joueur__Group__0__Impl"


    // $ANTLR start "rule__Joueur__Group__1"
    // InternalENIGMA.g:541:1: rule__Joueur__Group__1 : rule__Joueur__Group__1__Impl rule__Joueur__Group__2 ;
    public final void rule__Joueur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:545:1: ( rule__Joueur__Group__1__Impl rule__Joueur__Group__2 )
            // InternalENIGMA.g:546:2: rule__Joueur__Group__1__Impl rule__Joueur__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Joueur__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__2();

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
    // $ANTLR end "rule__Joueur__Group__1"


    // $ANTLR start "rule__Joueur__Group__1__Impl"
    // InternalENIGMA.g:553:1: rule__Joueur__Group__1__Impl : ( ( rule__Joueur__NameAssignment_1 ) ) ;
    public final void rule__Joueur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:557:1: ( ( ( rule__Joueur__NameAssignment_1 ) ) )
            // InternalENIGMA.g:558:1: ( ( rule__Joueur__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:558:1: ( ( rule__Joueur__NameAssignment_1 ) )
            // InternalENIGMA.g:559:2: ( rule__Joueur__NameAssignment_1 )
            {
             before(grammarAccess.getJoueurAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:560:2: ( rule__Joueur__NameAssignment_1 )
            // InternalENIGMA.g:560:3: rule__Joueur__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Joueur__Group__1__Impl"


    // $ANTLR start "rule__Joueur__Group__2"
    // InternalENIGMA.g:568:1: rule__Joueur__Group__2 : rule__Joueur__Group__2__Impl rule__Joueur__Group__3 ;
    public final void rule__Joueur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:572:1: ( rule__Joueur__Group__2__Impl rule__Joueur__Group__3 )
            // InternalENIGMA.g:573:2: rule__Joueur__Group__2__Impl rule__Joueur__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Joueur__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__3();

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
    // $ANTLR end "rule__Joueur__Group__2"


    // $ANTLR start "rule__Joueur__Group__2__Impl"
    // InternalENIGMA.g:580:1: rule__Joueur__Group__2__Impl : ( '{' ) ;
    public final void rule__Joueur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:584:1: ( ( '{' ) )
            // InternalENIGMA.g:585:1: ( '{' )
            {
            // InternalENIGMA.g:585:1: ( '{' )
            // InternalENIGMA.g:586:2: '{'
            {
             before(grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Joueur__Group__2__Impl"


    // $ANTLR start "rule__Joueur__Group__3"
    // InternalENIGMA.g:595:1: rule__Joueur__Group__3 : rule__Joueur__Group__3__Impl rule__Joueur__Group__4 ;
    public final void rule__Joueur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:599:1: ( rule__Joueur__Group__3__Impl rule__Joueur__Group__4 )
            // InternalENIGMA.g:600:2: rule__Joueur__Group__3__Impl rule__Joueur__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Joueur__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__4();

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
    // $ANTLR end "rule__Joueur__Group__3"


    // $ANTLR start "rule__Joueur__Group__3__Impl"
    // InternalENIGMA.g:607:1: rule__Joueur__Group__3__Impl : ( 'objets' ) ;
    public final void rule__Joueur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:611:1: ( ( 'objets' ) )
            // InternalENIGMA.g:612:1: ( 'objets' )
            {
            // InternalENIGMA.g:612:1: ( 'objets' )
            // InternalENIGMA.g:613:2: 'objets'
            {
             before(grammarAccess.getJoueurAccess().getObjetsKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getObjetsKeyword_3()); 

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
    // $ANTLR end "rule__Joueur__Group__3__Impl"


    // $ANTLR start "rule__Joueur__Group__4"
    // InternalENIGMA.g:622:1: rule__Joueur__Group__4 : rule__Joueur__Group__4__Impl rule__Joueur__Group__5 ;
    public final void rule__Joueur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:626:1: ( rule__Joueur__Group__4__Impl rule__Joueur__Group__5 )
            // InternalENIGMA.g:627:2: rule__Joueur__Group__4__Impl rule__Joueur__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Joueur__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__5();

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
    // $ANTLR end "rule__Joueur__Group__4"


    // $ANTLR start "rule__Joueur__Group__4__Impl"
    // InternalENIGMA.g:634:1: rule__Joueur__Group__4__Impl : ( '{' ) ;
    public final void rule__Joueur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:638:1: ( ( '{' ) )
            // InternalENIGMA.g:639:1: ( '{' )
            {
            // InternalENIGMA.g:639:1: ( '{' )
            // InternalENIGMA.g:640:2: '{'
            {
             before(grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Joueur__Group__4__Impl"


    // $ANTLR start "rule__Joueur__Group__5"
    // InternalENIGMA.g:649:1: rule__Joueur__Group__5 : rule__Joueur__Group__5__Impl rule__Joueur__Group__6 ;
    public final void rule__Joueur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:653:1: ( rule__Joueur__Group__5__Impl rule__Joueur__Group__6 )
            // InternalENIGMA.g:654:2: rule__Joueur__Group__5__Impl rule__Joueur__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Joueur__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__6();

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
    // $ANTLR end "rule__Joueur__Group__5"


    // $ANTLR start "rule__Joueur__Group__5__Impl"
    // InternalENIGMA.g:661:1: rule__Joueur__Group__5__Impl : ( ( rule__Joueur__ObjetAssignment_5 )* ) ;
    public final void rule__Joueur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:665:1: ( ( ( rule__Joueur__ObjetAssignment_5 )* ) )
            // InternalENIGMA.g:666:1: ( ( rule__Joueur__ObjetAssignment_5 )* )
            {
            // InternalENIGMA.g:666:1: ( ( rule__Joueur__ObjetAssignment_5 )* )
            // InternalENIGMA.g:667:2: ( rule__Joueur__ObjetAssignment_5 )*
            {
             before(grammarAccess.getJoueurAccess().getObjetAssignment_5()); 
            // InternalENIGMA.g:668:2: ( rule__Joueur__ObjetAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalENIGMA.g:668:3: rule__Joueur__ObjetAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Joueur__ObjetAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getJoueurAccess().getObjetAssignment_5()); 

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
    // $ANTLR end "rule__Joueur__Group__5__Impl"


    // $ANTLR start "rule__Joueur__Group__6"
    // InternalENIGMA.g:676:1: rule__Joueur__Group__6 : rule__Joueur__Group__6__Impl rule__Joueur__Group__7 ;
    public final void rule__Joueur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:680:1: ( rule__Joueur__Group__6__Impl rule__Joueur__Group__7 )
            // InternalENIGMA.g:681:2: rule__Joueur__Group__6__Impl rule__Joueur__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Joueur__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__7();

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
    // $ANTLR end "rule__Joueur__Group__6"


    // $ANTLR start "rule__Joueur__Group__6__Impl"
    // InternalENIGMA.g:688:1: rule__Joueur__Group__6__Impl : ( '}' ) ;
    public final void rule__Joueur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:692:1: ( ( '}' ) )
            // InternalENIGMA.g:693:1: ( '}' )
            {
            // InternalENIGMA.g:693:1: ( '}' )
            // InternalENIGMA.g:694:2: '}'
            {
             before(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Joueur__Group__6__Impl"


    // $ANTLR start "rule__Joueur__Group__7"
    // InternalENIGMA.g:703:1: rule__Joueur__Group__7 : rule__Joueur__Group__7__Impl ;
    public final void rule__Joueur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:707:1: ( rule__Joueur__Group__7__Impl )
            // InternalENIGMA.g:708:2: rule__Joueur__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Group__7__Impl();

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
    // $ANTLR end "rule__Joueur__Group__7"


    // $ANTLR start "rule__Joueur__Group__7__Impl"
    // InternalENIGMA.g:714:1: rule__Joueur__Group__7__Impl : ( '}' ) ;
    public final void rule__Joueur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:718:1: ( ( '}' ) )
            // InternalENIGMA.g:719:1: ( '}' )
            {
            // InternalENIGMA.g:719:1: ( '}' )
            // InternalENIGMA.g:720:2: '}'
            {
             before(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Joueur__Group__7__Impl"


    // $ANTLR start "rule__Objet__Group__0"
    // InternalENIGMA.g:730:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:734:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalENIGMA.g:735:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Objet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__1();

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
    // $ANTLR end "rule__Objet__Group__0"


    // $ANTLR start "rule__Objet__Group__0__Impl"
    // InternalENIGMA.g:742:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:746:1: ( ( 'objet' ) )
            // InternalENIGMA.g:747:1: ( 'objet' )
            {
            // InternalENIGMA.g:747:1: ( 'objet' )
            // InternalENIGMA.g:748:2: 'objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getObjetKeyword_0()); 

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
    // $ANTLR end "rule__Objet__Group__0__Impl"


    // $ANTLR start "rule__Objet__Group__1"
    // InternalENIGMA.g:757:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:761:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalENIGMA.g:762:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Objet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__2();

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
    // $ANTLR end "rule__Objet__Group__1"


    // $ANTLR start "rule__Objet__Group__1__Impl"
    // InternalENIGMA.g:769:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:773:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalENIGMA.g:774:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:774:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalENIGMA.g:775:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:776:2: ( rule__Objet__NameAssignment_1 )
            // InternalENIGMA.g:776:3: rule__Objet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Objet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Objet__Group__1__Impl"


    // $ANTLR start "rule__Objet__Group__2"
    // InternalENIGMA.g:784:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:788:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalENIGMA.g:789:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Objet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__3();

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
    // $ANTLR end "rule__Objet__Group__2"


    // $ANTLR start "rule__Objet__Group__2__Impl"
    // InternalENIGMA.g:796:1: rule__Objet__Group__2__Impl : ( 'de' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:800:1: ( ( 'de' ) )
            // InternalENIGMA.g:801:1: ( 'de' )
            {
            // InternalENIGMA.g:801:1: ( 'de' )
            // InternalENIGMA.g:802:2: 'de'
            {
             before(grammarAccess.getObjetAccess().getDeKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getDeKeyword_2()); 

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
    // $ANTLR end "rule__Objet__Group__2__Impl"


    // $ANTLR start "rule__Objet__Group__3"
    // InternalENIGMA.g:811:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:815:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalENIGMA.g:816:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Objet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__4();

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
    // $ANTLR end "rule__Objet__Group__3"


    // $ANTLR start "rule__Objet__Group__3__Impl"
    // InternalENIGMA.g:823:1: rule__Objet__Group__3__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:827:1: ( ( 'taille' ) )
            // InternalENIGMA.g:828:1: ( 'taille' )
            {
            // InternalENIGMA.g:828:1: ( 'taille' )
            // InternalENIGMA.g:829:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleKeyword_3()); 

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
    // $ANTLR end "rule__Objet__Group__3__Impl"


    // $ANTLR start "rule__Objet__Group__4"
    // InternalENIGMA.g:838:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:842:1: ( rule__Objet__Group__4__Impl )
            // InternalENIGMA.g:843:2: rule__Objet__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__4__Impl();

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
    // $ANTLR end "rule__Objet__Group__4"


    // $ANTLR start "rule__Objet__Group__4__Impl"
    // InternalENIGMA.g:849:1: rule__Objet__Group__4__Impl : ( ( rule__Objet__TailleAssignment_4 ) ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:853:1: ( ( ( rule__Objet__TailleAssignment_4 ) ) )
            // InternalENIGMA.g:854:1: ( ( rule__Objet__TailleAssignment_4 ) )
            {
            // InternalENIGMA.g:854:1: ( ( rule__Objet__TailleAssignment_4 ) )
            // InternalENIGMA.g:855:2: ( rule__Objet__TailleAssignment_4 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_4()); 
            // InternalENIGMA.g:856:2: ( rule__Objet__TailleAssignment_4 )
            // InternalENIGMA.g:856:3: rule__Objet__TailleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TailleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTailleAssignment_4()); 

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
    // $ANTLR end "rule__Objet__Group__4__Impl"


    // $ANTLR start "rule__Territoire__Group__0"
    // InternalENIGMA.g:865:1: rule__Territoire__Group__0 : rule__Territoire__Group__0__Impl rule__Territoire__Group__1 ;
    public final void rule__Territoire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:869:1: ( rule__Territoire__Group__0__Impl rule__Territoire__Group__1 )
            // InternalENIGMA.g:870:2: rule__Territoire__Group__0__Impl rule__Territoire__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Territoire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__1();

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
    // $ANTLR end "rule__Territoire__Group__0"


    // $ANTLR start "rule__Territoire__Group__0__Impl"
    // InternalENIGMA.g:877:1: rule__Territoire__Group__0__Impl : ( 'territoire' ) ;
    public final void rule__Territoire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:881:1: ( ( 'territoire' ) )
            // InternalENIGMA.g:882:1: ( 'territoire' )
            {
            // InternalENIGMA.g:882:1: ( 'territoire' )
            // InternalENIGMA.g:883:2: 'territoire'
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getTerritoireKeyword_0()); 

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
    // $ANTLR end "rule__Territoire__Group__0__Impl"


    // $ANTLR start "rule__Territoire__Group__1"
    // InternalENIGMA.g:892:1: rule__Territoire__Group__1 : rule__Territoire__Group__1__Impl rule__Territoire__Group__2 ;
    public final void rule__Territoire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:896:1: ( rule__Territoire__Group__1__Impl rule__Territoire__Group__2 )
            // InternalENIGMA.g:897:2: rule__Territoire__Group__1__Impl rule__Territoire__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Territoire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__2();

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
    // $ANTLR end "rule__Territoire__Group__1"


    // $ANTLR start "rule__Territoire__Group__1__Impl"
    // InternalENIGMA.g:904:1: rule__Territoire__Group__1__Impl : ( ( rule__Territoire__NameAssignment_1 ) ) ;
    public final void rule__Territoire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:908:1: ( ( ( rule__Territoire__NameAssignment_1 ) ) )
            // InternalENIGMA.g:909:1: ( ( rule__Territoire__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:909:1: ( ( rule__Territoire__NameAssignment_1 ) )
            // InternalENIGMA.g:910:2: ( rule__Territoire__NameAssignment_1 )
            {
             before(grammarAccess.getTerritoireAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:911:2: ( rule__Territoire__NameAssignment_1 )
            // InternalENIGMA.g:911:3: rule__Territoire__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Territoire__Group__1__Impl"


    // $ANTLR start "rule__Territoire__Group__2"
    // InternalENIGMA.g:919:1: rule__Territoire__Group__2 : rule__Territoire__Group__2__Impl rule__Territoire__Group__3 ;
    public final void rule__Territoire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:923:1: ( rule__Territoire__Group__2__Impl rule__Territoire__Group__3 )
            // InternalENIGMA.g:924:2: rule__Territoire__Group__2__Impl rule__Territoire__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Territoire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__3();

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
    // $ANTLR end "rule__Territoire__Group__2"


    // $ANTLR start "rule__Territoire__Group__2__Impl"
    // InternalENIGMA.g:931:1: rule__Territoire__Group__2__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:935:1: ( ( '{' ) )
            // InternalENIGMA.g:936:1: ( '{' )
            {
            // InternalENIGMA.g:936:1: ( '{' )
            // InternalENIGMA.g:937:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Territoire__Group__2__Impl"


    // $ANTLR start "rule__Territoire__Group__3"
    // InternalENIGMA.g:946:1: rule__Territoire__Group__3 : rule__Territoire__Group__3__Impl rule__Territoire__Group__4 ;
    public final void rule__Territoire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:950:1: ( rule__Territoire__Group__3__Impl rule__Territoire__Group__4 )
            // InternalENIGMA.g:951:2: rule__Territoire__Group__3__Impl rule__Territoire__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Territoire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__4();

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
    // $ANTLR end "rule__Territoire__Group__3"


    // $ANTLR start "rule__Territoire__Group__3__Impl"
    // InternalENIGMA.g:958:1: rule__Territoire__Group__3__Impl : ( 'debut' ) ;
    public final void rule__Territoire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:962:1: ( ( 'debut' ) )
            // InternalENIGMA.g:963:1: ( 'debut' )
            {
            // InternalENIGMA.g:963:1: ( 'debut' )
            // InternalENIGMA.g:964:2: 'debut'
            {
             before(grammarAccess.getTerritoireAccess().getDebutKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getDebutKeyword_3()); 

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
    // $ANTLR end "rule__Territoire__Group__3__Impl"


    // $ANTLR start "rule__Territoire__Group__4"
    // InternalENIGMA.g:973:1: rule__Territoire__Group__4 : rule__Territoire__Group__4__Impl rule__Territoire__Group__5 ;
    public final void rule__Territoire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:977:1: ( rule__Territoire__Group__4__Impl rule__Territoire__Group__5 )
            // InternalENIGMA.g:978:2: rule__Territoire__Group__4__Impl rule__Territoire__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Territoire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__5();

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
    // $ANTLR end "rule__Territoire__Group__4"


    // $ANTLR start "rule__Territoire__Group__4__Impl"
    // InternalENIGMA.g:985:1: rule__Territoire__Group__4__Impl : ( ( rule__Territoire__LieuDebutAssignment_4 ) ) ;
    public final void rule__Territoire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:989:1: ( ( ( rule__Territoire__LieuDebutAssignment_4 ) ) )
            // InternalENIGMA.g:990:1: ( ( rule__Territoire__LieuDebutAssignment_4 ) )
            {
            // InternalENIGMA.g:990:1: ( ( rule__Territoire__LieuDebutAssignment_4 ) )
            // InternalENIGMA.g:991:2: ( rule__Territoire__LieuDebutAssignment_4 )
            {
             before(grammarAccess.getTerritoireAccess().getLieuDebutAssignment_4()); 
            // InternalENIGMA.g:992:2: ( rule__Territoire__LieuDebutAssignment_4 )
            // InternalENIGMA.g:992:3: rule__Territoire__LieuDebutAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__LieuDebutAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTerritoireAccess().getLieuDebutAssignment_4()); 

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
    // $ANTLR end "rule__Territoire__Group__4__Impl"


    // $ANTLR start "rule__Territoire__Group__5"
    // InternalENIGMA.g:1000:1: rule__Territoire__Group__5 : rule__Territoire__Group__5__Impl rule__Territoire__Group__6 ;
    public final void rule__Territoire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1004:1: ( rule__Territoire__Group__5__Impl rule__Territoire__Group__6 )
            // InternalENIGMA.g:1005:2: rule__Territoire__Group__5__Impl rule__Territoire__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Territoire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__6();

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
    // $ANTLR end "rule__Territoire__Group__5"


    // $ANTLR start "rule__Territoire__Group__5__Impl"
    // InternalENIGMA.g:1012:1: rule__Territoire__Group__5__Impl : ( 'fin' ) ;
    public final void rule__Territoire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1016:1: ( ( 'fin' ) )
            // InternalENIGMA.g:1017:1: ( 'fin' )
            {
            // InternalENIGMA.g:1017:1: ( 'fin' )
            // InternalENIGMA.g:1018:2: 'fin'
            {
             before(grammarAccess.getTerritoireAccess().getFinKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getFinKeyword_5()); 

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
    // $ANTLR end "rule__Territoire__Group__5__Impl"


    // $ANTLR start "rule__Territoire__Group__6"
    // InternalENIGMA.g:1027:1: rule__Territoire__Group__6 : rule__Territoire__Group__6__Impl rule__Territoire__Group__7 ;
    public final void rule__Territoire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1031:1: ( rule__Territoire__Group__6__Impl rule__Territoire__Group__7 )
            // InternalENIGMA.g:1032:2: rule__Territoire__Group__6__Impl rule__Territoire__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Territoire__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__7();

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
    // $ANTLR end "rule__Territoire__Group__6"


    // $ANTLR start "rule__Territoire__Group__6__Impl"
    // InternalENIGMA.g:1039:1: rule__Territoire__Group__6__Impl : ( ( rule__Territoire__LieuxFinAssignment_6 )* ) ;
    public final void rule__Territoire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1043:1: ( ( ( rule__Territoire__LieuxFinAssignment_6 )* ) )
            // InternalENIGMA.g:1044:1: ( ( rule__Territoire__LieuxFinAssignment_6 )* )
            {
            // InternalENIGMA.g:1044:1: ( ( rule__Territoire__LieuxFinAssignment_6 )* )
            // InternalENIGMA.g:1045:2: ( rule__Territoire__LieuxFinAssignment_6 )*
            {
             before(grammarAccess.getTerritoireAccess().getLieuxFinAssignment_6()); 
            // InternalENIGMA.g:1046:2: ( rule__Territoire__LieuxFinAssignment_6 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalENIGMA.g:1046:3: rule__Territoire__LieuxFinAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Territoire__LieuxFinAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getLieuxFinAssignment_6()); 

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
    // $ANTLR end "rule__Territoire__Group__6__Impl"


    // $ANTLR start "rule__Territoire__Group__7"
    // InternalENIGMA.g:1054:1: rule__Territoire__Group__7 : rule__Territoire__Group__7__Impl rule__Territoire__Group__8 ;
    public final void rule__Territoire__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1058:1: ( rule__Territoire__Group__7__Impl rule__Territoire__Group__8 )
            // InternalENIGMA.g:1059:2: rule__Territoire__Group__7__Impl rule__Territoire__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Territoire__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__8();

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
    // $ANTLR end "rule__Territoire__Group__7"


    // $ANTLR start "rule__Territoire__Group__7__Impl"
    // InternalENIGMA.g:1066:1: rule__Territoire__Group__7__Impl : ( 'chemins' ) ;
    public final void rule__Territoire__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1070:1: ( ( 'chemins' ) )
            // InternalENIGMA.g:1071:1: ( 'chemins' )
            {
            // InternalENIGMA.g:1071:1: ( 'chemins' )
            // InternalENIGMA.g:1072:2: 'chemins'
            {
             before(grammarAccess.getTerritoireAccess().getCheminsKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getCheminsKeyword_7()); 

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
    // $ANTLR end "rule__Territoire__Group__7__Impl"


    // $ANTLR start "rule__Territoire__Group__8"
    // InternalENIGMA.g:1081:1: rule__Territoire__Group__8 : rule__Territoire__Group__8__Impl rule__Territoire__Group__9 ;
    public final void rule__Territoire__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1085:1: ( rule__Territoire__Group__8__Impl rule__Territoire__Group__9 )
            // InternalENIGMA.g:1086:2: rule__Territoire__Group__8__Impl rule__Territoire__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Territoire__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__9();

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
    // $ANTLR end "rule__Territoire__Group__8"


    // $ANTLR start "rule__Territoire__Group__8__Impl"
    // InternalENIGMA.g:1093:1: rule__Territoire__Group__8__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1097:1: ( ( '{' ) )
            // InternalENIGMA.g:1098:1: ( '{' )
            {
            // InternalENIGMA.g:1098:1: ( '{' )
            // InternalENIGMA.g:1099:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Territoire__Group__8__Impl"


    // $ANTLR start "rule__Territoire__Group__9"
    // InternalENIGMA.g:1108:1: rule__Territoire__Group__9 : rule__Territoire__Group__9__Impl rule__Territoire__Group__10 ;
    public final void rule__Territoire__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1112:1: ( rule__Territoire__Group__9__Impl rule__Territoire__Group__10 )
            // InternalENIGMA.g:1113:2: rule__Territoire__Group__9__Impl rule__Territoire__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Territoire__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__10();

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
    // $ANTLR end "rule__Territoire__Group__9"


    // $ANTLR start "rule__Territoire__Group__9__Impl"
    // InternalENIGMA.g:1120:1: rule__Territoire__Group__9__Impl : ( ( rule__Territoire__CheminsAssignment_9 )* ) ;
    public final void rule__Territoire__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1124:1: ( ( ( rule__Territoire__CheminsAssignment_9 )* ) )
            // InternalENIGMA.g:1125:1: ( ( rule__Territoire__CheminsAssignment_9 )* )
            {
            // InternalENIGMA.g:1125:1: ( ( rule__Territoire__CheminsAssignment_9 )* )
            // InternalENIGMA.g:1126:2: ( rule__Territoire__CheminsAssignment_9 )*
            {
             before(grammarAccess.getTerritoireAccess().getCheminsAssignment_9()); 
            // InternalENIGMA.g:1127:2: ( rule__Territoire__CheminsAssignment_9 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalENIGMA.g:1127:3: rule__Territoire__CheminsAssignment_9
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Territoire__CheminsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getCheminsAssignment_9()); 

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
    // $ANTLR end "rule__Territoire__Group__9__Impl"


    // $ANTLR start "rule__Territoire__Group__10"
    // InternalENIGMA.g:1135:1: rule__Territoire__Group__10 : rule__Territoire__Group__10__Impl rule__Territoire__Group__11 ;
    public final void rule__Territoire__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1139:1: ( rule__Territoire__Group__10__Impl rule__Territoire__Group__11 )
            // InternalENIGMA.g:1140:2: rule__Territoire__Group__10__Impl rule__Territoire__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Territoire__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__11();

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
    // $ANTLR end "rule__Territoire__Group__10"


    // $ANTLR start "rule__Territoire__Group__10__Impl"
    // InternalENIGMA.g:1147:1: rule__Territoire__Group__10__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1151:1: ( ( '}' ) )
            // InternalENIGMA.g:1152:1: ( '}' )
            {
            // InternalENIGMA.g:1152:1: ( '}' )
            // InternalENIGMA.g:1153:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Territoire__Group__10__Impl"


    // $ANTLR start "rule__Territoire__Group__11"
    // InternalENIGMA.g:1162:1: rule__Territoire__Group__11 : rule__Territoire__Group__11__Impl ;
    public final void rule__Territoire__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1166:1: ( rule__Territoire__Group__11__Impl )
            // InternalENIGMA.g:1167:2: rule__Territoire__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group__11__Impl();

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
    // $ANTLR end "rule__Territoire__Group__11"


    // $ANTLR start "rule__Territoire__Group__11__Impl"
    // InternalENIGMA.g:1173:1: rule__Territoire__Group__11__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1177:1: ( ( '}' ) )
            // InternalENIGMA.g:1178:1: ( '}' )
            {
            // InternalENIGMA.g:1178:1: ( '}' )
            // InternalENIGMA.g:1179:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Territoire__Group__11__Impl"


    // $ANTLR start "rule__Choix__Group__0"
    // InternalENIGMA.g:1189:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1193:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalENIGMA.g:1194:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Choix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__1();

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
    // $ANTLR end "rule__Choix__Group__0"


    // $ANTLR start "rule__Choix__Group__0__Impl"
    // InternalENIGMA.g:1201:1: rule__Choix__Group__0__Impl : ( () ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1205:1: ( ( () ) )
            // InternalENIGMA.g:1206:1: ( () )
            {
            // InternalENIGMA.g:1206:1: ( () )
            // InternalENIGMA.g:1207:2: ()
            {
             before(grammarAccess.getChoixAccess().getChoixAction_0()); 
            // InternalENIGMA.g:1208:2: ()
            // InternalENIGMA.g:1208:3: 
            {
            }

             after(grammarAccess.getChoixAccess().getChoixAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choix__Group__0__Impl"


    // $ANTLR start "rule__Choix__Group__1"
    // InternalENIGMA.g:1216:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1220:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalENIGMA.g:1221:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Choix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__2();

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
    // $ANTLR end "rule__Choix__Group__1"


    // $ANTLR start "rule__Choix__Group__1__Impl"
    // InternalENIGMA.g:1228:1: rule__Choix__Group__1__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1232:1: ( ( 'choix' ) )
            // InternalENIGMA.g:1233:1: ( 'choix' )
            {
            // InternalENIGMA.g:1233:1: ( 'choix' )
            // InternalENIGMA.g:1234:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixKeyword_1()); 

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
    // $ANTLR end "rule__Choix__Group__1__Impl"


    // $ANTLR start "rule__Choix__Group__2"
    // InternalENIGMA.g:1243:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1247:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalENIGMA.g:1248:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Choix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__3();

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
    // $ANTLR end "rule__Choix__Group__2"


    // $ANTLR start "rule__Choix__Group__2__Impl"
    // InternalENIGMA.g:1255:1: rule__Choix__Group__2__Impl : ( '{' ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1259:1: ( ( '{' ) )
            // InternalENIGMA.g:1260:1: ( '{' )
            {
            // InternalENIGMA.g:1260:1: ( '{' )
            // InternalENIGMA.g:1261:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Choix__Group__2__Impl"


    // $ANTLR start "rule__Choix__Group__3"
    // InternalENIGMA.g:1270:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1274:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalENIGMA.g:1275:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Choix__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__4();

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
    // $ANTLR end "rule__Choix__Group__3"


    // $ANTLR start "rule__Choix__Group__3__Impl"
    // InternalENIGMA.g:1282:1: rule__Choix__Group__3__Impl : ( ( rule__Choix__ReponsesAssignment_3 )* ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1286:1: ( ( ( rule__Choix__ReponsesAssignment_3 )* ) )
            // InternalENIGMA.g:1287:1: ( ( rule__Choix__ReponsesAssignment_3 )* )
            {
            // InternalENIGMA.g:1287:1: ( ( rule__Choix__ReponsesAssignment_3 )* )
            // InternalENIGMA.g:1288:2: ( rule__Choix__ReponsesAssignment_3 )*
            {
             before(grammarAccess.getChoixAccess().getReponsesAssignment_3()); 
            // InternalENIGMA.g:1289:2: ( rule__Choix__ReponsesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalENIGMA.g:1289:3: rule__Choix__ReponsesAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Choix__ReponsesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getReponsesAssignment_3()); 

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
    // $ANTLR end "rule__Choix__Group__3__Impl"


    // $ANTLR start "rule__Choix__Group__4"
    // InternalENIGMA.g:1297:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1301:1: ( rule__Choix__Group__4__Impl )
            // InternalENIGMA.g:1302:2: rule__Choix__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__4__Impl();

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
    // $ANTLR end "rule__Choix__Group__4"


    // $ANTLR start "rule__Choix__Group__4__Impl"
    // InternalENIGMA.g:1308:1: rule__Choix__Group__4__Impl : ( '}' ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1312:1: ( ( '}' ) )
            // InternalENIGMA.g:1313:1: ( '}' )
            {
            // InternalENIGMA.g:1313:1: ( '}' )
            // InternalENIGMA.g:1314:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Choix__Group__4__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalENIGMA.g:1324:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1328:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalENIGMA.g:1329:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Interaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__1();

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
    // $ANTLR end "rule__Interaction__Group__0"


    // $ANTLR start "rule__Interaction__Group__0__Impl"
    // InternalENIGMA.g:1336:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1340:1: ( ( 'interaction' ) )
            // InternalENIGMA.g:1341:1: ( 'interaction' )
            {
            // InternalENIGMA.g:1341:1: ( 'interaction' )
            // InternalENIGMA.g:1342:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 

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
    // $ANTLR end "rule__Interaction__Group__0__Impl"


    // $ANTLR start "rule__Interaction__Group__1"
    // InternalENIGMA.g:1351:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1355:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalENIGMA.g:1356:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Interaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__2();

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
    // $ANTLR end "rule__Interaction__Group__1"


    // $ANTLR start "rule__Interaction__Group__1__Impl"
    // InternalENIGMA.g:1363:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__NameAssignment_1 ) ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1367:1: ( ( ( rule__Interaction__NameAssignment_1 ) ) )
            // InternalENIGMA.g:1368:1: ( ( rule__Interaction__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:1368:1: ( ( rule__Interaction__NameAssignment_1 ) )
            // InternalENIGMA.g:1369:2: ( rule__Interaction__NameAssignment_1 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:1370:2: ( rule__Interaction__NameAssignment_1 )
            // InternalENIGMA.g:1370:3: rule__Interaction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Interaction__Group__1__Impl"


    // $ANTLR start "rule__Interaction__Group__2"
    // InternalENIGMA.g:1378:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1382:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalENIGMA.g:1383:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Interaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__3();

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
    // $ANTLR end "rule__Interaction__Group__2"


    // $ANTLR start "rule__Interaction__Group__2__Impl"
    // InternalENIGMA.g:1390:1: rule__Interaction__Group__2__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1394:1: ( ( '{' ) )
            // InternalENIGMA.g:1395:1: ( '{' )
            {
            // InternalENIGMA.g:1395:1: ( '{' )
            // InternalENIGMA.g:1396:2: '{'
            {
             before(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Interaction__Group__2__Impl"


    // $ANTLR start "rule__Interaction__Group__3"
    // InternalENIGMA.g:1405:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1409:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalENIGMA.g:1410:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Interaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__4();

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
    // $ANTLR end "rule__Interaction__Group__3"


    // $ANTLR start "rule__Interaction__Group__3__Impl"
    // InternalENIGMA.g:1417:1: rule__Interaction__Group__3__Impl : ( ( rule__Interaction__ChoixAssignment_3 )* ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1421:1: ( ( ( rule__Interaction__ChoixAssignment_3 )* ) )
            // InternalENIGMA.g:1422:1: ( ( rule__Interaction__ChoixAssignment_3 )* )
            {
            // InternalENIGMA.g:1422:1: ( ( rule__Interaction__ChoixAssignment_3 )* )
            // InternalENIGMA.g:1423:2: ( rule__Interaction__ChoixAssignment_3 )*
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 
            // InternalENIGMA.g:1424:2: ( rule__Interaction__ChoixAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalENIGMA.g:1424:3: rule__Interaction__ChoixAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Interaction__ChoixAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 

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
    // $ANTLR end "rule__Interaction__Group__3__Impl"


    // $ANTLR start "rule__Interaction__Group__4"
    // InternalENIGMA.g:1432:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1436:1: ( rule__Interaction__Group__4__Impl )
            // InternalENIGMA.g:1437:2: rule__Interaction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__4__Impl();

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
    // $ANTLR end "rule__Interaction__Group__4"


    // $ANTLR start "rule__Interaction__Group__4__Impl"
    // InternalENIGMA.g:1443:1: rule__Interaction__Group__4__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1447:1: ( ( '}' ) )
            // InternalENIGMA.g:1448:1: ( '}' )
            {
            // InternalENIGMA.g:1448:1: ( '}' )
            // InternalENIGMA.g:1449:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Interaction__Group__4__Impl"


    // $ANTLR start "rule__Personne__Group__0"
    // InternalENIGMA.g:1459:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1463:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalENIGMA.g:1464:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Personne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__1();

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
    // $ANTLR end "rule__Personne__Group__0"


    // $ANTLR start "rule__Personne__Group__0__Impl"
    // InternalENIGMA.g:1471:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1475:1: ( ( 'personne' ) )
            // InternalENIGMA.g:1476:1: ( 'personne' )
            {
            // InternalENIGMA.g:1476:1: ( 'personne' )
            // InternalENIGMA.g:1477:2: 'personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 

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
    // $ANTLR end "rule__Personne__Group__0__Impl"


    // $ANTLR start "rule__Personne__Group__1"
    // InternalENIGMA.g:1486:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1490:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalENIGMA.g:1491:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Personne__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__2();

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
    // $ANTLR end "rule__Personne__Group__1"


    // $ANTLR start "rule__Personne__Group__1__Impl"
    // InternalENIGMA.g:1498:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1502:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalENIGMA.g:1503:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:1503:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalENIGMA.g:1504:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:1505:2: ( rule__Personne__NameAssignment_1 )
            // InternalENIGMA.g:1505:3: rule__Personne__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Personne__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Personne__Group__1__Impl"


    // $ANTLR start "rule__Personne__Group__2"
    // InternalENIGMA.g:1513:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1517:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalENIGMA.g:1518:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Personne__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__3();

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
    // $ANTLR end "rule__Personne__Group__2"


    // $ANTLR start "rule__Personne__Group__2__Impl"
    // InternalENIGMA.g:1525:1: rule__Personne__Group__2__Impl : ( '{' ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1529:1: ( ( '{' ) )
            // InternalENIGMA.g:1530:1: ( '{' )
            {
            // InternalENIGMA.g:1530:1: ( '{' )
            // InternalENIGMA.g:1531:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Personne__Group__2__Impl"


    // $ANTLR start "rule__Personne__Group__3"
    // InternalENIGMA.g:1540:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1544:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalENIGMA.g:1545:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Personne__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__4();

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
    // $ANTLR end "rule__Personne__Group__3"


    // $ANTLR start "rule__Personne__Group__3__Impl"
    // InternalENIGMA.g:1552:1: rule__Personne__Group__3__Impl : ( ( rule__Personne__TexteAssignment_3 ) ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1556:1: ( ( ( rule__Personne__TexteAssignment_3 ) ) )
            // InternalENIGMA.g:1557:1: ( ( rule__Personne__TexteAssignment_3 ) )
            {
            // InternalENIGMA.g:1557:1: ( ( rule__Personne__TexteAssignment_3 ) )
            // InternalENIGMA.g:1558:2: ( rule__Personne__TexteAssignment_3 )
            {
             before(grammarAccess.getPersonneAccess().getTexteAssignment_3()); 
            // InternalENIGMA.g:1559:2: ( rule__Personne__TexteAssignment_3 )
            // InternalENIGMA.g:1559:3: rule__Personne__TexteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Personne__TexteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getTexteAssignment_3()); 

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
    // $ANTLR end "rule__Personne__Group__3__Impl"


    // $ANTLR start "rule__Personne__Group__4"
    // InternalENIGMA.g:1567:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1571:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalENIGMA.g:1572:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Personne__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__5();

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
    // $ANTLR end "rule__Personne__Group__4"


    // $ANTLR start "rule__Personne__Group__4__Impl"
    // InternalENIGMA.g:1579:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__InteractionAssignment_4 )? ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1583:1: ( ( ( rule__Personne__InteractionAssignment_4 )? ) )
            // InternalENIGMA.g:1584:1: ( ( rule__Personne__InteractionAssignment_4 )? )
            {
            // InternalENIGMA.g:1584:1: ( ( rule__Personne__InteractionAssignment_4 )? )
            // InternalENIGMA.g:1585:2: ( rule__Personne__InteractionAssignment_4 )?
            {
             before(grammarAccess.getPersonneAccess().getInteractionAssignment_4()); 
            // InternalENIGMA.g:1586:2: ( rule__Personne__InteractionAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalENIGMA.g:1586:3: rule__Personne__InteractionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__InteractionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getInteractionAssignment_4()); 

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
    // $ANTLR end "rule__Personne__Group__4__Impl"


    // $ANTLR start "rule__Personne__Group__5"
    // InternalENIGMA.g:1594:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1598:1: ( rule__Personne__Group__5__Impl )
            // InternalENIGMA.g:1599:2: rule__Personne__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__5__Impl();

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
    // $ANTLR end "rule__Personne__Group__5"


    // $ANTLR start "rule__Personne__Group__5__Impl"
    // InternalENIGMA.g:1605:1: rule__Personne__Group__5__Impl : ( '}' ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1609:1: ( ( '}' ) )
            // InternalENIGMA.g:1610:1: ( '}' )
            {
            // InternalENIGMA.g:1610:1: ( '}' )
            // InternalENIGMA.g:1611:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Personne__Group__5__Impl"


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalENIGMA.g:1621:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1625:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalENIGMA.g:1626:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Lieu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__1();

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
    // $ANTLR end "rule__Lieu__Group__0"


    // $ANTLR start "rule__Lieu__Group__0__Impl"
    // InternalENIGMA.g:1633:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1637:1: ( ( 'lieu' ) )
            // InternalENIGMA.g:1638:1: ( 'lieu' )
            {
            // InternalENIGMA.g:1638:1: ( 'lieu' )
            // InternalENIGMA.g:1639:2: 'lieu'
            {
             before(grammarAccess.getLieuAccess().getLieuKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLieuKeyword_0()); 

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
    // $ANTLR end "rule__Lieu__Group__0__Impl"


    // $ANTLR start "rule__Lieu__Group__1"
    // InternalENIGMA.g:1648:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1652:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalENIGMA.g:1653:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Lieu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__2();

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
    // $ANTLR end "rule__Lieu__Group__1"


    // $ANTLR start "rule__Lieu__Group__1__Impl"
    // InternalENIGMA.g:1660:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1664:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalENIGMA.g:1665:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:1665:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalENIGMA.g:1666:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:1667:2: ( rule__Lieu__NameAssignment_1 )
            // InternalENIGMA.g:1667:3: rule__Lieu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Lieu__Group__1__Impl"


    // $ANTLR start "rule__Lieu__Group__2"
    // InternalENIGMA.g:1675:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1679:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalENIGMA.g:1680:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Lieu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__3();

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
    // $ANTLR end "rule__Lieu__Group__2"


    // $ANTLR start "rule__Lieu__Group__2__Impl"
    // InternalENIGMA.g:1687:1: rule__Lieu__Group__2__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1691:1: ( ( '{' ) )
            // InternalENIGMA.g:1692:1: ( '{' )
            {
            // InternalENIGMA.g:1692:1: ( '{' )
            // InternalENIGMA.g:1693:2: '{'
            {
             before(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Lieu__Group__2__Impl"


    // $ANTLR start "rule__Lieu__Group__3"
    // InternalENIGMA.g:1702:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1706:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalENIGMA.g:1707:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Lieu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group__4();

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
    // $ANTLR end "rule__Lieu__Group__3"


    // $ANTLR start "rule__Lieu__Group__3__Impl"
    // InternalENIGMA.g:1714:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__PersonneAssignment_3 ) ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1718:1: ( ( ( rule__Lieu__PersonneAssignment_3 ) ) )
            // InternalENIGMA.g:1719:1: ( ( rule__Lieu__PersonneAssignment_3 ) )
            {
            // InternalENIGMA.g:1719:1: ( ( rule__Lieu__PersonneAssignment_3 ) )
            // InternalENIGMA.g:1720:2: ( rule__Lieu__PersonneAssignment_3 )
            {
             before(grammarAccess.getLieuAccess().getPersonneAssignment_3()); 
            // InternalENIGMA.g:1721:2: ( rule__Lieu__PersonneAssignment_3 )
            // InternalENIGMA.g:1721:3: rule__Lieu__PersonneAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__PersonneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLieuAccess().getPersonneAssignment_3()); 

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
    // $ANTLR end "rule__Lieu__Group__3__Impl"


    // $ANTLR start "rule__Lieu__Group__4"
    // InternalENIGMA.g:1729:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1733:1: ( rule__Lieu__Group__4__Impl )
            // InternalENIGMA.g:1734:2: rule__Lieu__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group__4__Impl();

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
    // $ANTLR end "rule__Lieu__Group__4"


    // $ANTLR start "rule__Lieu__Group__4__Impl"
    // InternalENIGMA.g:1740:1: rule__Lieu__Group__4__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1744:1: ( ( '}' ) )
            // InternalENIGMA.g:1745:1: ( '}' )
            {
            // InternalENIGMA.g:1745:1: ( '}' )
            // InternalENIGMA.g:1746:2: '}'
            {
             before(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Lieu__Group__4__Impl"


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalENIGMA.g:1756:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1760:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalENIGMA.g:1761:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Chemin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__1();

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
    // $ANTLR end "rule__Chemin__Group__0"


    // $ANTLR start "rule__Chemin__Group__0__Impl"
    // InternalENIGMA.g:1768:1: rule__Chemin__Group__0__Impl : ( 'chemin' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1772:1: ( ( 'chemin' ) )
            // InternalENIGMA.g:1773:1: ( 'chemin' )
            {
            // InternalENIGMA.g:1773:1: ( 'chemin' )
            // InternalENIGMA.g:1774:2: 'chemin'
            {
             before(grammarAccess.getCheminAccess().getCheminKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getCheminKeyword_0()); 

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
    // $ANTLR end "rule__Chemin__Group__0__Impl"


    // $ANTLR start "rule__Chemin__Group__1"
    // InternalENIGMA.g:1783:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1787:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalENIGMA.g:1788:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__2();

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
    // $ANTLR end "rule__Chemin__Group__1"


    // $ANTLR start "rule__Chemin__Group__1__Impl"
    // InternalENIGMA.g:1795:1: rule__Chemin__Group__1__Impl : ( 'de' ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1799:1: ( ( 'de' ) )
            // InternalENIGMA.g:1800:1: ( 'de' )
            {
            // InternalENIGMA.g:1800:1: ( 'de' )
            // InternalENIGMA.g:1801:2: 'de'
            {
             before(grammarAccess.getCheminAccess().getDeKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDeKeyword_1()); 

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
    // $ANTLR end "rule__Chemin__Group__1__Impl"


    // $ANTLR start "rule__Chemin__Group__2"
    // InternalENIGMA.g:1810:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1814:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalENIGMA.g:1815:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Chemin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__3();

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
    // $ANTLR end "rule__Chemin__Group__2"


    // $ANTLR start "rule__Chemin__Group__2__Impl"
    // InternalENIGMA.g:1822:1: rule__Chemin__Group__2__Impl : ( ( rule__Chemin__PrecedentAssignment_2 ) ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1826:1: ( ( ( rule__Chemin__PrecedentAssignment_2 ) ) )
            // InternalENIGMA.g:1827:1: ( ( rule__Chemin__PrecedentAssignment_2 ) )
            {
            // InternalENIGMA.g:1827:1: ( ( rule__Chemin__PrecedentAssignment_2 ) )
            // InternalENIGMA.g:1828:2: ( rule__Chemin__PrecedentAssignment_2 )
            {
             before(grammarAccess.getCheminAccess().getPrecedentAssignment_2()); 
            // InternalENIGMA.g:1829:2: ( rule__Chemin__PrecedentAssignment_2 )
            // InternalENIGMA.g:1829:3: rule__Chemin__PrecedentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__PrecedentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getPrecedentAssignment_2()); 

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
    // $ANTLR end "rule__Chemin__Group__2__Impl"


    // $ANTLR start "rule__Chemin__Group__3"
    // InternalENIGMA.g:1837:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1841:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalENIGMA.g:1842:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__4();

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
    // $ANTLR end "rule__Chemin__Group__3"


    // $ANTLR start "rule__Chemin__Group__3__Impl"
    // InternalENIGMA.g:1849:1: rule__Chemin__Group__3__Impl : ( 'a' ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1853:1: ( ( 'a' ) )
            // InternalENIGMA.g:1854:1: ( 'a' )
            {
            // InternalENIGMA.g:1854:1: ( 'a' )
            // InternalENIGMA.g:1855:2: 'a'
            {
             before(grammarAccess.getCheminAccess().getAKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getAKeyword_3()); 

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
    // $ANTLR end "rule__Chemin__Group__3__Impl"


    // $ANTLR start "rule__Chemin__Group__4"
    // InternalENIGMA.g:1864:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1868:1: ( rule__Chemin__Group__4__Impl )
            // InternalENIGMA.g:1869:2: rule__Chemin__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__4__Impl();

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
    // $ANTLR end "rule__Chemin__Group__4"


    // $ANTLR start "rule__Chemin__Group__4__Impl"
    // InternalENIGMA.g:1875:1: rule__Chemin__Group__4__Impl : ( ( rule__Chemin__SuivantAssignment_4 ) ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1879:1: ( ( ( rule__Chemin__SuivantAssignment_4 ) ) )
            // InternalENIGMA.g:1880:1: ( ( rule__Chemin__SuivantAssignment_4 ) )
            {
            // InternalENIGMA.g:1880:1: ( ( rule__Chemin__SuivantAssignment_4 ) )
            // InternalENIGMA.g:1881:2: ( rule__Chemin__SuivantAssignment_4 )
            {
             before(grammarAccess.getCheminAccess().getSuivantAssignment_4()); 
            // InternalENIGMA.g:1882:2: ( rule__Chemin__SuivantAssignment_4 )
            // InternalENIGMA.g:1882:3: rule__Chemin__SuivantAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__SuivantAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getSuivantAssignment_4()); 

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
    // $ANTLR end "rule__Chemin__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalENIGMA.g:1891:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1895:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalENIGMA.g:1896:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

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
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalENIGMA.g:1903:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1907:1: ( ( 'action' ) )
            // InternalENIGMA.g:1908:1: ( 'action' )
            {
            // InternalENIGMA.g:1908:1: ( 'action' )
            // InternalENIGMA.g:1909:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

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
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalENIGMA.g:1918:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1922:1: ( rule__Action__Group__1__Impl )
            // InternalENIGMA.g:1923:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__1__Impl();

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
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalENIGMA.g:1929:1: rule__Action__Group__1__Impl : ( ( rule__Action__TexteAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1933:1: ( ( ( rule__Action__TexteAssignment_1 ) ) )
            // InternalENIGMA.g:1934:1: ( ( rule__Action__TexteAssignment_1 ) )
            {
            // InternalENIGMA.g:1934:1: ( ( rule__Action__TexteAssignment_1 ) )
            // InternalENIGMA.g:1935:2: ( rule__Action__TexteAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getTexteAssignment_1()); 
            // InternalENIGMA.g:1936:2: ( rule__Action__TexteAssignment_1 )
            // InternalENIGMA.g:1936:3: rule__Action__TexteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__TexteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTexteAssignment_1()); 

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
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Reponse__Group__0"
    // InternalENIGMA.g:1945:1: rule__Reponse__Group__0 : rule__Reponse__Group__0__Impl rule__Reponse__Group__1 ;
    public final void rule__Reponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1949:1: ( rule__Reponse__Group__0__Impl rule__Reponse__Group__1 )
            // InternalENIGMA.g:1950:2: rule__Reponse__Group__0__Impl rule__Reponse__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Reponse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__1();

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
    // $ANTLR end "rule__Reponse__Group__0"


    // $ANTLR start "rule__Reponse__Group__0__Impl"
    // InternalENIGMA.g:1957:1: rule__Reponse__Group__0__Impl : ( 'reponse' ) ;
    public final void rule__Reponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1961:1: ( ( 'reponse' ) )
            // InternalENIGMA.g:1962:1: ( 'reponse' )
            {
            // InternalENIGMA.g:1962:1: ( 'reponse' )
            // InternalENIGMA.g:1963:2: 'reponse'
            {
             before(grammarAccess.getReponseAccess().getReponseKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getReponseKeyword_0()); 

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
    // $ANTLR end "rule__Reponse__Group__0__Impl"


    // $ANTLR start "rule__Reponse__Group__1"
    // InternalENIGMA.g:1972:1: rule__Reponse__Group__1 : rule__Reponse__Group__1__Impl rule__Reponse__Group__2 ;
    public final void rule__Reponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1976:1: ( rule__Reponse__Group__1__Impl rule__Reponse__Group__2 )
            // InternalENIGMA.g:1977:2: rule__Reponse__Group__1__Impl rule__Reponse__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Reponse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__2();

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
    // $ANTLR end "rule__Reponse__Group__1"


    // $ANTLR start "rule__Reponse__Group__1__Impl"
    // InternalENIGMA.g:1984:1: rule__Reponse__Group__1__Impl : ( '>>' ) ;
    public final void rule__Reponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1988:1: ( ( '>>' ) )
            // InternalENIGMA.g:1989:1: ( '>>' )
            {
            // InternalENIGMA.g:1989:1: ( '>>' )
            // InternalENIGMA.g:1990:2: '>>'
            {
             before(grammarAccess.getReponseAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Reponse__Group__1__Impl"


    // $ANTLR start "rule__Reponse__Group__2"
    // InternalENIGMA.g:1999:1: rule__Reponse__Group__2 : rule__Reponse__Group__2__Impl rule__Reponse__Group__3 ;
    public final void rule__Reponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2003:1: ( rule__Reponse__Group__2__Impl rule__Reponse__Group__3 )
            // InternalENIGMA.g:2004:2: rule__Reponse__Group__2__Impl rule__Reponse__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Reponse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__3();

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
    // $ANTLR end "rule__Reponse__Group__2"


    // $ANTLR start "rule__Reponse__Group__2__Impl"
    // InternalENIGMA.g:2011:1: rule__Reponse__Group__2__Impl : ( ( rule__Reponse__TexteAssignment_2 ) ) ;
    public final void rule__Reponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2015:1: ( ( ( rule__Reponse__TexteAssignment_2 ) ) )
            // InternalENIGMA.g:2016:1: ( ( rule__Reponse__TexteAssignment_2 ) )
            {
            // InternalENIGMA.g:2016:1: ( ( rule__Reponse__TexteAssignment_2 ) )
            // InternalENIGMA.g:2017:2: ( rule__Reponse__TexteAssignment_2 )
            {
             before(grammarAccess.getReponseAccess().getTexteAssignment_2()); 
            // InternalENIGMA.g:2018:2: ( rule__Reponse__TexteAssignment_2 )
            // InternalENIGMA.g:2018:3: rule__Reponse__TexteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__TexteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getTexteAssignment_2()); 

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
    // $ANTLR end "rule__Reponse__Group__2__Impl"


    // $ANTLR start "rule__Reponse__Group__3"
    // InternalENIGMA.g:2026:1: rule__Reponse__Group__3 : rule__Reponse__Group__3__Impl rule__Reponse__Group__4 ;
    public final void rule__Reponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2030:1: ( rule__Reponse__Group__3__Impl rule__Reponse__Group__4 )
            // InternalENIGMA.g:2031:2: rule__Reponse__Group__3__Impl rule__Reponse__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Reponse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__4();

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
    // $ANTLR end "rule__Reponse__Group__3"


    // $ANTLR start "rule__Reponse__Group__3__Impl"
    // InternalENIGMA.g:2038:1: rule__Reponse__Group__3__Impl : ( 'avec' ) ;
    public final void rule__Reponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2042:1: ( ( 'avec' ) )
            // InternalENIGMA.g:2043:1: ( 'avec' )
            {
            // InternalENIGMA.g:2043:1: ( 'avec' )
            // InternalENIGMA.g:2044:2: 'avec'
            {
             before(grammarAccess.getReponseAccess().getAvecKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getAvecKeyword_3()); 

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
    // $ANTLR end "rule__Reponse__Group__3__Impl"


    // $ANTLR start "rule__Reponse__Group__4"
    // InternalENIGMA.g:2053:1: rule__Reponse__Group__4 : rule__Reponse__Group__4__Impl ;
    public final void rule__Reponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2057:1: ( rule__Reponse__Group__4__Impl )
            // InternalENIGMA.g:2058:2: rule__Reponse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__4__Impl();

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
    // $ANTLR end "rule__Reponse__Group__4"


    // $ANTLR start "rule__Reponse__Group__4__Impl"
    // InternalENIGMA.g:2064:1: rule__Reponse__Group__4__Impl : ( ( rule__Reponse__ActionAssignment_4 ) ) ;
    public final void rule__Reponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2068:1: ( ( ( rule__Reponse__ActionAssignment_4 ) ) )
            // InternalENIGMA.g:2069:1: ( ( rule__Reponse__ActionAssignment_4 ) )
            {
            // InternalENIGMA.g:2069:1: ( ( rule__Reponse__ActionAssignment_4 ) )
            // InternalENIGMA.g:2070:2: ( rule__Reponse__ActionAssignment_4 )
            {
             before(grammarAccess.getReponseAccess().getActionAssignment_4()); 
            // InternalENIGMA.g:2071:2: ( rule__Reponse__ActionAssignment_4 )
            // InternalENIGMA.g:2071:3: rule__Reponse__ActionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__ActionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getActionAssignment_4()); 

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
    // $ANTLR end "rule__Reponse__Group__4__Impl"


    // $ANTLR start "rule__Jeu__NameAssignment_1"
    // InternalENIGMA.g:2080:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2084:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:2085:2: ( RULE_ID )
            {
            // InternalENIGMA.g:2085:2: ( RULE_ID )
            // InternalENIGMA.g:2086:3: RULE_ID
            {
             before(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Jeu__NameAssignment_1"


    // $ANTLR start "rule__Jeu__TerritoireAssignment_3"
    // InternalENIGMA.g:2095:1: rule__Jeu__TerritoireAssignment_3 : ( ruleTerritoire ) ;
    public final void rule__Jeu__TerritoireAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2099:1: ( ( ruleTerritoire ) )
            // InternalENIGMA.g:2100:2: ( ruleTerritoire )
            {
            // InternalENIGMA.g:2100:2: ( ruleTerritoire )
            // InternalENIGMA.g:2101:3: ruleTerritoire
            {
             before(grammarAccess.getJeuAccess().getTerritoireTerritoireParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTerritoire();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getTerritoireTerritoireParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Jeu__TerritoireAssignment_3"


    // $ANTLR start "rule__Jeu__JoueurAssignment_4"
    // InternalENIGMA.g:2110:1: rule__Jeu__JoueurAssignment_4 : ( ruleJoueur ) ;
    public final void rule__Jeu__JoueurAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2114:1: ( ( ruleJoueur ) )
            // InternalENIGMA.g:2115:2: ( ruleJoueur )
            {
            // InternalENIGMA.g:2115:2: ( ruleJoueur )
            // InternalENIGMA.g:2116:3: ruleJoueur
            {
             before(grammarAccess.getJeuAccess().getJoueurJoueurParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJoueur();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJoueurJoueurParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Jeu__JoueurAssignment_4"


    // $ANTLR start "rule__Joueur__NameAssignment_1"
    // InternalENIGMA.g:2125:1: rule__Joueur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joueur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2129:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:2130:2: ( RULE_ID )
            {
            // InternalENIGMA.g:2130:2: ( RULE_ID )
            // InternalENIGMA.g:2131:3: RULE_ID
            {
             before(grammarAccess.getJoueurAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Joueur__NameAssignment_1"


    // $ANTLR start "rule__Joueur__ObjetAssignment_5"
    // InternalENIGMA.g:2140:1: rule__Joueur__ObjetAssignment_5 : ( ruleObjet ) ;
    public final void rule__Joueur__ObjetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2144:1: ( ( ruleObjet ) )
            // InternalENIGMA.g:2145:2: ( ruleObjet )
            {
            // InternalENIGMA.g:2145:2: ( ruleObjet )
            // InternalENIGMA.g:2146:3: ruleObjet
            {
             before(grammarAccess.getJoueurAccess().getObjetObjetParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getJoueurAccess().getObjetObjetParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Joueur__ObjetAssignment_5"


    // $ANTLR start "rule__Objet__NameAssignment_1"
    // InternalENIGMA.g:2155:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2159:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:2160:2: ( RULE_ID )
            {
            // InternalENIGMA.g:2160:2: ( RULE_ID )
            // InternalENIGMA.g:2161:3: RULE_ID
            {
             before(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Objet__NameAssignment_1"


    // $ANTLR start "rule__Objet__TailleAssignment_4"
    // InternalENIGMA.g:2170:1: rule__Objet__TailleAssignment_4 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2174:1: ( ( RULE_INT ) )
            // InternalENIGMA.g:2175:2: ( RULE_INT )
            {
            // InternalENIGMA.g:2175:2: ( RULE_INT )
            // InternalENIGMA.g:2176:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Objet__TailleAssignment_4"


    // $ANTLR start "rule__Territoire__NameAssignment_1"
    // InternalENIGMA.g:2185:1: rule__Territoire__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Territoire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2189:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:2190:2: ( RULE_ID )
            {
            // InternalENIGMA.g:2190:2: ( RULE_ID )
            // InternalENIGMA.g:2191:3: RULE_ID
            {
             before(grammarAccess.getTerritoireAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Territoire__NameAssignment_1"


    // $ANTLR start "rule__Territoire__LieuDebutAssignment_4"
    // InternalENIGMA.g:2200:1: rule__Territoire__LieuDebutAssignment_4 : ( ruleLieu ) ;
    public final void rule__Territoire__LieuDebutAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2204:1: ( ( ruleLieu ) )
            // InternalENIGMA.g:2205:2: ( ruleLieu )
            {
            // InternalENIGMA.g:2205:2: ( ruleLieu )
            // InternalENIGMA.g:2206:3: ruleLieu
            {
             before(grammarAccess.getTerritoireAccess().getLieuDebutLieuParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getLieuDebutLieuParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Territoire__LieuDebutAssignment_4"


    // $ANTLR start "rule__Territoire__LieuxFinAssignment_6"
    // InternalENIGMA.g:2215:1: rule__Territoire__LieuxFinAssignment_6 : ( ruleLieu ) ;
    public final void rule__Territoire__LieuxFinAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2219:1: ( ( ruleLieu ) )
            // InternalENIGMA.g:2220:2: ( ruleLieu )
            {
            // InternalENIGMA.g:2220:2: ( ruleLieu )
            // InternalENIGMA.g:2221:3: ruleLieu
            {
             before(grammarAccess.getTerritoireAccess().getLieuxFinLieuParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getLieuxFinLieuParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Territoire__LieuxFinAssignment_6"


    // $ANTLR start "rule__Territoire__CheminsAssignment_9"
    // InternalENIGMA.g:2230:1: rule__Territoire__CheminsAssignment_9 : ( ruleChemin ) ;
    public final void rule__Territoire__CheminsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2234:1: ( ( ruleChemin ) )
            // InternalENIGMA.g:2235:2: ( ruleChemin )
            {
            // InternalENIGMA.g:2235:2: ( ruleChemin )
            // InternalENIGMA.g:2236:3: ruleChemin
            {
             before(grammarAccess.getTerritoireAccess().getCheminsCheminParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getCheminsCheminParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Territoire__CheminsAssignment_9"


    // $ANTLR start "rule__Choix__ReponsesAssignment_3"
    // InternalENIGMA.g:2245:1: rule__Choix__ReponsesAssignment_3 : ( ruleReponse ) ;
    public final void rule__Choix__ReponsesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2249:1: ( ( ruleReponse ) )
            // InternalENIGMA.g:2250:2: ( ruleReponse )
            {
            // InternalENIGMA.g:2250:2: ( ruleReponse )
            // InternalENIGMA.g:2251:3: ruleReponse
            {
             before(grammarAccess.getChoixAccess().getReponsesReponseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getChoixAccess().getReponsesReponseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Choix__ReponsesAssignment_3"


    // $ANTLR start "rule__Interaction__NameAssignment_1"
    // InternalENIGMA.g:2260:1: rule__Interaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2264:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:2265:2: ( RULE_ID )
            {
            // InternalENIGMA.g:2265:2: ( RULE_ID )
            // InternalENIGMA.g:2266:3: RULE_ID
            {
             before(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interaction__NameAssignment_1"


    // $ANTLR start "rule__Interaction__ChoixAssignment_3"
    // InternalENIGMA.g:2275:1: rule__Interaction__ChoixAssignment_3 : ( ruleChoix ) ;
    public final void rule__Interaction__ChoixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2279:1: ( ( ruleChoix ) )
            // InternalENIGMA.g:2280:2: ( ruleChoix )
            {
            // InternalENIGMA.g:2280:2: ( ruleChoix )
            // InternalENIGMA.g:2281:3: ruleChoix
            {
             before(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Interaction__ChoixAssignment_3"


    // $ANTLR start "rule__Personne__NameAssignment_1"
    // InternalENIGMA.g:2290:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2294:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:2295:2: ( RULE_ID )
            {
            // InternalENIGMA.g:2295:2: ( RULE_ID )
            // InternalENIGMA.g:2296:3: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Personne__NameAssignment_1"


    // $ANTLR start "rule__Personne__TexteAssignment_3"
    // InternalENIGMA.g:2305:1: rule__Personne__TexteAssignment_3 : ( ruleQualification ) ;
    public final void rule__Personne__TexteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2309:1: ( ( ruleQualification ) )
            // InternalENIGMA.g:2310:2: ( ruleQualification )
            {
            // InternalENIGMA.g:2310:2: ( ruleQualification )
            // InternalENIGMA.g:2311:3: ruleQualification
            {
             before(grammarAccess.getPersonneAccess().getTexteQualificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getTexteQualificationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Personne__TexteAssignment_3"


    // $ANTLR start "rule__Personne__InteractionAssignment_4"
    // InternalENIGMA.g:2320:1: rule__Personne__InteractionAssignment_4 : ( ruleInteraction ) ;
    public final void rule__Personne__InteractionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2324:1: ( ( ruleInteraction ) )
            // InternalENIGMA.g:2325:2: ( ruleInteraction )
            {
            // InternalENIGMA.g:2325:2: ( ruleInteraction )
            // InternalENIGMA.g:2326:3: ruleInteraction
            {
             before(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Personne__InteractionAssignment_4"


    // $ANTLR start "rule__Lieu__NameAssignment_1"
    // InternalENIGMA.g:2335:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2339:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:2340:2: ( RULE_ID )
            {
            // InternalENIGMA.g:2340:2: ( RULE_ID )
            // InternalENIGMA.g:2341:3: RULE_ID
            {
             before(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Lieu__NameAssignment_1"


    // $ANTLR start "rule__Lieu__PersonneAssignment_3"
    // InternalENIGMA.g:2350:1: rule__Lieu__PersonneAssignment_3 : ( rulePersonne ) ;
    public final void rule__Lieu__PersonneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2354:1: ( ( rulePersonne ) )
            // InternalENIGMA.g:2355:2: ( rulePersonne )
            {
            // InternalENIGMA.g:2355:2: ( rulePersonne )
            // InternalENIGMA.g:2356:3: rulePersonne
            {
             before(grammarAccess.getLieuAccess().getPersonnePersonneParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getPersonnePersonneParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Lieu__PersonneAssignment_3"


    // $ANTLR start "rule__Chemin__PrecedentAssignment_2"
    // InternalENIGMA.g:2365:1: rule__Chemin__PrecedentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__PrecedentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2369:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:2370:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:2370:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:2371:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getPrecedentLieuCrossReference_2_0()); 
            // InternalENIGMA.g:2372:3: ( RULE_ID )
            // InternalENIGMA.g:2373:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getPrecedentLieuIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getPrecedentLieuIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getPrecedentLieuCrossReference_2_0()); 

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
    // $ANTLR end "rule__Chemin__PrecedentAssignment_2"


    // $ANTLR start "rule__Chemin__SuivantAssignment_4"
    // InternalENIGMA.g:2384:1: rule__Chemin__SuivantAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__SuivantAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2388:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:2389:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:2389:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:2390:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getSuivantLieuCrossReference_4_0()); 
            // InternalENIGMA.g:2391:3: ( RULE_ID )
            // InternalENIGMA.g:2392:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getSuivantLieuIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSuivantLieuIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getSuivantLieuCrossReference_4_0()); 

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
    // $ANTLR end "rule__Chemin__SuivantAssignment_4"


    // $ANTLR start "rule__Qualification__QualificationAssignment"
    // InternalENIGMA.g:2403:1: rule__Qualification__QualificationAssignment : ( RULE_STRING ) ;
    public final void rule__Qualification__QualificationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2407:1: ( ( RULE_STRING ) )
            // InternalENIGMA.g:2408:2: ( RULE_STRING )
            {
            // InternalENIGMA.g:2408:2: ( RULE_STRING )
            // InternalENIGMA.g:2409:3: RULE_STRING
            {
             before(grammarAccess.getQualificationAccess().getQualificationSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQualificationAccess().getQualificationSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Qualification__QualificationAssignment"


    // $ANTLR start "rule__Action__TexteAssignment_1"
    // InternalENIGMA.g:2418:1: rule__Action__TexteAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Action__TexteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2422:1: ( ( RULE_STRING ) )
            // InternalENIGMA.g:2423:2: ( RULE_STRING )
            {
            // InternalENIGMA.g:2423:2: ( RULE_STRING )
            // InternalENIGMA.g:2424:3: RULE_STRING
            {
             before(grammarAccess.getActionAccess().getTexteSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getTexteSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Action__TexteAssignment_1"


    // $ANTLR start "rule__Reponse__TexteAssignment_2"
    // InternalENIGMA.g:2433:1: rule__Reponse__TexteAssignment_2 : ( ruleQualification ) ;
    public final void rule__Reponse__TexteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2437:1: ( ( ruleQualification ) )
            // InternalENIGMA.g:2438:2: ( ruleQualification )
            {
            // InternalENIGMA.g:2438:2: ( ruleQualification )
            // InternalENIGMA.g:2439:3: ruleQualification
            {
             before(grammarAccess.getReponseAccess().getTexteQualificationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getReponseAccess().getTexteQualificationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Reponse__TexteAssignment_2"


    // $ANTLR start "rule__Reponse__ActionAssignment_4"
    // InternalENIGMA.g:2448:1: rule__Reponse__ActionAssignment_4 : ( ruleAction ) ;
    public final void rule__Reponse__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2452:1: ( ( ruleAction ) )
            // InternalENIGMA.g:2453:2: ( ruleAction )
            {
            // InternalENIGMA.g:2453:2: ( ruleAction )
            // InternalENIGMA.g:2454:3: ruleAction
            {
             before(grammarAccess.getReponseAccess().getActionActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getReponseAccess().getActionActionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Reponse__ActionAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});

}