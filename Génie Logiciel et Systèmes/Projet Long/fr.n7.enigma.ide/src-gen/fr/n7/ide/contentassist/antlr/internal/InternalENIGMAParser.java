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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'possede'", "'npossede'", "'visible'", "'nvisible'", "'obligatoire'", "'nobligatoire'", "'ouvert'", "'ferme'", "'jeu'", "'{'", "'}'", "'joueur'", "'limite'", "'objets'", "'connaissances'", "'connaissance'", "'etat'", "'objet'", "'occurrence'", "','", "'de'", "'taille'", "'territoire'", "'depart'", "'milieu'", "'fin'", "'chemins'", "'choix'", "'conditions'", "'interaction'", "'personne'", "'lieu'", "'personnes'", "'chemin'", "'a'", "'action'", "'c'", "'reponse'", "'>>'", "'qualification'", "'avec'", "'condition'", "'obj'", "'con'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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


    // $ANTLR start "entryRuleJeuElement"
    // InternalENIGMA.g:78:1: entryRuleJeuElement : ruleJeuElement EOF ;
    public final void entryRuleJeuElement() throws RecognitionException {
        try {
            // InternalENIGMA.g:79:1: ( ruleJeuElement EOF )
            // InternalENIGMA.g:80:1: ruleJeuElement EOF
            {
             before(grammarAccess.getJeuElementRule()); 
            pushFollow(FOLLOW_1);
            ruleJeuElement();

            state._fsp--;

             after(grammarAccess.getJeuElementRule()); 
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
    // $ANTLR end "entryRuleJeuElement"


    // $ANTLR start "ruleJeuElement"
    // InternalENIGMA.g:87:1: ruleJeuElement : ( ( rule__JeuElement__Alternatives ) ) ;
    public final void ruleJeuElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:91:2: ( ( ( rule__JeuElement__Alternatives ) ) )
            // InternalENIGMA.g:92:2: ( ( rule__JeuElement__Alternatives ) )
            {
            // InternalENIGMA.g:92:2: ( ( rule__JeuElement__Alternatives ) )
            // InternalENIGMA.g:93:3: ( rule__JeuElement__Alternatives )
            {
             before(grammarAccess.getJeuElementAccess().getAlternatives()); 
            // InternalENIGMA.g:94:3: ( rule__JeuElement__Alternatives )
            // InternalENIGMA.g:94:4: rule__JeuElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JeuElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJeuElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleJeuElement"


    // $ANTLR start "entryRuleJoueur"
    // InternalENIGMA.g:103:1: entryRuleJoueur : ruleJoueur EOF ;
    public final void entryRuleJoueur() throws RecognitionException {
        try {
            // InternalENIGMA.g:104:1: ( ruleJoueur EOF )
            // InternalENIGMA.g:105:1: ruleJoueur EOF
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
    // InternalENIGMA.g:112:1: ruleJoueur : ( ( rule__Joueur__Group__0 ) ) ;
    public final void ruleJoueur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:116:2: ( ( ( rule__Joueur__Group__0 ) ) )
            // InternalENIGMA.g:117:2: ( ( rule__Joueur__Group__0 ) )
            {
            // InternalENIGMA.g:117:2: ( ( rule__Joueur__Group__0 ) )
            // InternalENIGMA.g:118:3: ( rule__Joueur__Group__0 )
            {
             before(grammarAccess.getJoueurAccess().getGroup()); 
            // InternalENIGMA.g:119:3: ( rule__Joueur__Group__0 )
            // InternalENIGMA.g:119:4: rule__Joueur__Group__0
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


    // $ANTLR start "entryRuleConnaissance"
    // InternalENIGMA.g:128:1: entryRuleConnaissance : ruleConnaissance EOF ;
    public final void entryRuleConnaissance() throws RecognitionException {
        try {
            // InternalENIGMA.g:129:1: ( ruleConnaissance EOF )
            // InternalENIGMA.g:130:1: ruleConnaissance EOF
            {
             before(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getConnaissanceRule()); 
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
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalENIGMA.g:137:1: ruleConnaissance : ( ( rule__Connaissance__Group__0 ) ) ;
    public final void ruleConnaissance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:141:2: ( ( ( rule__Connaissance__Group__0 ) ) )
            // InternalENIGMA.g:142:2: ( ( rule__Connaissance__Group__0 ) )
            {
            // InternalENIGMA.g:142:2: ( ( rule__Connaissance__Group__0 ) )
            // InternalENIGMA.g:143:3: ( rule__Connaissance__Group__0 )
            {
             before(grammarAccess.getConnaissanceAccess().getGroup()); 
            // InternalENIGMA.g:144:3: ( rule__Connaissance__Group__0 )
            // InternalENIGMA.g:144:4: rule__Connaissance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getGroup()); 

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
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleObjet"
    // InternalENIGMA.g:153:1: entryRuleObjet : ruleObjet EOF ;
    public final void entryRuleObjet() throws RecognitionException {
        try {
            // InternalENIGMA.g:154:1: ( ruleObjet EOF )
            // InternalENIGMA.g:155:1: ruleObjet EOF
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
    // InternalENIGMA.g:162:1: ruleObjet : ( ( rule__Objet__Group__0 ) ) ;
    public final void ruleObjet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:166:2: ( ( ( rule__Objet__Group__0 ) ) )
            // InternalENIGMA.g:167:2: ( ( rule__Objet__Group__0 ) )
            {
            // InternalENIGMA.g:167:2: ( ( rule__Objet__Group__0 ) )
            // InternalENIGMA.g:168:3: ( rule__Objet__Group__0 )
            {
             before(grammarAccess.getObjetAccess().getGroup()); 
            // InternalENIGMA.g:169:3: ( rule__Objet__Group__0 )
            // InternalENIGMA.g:169:4: rule__Objet__Group__0
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
    // InternalENIGMA.g:178:1: entryRuleTerritoire : ruleTerritoire EOF ;
    public final void entryRuleTerritoire() throws RecognitionException {
        try {
            // InternalENIGMA.g:179:1: ( ruleTerritoire EOF )
            // InternalENIGMA.g:180:1: ruleTerritoire EOF
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
    // InternalENIGMA.g:187:1: ruleTerritoire : ( ( rule__Territoire__Group__0 ) ) ;
    public final void ruleTerritoire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:191:2: ( ( ( rule__Territoire__Group__0 ) ) )
            // InternalENIGMA.g:192:2: ( ( rule__Territoire__Group__0 ) )
            {
            // InternalENIGMA.g:192:2: ( ( rule__Territoire__Group__0 ) )
            // InternalENIGMA.g:193:3: ( rule__Territoire__Group__0 )
            {
             before(grammarAccess.getTerritoireAccess().getGroup()); 
            // InternalENIGMA.g:194:3: ( rule__Territoire__Group__0 )
            // InternalENIGMA.g:194:4: rule__Territoire__Group__0
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
    // InternalENIGMA.g:203:1: entryRuleChoix : ruleChoix EOF ;
    public final void entryRuleChoix() throws RecognitionException {
        try {
            // InternalENIGMA.g:204:1: ( ruleChoix EOF )
            // InternalENIGMA.g:205:1: ruleChoix EOF
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
    // InternalENIGMA.g:212:1: ruleChoix : ( ( rule__Choix__Group__0 ) ) ;
    public final void ruleChoix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:216:2: ( ( ( rule__Choix__Group__0 ) ) )
            // InternalENIGMA.g:217:2: ( ( rule__Choix__Group__0 ) )
            {
            // InternalENIGMA.g:217:2: ( ( rule__Choix__Group__0 ) )
            // InternalENIGMA.g:218:3: ( rule__Choix__Group__0 )
            {
             before(grammarAccess.getChoixAccess().getGroup()); 
            // InternalENIGMA.g:219:3: ( rule__Choix__Group__0 )
            // InternalENIGMA.g:219:4: rule__Choix__Group__0
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
    // InternalENIGMA.g:228:1: entryRuleInteraction : ruleInteraction EOF ;
    public final void entryRuleInteraction() throws RecognitionException {
        try {
            // InternalENIGMA.g:229:1: ( ruleInteraction EOF )
            // InternalENIGMA.g:230:1: ruleInteraction EOF
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
    // InternalENIGMA.g:237:1: ruleInteraction : ( ( rule__Interaction__Group__0 ) ) ;
    public final void ruleInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:241:2: ( ( ( rule__Interaction__Group__0 ) ) )
            // InternalENIGMA.g:242:2: ( ( rule__Interaction__Group__0 ) )
            {
            // InternalENIGMA.g:242:2: ( ( rule__Interaction__Group__0 ) )
            // InternalENIGMA.g:243:3: ( rule__Interaction__Group__0 )
            {
             before(grammarAccess.getInteractionAccess().getGroup()); 
            // InternalENIGMA.g:244:3: ( rule__Interaction__Group__0 )
            // InternalENIGMA.g:244:4: rule__Interaction__Group__0
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
    // InternalENIGMA.g:253:1: entryRulePersonne : rulePersonne EOF ;
    public final void entryRulePersonne() throws RecognitionException {
        try {
            // InternalENIGMA.g:254:1: ( rulePersonne EOF )
            // InternalENIGMA.g:255:1: rulePersonne EOF
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
    // InternalENIGMA.g:262:1: rulePersonne : ( ( rule__Personne__Group__0 ) ) ;
    public final void rulePersonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:266:2: ( ( ( rule__Personne__Group__0 ) ) )
            // InternalENIGMA.g:267:2: ( ( rule__Personne__Group__0 ) )
            {
            // InternalENIGMA.g:267:2: ( ( rule__Personne__Group__0 ) )
            // InternalENIGMA.g:268:3: ( rule__Personne__Group__0 )
            {
             before(grammarAccess.getPersonneAccess().getGroup()); 
            // InternalENIGMA.g:269:3: ( rule__Personne__Group__0 )
            // InternalENIGMA.g:269:4: rule__Personne__Group__0
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
    // InternalENIGMA.g:278:1: entryRuleLieu : ruleLieu EOF ;
    public final void entryRuleLieu() throws RecognitionException {
        try {
            // InternalENIGMA.g:279:1: ( ruleLieu EOF )
            // InternalENIGMA.g:280:1: ruleLieu EOF
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
    // InternalENIGMA.g:287:1: ruleLieu : ( ( rule__Lieu__Group__0 ) ) ;
    public final void ruleLieu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:291:2: ( ( ( rule__Lieu__Group__0 ) ) )
            // InternalENIGMA.g:292:2: ( ( rule__Lieu__Group__0 ) )
            {
            // InternalENIGMA.g:292:2: ( ( rule__Lieu__Group__0 ) )
            // InternalENIGMA.g:293:3: ( rule__Lieu__Group__0 )
            {
             before(grammarAccess.getLieuAccess().getGroup()); 
            // InternalENIGMA.g:294:3: ( rule__Lieu__Group__0 )
            // InternalENIGMA.g:294:4: rule__Lieu__Group__0
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
    // InternalENIGMA.g:303:1: entryRuleChemin : ruleChemin EOF ;
    public final void entryRuleChemin() throws RecognitionException {
        try {
            // InternalENIGMA.g:304:1: ( ruleChemin EOF )
            // InternalENIGMA.g:305:1: ruleChemin EOF
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
    // InternalENIGMA.g:312:1: ruleChemin : ( ( rule__Chemin__Group__0 ) ) ;
    public final void ruleChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:316:2: ( ( ( rule__Chemin__Group__0 ) ) )
            // InternalENIGMA.g:317:2: ( ( rule__Chemin__Group__0 ) )
            {
            // InternalENIGMA.g:317:2: ( ( rule__Chemin__Group__0 ) )
            // InternalENIGMA.g:318:3: ( rule__Chemin__Group__0 )
            {
             before(grammarAccess.getCheminAccess().getGroup()); 
            // InternalENIGMA.g:319:3: ( rule__Chemin__Group__0 )
            // InternalENIGMA.g:319:4: rule__Chemin__Group__0
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
    // InternalENIGMA.g:328:1: entryRuleQualification : ruleQualification EOF ;
    public final void entryRuleQualification() throws RecognitionException {
        try {
            // InternalENIGMA.g:329:1: ( ruleQualification EOF )
            // InternalENIGMA.g:330:1: ruleQualification EOF
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
    // InternalENIGMA.g:337:1: ruleQualification : ( ( rule__Qualification__QualificationAssignment ) ) ;
    public final void ruleQualification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:341:2: ( ( ( rule__Qualification__QualificationAssignment ) ) )
            // InternalENIGMA.g:342:2: ( ( rule__Qualification__QualificationAssignment ) )
            {
            // InternalENIGMA.g:342:2: ( ( rule__Qualification__QualificationAssignment ) )
            // InternalENIGMA.g:343:3: ( rule__Qualification__QualificationAssignment )
            {
             before(grammarAccess.getQualificationAccess().getQualificationAssignment()); 
            // InternalENIGMA.g:344:3: ( rule__Qualification__QualificationAssignment )
            // InternalENIGMA.g:344:4: rule__Qualification__QualificationAssignment
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
    // InternalENIGMA.g:353:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalENIGMA.g:354:1: ( ruleAction EOF )
            // InternalENIGMA.g:355:1: ruleAction EOF
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
    // InternalENIGMA.g:362:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:366:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalENIGMA.g:367:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalENIGMA.g:367:2: ( ( rule__Action__Group__0 ) )
            // InternalENIGMA.g:368:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalENIGMA.g:369:3: ( rule__Action__Group__0 )
            // InternalENIGMA.g:369:4: rule__Action__Group__0
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
    // InternalENIGMA.g:378:1: entryRuleReponse : ruleReponse EOF ;
    public final void entryRuleReponse() throws RecognitionException {
        try {
            // InternalENIGMA.g:379:1: ( ruleReponse EOF )
            // InternalENIGMA.g:380:1: ruleReponse EOF
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
    // InternalENIGMA.g:387:1: ruleReponse : ( ( rule__Reponse__Group__0 ) ) ;
    public final void ruleReponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:391:2: ( ( ( rule__Reponse__Group__0 ) ) )
            // InternalENIGMA.g:392:2: ( ( rule__Reponse__Group__0 ) )
            {
            // InternalENIGMA.g:392:2: ( ( rule__Reponse__Group__0 ) )
            // InternalENIGMA.g:393:3: ( rule__Reponse__Group__0 )
            {
             before(grammarAccess.getReponseAccess().getGroup()); 
            // InternalENIGMA.g:394:3: ( rule__Reponse__Group__0 )
            // InternalENIGMA.g:394:4: rule__Reponse__Group__0
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


    // $ANTLR start "entryRuleCondition"
    // InternalENIGMA.g:403:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalENIGMA.g:404:1: ( ruleCondition EOF )
            // InternalENIGMA.g:405:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalENIGMA.g:412:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:416:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalENIGMA.g:417:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalENIGMA.g:417:2: ( ( rule__Condition__Group__0 ) )
            // InternalENIGMA.g:418:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalENIGMA.g:419:3: ( rule__Condition__Group__0 )
            // InternalENIGMA.g:419:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleEtatPossession"
    // InternalENIGMA.g:428:1: ruleEtatPossession : ( ( rule__EtatPossession__Alternatives ) ) ;
    public final void ruleEtatPossession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:432:1: ( ( ( rule__EtatPossession__Alternatives ) ) )
            // InternalENIGMA.g:433:2: ( ( rule__EtatPossession__Alternatives ) )
            {
            // InternalENIGMA.g:433:2: ( ( rule__EtatPossession__Alternatives ) )
            // InternalENIGMA.g:434:3: ( rule__EtatPossession__Alternatives )
            {
             before(grammarAccess.getEtatPossessionAccess().getAlternatives()); 
            // InternalENIGMA.g:435:3: ( rule__EtatPossession__Alternatives )
            // InternalENIGMA.g:435:4: rule__EtatPossession__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EtatPossession__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEtatPossessionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEtatPossession"


    // $ANTLR start "ruleEtatVisibilite"
    // InternalENIGMA.g:444:1: ruleEtatVisibilite : ( ( rule__EtatVisibilite__Alternatives ) ) ;
    public final void ruleEtatVisibilite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:448:1: ( ( ( rule__EtatVisibilite__Alternatives ) ) )
            // InternalENIGMA.g:449:2: ( ( rule__EtatVisibilite__Alternatives ) )
            {
            // InternalENIGMA.g:449:2: ( ( rule__EtatVisibilite__Alternatives ) )
            // InternalENIGMA.g:450:3: ( rule__EtatVisibilite__Alternatives )
            {
             before(grammarAccess.getEtatVisibiliteAccess().getAlternatives()); 
            // InternalENIGMA.g:451:3: ( rule__EtatVisibilite__Alternatives )
            // InternalENIGMA.g:451:4: rule__EtatVisibilite__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EtatVisibilite__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEtatVisibiliteAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEtatVisibilite"


    // $ANTLR start "ruleEtatObligation"
    // InternalENIGMA.g:460:1: ruleEtatObligation : ( ( rule__EtatObligation__Alternatives ) ) ;
    public final void ruleEtatObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:464:1: ( ( ( rule__EtatObligation__Alternatives ) ) )
            // InternalENIGMA.g:465:2: ( ( rule__EtatObligation__Alternatives ) )
            {
            // InternalENIGMA.g:465:2: ( ( rule__EtatObligation__Alternatives ) )
            // InternalENIGMA.g:466:3: ( rule__EtatObligation__Alternatives )
            {
             before(grammarAccess.getEtatObligationAccess().getAlternatives()); 
            // InternalENIGMA.g:467:3: ( rule__EtatObligation__Alternatives )
            // InternalENIGMA.g:467:4: rule__EtatObligation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EtatObligation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEtatObligationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEtatObligation"


    // $ANTLR start "ruleEtatChemin"
    // InternalENIGMA.g:476:1: ruleEtatChemin : ( ( rule__EtatChemin__Alternatives ) ) ;
    public final void ruleEtatChemin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:480:1: ( ( ( rule__EtatChemin__Alternatives ) ) )
            // InternalENIGMA.g:481:2: ( ( rule__EtatChemin__Alternatives ) )
            {
            // InternalENIGMA.g:481:2: ( ( rule__EtatChemin__Alternatives ) )
            // InternalENIGMA.g:482:3: ( rule__EtatChemin__Alternatives )
            {
             before(grammarAccess.getEtatCheminAccess().getAlternatives()); 
            // InternalENIGMA.g:483:3: ( rule__EtatChemin__Alternatives )
            // InternalENIGMA.g:483:4: rule__EtatChemin__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EtatChemin__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEtatCheminAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEtatChemin"


    // $ANTLR start "rule__JeuElement__Alternatives"
    // InternalENIGMA.g:491:1: rule__JeuElement__Alternatives : ( ( ruleTerritoire ) | ( ruleJoueur ) | ( ruleObjet ) | ( ruleChoix ) | ( ruleConnaissance ) | ( ruleLieu ) | ( ruleReponse ) | ( ruleAction ) | ( ruleInteraction ) | ( rulePersonne ) | ( ruleChemin ) | ( ruleCondition ) );
    public final void rule__JeuElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:495:1: ( ( ruleTerritoire ) | ( ruleJoueur ) | ( ruleObjet ) | ( ruleChoix ) | ( ruleConnaissance ) | ( ruleLieu ) | ( ruleReponse ) | ( ruleAction ) | ( ruleInteraction ) | ( rulePersonne ) | ( ruleChemin ) | ( ruleCondition ) )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case 42:
                {
                alt1=6;
                }
                break;
            case 48:
                {
                alt1=7;
                }
                break;
            case 46:
                {
                alt1=8;
                }
                break;
            case 40:
                {
                alt1=9;
                }
                break;
            case 41:
                {
                alt1=10;
                }
                break;
            case 44:
                {
                alt1=11;
                }
                break;
            case 52:
                {
                alt1=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalENIGMA.g:496:2: ( ruleTerritoire )
                    {
                    // InternalENIGMA.g:496:2: ( ruleTerritoire )
                    // InternalENIGMA.g:497:3: ruleTerritoire
                    {
                     before(grammarAccess.getJeuElementAccess().getTerritoireParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTerritoire();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getTerritoireParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:502:2: ( ruleJoueur )
                    {
                    // InternalENIGMA.g:502:2: ( ruleJoueur )
                    // InternalENIGMA.g:503:3: ruleJoueur
                    {
                     before(grammarAccess.getJeuElementAccess().getJoueurParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJoueur();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getJoueurParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalENIGMA.g:508:2: ( ruleObjet )
                    {
                    // InternalENIGMA.g:508:2: ( ruleObjet )
                    // InternalENIGMA.g:509:3: ruleObjet
                    {
                     before(grammarAccess.getJeuElementAccess().getObjetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleObjet();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getObjetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalENIGMA.g:514:2: ( ruleChoix )
                    {
                    // InternalENIGMA.g:514:2: ( ruleChoix )
                    // InternalENIGMA.g:515:3: ruleChoix
                    {
                     before(grammarAccess.getJeuElementAccess().getChoixParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleChoix();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getChoixParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalENIGMA.g:520:2: ( ruleConnaissance )
                    {
                    // InternalENIGMA.g:520:2: ( ruleConnaissance )
                    // InternalENIGMA.g:521:3: ruleConnaissance
                    {
                     before(grammarAccess.getJeuElementAccess().getConnaissanceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConnaissance();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getConnaissanceParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalENIGMA.g:526:2: ( ruleLieu )
                    {
                    // InternalENIGMA.g:526:2: ( ruleLieu )
                    // InternalENIGMA.g:527:3: ruleLieu
                    {
                     before(grammarAccess.getJeuElementAccess().getLieuParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleLieu();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getLieuParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalENIGMA.g:532:2: ( ruleReponse )
                    {
                    // InternalENIGMA.g:532:2: ( ruleReponse )
                    // InternalENIGMA.g:533:3: ruleReponse
                    {
                     before(grammarAccess.getJeuElementAccess().getReponseParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleReponse();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getReponseParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalENIGMA.g:538:2: ( ruleAction )
                    {
                    // InternalENIGMA.g:538:2: ( ruleAction )
                    // InternalENIGMA.g:539:3: ruleAction
                    {
                     before(grammarAccess.getJeuElementAccess().getActionParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getActionParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalENIGMA.g:544:2: ( ruleInteraction )
                    {
                    // InternalENIGMA.g:544:2: ( ruleInteraction )
                    // InternalENIGMA.g:545:3: ruleInteraction
                    {
                     before(grammarAccess.getJeuElementAccess().getInteractionParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleInteraction();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getInteractionParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalENIGMA.g:550:2: ( rulePersonne )
                    {
                    // InternalENIGMA.g:550:2: ( rulePersonne )
                    // InternalENIGMA.g:551:3: rulePersonne
                    {
                     before(grammarAccess.getJeuElementAccess().getPersonneParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    rulePersonne();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getPersonneParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalENIGMA.g:556:2: ( ruleChemin )
                    {
                    // InternalENIGMA.g:556:2: ( ruleChemin )
                    // InternalENIGMA.g:557:3: ruleChemin
                    {
                     before(grammarAccess.getJeuElementAccess().getCheminParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleChemin();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getCheminParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalENIGMA.g:562:2: ( ruleCondition )
                    {
                    // InternalENIGMA.g:562:2: ( ruleCondition )
                    // InternalENIGMA.g:563:3: ruleCondition
                    {
                     before(grammarAccess.getJeuElementAccess().getConditionParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;

                     after(grammarAccess.getJeuElementAccess().getConditionParserRuleCall_11()); 

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
    // $ANTLR end "rule__JeuElement__Alternatives"


    // $ANTLR start "rule__EtatPossession__Alternatives"
    // InternalENIGMA.g:572:1: rule__EtatPossession__Alternatives : ( ( ( 'possede' ) ) | ( ( 'npossede' ) ) );
    public final void rule__EtatPossession__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:576:1: ( ( ( 'possede' ) ) | ( ( 'npossede' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalENIGMA.g:577:2: ( ( 'possede' ) )
                    {
                    // InternalENIGMA.g:577:2: ( ( 'possede' ) )
                    // InternalENIGMA.g:578:3: ( 'possede' )
                    {
                     before(grammarAccess.getEtatPossessionAccess().getPossedeEnumLiteralDeclaration_0()); 
                    // InternalENIGMA.g:579:3: ( 'possede' )
                    // InternalENIGMA.g:579:4: 'possede'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtatPossessionAccess().getPossedeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:583:2: ( ( 'npossede' ) )
                    {
                    // InternalENIGMA.g:583:2: ( ( 'npossede' ) )
                    // InternalENIGMA.g:584:3: ( 'npossede' )
                    {
                     before(grammarAccess.getEtatPossessionAccess().getNpossedeEnumLiteralDeclaration_1()); 
                    // InternalENIGMA.g:585:3: ( 'npossede' )
                    // InternalENIGMA.g:585:4: 'npossede'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtatPossessionAccess().getNpossedeEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EtatPossession__Alternatives"


    // $ANTLR start "rule__EtatVisibilite__Alternatives"
    // InternalENIGMA.g:593:1: rule__EtatVisibilite__Alternatives : ( ( ( 'visible' ) ) | ( ( 'nvisible' ) ) );
    public final void rule__EtatVisibilite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:597:1: ( ( ( 'visible' ) ) | ( ( 'nvisible' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalENIGMA.g:598:2: ( ( 'visible' ) )
                    {
                    // InternalENIGMA.g:598:2: ( ( 'visible' ) )
                    // InternalENIGMA.g:599:3: ( 'visible' )
                    {
                     before(grammarAccess.getEtatVisibiliteAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalENIGMA.g:600:3: ( 'visible' )
                    // InternalENIGMA.g:600:4: 'visible'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtatVisibiliteAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:604:2: ( ( 'nvisible' ) )
                    {
                    // InternalENIGMA.g:604:2: ( ( 'nvisible' ) )
                    // InternalENIGMA.g:605:3: ( 'nvisible' )
                    {
                     before(grammarAccess.getEtatVisibiliteAccess().getNvisibleEnumLiteralDeclaration_1()); 
                    // InternalENIGMA.g:606:3: ( 'nvisible' )
                    // InternalENIGMA.g:606:4: 'nvisible'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtatVisibiliteAccess().getNvisibleEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EtatVisibilite__Alternatives"


    // $ANTLR start "rule__EtatObligation__Alternatives"
    // InternalENIGMA.g:614:1: rule__EtatObligation__Alternatives : ( ( ( 'obligatoire' ) ) | ( ( 'nobligatoire' ) ) );
    public final void rule__EtatObligation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:618:1: ( ( ( 'obligatoire' ) ) | ( ( 'nobligatoire' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalENIGMA.g:619:2: ( ( 'obligatoire' ) )
                    {
                    // InternalENIGMA.g:619:2: ( ( 'obligatoire' ) )
                    // InternalENIGMA.g:620:3: ( 'obligatoire' )
                    {
                     before(grammarAccess.getEtatObligationAccess().getObligatoireEnumLiteralDeclaration_0()); 
                    // InternalENIGMA.g:621:3: ( 'obligatoire' )
                    // InternalENIGMA.g:621:4: 'obligatoire'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtatObligationAccess().getObligatoireEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:625:2: ( ( 'nobligatoire' ) )
                    {
                    // InternalENIGMA.g:625:2: ( ( 'nobligatoire' ) )
                    // InternalENIGMA.g:626:3: ( 'nobligatoire' )
                    {
                     before(grammarAccess.getEtatObligationAccess().getNobligatoireEnumLiteralDeclaration_1()); 
                    // InternalENIGMA.g:627:3: ( 'nobligatoire' )
                    // InternalENIGMA.g:627:4: 'nobligatoire'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtatObligationAccess().getNobligatoireEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EtatObligation__Alternatives"


    // $ANTLR start "rule__EtatChemin__Alternatives"
    // InternalENIGMA.g:635:1: rule__EtatChemin__Alternatives : ( ( ( 'ouvert' ) ) | ( ( 'ferme' ) ) );
    public final void rule__EtatChemin__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:639:1: ( ( ( 'ouvert' ) ) | ( ( 'ferme' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalENIGMA.g:640:2: ( ( 'ouvert' ) )
                    {
                    // InternalENIGMA.g:640:2: ( ( 'ouvert' ) )
                    // InternalENIGMA.g:641:3: ( 'ouvert' )
                    {
                     before(grammarAccess.getEtatCheminAccess().getOuvertEnumLiteralDeclaration_0()); 
                    // InternalENIGMA.g:642:3: ( 'ouvert' )
                    // InternalENIGMA.g:642:4: 'ouvert'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtatCheminAccess().getOuvertEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:646:2: ( ( 'ferme' ) )
                    {
                    // InternalENIGMA.g:646:2: ( ( 'ferme' ) )
                    // InternalENIGMA.g:647:3: ( 'ferme' )
                    {
                     before(grammarAccess.getEtatCheminAccess().getFermeEnumLiteralDeclaration_1()); 
                    // InternalENIGMA.g:648:3: ( 'ferme' )
                    // InternalENIGMA.g:648:4: 'ferme'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtatCheminAccess().getFermeEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__EtatChemin__Alternatives"


    // $ANTLR start "rule__Jeu__Group__0"
    // InternalENIGMA.g:656:1: rule__Jeu__Group__0 : rule__Jeu__Group__0__Impl rule__Jeu__Group__1 ;
    public final void rule__Jeu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:660:1: ( rule__Jeu__Group__0__Impl rule__Jeu__Group__1 )
            // InternalENIGMA.g:661:2: rule__Jeu__Group__0__Impl rule__Jeu__Group__1
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
    // InternalENIGMA.g:668:1: rule__Jeu__Group__0__Impl : ( 'jeu' ) ;
    public final void rule__Jeu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:672:1: ( ( 'jeu' ) )
            // InternalENIGMA.g:673:1: ( 'jeu' )
            {
            // InternalENIGMA.g:673:1: ( 'jeu' )
            // InternalENIGMA.g:674:2: 'jeu'
            {
             before(grammarAccess.getJeuAccess().getJeuKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalENIGMA.g:683:1: rule__Jeu__Group__1 : rule__Jeu__Group__1__Impl rule__Jeu__Group__2 ;
    public final void rule__Jeu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:687:1: ( rule__Jeu__Group__1__Impl rule__Jeu__Group__2 )
            // InternalENIGMA.g:688:2: rule__Jeu__Group__1__Impl rule__Jeu__Group__2
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
    // InternalENIGMA.g:695:1: rule__Jeu__Group__1__Impl : ( ( rule__Jeu__NameAssignment_1 ) ) ;
    public final void rule__Jeu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:699:1: ( ( ( rule__Jeu__NameAssignment_1 ) ) )
            // InternalENIGMA.g:700:1: ( ( rule__Jeu__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:700:1: ( ( rule__Jeu__NameAssignment_1 ) )
            // InternalENIGMA.g:701:2: ( rule__Jeu__NameAssignment_1 )
            {
             before(grammarAccess.getJeuAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:702:2: ( rule__Jeu__NameAssignment_1 )
            // InternalENIGMA.g:702:3: rule__Jeu__NameAssignment_1
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
    // InternalENIGMA.g:710:1: rule__Jeu__Group__2 : rule__Jeu__Group__2__Impl rule__Jeu__Group__3 ;
    public final void rule__Jeu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:714:1: ( rule__Jeu__Group__2__Impl rule__Jeu__Group__3 )
            // InternalENIGMA.g:715:2: rule__Jeu__Group__2__Impl rule__Jeu__Group__3
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
    // InternalENIGMA.g:722:1: rule__Jeu__Group__2__Impl : ( '{' ) ;
    public final void rule__Jeu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:726:1: ( ( '{' ) )
            // InternalENIGMA.g:727:1: ( '{' )
            {
            // InternalENIGMA.g:727:1: ( '{' )
            // InternalENIGMA.g:728:2: '{'
            {
             before(grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalENIGMA.g:737:1: rule__Jeu__Group__3 : rule__Jeu__Group__3__Impl rule__Jeu__Group__4 ;
    public final void rule__Jeu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:741:1: ( rule__Jeu__Group__3__Impl rule__Jeu__Group__4 )
            // InternalENIGMA.g:742:2: rule__Jeu__Group__3__Impl rule__Jeu__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalENIGMA.g:749:1: rule__Jeu__Group__3__Impl : ( ( rule__Jeu__JeuelementAssignment_3 )* ) ;
    public final void rule__Jeu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:753:1: ( ( ( rule__Jeu__JeuelementAssignment_3 )* ) )
            // InternalENIGMA.g:754:1: ( ( rule__Jeu__JeuelementAssignment_3 )* )
            {
            // InternalENIGMA.g:754:1: ( ( rule__Jeu__JeuelementAssignment_3 )* )
            // InternalENIGMA.g:755:2: ( rule__Jeu__JeuelementAssignment_3 )*
            {
             before(grammarAccess.getJeuAccess().getJeuelementAssignment_3()); 
            // InternalENIGMA.g:756:2: ( rule__Jeu__JeuelementAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==26||LA6_0==28||LA6_0==33||LA6_0==38||(LA6_0>=40 && LA6_0<=42)||LA6_0==44||LA6_0==46||LA6_0==48||LA6_0==52) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalENIGMA.g:756:3: rule__Jeu__JeuelementAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Jeu__JeuelementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getJeuAccess().getJeuelementAssignment_3()); 

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
    // InternalENIGMA.g:764:1: rule__Jeu__Group__4 : rule__Jeu__Group__4__Impl ;
    public final void rule__Jeu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:768:1: ( rule__Jeu__Group__4__Impl )
            // InternalENIGMA.g:769:2: rule__Jeu__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jeu__Group__4__Impl();

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
    // InternalENIGMA.g:775:1: rule__Jeu__Group__4__Impl : ( '}' ) ;
    public final void rule__Jeu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:779:1: ( ( '}' ) )
            // InternalENIGMA.g:780:1: ( '}' )
            {
            // InternalENIGMA.g:780:1: ( '}' )
            // InternalENIGMA.g:781:2: '}'
            {
             before(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Joueur__Group__0"
    // InternalENIGMA.g:791:1: rule__Joueur__Group__0 : rule__Joueur__Group__0__Impl rule__Joueur__Group__1 ;
    public final void rule__Joueur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:795:1: ( rule__Joueur__Group__0__Impl rule__Joueur__Group__1 )
            // InternalENIGMA.g:796:2: rule__Joueur__Group__0__Impl rule__Joueur__Group__1
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
    // InternalENIGMA.g:803:1: rule__Joueur__Group__0__Impl : ( 'joueur' ) ;
    public final void rule__Joueur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:807:1: ( ( 'joueur' ) )
            // InternalENIGMA.g:808:1: ( 'joueur' )
            {
            // InternalENIGMA.g:808:1: ( 'joueur' )
            // InternalENIGMA.g:809:2: 'joueur'
            {
             before(grammarAccess.getJoueurAccess().getJoueurKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalENIGMA.g:818:1: rule__Joueur__Group__1 : rule__Joueur__Group__1__Impl rule__Joueur__Group__2 ;
    public final void rule__Joueur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:822:1: ( rule__Joueur__Group__1__Impl rule__Joueur__Group__2 )
            // InternalENIGMA.g:823:2: rule__Joueur__Group__1__Impl rule__Joueur__Group__2
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
    // InternalENIGMA.g:830:1: rule__Joueur__Group__1__Impl : ( ( rule__Joueur__NameAssignment_1 ) ) ;
    public final void rule__Joueur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:834:1: ( ( ( rule__Joueur__NameAssignment_1 ) ) )
            // InternalENIGMA.g:835:1: ( ( rule__Joueur__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:835:1: ( ( rule__Joueur__NameAssignment_1 ) )
            // InternalENIGMA.g:836:2: ( rule__Joueur__NameAssignment_1 )
            {
             before(grammarAccess.getJoueurAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:837:2: ( rule__Joueur__NameAssignment_1 )
            // InternalENIGMA.g:837:3: rule__Joueur__NameAssignment_1
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
    // InternalENIGMA.g:845:1: rule__Joueur__Group__2 : rule__Joueur__Group__2__Impl rule__Joueur__Group__3 ;
    public final void rule__Joueur__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:849:1: ( rule__Joueur__Group__2__Impl rule__Joueur__Group__3 )
            // InternalENIGMA.g:850:2: rule__Joueur__Group__2__Impl rule__Joueur__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalENIGMA.g:857:1: rule__Joueur__Group__2__Impl : ( '{' ) ;
    public final void rule__Joueur__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:861:1: ( ( '{' ) )
            // InternalENIGMA.g:862:1: ( '{' )
            {
            // InternalENIGMA.g:862:1: ( '{' )
            // InternalENIGMA.g:863:2: '{'
            {
             before(grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalENIGMA.g:872:1: rule__Joueur__Group__3 : rule__Joueur__Group__3__Impl rule__Joueur__Group__4 ;
    public final void rule__Joueur__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:876:1: ( rule__Joueur__Group__3__Impl rule__Joueur__Group__4 )
            // InternalENIGMA.g:877:2: rule__Joueur__Group__3__Impl rule__Joueur__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalENIGMA.g:884:1: rule__Joueur__Group__3__Impl : ( 'limite' ) ;
    public final void rule__Joueur__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:888:1: ( ( 'limite' ) )
            // InternalENIGMA.g:889:1: ( 'limite' )
            {
            // InternalENIGMA.g:889:1: ( 'limite' )
            // InternalENIGMA.g:890:2: 'limite'
            {
             before(grammarAccess.getJoueurAccess().getLimiteKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getLimiteKeyword_3()); 

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
    // InternalENIGMA.g:899:1: rule__Joueur__Group__4 : rule__Joueur__Group__4__Impl rule__Joueur__Group__5 ;
    public final void rule__Joueur__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:903:1: ( rule__Joueur__Group__4__Impl rule__Joueur__Group__5 )
            // InternalENIGMA.g:904:2: rule__Joueur__Group__4__Impl rule__Joueur__Group__5
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
    // InternalENIGMA.g:911:1: rule__Joueur__Group__4__Impl : ( ( rule__Joueur__LimiteAssignment_4 ) ) ;
    public final void rule__Joueur__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:915:1: ( ( ( rule__Joueur__LimiteAssignment_4 ) ) )
            // InternalENIGMA.g:916:1: ( ( rule__Joueur__LimiteAssignment_4 ) )
            {
            // InternalENIGMA.g:916:1: ( ( rule__Joueur__LimiteAssignment_4 ) )
            // InternalENIGMA.g:917:2: ( rule__Joueur__LimiteAssignment_4 )
            {
             before(grammarAccess.getJoueurAccess().getLimiteAssignment_4()); 
            // InternalENIGMA.g:918:2: ( rule__Joueur__LimiteAssignment_4 )
            // InternalENIGMA.g:918:3: rule__Joueur__LimiteAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__LimiteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getLimiteAssignment_4()); 

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
    // InternalENIGMA.g:926:1: rule__Joueur__Group__5 : rule__Joueur__Group__5__Impl rule__Joueur__Group__6 ;
    public final void rule__Joueur__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:930:1: ( rule__Joueur__Group__5__Impl rule__Joueur__Group__6 )
            // InternalENIGMA.g:931:2: rule__Joueur__Group__5__Impl rule__Joueur__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalENIGMA.g:938:1: rule__Joueur__Group__5__Impl : ( 'objets' ) ;
    public final void rule__Joueur__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:942:1: ( ( 'objets' ) )
            // InternalENIGMA.g:943:1: ( 'objets' )
            {
            // InternalENIGMA.g:943:1: ( 'objets' )
            // InternalENIGMA.g:944:2: 'objets'
            {
             before(grammarAccess.getJoueurAccess().getObjetsKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getObjetsKeyword_5()); 

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
    // InternalENIGMA.g:953:1: rule__Joueur__Group__6 : rule__Joueur__Group__6__Impl rule__Joueur__Group__7 ;
    public final void rule__Joueur__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:957:1: ( rule__Joueur__Group__6__Impl rule__Joueur__Group__7 )
            // InternalENIGMA.g:958:2: rule__Joueur__Group__6__Impl rule__Joueur__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalENIGMA.g:965:1: rule__Joueur__Group__6__Impl : ( '{' ) ;
    public final void rule__Joueur__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:969:1: ( ( '{' ) )
            // InternalENIGMA.g:970:1: ( '{' )
            {
            // InternalENIGMA.g:970:1: ( '{' )
            // InternalENIGMA.g:971:2: '{'
            {
             before(grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_6()); 

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
    // InternalENIGMA.g:980:1: rule__Joueur__Group__7 : rule__Joueur__Group__7__Impl rule__Joueur__Group__8 ;
    public final void rule__Joueur__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:984:1: ( rule__Joueur__Group__7__Impl rule__Joueur__Group__8 )
            // InternalENIGMA.g:985:2: rule__Joueur__Group__7__Impl rule__Joueur__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Joueur__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__8();

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
    // InternalENIGMA.g:992:1: rule__Joueur__Group__7__Impl : ( ( rule__Joueur__ObjetsAssignment_7 )* ) ;
    public final void rule__Joueur__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:996:1: ( ( ( rule__Joueur__ObjetsAssignment_7 )* ) )
            // InternalENIGMA.g:997:1: ( ( rule__Joueur__ObjetsAssignment_7 )* )
            {
            // InternalENIGMA.g:997:1: ( ( rule__Joueur__ObjetsAssignment_7 )* )
            // InternalENIGMA.g:998:2: ( rule__Joueur__ObjetsAssignment_7 )*
            {
             before(grammarAccess.getJoueurAccess().getObjetsAssignment_7()); 
            // InternalENIGMA.g:999:2: ( rule__Joueur__ObjetsAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalENIGMA.g:999:3: rule__Joueur__ObjetsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Joueur__ObjetsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getJoueurAccess().getObjetsAssignment_7()); 

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


    // $ANTLR start "rule__Joueur__Group__8"
    // InternalENIGMA.g:1007:1: rule__Joueur__Group__8 : rule__Joueur__Group__8__Impl rule__Joueur__Group__9 ;
    public final void rule__Joueur__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1011:1: ( rule__Joueur__Group__8__Impl rule__Joueur__Group__9 )
            // InternalENIGMA.g:1012:2: rule__Joueur__Group__8__Impl rule__Joueur__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Joueur__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__9();

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
    // $ANTLR end "rule__Joueur__Group__8"


    // $ANTLR start "rule__Joueur__Group__8__Impl"
    // InternalENIGMA.g:1019:1: rule__Joueur__Group__8__Impl : ( '}' ) ;
    public final void rule__Joueur__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1023:1: ( ( '}' ) )
            // InternalENIGMA.g:1024:1: ( '}' )
            {
            // InternalENIGMA.g:1024:1: ( '}' )
            // InternalENIGMA.g:1025:2: '}'
            {
             before(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Joueur__Group__8__Impl"


    // $ANTLR start "rule__Joueur__Group__9"
    // InternalENIGMA.g:1034:1: rule__Joueur__Group__9 : rule__Joueur__Group__9__Impl rule__Joueur__Group__10 ;
    public final void rule__Joueur__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1038:1: ( rule__Joueur__Group__9__Impl rule__Joueur__Group__10 )
            // InternalENIGMA.g:1039:2: rule__Joueur__Group__9__Impl rule__Joueur__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Joueur__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__10();

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
    // $ANTLR end "rule__Joueur__Group__9"


    // $ANTLR start "rule__Joueur__Group__9__Impl"
    // InternalENIGMA.g:1046:1: rule__Joueur__Group__9__Impl : ( 'connaissances' ) ;
    public final void rule__Joueur__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1050:1: ( ( 'connaissances' ) )
            // InternalENIGMA.g:1051:1: ( 'connaissances' )
            {
            // InternalENIGMA.g:1051:1: ( 'connaissances' )
            // InternalENIGMA.g:1052:2: 'connaissances'
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getConnaissancesKeyword_9()); 

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
    // $ANTLR end "rule__Joueur__Group__9__Impl"


    // $ANTLR start "rule__Joueur__Group__10"
    // InternalENIGMA.g:1061:1: rule__Joueur__Group__10 : rule__Joueur__Group__10__Impl rule__Joueur__Group__11 ;
    public final void rule__Joueur__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1065:1: ( rule__Joueur__Group__10__Impl rule__Joueur__Group__11 )
            // InternalENIGMA.g:1066:2: rule__Joueur__Group__10__Impl rule__Joueur__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Joueur__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__11();

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
    // $ANTLR end "rule__Joueur__Group__10"


    // $ANTLR start "rule__Joueur__Group__10__Impl"
    // InternalENIGMA.g:1073:1: rule__Joueur__Group__10__Impl : ( '{' ) ;
    public final void rule__Joueur__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1077:1: ( ( '{' ) )
            // InternalENIGMA.g:1078:1: ( '{' )
            {
            // InternalENIGMA.g:1078:1: ( '{' )
            // InternalENIGMA.g:1079:2: '{'
            {
             before(grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Joueur__Group__10__Impl"


    // $ANTLR start "rule__Joueur__Group__11"
    // InternalENIGMA.g:1088:1: rule__Joueur__Group__11 : rule__Joueur__Group__11__Impl rule__Joueur__Group__12 ;
    public final void rule__Joueur__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1092:1: ( rule__Joueur__Group__11__Impl rule__Joueur__Group__12 )
            // InternalENIGMA.g:1093:2: rule__Joueur__Group__11__Impl rule__Joueur__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Joueur__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__12();

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
    // $ANTLR end "rule__Joueur__Group__11"


    // $ANTLR start "rule__Joueur__Group__11__Impl"
    // InternalENIGMA.g:1100:1: rule__Joueur__Group__11__Impl : ( ( rule__Joueur__ConnaissancesAssignment_11 )* ) ;
    public final void rule__Joueur__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1104:1: ( ( ( rule__Joueur__ConnaissancesAssignment_11 )* ) )
            // InternalENIGMA.g:1105:1: ( ( rule__Joueur__ConnaissancesAssignment_11 )* )
            {
            // InternalENIGMA.g:1105:1: ( ( rule__Joueur__ConnaissancesAssignment_11 )* )
            // InternalENIGMA.g:1106:2: ( rule__Joueur__ConnaissancesAssignment_11 )*
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesAssignment_11()); 
            // InternalENIGMA.g:1107:2: ( rule__Joueur__ConnaissancesAssignment_11 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalENIGMA.g:1107:3: rule__Joueur__ConnaissancesAssignment_11
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Joueur__ConnaissancesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getJoueurAccess().getConnaissancesAssignment_11()); 

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
    // $ANTLR end "rule__Joueur__Group__11__Impl"


    // $ANTLR start "rule__Joueur__Group__12"
    // InternalENIGMA.g:1115:1: rule__Joueur__Group__12 : rule__Joueur__Group__12__Impl rule__Joueur__Group__13 ;
    public final void rule__Joueur__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1119:1: ( rule__Joueur__Group__12__Impl rule__Joueur__Group__13 )
            // InternalENIGMA.g:1120:2: rule__Joueur__Group__12__Impl rule__Joueur__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Joueur__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joueur__Group__13();

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
    // $ANTLR end "rule__Joueur__Group__12"


    // $ANTLR start "rule__Joueur__Group__12__Impl"
    // InternalENIGMA.g:1127:1: rule__Joueur__Group__12__Impl : ( '}' ) ;
    public final void rule__Joueur__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1131:1: ( ( '}' ) )
            // InternalENIGMA.g:1132:1: ( '}' )
            {
            // InternalENIGMA.g:1132:1: ( '}' )
            // InternalENIGMA.g:1133:2: '}'
            {
             before(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_12()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Joueur__Group__12__Impl"


    // $ANTLR start "rule__Joueur__Group__13"
    // InternalENIGMA.g:1142:1: rule__Joueur__Group__13 : rule__Joueur__Group__13__Impl ;
    public final void rule__Joueur__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1146:1: ( rule__Joueur__Group__13__Impl )
            // InternalENIGMA.g:1147:2: rule__Joueur__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Group__13__Impl();

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
    // $ANTLR end "rule__Joueur__Group__13"


    // $ANTLR start "rule__Joueur__Group__13__Impl"
    // InternalENIGMA.g:1153:1: rule__Joueur__Group__13__Impl : ( '}' ) ;
    public final void rule__Joueur__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1157:1: ( ( '}' ) )
            // InternalENIGMA.g:1158:1: ( '}' )
            {
            // InternalENIGMA.g:1158:1: ( '}' )
            // InternalENIGMA.g:1159:2: '}'
            {
             before(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Joueur__Group__13__Impl"


    // $ANTLR start "rule__Connaissance__Group__0"
    // InternalENIGMA.g:1169:1: rule__Connaissance__Group__0 : rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 ;
    public final void rule__Connaissance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1173:1: ( rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1 )
            // InternalENIGMA.g:1174:2: rule__Connaissance__Group__0__Impl rule__Connaissance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Connaissance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__1();

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
    // $ANTLR end "rule__Connaissance__Group__0"


    // $ANTLR start "rule__Connaissance__Group__0__Impl"
    // InternalENIGMA.g:1181:1: rule__Connaissance__Group__0__Impl : ( 'connaissance' ) ;
    public final void rule__Connaissance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1185:1: ( ( 'connaissance' ) )
            // InternalENIGMA.g:1186:1: ( 'connaissance' )
            {
            // InternalENIGMA.g:1186:1: ( 'connaissance' )
            // InternalENIGMA.g:1187:2: 'connaissance'
            {
             before(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0()); 

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
    // $ANTLR end "rule__Connaissance__Group__0__Impl"


    // $ANTLR start "rule__Connaissance__Group__1"
    // InternalENIGMA.g:1196:1: rule__Connaissance__Group__1 : rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 ;
    public final void rule__Connaissance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1200:1: ( rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2 )
            // InternalENIGMA.g:1201:2: rule__Connaissance__Group__1__Impl rule__Connaissance__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Connaissance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__2();

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
    // $ANTLR end "rule__Connaissance__Group__1"


    // $ANTLR start "rule__Connaissance__Group__1__Impl"
    // InternalENIGMA.g:1208:1: rule__Connaissance__Group__1__Impl : ( ( rule__Connaissance__NameAssignment_1 ) ) ;
    public final void rule__Connaissance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1212:1: ( ( ( rule__Connaissance__NameAssignment_1 ) ) )
            // InternalENIGMA.g:1213:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:1213:1: ( ( rule__Connaissance__NameAssignment_1 ) )
            // InternalENIGMA.g:1214:2: ( rule__Connaissance__NameAssignment_1 )
            {
             before(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:1215:2: ( rule__Connaissance__NameAssignment_1 )
            // InternalENIGMA.g:1215:3: rule__Connaissance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Connaissance__Group__1__Impl"


    // $ANTLR start "rule__Connaissance__Group__2"
    // InternalENIGMA.g:1223:1: rule__Connaissance__Group__2 : rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 ;
    public final void rule__Connaissance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1227:1: ( rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3 )
            // InternalENIGMA.g:1228:2: rule__Connaissance__Group__2__Impl rule__Connaissance__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Connaissance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__3();

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
    // $ANTLR end "rule__Connaissance__Group__2"


    // $ANTLR start "rule__Connaissance__Group__2__Impl"
    // InternalENIGMA.g:1235:1: rule__Connaissance__Group__2__Impl : ( ( rule__Connaissance__QualificationAssignment_2 ) ) ;
    public final void rule__Connaissance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1239:1: ( ( ( rule__Connaissance__QualificationAssignment_2 ) ) )
            // InternalENIGMA.g:1240:1: ( ( rule__Connaissance__QualificationAssignment_2 ) )
            {
            // InternalENIGMA.g:1240:1: ( ( rule__Connaissance__QualificationAssignment_2 ) )
            // InternalENIGMA.g:1241:2: ( rule__Connaissance__QualificationAssignment_2 )
            {
             before(grammarAccess.getConnaissanceAccess().getQualificationAssignment_2()); 
            // InternalENIGMA.g:1242:2: ( rule__Connaissance__QualificationAssignment_2 )
            // InternalENIGMA.g:1242:3: rule__Connaissance__QualificationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__QualificationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getQualificationAssignment_2()); 

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
    // $ANTLR end "rule__Connaissance__Group__2__Impl"


    // $ANTLR start "rule__Connaissance__Group__3"
    // InternalENIGMA.g:1250:1: rule__Connaissance__Group__3 : rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 ;
    public final void rule__Connaissance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1254:1: ( rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4 )
            // InternalENIGMA.g:1255:2: rule__Connaissance__Group__3__Impl rule__Connaissance__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Connaissance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__4();

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
    // $ANTLR end "rule__Connaissance__Group__3"


    // $ANTLR start "rule__Connaissance__Group__3__Impl"
    // InternalENIGMA.g:1262:1: rule__Connaissance__Group__3__Impl : ( 'etat' ) ;
    public final void rule__Connaissance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1266:1: ( ( 'etat' ) )
            // InternalENIGMA.g:1267:1: ( 'etat' )
            {
            // InternalENIGMA.g:1267:1: ( 'etat' )
            // InternalENIGMA.g:1268:2: 'etat'
            {
             before(grammarAccess.getConnaissanceAccess().getEtatKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getEtatKeyword_3()); 

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
    // $ANTLR end "rule__Connaissance__Group__3__Impl"


    // $ANTLR start "rule__Connaissance__Group__4"
    // InternalENIGMA.g:1277:1: rule__Connaissance__Group__4 : rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 ;
    public final void rule__Connaissance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1281:1: ( rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5 )
            // InternalENIGMA.g:1282:2: rule__Connaissance__Group__4__Impl rule__Connaissance__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Connaissance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__5();

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
    // $ANTLR end "rule__Connaissance__Group__4"


    // $ANTLR start "rule__Connaissance__Group__4__Impl"
    // InternalENIGMA.g:1289:1: rule__Connaissance__Group__4__Impl : ( ( rule__Connaissance__EtatvAssignment_4 ) ) ;
    public final void rule__Connaissance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1293:1: ( ( ( rule__Connaissance__EtatvAssignment_4 ) ) )
            // InternalENIGMA.g:1294:1: ( ( rule__Connaissance__EtatvAssignment_4 ) )
            {
            // InternalENIGMA.g:1294:1: ( ( rule__Connaissance__EtatvAssignment_4 ) )
            // InternalENIGMA.g:1295:2: ( rule__Connaissance__EtatvAssignment_4 )
            {
             before(grammarAccess.getConnaissanceAccess().getEtatvAssignment_4()); 
            // InternalENIGMA.g:1296:2: ( rule__Connaissance__EtatvAssignment_4 )
            // InternalENIGMA.g:1296:3: rule__Connaissance__EtatvAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__EtatvAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getEtatvAssignment_4()); 

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
    // $ANTLR end "rule__Connaissance__Group__4__Impl"


    // $ANTLR start "rule__Connaissance__Group__5"
    // InternalENIGMA.g:1304:1: rule__Connaissance__Group__5 : rule__Connaissance__Group__5__Impl ;
    public final void rule__Connaissance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1308:1: ( rule__Connaissance__Group__5__Impl )
            // InternalENIGMA.g:1309:2: rule__Connaissance__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__Group__5__Impl();

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
    // $ANTLR end "rule__Connaissance__Group__5"


    // $ANTLR start "rule__Connaissance__Group__5__Impl"
    // InternalENIGMA.g:1315:1: rule__Connaissance__Group__5__Impl : ( ( rule__Connaissance__EtatpAssignment_5 ) ) ;
    public final void rule__Connaissance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1319:1: ( ( ( rule__Connaissance__EtatpAssignment_5 ) ) )
            // InternalENIGMA.g:1320:1: ( ( rule__Connaissance__EtatpAssignment_5 ) )
            {
            // InternalENIGMA.g:1320:1: ( ( rule__Connaissance__EtatpAssignment_5 ) )
            // InternalENIGMA.g:1321:2: ( rule__Connaissance__EtatpAssignment_5 )
            {
             before(grammarAccess.getConnaissanceAccess().getEtatpAssignment_5()); 
            // InternalENIGMA.g:1322:2: ( rule__Connaissance__EtatpAssignment_5 )
            // InternalENIGMA.g:1322:3: rule__Connaissance__EtatpAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Connaissance__EtatpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConnaissanceAccess().getEtatpAssignment_5()); 

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
    // $ANTLR end "rule__Connaissance__Group__5__Impl"


    // $ANTLR start "rule__Objet__Group__0"
    // InternalENIGMA.g:1331:1: rule__Objet__Group__0 : rule__Objet__Group__0__Impl rule__Objet__Group__1 ;
    public final void rule__Objet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1335:1: ( rule__Objet__Group__0__Impl rule__Objet__Group__1 )
            // InternalENIGMA.g:1336:2: rule__Objet__Group__0__Impl rule__Objet__Group__1
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
    // InternalENIGMA.g:1343:1: rule__Objet__Group__0__Impl : ( 'objet' ) ;
    public final void rule__Objet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1347:1: ( ( 'objet' ) )
            // InternalENIGMA.g:1348:1: ( 'objet' )
            {
            // InternalENIGMA.g:1348:1: ( 'objet' )
            // InternalENIGMA.g:1349:2: 'objet'
            {
             before(grammarAccess.getObjetAccess().getObjetKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalENIGMA.g:1358:1: rule__Objet__Group__1 : rule__Objet__Group__1__Impl rule__Objet__Group__2 ;
    public final void rule__Objet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1362:1: ( rule__Objet__Group__1__Impl rule__Objet__Group__2 )
            // InternalENIGMA.g:1363:2: rule__Objet__Group__1__Impl rule__Objet__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalENIGMA.g:1370:1: rule__Objet__Group__1__Impl : ( ( rule__Objet__NameAssignment_1 ) ) ;
    public final void rule__Objet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1374:1: ( ( ( rule__Objet__NameAssignment_1 ) ) )
            // InternalENIGMA.g:1375:1: ( ( rule__Objet__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:1375:1: ( ( rule__Objet__NameAssignment_1 ) )
            // InternalENIGMA.g:1376:2: ( rule__Objet__NameAssignment_1 )
            {
             before(grammarAccess.getObjetAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:1377:2: ( rule__Objet__NameAssignment_1 )
            // InternalENIGMA.g:1377:3: rule__Objet__NameAssignment_1
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
    // InternalENIGMA.g:1385:1: rule__Objet__Group__2 : rule__Objet__Group__2__Impl rule__Objet__Group__3 ;
    public final void rule__Objet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1389:1: ( rule__Objet__Group__2__Impl rule__Objet__Group__3 )
            // InternalENIGMA.g:1390:2: rule__Objet__Group__2__Impl rule__Objet__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalENIGMA.g:1397:1: rule__Objet__Group__2__Impl : ( 'occurrence' ) ;
    public final void rule__Objet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1401:1: ( ( 'occurrence' ) )
            // InternalENIGMA.g:1402:1: ( 'occurrence' )
            {
            // InternalENIGMA.g:1402:1: ( 'occurrence' )
            // InternalENIGMA.g:1403:2: 'occurrence'
            {
             before(grammarAccess.getObjetAccess().getOccurrenceKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getOccurrenceKeyword_2()); 

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
    // InternalENIGMA.g:1412:1: rule__Objet__Group__3 : rule__Objet__Group__3__Impl rule__Objet__Group__4 ;
    public final void rule__Objet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1416:1: ( rule__Objet__Group__3__Impl rule__Objet__Group__4 )
            // InternalENIGMA.g:1417:2: rule__Objet__Group__3__Impl rule__Objet__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalENIGMA.g:1424:1: rule__Objet__Group__3__Impl : ( ( rule__Objet__OccurrenceAssignment_3 ) ) ;
    public final void rule__Objet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1428:1: ( ( ( rule__Objet__OccurrenceAssignment_3 ) ) )
            // InternalENIGMA.g:1429:1: ( ( rule__Objet__OccurrenceAssignment_3 ) )
            {
            // InternalENIGMA.g:1429:1: ( ( rule__Objet__OccurrenceAssignment_3 ) )
            // InternalENIGMA.g:1430:2: ( rule__Objet__OccurrenceAssignment_3 )
            {
             before(grammarAccess.getObjetAccess().getOccurrenceAssignment_3()); 
            // InternalENIGMA.g:1431:2: ( rule__Objet__OccurrenceAssignment_3 )
            // InternalENIGMA.g:1431:3: rule__Objet__OccurrenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Objet__OccurrenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getOccurrenceAssignment_3()); 

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
    // InternalENIGMA.g:1439:1: rule__Objet__Group__4 : rule__Objet__Group__4__Impl rule__Objet__Group__5 ;
    public final void rule__Objet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1443:1: ( rule__Objet__Group__4__Impl rule__Objet__Group__5 )
            // InternalENIGMA.g:1444:2: rule__Objet__Group__4__Impl rule__Objet__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Objet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__5();

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
    // InternalENIGMA.g:1451:1: rule__Objet__Group__4__Impl : ( ',' ) ;
    public final void rule__Objet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1455:1: ( ( ',' ) )
            // InternalENIGMA.g:1456:1: ( ',' )
            {
            // InternalENIGMA.g:1456:1: ( ',' )
            // InternalENIGMA.g:1457:2: ','
            {
             before(grammarAccess.getObjetAccess().getCommaKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getCommaKeyword_4()); 

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


    // $ANTLR start "rule__Objet__Group__5"
    // InternalENIGMA.g:1466:1: rule__Objet__Group__5 : rule__Objet__Group__5__Impl rule__Objet__Group__6 ;
    public final void rule__Objet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1470:1: ( rule__Objet__Group__5__Impl rule__Objet__Group__6 )
            // InternalENIGMA.g:1471:2: rule__Objet__Group__5__Impl rule__Objet__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Objet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__6();

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
    // $ANTLR end "rule__Objet__Group__5"


    // $ANTLR start "rule__Objet__Group__5__Impl"
    // InternalENIGMA.g:1478:1: rule__Objet__Group__5__Impl : ( 'de' ) ;
    public final void rule__Objet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1482:1: ( ( 'de' ) )
            // InternalENIGMA.g:1483:1: ( 'de' )
            {
            // InternalENIGMA.g:1483:1: ( 'de' )
            // InternalENIGMA.g:1484:2: 'de'
            {
             before(grammarAccess.getObjetAccess().getDeKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getDeKeyword_5()); 

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
    // $ANTLR end "rule__Objet__Group__5__Impl"


    // $ANTLR start "rule__Objet__Group__6"
    // InternalENIGMA.g:1493:1: rule__Objet__Group__6 : rule__Objet__Group__6__Impl rule__Objet__Group__7 ;
    public final void rule__Objet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1497:1: ( rule__Objet__Group__6__Impl rule__Objet__Group__7 )
            // InternalENIGMA.g:1498:2: rule__Objet__Group__6__Impl rule__Objet__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Objet__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__7();

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
    // $ANTLR end "rule__Objet__Group__6"


    // $ANTLR start "rule__Objet__Group__6__Impl"
    // InternalENIGMA.g:1505:1: rule__Objet__Group__6__Impl : ( 'taille' ) ;
    public final void rule__Objet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1509:1: ( ( 'taille' ) )
            // InternalENIGMA.g:1510:1: ( 'taille' )
            {
            // InternalENIGMA.g:1510:1: ( 'taille' )
            // InternalENIGMA.g:1511:2: 'taille'
            {
             before(grammarAccess.getObjetAccess().getTailleKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleKeyword_6()); 

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
    // $ANTLR end "rule__Objet__Group__6__Impl"


    // $ANTLR start "rule__Objet__Group__7"
    // InternalENIGMA.g:1520:1: rule__Objet__Group__7 : rule__Objet__Group__7__Impl rule__Objet__Group__8 ;
    public final void rule__Objet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1524:1: ( rule__Objet__Group__7__Impl rule__Objet__Group__8 )
            // InternalENIGMA.g:1525:2: rule__Objet__Group__7__Impl rule__Objet__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Objet__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__8();

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
    // $ANTLR end "rule__Objet__Group__7"


    // $ANTLR start "rule__Objet__Group__7__Impl"
    // InternalENIGMA.g:1532:1: rule__Objet__Group__7__Impl : ( ( rule__Objet__TailleAssignment_7 ) ) ;
    public final void rule__Objet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1536:1: ( ( ( rule__Objet__TailleAssignment_7 ) ) )
            // InternalENIGMA.g:1537:1: ( ( rule__Objet__TailleAssignment_7 ) )
            {
            // InternalENIGMA.g:1537:1: ( ( rule__Objet__TailleAssignment_7 ) )
            // InternalENIGMA.g:1538:2: ( rule__Objet__TailleAssignment_7 )
            {
             before(grammarAccess.getObjetAccess().getTailleAssignment_7()); 
            // InternalENIGMA.g:1539:2: ( rule__Objet__TailleAssignment_7 )
            // InternalENIGMA.g:1539:3: rule__Objet__TailleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Objet__TailleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getTailleAssignment_7()); 

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
    // $ANTLR end "rule__Objet__Group__7__Impl"


    // $ANTLR start "rule__Objet__Group__8"
    // InternalENIGMA.g:1547:1: rule__Objet__Group__8 : rule__Objet__Group__8__Impl rule__Objet__Group__9 ;
    public final void rule__Objet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1551:1: ( rule__Objet__Group__8__Impl rule__Objet__Group__9 )
            // InternalENIGMA.g:1552:2: rule__Objet__Group__8__Impl rule__Objet__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Objet__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__9();

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
    // $ANTLR end "rule__Objet__Group__8"


    // $ANTLR start "rule__Objet__Group__8__Impl"
    // InternalENIGMA.g:1559:1: rule__Objet__Group__8__Impl : ( 'etat' ) ;
    public final void rule__Objet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1563:1: ( ( 'etat' ) )
            // InternalENIGMA.g:1564:1: ( 'etat' )
            {
            // InternalENIGMA.g:1564:1: ( 'etat' )
            // InternalENIGMA.g:1565:2: 'etat'
            {
             before(grammarAccess.getObjetAccess().getEtatKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getEtatKeyword_8()); 

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
    // $ANTLR end "rule__Objet__Group__8__Impl"


    // $ANTLR start "rule__Objet__Group__9"
    // InternalENIGMA.g:1574:1: rule__Objet__Group__9 : rule__Objet__Group__9__Impl rule__Objet__Group__10 ;
    public final void rule__Objet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1578:1: ( rule__Objet__Group__9__Impl rule__Objet__Group__10 )
            // InternalENIGMA.g:1579:2: rule__Objet__Group__9__Impl rule__Objet__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Objet__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Objet__Group__10();

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
    // $ANTLR end "rule__Objet__Group__9"


    // $ANTLR start "rule__Objet__Group__9__Impl"
    // InternalENIGMA.g:1586:1: rule__Objet__Group__9__Impl : ( ( rule__Objet__EtatvAssignment_9 ) ) ;
    public final void rule__Objet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1590:1: ( ( ( rule__Objet__EtatvAssignment_9 ) ) )
            // InternalENIGMA.g:1591:1: ( ( rule__Objet__EtatvAssignment_9 ) )
            {
            // InternalENIGMA.g:1591:1: ( ( rule__Objet__EtatvAssignment_9 ) )
            // InternalENIGMA.g:1592:2: ( rule__Objet__EtatvAssignment_9 )
            {
             before(grammarAccess.getObjetAccess().getEtatvAssignment_9()); 
            // InternalENIGMA.g:1593:2: ( rule__Objet__EtatvAssignment_9 )
            // InternalENIGMA.g:1593:3: rule__Objet__EtatvAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Objet__EtatvAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getEtatvAssignment_9()); 

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
    // $ANTLR end "rule__Objet__Group__9__Impl"


    // $ANTLR start "rule__Objet__Group__10"
    // InternalENIGMA.g:1601:1: rule__Objet__Group__10 : rule__Objet__Group__10__Impl ;
    public final void rule__Objet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1605:1: ( rule__Objet__Group__10__Impl )
            // InternalENIGMA.g:1606:2: rule__Objet__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Objet__Group__10__Impl();

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
    // $ANTLR end "rule__Objet__Group__10"


    // $ANTLR start "rule__Objet__Group__10__Impl"
    // InternalENIGMA.g:1612:1: rule__Objet__Group__10__Impl : ( ( rule__Objet__EtatpAssignment_10 ) ) ;
    public final void rule__Objet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1616:1: ( ( ( rule__Objet__EtatpAssignment_10 ) ) )
            // InternalENIGMA.g:1617:1: ( ( rule__Objet__EtatpAssignment_10 ) )
            {
            // InternalENIGMA.g:1617:1: ( ( rule__Objet__EtatpAssignment_10 ) )
            // InternalENIGMA.g:1618:2: ( rule__Objet__EtatpAssignment_10 )
            {
             before(grammarAccess.getObjetAccess().getEtatpAssignment_10()); 
            // InternalENIGMA.g:1619:2: ( rule__Objet__EtatpAssignment_10 )
            // InternalENIGMA.g:1619:3: rule__Objet__EtatpAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Objet__EtatpAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getObjetAccess().getEtatpAssignment_10()); 

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
    // $ANTLR end "rule__Objet__Group__10__Impl"


    // $ANTLR start "rule__Territoire__Group__0"
    // InternalENIGMA.g:1628:1: rule__Territoire__Group__0 : rule__Territoire__Group__0__Impl rule__Territoire__Group__1 ;
    public final void rule__Territoire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1632:1: ( rule__Territoire__Group__0__Impl rule__Territoire__Group__1 )
            // InternalENIGMA.g:1633:2: rule__Territoire__Group__0__Impl rule__Territoire__Group__1
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
    // InternalENIGMA.g:1640:1: rule__Territoire__Group__0__Impl : ( 'territoire' ) ;
    public final void rule__Territoire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1644:1: ( ( 'territoire' ) )
            // InternalENIGMA.g:1645:1: ( 'territoire' )
            {
            // InternalENIGMA.g:1645:1: ( 'territoire' )
            // InternalENIGMA.g:1646:2: 'territoire'
            {
             before(grammarAccess.getTerritoireAccess().getTerritoireKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalENIGMA.g:1655:1: rule__Territoire__Group__1 : rule__Territoire__Group__1__Impl rule__Territoire__Group__2 ;
    public final void rule__Territoire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1659:1: ( rule__Territoire__Group__1__Impl rule__Territoire__Group__2 )
            // InternalENIGMA.g:1660:2: rule__Territoire__Group__1__Impl rule__Territoire__Group__2
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
    // InternalENIGMA.g:1667:1: rule__Territoire__Group__1__Impl : ( ( rule__Territoire__NameAssignment_1 ) ) ;
    public final void rule__Territoire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1671:1: ( ( ( rule__Territoire__NameAssignment_1 ) ) )
            // InternalENIGMA.g:1672:1: ( ( rule__Territoire__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:1672:1: ( ( rule__Territoire__NameAssignment_1 ) )
            // InternalENIGMA.g:1673:2: ( rule__Territoire__NameAssignment_1 )
            {
             before(grammarAccess.getTerritoireAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:1674:2: ( rule__Territoire__NameAssignment_1 )
            // InternalENIGMA.g:1674:3: rule__Territoire__NameAssignment_1
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
    // InternalENIGMA.g:1682:1: rule__Territoire__Group__2 : rule__Territoire__Group__2__Impl rule__Territoire__Group__3 ;
    public final void rule__Territoire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1686:1: ( rule__Territoire__Group__2__Impl rule__Territoire__Group__3 )
            // InternalENIGMA.g:1687:2: rule__Territoire__Group__2__Impl rule__Territoire__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalENIGMA.g:1694:1: rule__Territoire__Group__2__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1698:1: ( ( '{' ) )
            // InternalENIGMA.g:1699:1: ( '{' )
            {
            // InternalENIGMA.g:1699:1: ( '{' )
            // InternalENIGMA.g:1700:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalENIGMA.g:1709:1: rule__Territoire__Group__3 : rule__Territoire__Group__3__Impl rule__Territoire__Group__4 ;
    public final void rule__Territoire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1713:1: ( rule__Territoire__Group__3__Impl rule__Territoire__Group__4 )
            // InternalENIGMA.g:1714:2: rule__Territoire__Group__3__Impl rule__Territoire__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalENIGMA.g:1721:1: rule__Territoire__Group__3__Impl : ( 'depart' ) ;
    public final void rule__Territoire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1725:1: ( ( 'depart' ) )
            // InternalENIGMA.g:1726:1: ( 'depart' )
            {
            // InternalENIGMA.g:1726:1: ( 'depart' )
            // InternalENIGMA.g:1727:2: 'depart'
            {
             before(grammarAccess.getTerritoireAccess().getDepartKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getDepartKeyword_3()); 

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
    // InternalENIGMA.g:1736:1: rule__Territoire__Group__4 : rule__Territoire__Group__4__Impl rule__Territoire__Group__5 ;
    public final void rule__Territoire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1740:1: ( rule__Territoire__Group__4__Impl rule__Territoire__Group__5 )
            // InternalENIGMA.g:1741:2: rule__Territoire__Group__4__Impl rule__Territoire__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalENIGMA.g:1748:1: rule__Territoire__Group__4__Impl : ( ( rule__Territoire__LieuDebutAssignment_4 ) ) ;
    public final void rule__Territoire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1752:1: ( ( ( rule__Territoire__LieuDebutAssignment_4 ) ) )
            // InternalENIGMA.g:1753:1: ( ( rule__Territoire__LieuDebutAssignment_4 ) )
            {
            // InternalENIGMA.g:1753:1: ( ( rule__Territoire__LieuDebutAssignment_4 ) )
            // InternalENIGMA.g:1754:2: ( rule__Territoire__LieuDebutAssignment_4 )
            {
             before(grammarAccess.getTerritoireAccess().getLieuDebutAssignment_4()); 
            // InternalENIGMA.g:1755:2: ( rule__Territoire__LieuDebutAssignment_4 )
            // InternalENIGMA.g:1755:3: rule__Territoire__LieuDebutAssignment_4
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
    // InternalENIGMA.g:1763:1: rule__Territoire__Group__5 : rule__Territoire__Group__5__Impl rule__Territoire__Group__6 ;
    public final void rule__Territoire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1767:1: ( rule__Territoire__Group__5__Impl rule__Territoire__Group__6 )
            // InternalENIGMA.g:1768:2: rule__Territoire__Group__5__Impl rule__Territoire__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalENIGMA.g:1775:1: rule__Territoire__Group__5__Impl : ( 'milieu' ) ;
    public final void rule__Territoire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1779:1: ( ( 'milieu' ) )
            // InternalENIGMA.g:1780:1: ( 'milieu' )
            {
            // InternalENIGMA.g:1780:1: ( 'milieu' )
            // InternalENIGMA.g:1781:2: 'milieu'
            {
             before(grammarAccess.getTerritoireAccess().getMilieuKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getMilieuKeyword_5()); 

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
    // InternalENIGMA.g:1790:1: rule__Territoire__Group__6 : rule__Territoire__Group__6__Impl rule__Territoire__Group__7 ;
    public final void rule__Territoire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1794:1: ( rule__Territoire__Group__6__Impl rule__Territoire__Group__7 )
            // InternalENIGMA.g:1795:2: rule__Territoire__Group__6__Impl rule__Territoire__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalENIGMA.g:1802:1: rule__Territoire__Group__6__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1806:1: ( ( '{' ) )
            // InternalENIGMA.g:1807:1: ( '{' )
            {
            // InternalENIGMA.g:1807:1: ( '{' )
            // InternalENIGMA.g:1808:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_6()); 

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
    // InternalENIGMA.g:1817:1: rule__Territoire__Group__7 : rule__Territoire__Group__7__Impl rule__Territoire__Group__8 ;
    public final void rule__Territoire__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1821:1: ( rule__Territoire__Group__7__Impl rule__Territoire__Group__8 )
            // InternalENIGMA.g:1822:2: rule__Territoire__Group__7__Impl rule__Territoire__Group__8
            {
            pushFollow(FOLLOW_27);
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
    // InternalENIGMA.g:1829:1: rule__Territoire__Group__7__Impl : ( ( rule__Territoire__LieuxintermediairesAssignment_7 )* ) ;
    public final void rule__Territoire__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1833:1: ( ( ( rule__Territoire__LieuxintermediairesAssignment_7 )* ) )
            // InternalENIGMA.g:1834:1: ( ( rule__Territoire__LieuxintermediairesAssignment_7 )* )
            {
            // InternalENIGMA.g:1834:1: ( ( rule__Territoire__LieuxintermediairesAssignment_7 )* )
            // InternalENIGMA.g:1835:2: ( rule__Territoire__LieuxintermediairesAssignment_7 )*
            {
             before(grammarAccess.getTerritoireAccess().getLieuxintermediairesAssignment_7()); 
            // InternalENIGMA.g:1836:2: ( rule__Territoire__LieuxintermediairesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==42) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalENIGMA.g:1836:3: rule__Territoire__LieuxintermediairesAssignment_7
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Territoire__LieuxintermediairesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getLieuxintermediairesAssignment_7()); 

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
    // InternalENIGMA.g:1844:1: rule__Territoire__Group__8 : rule__Territoire__Group__8__Impl rule__Territoire__Group__9 ;
    public final void rule__Territoire__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1848:1: ( rule__Territoire__Group__8__Impl rule__Territoire__Group__9 )
            // InternalENIGMA.g:1849:2: rule__Territoire__Group__8__Impl rule__Territoire__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalENIGMA.g:1856:1: rule__Territoire__Group__8__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1860:1: ( ( '}' ) )
            // InternalENIGMA.g:1861:1: ( '}' )
            {
            // InternalENIGMA.g:1861:1: ( '}' )
            // InternalENIGMA.g:1862:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_8()); 

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
    // InternalENIGMA.g:1871:1: rule__Territoire__Group__9 : rule__Territoire__Group__9__Impl rule__Territoire__Group__10 ;
    public final void rule__Territoire__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1875:1: ( rule__Territoire__Group__9__Impl rule__Territoire__Group__10 )
            // InternalENIGMA.g:1876:2: rule__Territoire__Group__9__Impl rule__Territoire__Group__10
            {
            pushFollow(FOLLOW_4);
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
    // InternalENIGMA.g:1883:1: rule__Territoire__Group__9__Impl : ( 'fin' ) ;
    public final void rule__Territoire__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1887:1: ( ( 'fin' ) )
            // InternalENIGMA.g:1888:1: ( 'fin' )
            {
            // InternalENIGMA.g:1888:1: ( 'fin' )
            // InternalENIGMA.g:1889:2: 'fin'
            {
             before(grammarAccess.getTerritoireAccess().getFinKeyword_9()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getFinKeyword_9()); 

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
    // InternalENIGMA.g:1898:1: rule__Territoire__Group__10 : rule__Territoire__Group__10__Impl rule__Territoire__Group__11 ;
    public final void rule__Territoire__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1902:1: ( rule__Territoire__Group__10__Impl rule__Territoire__Group__11 )
            // InternalENIGMA.g:1903:2: rule__Territoire__Group__10__Impl rule__Territoire__Group__11
            {
            pushFollow(FOLLOW_27);
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
    // InternalENIGMA.g:1910:1: rule__Territoire__Group__10__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1914:1: ( ( '{' ) )
            // InternalENIGMA.g:1915:1: ( '{' )
            {
            // InternalENIGMA.g:1915:1: ( '{' )
            // InternalENIGMA.g:1916:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_10()); 

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
    // InternalENIGMA.g:1925:1: rule__Territoire__Group__11 : rule__Territoire__Group__11__Impl rule__Territoire__Group__12 ;
    public final void rule__Territoire__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1929:1: ( rule__Territoire__Group__11__Impl rule__Territoire__Group__12 )
            // InternalENIGMA.g:1930:2: rule__Territoire__Group__11__Impl rule__Territoire__Group__12
            {
            pushFollow(FOLLOW_27);
            rule__Territoire__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__12();

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
    // InternalENIGMA.g:1937:1: rule__Territoire__Group__11__Impl : ( ( rule__Territoire__LieuxFinAssignment_11 )* ) ;
    public final void rule__Territoire__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1941:1: ( ( ( rule__Territoire__LieuxFinAssignment_11 )* ) )
            // InternalENIGMA.g:1942:1: ( ( rule__Territoire__LieuxFinAssignment_11 )* )
            {
            // InternalENIGMA.g:1942:1: ( ( rule__Territoire__LieuxFinAssignment_11 )* )
            // InternalENIGMA.g:1943:2: ( rule__Territoire__LieuxFinAssignment_11 )*
            {
             before(grammarAccess.getTerritoireAccess().getLieuxFinAssignment_11()); 
            // InternalENIGMA.g:1944:2: ( rule__Territoire__LieuxFinAssignment_11 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==42) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalENIGMA.g:1944:3: rule__Territoire__LieuxFinAssignment_11
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Territoire__LieuxFinAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getLieuxFinAssignment_11()); 

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


    // $ANTLR start "rule__Territoire__Group__12"
    // InternalENIGMA.g:1952:1: rule__Territoire__Group__12 : rule__Territoire__Group__12__Impl rule__Territoire__Group__13 ;
    public final void rule__Territoire__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1956:1: ( rule__Territoire__Group__12__Impl rule__Territoire__Group__13 )
            // InternalENIGMA.g:1957:2: rule__Territoire__Group__12__Impl rule__Territoire__Group__13
            {
            pushFollow(FOLLOW_30);
            rule__Territoire__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__13();

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
    // $ANTLR end "rule__Territoire__Group__12"


    // $ANTLR start "rule__Territoire__Group__12__Impl"
    // InternalENIGMA.g:1964:1: rule__Territoire__Group__12__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1968:1: ( ( '}' ) )
            // InternalENIGMA.g:1969:1: ( '}' )
            {
            // InternalENIGMA.g:1969:1: ( '}' )
            // InternalENIGMA.g:1970:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_12()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Territoire__Group__12__Impl"


    // $ANTLR start "rule__Territoire__Group__13"
    // InternalENIGMA.g:1979:1: rule__Territoire__Group__13 : rule__Territoire__Group__13__Impl rule__Territoire__Group__14 ;
    public final void rule__Territoire__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1983:1: ( rule__Territoire__Group__13__Impl rule__Territoire__Group__14 )
            // InternalENIGMA.g:1984:2: rule__Territoire__Group__13__Impl rule__Territoire__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__Territoire__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__14();

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
    // $ANTLR end "rule__Territoire__Group__13"


    // $ANTLR start "rule__Territoire__Group__13__Impl"
    // InternalENIGMA.g:1991:1: rule__Territoire__Group__13__Impl : ( 'chemins' ) ;
    public final void rule__Territoire__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:1995:1: ( ( 'chemins' ) )
            // InternalENIGMA.g:1996:1: ( 'chemins' )
            {
            // InternalENIGMA.g:1996:1: ( 'chemins' )
            // InternalENIGMA.g:1997:2: 'chemins'
            {
             before(grammarAccess.getTerritoireAccess().getCheminsKeyword_13()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getCheminsKeyword_13()); 

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
    // $ANTLR end "rule__Territoire__Group__13__Impl"


    // $ANTLR start "rule__Territoire__Group__14"
    // InternalENIGMA.g:2006:1: rule__Territoire__Group__14 : rule__Territoire__Group__14__Impl rule__Territoire__Group__15 ;
    public final void rule__Territoire__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2010:1: ( rule__Territoire__Group__14__Impl rule__Territoire__Group__15 )
            // InternalENIGMA.g:2011:2: rule__Territoire__Group__14__Impl rule__Territoire__Group__15
            {
            pushFollow(FOLLOW_31);
            rule__Territoire__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__15();

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
    // $ANTLR end "rule__Territoire__Group__14"


    // $ANTLR start "rule__Territoire__Group__14__Impl"
    // InternalENIGMA.g:2018:1: rule__Territoire__Group__14__Impl : ( '{' ) ;
    public final void rule__Territoire__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2022:1: ( ( '{' ) )
            // InternalENIGMA.g:2023:1: ( '{' )
            {
            // InternalENIGMA.g:2023:1: ( '{' )
            // InternalENIGMA.g:2024:2: '{'
            {
             before(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Territoire__Group__14__Impl"


    // $ANTLR start "rule__Territoire__Group__15"
    // InternalENIGMA.g:2033:1: rule__Territoire__Group__15 : rule__Territoire__Group__15__Impl rule__Territoire__Group__16 ;
    public final void rule__Territoire__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2037:1: ( rule__Territoire__Group__15__Impl rule__Territoire__Group__16 )
            // InternalENIGMA.g:2038:2: rule__Territoire__Group__15__Impl rule__Territoire__Group__16
            {
            pushFollow(FOLLOW_31);
            rule__Territoire__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__16();

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
    // $ANTLR end "rule__Territoire__Group__15"


    // $ANTLR start "rule__Territoire__Group__15__Impl"
    // InternalENIGMA.g:2045:1: rule__Territoire__Group__15__Impl : ( ( rule__Territoire__CheminsAssignment_15 )* ) ;
    public final void rule__Territoire__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2049:1: ( ( ( rule__Territoire__CheminsAssignment_15 )* ) )
            // InternalENIGMA.g:2050:1: ( ( rule__Territoire__CheminsAssignment_15 )* )
            {
            // InternalENIGMA.g:2050:1: ( ( rule__Territoire__CheminsAssignment_15 )* )
            // InternalENIGMA.g:2051:2: ( rule__Territoire__CheminsAssignment_15 )*
            {
             before(grammarAccess.getTerritoireAccess().getCheminsAssignment_15()); 
            // InternalENIGMA.g:2052:2: ( rule__Territoire__CheminsAssignment_15 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalENIGMA.g:2052:3: rule__Territoire__CheminsAssignment_15
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Territoire__CheminsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTerritoireAccess().getCheminsAssignment_15()); 

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
    // $ANTLR end "rule__Territoire__Group__15__Impl"


    // $ANTLR start "rule__Territoire__Group__16"
    // InternalENIGMA.g:2060:1: rule__Territoire__Group__16 : rule__Territoire__Group__16__Impl rule__Territoire__Group__17 ;
    public final void rule__Territoire__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2064:1: ( rule__Territoire__Group__16__Impl rule__Territoire__Group__17 )
            // InternalENIGMA.g:2065:2: rule__Territoire__Group__16__Impl rule__Territoire__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Territoire__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Territoire__Group__17();

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
    // $ANTLR end "rule__Territoire__Group__16"


    // $ANTLR start "rule__Territoire__Group__16__Impl"
    // InternalENIGMA.g:2072:1: rule__Territoire__Group__16__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2076:1: ( ( '}' ) )
            // InternalENIGMA.g:2077:1: ( '}' )
            {
            // InternalENIGMA.g:2077:1: ( '}' )
            // InternalENIGMA.g:2078:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_16()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__Territoire__Group__16__Impl"


    // $ANTLR start "rule__Territoire__Group__17"
    // InternalENIGMA.g:2087:1: rule__Territoire__Group__17 : rule__Territoire__Group__17__Impl ;
    public final void rule__Territoire__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2091:1: ( rule__Territoire__Group__17__Impl )
            // InternalENIGMA.g:2092:2: rule__Territoire__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Territoire__Group__17__Impl();

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
    // $ANTLR end "rule__Territoire__Group__17"


    // $ANTLR start "rule__Territoire__Group__17__Impl"
    // InternalENIGMA.g:2098:1: rule__Territoire__Group__17__Impl : ( '}' ) ;
    public final void rule__Territoire__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2102:1: ( ( '}' ) )
            // InternalENIGMA.g:2103:1: ( '}' )
            {
            // InternalENIGMA.g:2103:1: ( '}' )
            // InternalENIGMA.g:2104:2: '}'
            {
             before(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__Territoire__Group__17__Impl"


    // $ANTLR start "rule__Choix__Group__0"
    // InternalENIGMA.g:2114:1: rule__Choix__Group__0 : rule__Choix__Group__0__Impl rule__Choix__Group__1 ;
    public final void rule__Choix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2118:1: ( rule__Choix__Group__0__Impl rule__Choix__Group__1 )
            // InternalENIGMA.g:2119:2: rule__Choix__Group__0__Impl rule__Choix__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalENIGMA.g:2126:1: rule__Choix__Group__0__Impl : ( 'choix' ) ;
    public final void rule__Choix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2130:1: ( ( 'choix' ) )
            // InternalENIGMA.g:2131:1: ( 'choix' )
            {
            // InternalENIGMA.g:2131:1: ( 'choix' )
            // InternalENIGMA.g:2132:2: 'choix'
            {
             before(grammarAccess.getChoixAccess().getChoixKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getChoixKeyword_0()); 

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
    // $ANTLR end "rule__Choix__Group__0__Impl"


    // $ANTLR start "rule__Choix__Group__1"
    // InternalENIGMA.g:2141:1: rule__Choix__Group__1 : rule__Choix__Group__1__Impl rule__Choix__Group__2 ;
    public final void rule__Choix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2145:1: ( rule__Choix__Group__1__Impl rule__Choix__Group__2 )
            // InternalENIGMA.g:2146:2: rule__Choix__Group__1__Impl rule__Choix__Group__2
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
    // InternalENIGMA.g:2153:1: rule__Choix__Group__1__Impl : ( ( rule__Choix__NameAssignment_1 ) ) ;
    public final void rule__Choix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2157:1: ( ( ( rule__Choix__NameAssignment_1 ) ) )
            // InternalENIGMA.g:2158:1: ( ( rule__Choix__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:2158:1: ( ( rule__Choix__NameAssignment_1 ) )
            // InternalENIGMA.g:2159:2: ( rule__Choix__NameAssignment_1 )
            {
             before(grammarAccess.getChoixAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:2160:2: ( rule__Choix__NameAssignment_1 )
            // InternalENIGMA.g:2160:3: rule__Choix__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Choix__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoixAccess().getNameAssignment_1()); 

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
    // InternalENIGMA.g:2168:1: rule__Choix__Group__2 : rule__Choix__Group__2__Impl rule__Choix__Group__3 ;
    public final void rule__Choix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2172:1: ( rule__Choix__Group__2__Impl rule__Choix__Group__3 )
            // InternalENIGMA.g:2173:2: rule__Choix__Group__2__Impl rule__Choix__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalENIGMA.g:2180:1: rule__Choix__Group__2__Impl : ( '{' ) ;
    public final void rule__Choix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2184:1: ( ( '{' ) )
            // InternalENIGMA.g:2185:1: ( '{' )
            {
            // InternalENIGMA.g:2185:1: ( '{' )
            // InternalENIGMA.g:2186:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalENIGMA.g:2195:1: rule__Choix__Group__3 : rule__Choix__Group__3__Impl rule__Choix__Group__4 ;
    public final void rule__Choix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2199:1: ( rule__Choix__Group__3__Impl rule__Choix__Group__4 )
            // InternalENIGMA.g:2200:2: rule__Choix__Group__3__Impl rule__Choix__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalENIGMA.g:2207:1: rule__Choix__Group__3__Impl : ( ( rule__Choix__ReponsesAssignment_3 )* ) ;
    public final void rule__Choix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2211:1: ( ( ( rule__Choix__ReponsesAssignment_3 )* ) )
            // InternalENIGMA.g:2212:1: ( ( rule__Choix__ReponsesAssignment_3 )* )
            {
            // InternalENIGMA.g:2212:1: ( ( rule__Choix__ReponsesAssignment_3 )* )
            // InternalENIGMA.g:2213:2: ( rule__Choix__ReponsesAssignment_3 )*
            {
             before(grammarAccess.getChoixAccess().getReponsesAssignment_3()); 
            // InternalENIGMA.g:2214:2: ( rule__Choix__ReponsesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==48) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalENIGMA.g:2214:3: rule__Choix__ReponsesAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Choix__ReponsesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalENIGMA.g:2222:1: rule__Choix__Group__4 : rule__Choix__Group__4__Impl rule__Choix__Group__5 ;
    public final void rule__Choix__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2226:1: ( rule__Choix__Group__4__Impl rule__Choix__Group__5 )
            // InternalENIGMA.g:2227:2: rule__Choix__Group__4__Impl rule__Choix__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Choix__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__5();

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
    // InternalENIGMA.g:2234:1: rule__Choix__Group__4__Impl : ( 'conditions' ) ;
    public final void rule__Choix__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2238:1: ( ( 'conditions' ) )
            // InternalENIGMA.g:2239:1: ( 'conditions' )
            {
            // InternalENIGMA.g:2239:1: ( 'conditions' )
            // InternalENIGMA.g:2240:2: 'conditions'
            {
             before(grammarAccess.getChoixAccess().getConditionsKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConditionsKeyword_4()); 

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


    // $ANTLR start "rule__Choix__Group__5"
    // InternalENIGMA.g:2249:1: rule__Choix__Group__5 : rule__Choix__Group__5__Impl rule__Choix__Group__6 ;
    public final void rule__Choix__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2253:1: ( rule__Choix__Group__5__Impl rule__Choix__Group__6 )
            // InternalENIGMA.g:2254:2: rule__Choix__Group__5__Impl rule__Choix__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Choix__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__6();

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
    // $ANTLR end "rule__Choix__Group__5"


    // $ANTLR start "rule__Choix__Group__5__Impl"
    // InternalENIGMA.g:2261:1: rule__Choix__Group__5__Impl : ( '{' ) ;
    public final void rule__Choix__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2265:1: ( ( '{' ) )
            // InternalENIGMA.g:2266:1: ( '{' )
            {
            // InternalENIGMA.g:2266:1: ( '{' )
            // InternalENIGMA.g:2267:2: '{'
            {
             before(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Choix__Group__5__Impl"


    // $ANTLR start "rule__Choix__Group__6"
    // InternalENIGMA.g:2276:1: rule__Choix__Group__6 : rule__Choix__Group__6__Impl rule__Choix__Group__7 ;
    public final void rule__Choix__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2280:1: ( rule__Choix__Group__6__Impl rule__Choix__Group__7 )
            // InternalENIGMA.g:2281:2: rule__Choix__Group__6__Impl rule__Choix__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__Choix__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__7();

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
    // $ANTLR end "rule__Choix__Group__6"


    // $ANTLR start "rule__Choix__Group__6__Impl"
    // InternalENIGMA.g:2288:1: rule__Choix__Group__6__Impl : ( ( rule__Choix__ConditionsAssignment_6 )* ) ;
    public final void rule__Choix__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2292:1: ( ( ( rule__Choix__ConditionsAssignment_6 )* ) )
            // InternalENIGMA.g:2293:1: ( ( rule__Choix__ConditionsAssignment_6 )* )
            {
            // InternalENIGMA.g:2293:1: ( ( rule__Choix__ConditionsAssignment_6 )* )
            // InternalENIGMA.g:2294:2: ( rule__Choix__ConditionsAssignment_6 )*
            {
             before(grammarAccess.getChoixAccess().getConditionsAssignment_6()); 
            // InternalENIGMA.g:2295:2: ( rule__Choix__ConditionsAssignment_6 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalENIGMA.g:2295:3: rule__Choix__ConditionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Choix__ConditionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getChoixAccess().getConditionsAssignment_6()); 

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
    // $ANTLR end "rule__Choix__Group__6__Impl"


    // $ANTLR start "rule__Choix__Group__7"
    // InternalENIGMA.g:2303:1: rule__Choix__Group__7 : rule__Choix__Group__7__Impl rule__Choix__Group__8 ;
    public final void rule__Choix__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2307:1: ( rule__Choix__Group__7__Impl rule__Choix__Group__8 )
            // InternalENIGMA.g:2308:2: rule__Choix__Group__7__Impl rule__Choix__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Choix__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choix__Group__8();

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
    // $ANTLR end "rule__Choix__Group__7"


    // $ANTLR start "rule__Choix__Group__7__Impl"
    // InternalENIGMA.g:2315:1: rule__Choix__Group__7__Impl : ( '}' ) ;
    public final void rule__Choix__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2319:1: ( ( '}' ) )
            // InternalENIGMA.g:2320:1: ( '}' )
            {
            // InternalENIGMA.g:2320:1: ( '}' )
            // InternalENIGMA.g:2321:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Choix__Group__7__Impl"


    // $ANTLR start "rule__Choix__Group__8"
    // InternalENIGMA.g:2330:1: rule__Choix__Group__8 : rule__Choix__Group__8__Impl ;
    public final void rule__Choix__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2334:1: ( rule__Choix__Group__8__Impl )
            // InternalENIGMA.g:2335:2: rule__Choix__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choix__Group__8__Impl();

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
    // $ANTLR end "rule__Choix__Group__8"


    // $ANTLR start "rule__Choix__Group__8__Impl"
    // InternalENIGMA.g:2341:1: rule__Choix__Group__8__Impl : ( '}' ) ;
    public final void rule__Choix__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2345:1: ( ( '}' ) )
            // InternalENIGMA.g:2346:1: ( '}' )
            {
            // InternalENIGMA.g:2346:1: ( '}' )
            // InternalENIGMA.g:2347:2: '}'
            {
             before(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Choix__Group__8__Impl"


    // $ANTLR start "rule__Interaction__Group__0"
    // InternalENIGMA.g:2357:1: rule__Interaction__Group__0 : rule__Interaction__Group__0__Impl rule__Interaction__Group__1 ;
    public final void rule__Interaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2361:1: ( rule__Interaction__Group__0__Impl rule__Interaction__Group__1 )
            // InternalENIGMA.g:2362:2: rule__Interaction__Group__0__Impl rule__Interaction__Group__1
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
    // InternalENIGMA.g:2369:1: rule__Interaction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__Interaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2373:1: ( ( 'interaction' ) )
            // InternalENIGMA.g:2374:1: ( 'interaction' )
            {
            // InternalENIGMA.g:2374:1: ( 'interaction' )
            // InternalENIGMA.g:2375:2: 'interaction'
            {
             before(grammarAccess.getInteractionAccess().getInteractionKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalENIGMA.g:2384:1: rule__Interaction__Group__1 : rule__Interaction__Group__1__Impl rule__Interaction__Group__2 ;
    public final void rule__Interaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2388:1: ( rule__Interaction__Group__1__Impl rule__Interaction__Group__2 )
            // InternalENIGMA.g:2389:2: rule__Interaction__Group__1__Impl rule__Interaction__Group__2
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
    // InternalENIGMA.g:2396:1: rule__Interaction__Group__1__Impl : ( ( rule__Interaction__NameAssignment_1 ) ) ;
    public final void rule__Interaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2400:1: ( ( ( rule__Interaction__NameAssignment_1 ) ) )
            // InternalENIGMA.g:2401:1: ( ( rule__Interaction__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:2401:1: ( ( rule__Interaction__NameAssignment_1 ) )
            // InternalENIGMA.g:2402:2: ( rule__Interaction__NameAssignment_1 )
            {
             before(grammarAccess.getInteractionAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:2403:2: ( rule__Interaction__NameAssignment_1 )
            // InternalENIGMA.g:2403:3: rule__Interaction__NameAssignment_1
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
    // InternalENIGMA.g:2411:1: rule__Interaction__Group__2 : rule__Interaction__Group__2__Impl rule__Interaction__Group__3 ;
    public final void rule__Interaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2415:1: ( rule__Interaction__Group__2__Impl rule__Interaction__Group__3 )
            // InternalENIGMA.g:2416:2: rule__Interaction__Group__2__Impl rule__Interaction__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalENIGMA.g:2423:1: rule__Interaction__Group__2__Impl : ( '{' ) ;
    public final void rule__Interaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2427:1: ( ( '{' ) )
            // InternalENIGMA.g:2428:1: ( '{' )
            {
            // InternalENIGMA.g:2428:1: ( '{' )
            // InternalENIGMA.g:2429:2: '{'
            {
             before(grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalENIGMA.g:2438:1: rule__Interaction__Group__3 : rule__Interaction__Group__3__Impl rule__Interaction__Group__4 ;
    public final void rule__Interaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2442:1: ( rule__Interaction__Group__3__Impl rule__Interaction__Group__4 )
            // InternalENIGMA.g:2443:2: rule__Interaction__Group__3__Impl rule__Interaction__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalENIGMA.g:2450:1: rule__Interaction__Group__3__Impl : ( ( rule__Interaction__ChoixAssignment_3 ) ) ;
    public final void rule__Interaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2454:1: ( ( ( rule__Interaction__ChoixAssignment_3 ) ) )
            // InternalENIGMA.g:2455:1: ( ( rule__Interaction__ChoixAssignment_3 ) )
            {
            // InternalENIGMA.g:2455:1: ( ( rule__Interaction__ChoixAssignment_3 ) )
            // InternalENIGMA.g:2456:2: ( rule__Interaction__ChoixAssignment_3 )
            {
             before(grammarAccess.getInteractionAccess().getChoixAssignment_3()); 
            // InternalENIGMA.g:2457:2: ( rule__Interaction__ChoixAssignment_3 )
            // InternalENIGMA.g:2457:3: rule__Interaction__ChoixAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__ChoixAssignment_3();

            state._fsp--;


            }

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
    // InternalENIGMA.g:2465:1: rule__Interaction__Group__4 : rule__Interaction__Group__4__Impl rule__Interaction__Group__5 ;
    public final void rule__Interaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2469:1: ( rule__Interaction__Group__4__Impl rule__Interaction__Group__5 )
            // InternalENIGMA.g:2470:2: rule__Interaction__Group__4__Impl rule__Interaction__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Interaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interaction__Group__5();

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
    // InternalENIGMA.g:2477:1: rule__Interaction__Group__4__Impl : ( ( rule__Interaction__ChoixFinAssignment_4 ) ) ;
    public final void rule__Interaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2481:1: ( ( ( rule__Interaction__ChoixFinAssignment_4 ) ) )
            // InternalENIGMA.g:2482:1: ( ( rule__Interaction__ChoixFinAssignment_4 ) )
            {
            // InternalENIGMA.g:2482:1: ( ( rule__Interaction__ChoixFinAssignment_4 ) )
            // InternalENIGMA.g:2483:2: ( rule__Interaction__ChoixFinAssignment_4 )
            {
             before(grammarAccess.getInteractionAccess().getChoixFinAssignment_4()); 
            // InternalENIGMA.g:2484:2: ( rule__Interaction__ChoixFinAssignment_4 )
            // InternalENIGMA.g:2484:3: rule__Interaction__ChoixFinAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__ChoixFinAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInteractionAccess().getChoixFinAssignment_4()); 

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


    // $ANTLR start "rule__Interaction__Group__5"
    // InternalENIGMA.g:2492:1: rule__Interaction__Group__5 : rule__Interaction__Group__5__Impl ;
    public final void rule__Interaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2496:1: ( rule__Interaction__Group__5__Impl )
            // InternalENIGMA.g:2497:2: rule__Interaction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interaction__Group__5__Impl();

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
    // $ANTLR end "rule__Interaction__Group__5"


    // $ANTLR start "rule__Interaction__Group__5__Impl"
    // InternalENIGMA.g:2503:1: rule__Interaction__Group__5__Impl : ( '}' ) ;
    public final void rule__Interaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2507:1: ( ( '}' ) )
            // InternalENIGMA.g:2508:1: ( '}' )
            {
            // InternalENIGMA.g:2508:1: ( '}' )
            // InternalENIGMA.g:2509:2: '}'
            {
             before(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Interaction__Group__5__Impl"


    // $ANTLR start "rule__Personne__Group__0"
    // InternalENIGMA.g:2519:1: rule__Personne__Group__0 : rule__Personne__Group__0__Impl rule__Personne__Group__1 ;
    public final void rule__Personne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2523:1: ( rule__Personne__Group__0__Impl rule__Personne__Group__1 )
            // InternalENIGMA.g:2524:2: rule__Personne__Group__0__Impl rule__Personne__Group__1
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
    // InternalENIGMA.g:2531:1: rule__Personne__Group__0__Impl : ( 'personne' ) ;
    public final void rule__Personne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2535:1: ( ( 'personne' ) )
            // InternalENIGMA.g:2536:1: ( 'personne' )
            {
            // InternalENIGMA.g:2536:1: ( 'personne' )
            // InternalENIGMA.g:2537:2: 'personne'
            {
             before(grammarAccess.getPersonneAccess().getPersonneKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalENIGMA.g:2546:1: rule__Personne__Group__1 : rule__Personne__Group__1__Impl rule__Personne__Group__2 ;
    public final void rule__Personne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2550:1: ( rule__Personne__Group__1__Impl rule__Personne__Group__2 )
            // InternalENIGMA.g:2551:2: rule__Personne__Group__1__Impl rule__Personne__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalENIGMA.g:2558:1: rule__Personne__Group__1__Impl : ( ( rule__Personne__NameAssignment_1 ) ) ;
    public final void rule__Personne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2562:1: ( ( ( rule__Personne__NameAssignment_1 ) ) )
            // InternalENIGMA.g:2563:1: ( ( rule__Personne__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:2563:1: ( ( rule__Personne__NameAssignment_1 ) )
            // InternalENIGMA.g:2564:2: ( rule__Personne__NameAssignment_1 )
            {
             before(grammarAccess.getPersonneAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:2565:2: ( rule__Personne__NameAssignment_1 )
            // InternalENIGMA.g:2565:3: rule__Personne__NameAssignment_1
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
    // InternalENIGMA.g:2573:1: rule__Personne__Group__2 : rule__Personne__Group__2__Impl rule__Personne__Group__3 ;
    public final void rule__Personne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2577:1: ( rule__Personne__Group__2__Impl rule__Personne__Group__3 )
            // InternalENIGMA.g:2578:2: rule__Personne__Group__2__Impl rule__Personne__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalENIGMA.g:2585:1: rule__Personne__Group__2__Impl : ( ( rule__Personne__EtatoAssignment_2 ) ) ;
    public final void rule__Personne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2589:1: ( ( ( rule__Personne__EtatoAssignment_2 ) ) )
            // InternalENIGMA.g:2590:1: ( ( rule__Personne__EtatoAssignment_2 ) )
            {
            // InternalENIGMA.g:2590:1: ( ( rule__Personne__EtatoAssignment_2 ) )
            // InternalENIGMA.g:2591:2: ( rule__Personne__EtatoAssignment_2 )
            {
             before(grammarAccess.getPersonneAccess().getEtatoAssignment_2()); 
            // InternalENIGMA.g:2592:2: ( rule__Personne__EtatoAssignment_2 )
            // InternalENIGMA.g:2592:3: rule__Personne__EtatoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Personne__EtatoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getEtatoAssignment_2()); 

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
    // InternalENIGMA.g:2600:1: rule__Personne__Group__3 : rule__Personne__Group__3__Impl rule__Personne__Group__4 ;
    public final void rule__Personne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2604:1: ( rule__Personne__Group__3__Impl rule__Personne__Group__4 )
            // InternalENIGMA.g:2605:2: rule__Personne__Group__3__Impl rule__Personne__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalENIGMA.g:2612:1: rule__Personne__Group__3__Impl : ( ( rule__Personne__ConditionoAssignment_3 ) ) ;
    public final void rule__Personne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2616:1: ( ( ( rule__Personne__ConditionoAssignment_3 ) ) )
            // InternalENIGMA.g:2617:1: ( ( rule__Personne__ConditionoAssignment_3 ) )
            {
            // InternalENIGMA.g:2617:1: ( ( rule__Personne__ConditionoAssignment_3 ) )
            // InternalENIGMA.g:2618:2: ( rule__Personne__ConditionoAssignment_3 )
            {
             before(grammarAccess.getPersonneAccess().getConditionoAssignment_3()); 
            // InternalENIGMA.g:2619:2: ( rule__Personne__ConditionoAssignment_3 )
            // InternalENIGMA.g:2619:3: rule__Personne__ConditionoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ConditionoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getConditionoAssignment_3()); 

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
    // InternalENIGMA.g:2627:1: rule__Personne__Group__4 : rule__Personne__Group__4__Impl rule__Personne__Group__5 ;
    public final void rule__Personne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2631:1: ( rule__Personne__Group__4__Impl rule__Personne__Group__5 )
            // InternalENIGMA.g:2632:2: rule__Personne__Group__4__Impl rule__Personne__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalENIGMA.g:2639:1: rule__Personne__Group__4__Impl : ( ( rule__Personne__EtatvAssignment_4 ) ) ;
    public final void rule__Personne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2643:1: ( ( ( rule__Personne__EtatvAssignment_4 ) ) )
            // InternalENIGMA.g:2644:1: ( ( rule__Personne__EtatvAssignment_4 ) )
            {
            // InternalENIGMA.g:2644:1: ( ( rule__Personne__EtatvAssignment_4 ) )
            // InternalENIGMA.g:2645:2: ( rule__Personne__EtatvAssignment_4 )
            {
             before(grammarAccess.getPersonneAccess().getEtatvAssignment_4()); 
            // InternalENIGMA.g:2646:2: ( rule__Personne__EtatvAssignment_4 )
            // InternalENIGMA.g:2646:3: rule__Personne__EtatvAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Personne__EtatvAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getEtatvAssignment_4()); 

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
    // InternalENIGMA.g:2654:1: rule__Personne__Group__5 : rule__Personne__Group__5__Impl rule__Personne__Group__6 ;
    public final void rule__Personne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2658:1: ( rule__Personne__Group__5__Impl rule__Personne__Group__6 )
            // InternalENIGMA.g:2659:2: rule__Personne__Group__5__Impl rule__Personne__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Personne__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__6();

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
    // InternalENIGMA.g:2666:1: rule__Personne__Group__5__Impl : ( ( rule__Personne__ConditionvAssignment_5 ) ) ;
    public final void rule__Personne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2670:1: ( ( ( rule__Personne__ConditionvAssignment_5 ) ) )
            // InternalENIGMA.g:2671:1: ( ( rule__Personne__ConditionvAssignment_5 ) )
            {
            // InternalENIGMA.g:2671:1: ( ( rule__Personne__ConditionvAssignment_5 ) )
            // InternalENIGMA.g:2672:2: ( rule__Personne__ConditionvAssignment_5 )
            {
             before(grammarAccess.getPersonneAccess().getConditionvAssignment_5()); 
            // InternalENIGMA.g:2673:2: ( rule__Personne__ConditionvAssignment_5 )
            // InternalENIGMA.g:2673:3: rule__Personne__ConditionvAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Personne__ConditionvAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getConditionvAssignment_5()); 

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


    // $ANTLR start "rule__Personne__Group__6"
    // InternalENIGMA.g:2681:1: rule__Personne__Group__6 : rule__Personne__Group__6__Impl rule__Personne__Group__7 ;
    public final void rule__Personne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2685:1: ( rule__Personne__Group__6__Impl rule__Personne__Group__7 )
            // InternalENIGMA.g:2686:2: rule__Personne__Group__6__Impl rule__Personne__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Personne__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__7();

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
    // $ANTLR end "rule__Personne__Group__6"


    // $ANTLR start "rule__Personne__Group__6__Impl"
    // InternalENIGMA.g:2693:1: rule__Personne__Group__6__Impl : ( '{' ) ;
    public final void rule__Personne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2697:1: ( ( '{' ) )
            // InternalENIGMA.g:2698:1: ( '{' )
            {
            // InternalENIGMA.g:2698:1: ( '{' )
            // InternalENIGMA.g:2699:2: '{'
            {
             before(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Personne__Group__6__Impl"


    // $ANTLR start "rule__Personne__Group__7"
    // InternalENIGMA.g:2708:1: rule__Personne__Group__7 : rule__Personne__Group__7__Impl rule__Personne__Group__8 ;
    public final void rule__Personne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2712:1: ( rule__Personne__Group__7__Impl rule__Personne__Group__8 )
            // InternalENIGMA.g:2713:2: rule__Personne__Group__7__Impl rule__Personne__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__Personne__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__8();

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
    // $ANTLR end "rule__Personne__Group__7"


    // $ANTLR start "rule__Personne__Group__7__Impl"
    // InternalENIGMA.g:2720:1: rule__Personne__Group__7__Impl : ( ( rule__Personne__TexteAssignment_7 ) ) ;
    public final void rule__Personne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2724:1: ( ( ( rule__Personne__TexteAssignment_7 ) ) )
            // InternalENIGMA.g:2725:1: ( ( rule__Personne__TexteAssignment_7 ) )
            {
            // InternalENIGMA.g:2725:1: ( ( rule__Personne__TexteAssignment_7 ) )
            // InternalENIGMA.g:2726:2: ( rule__Personne__TexteAssignment_7 )
            {
             before(grammarAccess.getPersonneAccess().getTexteAssignment_7()); 
            // InternalENIGMA.g:2727:2: ( rule__Personne__TexteAssignment_7 )
            // InternalENIGMA.g:2727:3: rule__Personne__TexteAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Personne__TexteAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPersonneAccess().getTexteAssignment_7()); 

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
    // $ANTLR end "rule__Personne__Group__7__Impl"


    // $ANTLR start "rule__Personne__Group__8"
    // InternalENIGMA.g:2735:1: rule__Personne__Group__8 : rule__Personne__Group__8__Impl rule__Personne__Group__9 ;
    public final void rule__Personne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2739:1: ( rule__Personne__Group__8__Impl rule__Personne__Group__9 )
            // InternalENIGMA.g:2740:2: rule__Personne__Group__8__Impl rule__Personne__Group__9
            {
            pushFollow(FOLLOW_39);
            rule__Personne__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Personne__Group__9();

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
    // $ANTLR end "rule__Personne__Group__8"


    // $ANTLR start "rule__Personne__Group__8__Impl"
    // InternalENIGMA.g:2747:1: rule__Personne__Group__8__Impl : ( ( rule__Personne__InteractionAssignment_8 )? ) ;
    public final void rule__Personne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2751:1: ( ( ( rule__Personne__InteractionAssignment_8 )? ) )
            // InternalENIGMA.g:2752:1: ( ( rule__Personne__InteractionAssignment_8 )? )
            {
            // InternalENIGMA.g:2752:1: ( ( rule__Personne__InteractionAssignment_8 )? )
            // InternalENIGMA.g:2753:2: ( rule__Personne__InteractionAssignment_8 )?
            {
             before(grammarAccess.getPersonneAccess().getInteractionAssignment_8()); 
            // InternalENIGMA.g:2754:2: ( rule__Personne__InteractionAssignment_8 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalENIGMA.g:2754:3: rule__Personne__InteractionAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Personne__InteractionAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonneAccess().getInteractionAssignment_8()); 

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
    // $ANTLR end "rule__Personne__Group__8__Impl"


    // $ANTLR start "rule__Personne__Group__9"
    // InternalENIGMA.g:2762:1: rule__Personne__Group__9 : rule__Personne__Group__9__Impl ;
    public final void rule__Personne__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2766:1: ( rule__Personne__Group__9__Impl )
            // InternalENIGMA.g:2767:2: rule__Personne__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Personne__Group__9__Impl();

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
    // $ANTLR end "rule__Personne__Group__9"


    // $ANTLR start "rule__Personne__Group__9__Impl"
    // InternalENIGMA.g:2773:1: rule__Personne__Group__9__Impl : ( '}' ) ;
    public final void rule__Personne__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2777:1: ( ( '}' ) )
            // InternalENIGMA.g:2778:1: ( '}' )
            {
            // InternalENIGMA.g:2778:1: ( '}' )
            // InternalENIGMA.g:2779:2: '}'
            {
             before(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Personne__Group__9__Impl"


    // $ANTLR start "rule__Lieu__Group__0"
    // InternalENIGMA.g:2789:1: rule__Lieu__Group__0 : rule__Lieu__Group__0__Impl rule__Lieu__Group__1 ;
    public final void rule__Lieu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2793:1: ( rule__Lieu__Group__0__Impl rule__Lieu__Group__1 )
            // InternalENIGMA.g:2794:2: rule__Lieu__Group__0__Impl rule__Lieu__Group__1
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
    // InternalENIGMA.g:2801:1: rule__Lieu__Group__0__Impl : ( 'lieu' ) ;
    public final void rule__Lieu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2805:1: ( ( 'lieu' ) )
            // InternalENIGMA.g:2806:1: ( 'lieu' )
            {
            // InternalENIGMA.g:2806:1: ( 'lieu' )
            // InternalENIGMA.g:2807:2: 'lieu'
            {
             before(grammarAccess.getLieuAccess().getLieuKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalENIGMA.g:2816:1: rule__Lieu__Group__1 : rule__Lieu__Group__1__Impl rule__Lieu__Group__2 ;
    public final void rule__Lieu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2820:1: ( rule__Lieu__Group__1__Impl rule__Lieu__Group__2 )
            // InternalENIGMA.g:2821:2: rule__Lieu__Group__1__Impl rule__Lieu__Group__2
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
    // InternalENIGMA.g:2828:1: rule__Lieu__Group__1__Impl : ( ( rule__Lieu__NameAssignment_1 ) ) ;
    public final void rule__Lieu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2832:1: ( ( ( rule__Lieu__NameAssignment_1 ) ) )
            // InternalENIGMA.g:2833:1: ( ( rule__Lieu__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:2833:1: ( ( rule__Lieu__NameAssignment_1 ) )
            // InternalENIGMA.g:2834:2: ( rule__Lieu__NameAssignment_1 )
            {
             before(grammarAccess.getLieuAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:2835:2: ( rule__Lieu__NameAssignment_1 )
            // InternalENIGMA.g:2835:3: rule__Lieu__NameAssignment_1
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
    // InternalENIGMA.g:2843:1: rule__Lieu__Group__2 : rule__Lieu__Group__2__Impl rule__Lieu__Group__3 ;
    public final void rule__Lieu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2847:1: ( rule__Lieu__Group__2__Impl rule__Lieu__Group__3 )
            // InternalENIGMA.g:2848:2: rule__Lieu__Group__2__Impl rule__Lieu__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalENIGMA.g:2855:1: rule__Lieu__Group__2__Impl : ( '{' ) ;
    public final void rule__Lieu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2859:1: ( ( '{' ) )
            // InternalENIGMA.g:2860:1: ( '{' )
            {
            // InternalENIGMA.g:2860:1: ( '{' )
            // InternalENIGMA.g:2861:2: '{'
            {
             before(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalENIGMA.g:2870:1: rule__Lieu__Group__3 : rule__Lieu__Group__3__Impl rule__Lieu__Group__4 ;
    public final void rule__Lieu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2874:1: ( rule__Lieu__Group__3__Impl rule__Lieu__Group__4 )
            // InternalENIGMA.g:2875:2: rule__Lieu__Group__3__Impl rule__Lieu__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalENIGMA.g:2882:1: rule__Lieu__Group__3__Impl : ( ( rule__Lieu__Group_3__0 )? ) ;
    public final void rule__Lieu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2886:1: ( ( ( rule__Lieu__Group_3__0 )? ) )
            // InternalENIGMA.g:2887:1: ( ( rule__Lieu__Group_3__0 )? )
            {
            // InternalENIGMA.g:2887:1: ( ( rule__Lieu__Group_3__0 )? )
            // InternalENIGMA.g:2888:2: ( rule__Lieu__Group_3__0 )?
            {
             before(grammarAccess.getLieuAccess().getGroup_3()); 
            // InternalENIGMA.g:2889:2: ( rule__Lieu__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalENIGMA.g:2889:3: rule__Lieu__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lieu__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLieuAccess().getGroup_3()); 

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
    // InternalENIGMA.g:2897:1: rule__Lieu__Group__4 : rule__Lieu__Group__4__Impl ;
    public final void rule__Lieu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2901:1: ( rule__Lieu__Group__4__Impl )
            // InternalENIGMA.g:2902:2: rule__Lieu__Group__4__Impl
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
    // InternalENIGMA.g:2908:1: rule__Lieu__Group__4__Impl : ( '}' ) ;
    public final void rule__Lieu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2912:1: ( ( '}' ) )
            // InternalENIGMA.g:2913:1: ( '}' )
            {
            // InternalENIGMA.g:2913:1: ( '}' )
            // InternalENIGMA.g:2914:2: '}'
            {
             before(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__Lieu__Group_3__0"
    // InternalENIGMA.g:2924:1: rule__Lieu__Group_3__0 : rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1 ;
    public final void rule__Lieu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2928:1: ( rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1 )
            // InternalENIGMA.g:2929:2: rule__Lieu__Group_3__0__Impl rule__Lieu__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Lieu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__1();

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
    // $ANTLR end "rule__Lieu__Group_3__0"


    // $ANTLR start "rule__Lieu__Group_3__0__Impl"
    // InternalENIGMA.g:2936:1: rule__Lieu__Group_3__0__Impl : ( 'personnes' ) ;
    public final void rule__Lieu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2940:1: ( ( 'personnes' ) )
            // InternalENIGMA.g:2941:1: ( 'personnes' )
            {
            // InternalENIGMA.g:2941:1: ( 'personnes' )
            // InternalENIGMA.g:2942:2: 'personnes'
            {
             before(grammarAccess.getLieuAccess().getPersonnesKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getPersonnesKeyword_3_0()); 

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
    // $ANTLR end "rule__Lieu__Group_3__0__Impl"


    // $ANTLR start "rule__Lieu__Group_3__1"
    // InternalENIGMA.g:2951:1: rule__Lieu__Group_3__1 : rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2 ;
    public final void rule__Lieu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2955:1: ( rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2 )
            // InternalENIGMA.g:2956:2: rule__Lieu__Group_3__1__Impl rule__Lieu__Group_3__2
            {
            pushFollow(FOLLOW_41);
            rule__Lieu__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__2();

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
    // $ANTLR end "rule__Lieu__Group_3__1"


    // $ANTLR start "rule__Lieu__Group_3__1__Impl"
    // InternalENIGMA.g:2963:1: rule__Lieu__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Lieu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2967:1: ( ( '{' ) )
            // InternalENIGMA.g:2968:1: ( '{' )
            {
            // InternalENIGMA.g:2968:1: ( '{' )
            // InternalENIGMA.g:2969:2: '{'
            {
             before(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Lieu__Group_3__1__Impl"


    // $ANTLR start "rule__Lieu__Group_3__2"
    // InternalENIGMA.g:2978:1: rule__Lieu__Group_3__2 : rule__Lieu__Group_3__2__Impl rule__Lieu__Group_3__3 ;
    public final void rule__Lieu__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2982:1: ( rule__Lieu__Group_3__2__Impl rule__Lieu__Group_3__3 )
            // InternalENIGMA.g:2983:2: rule__Lieu__Group_3__2__Impl rule__Lieu__Group_3__3
            {
            pushFollow(FOLLOW_41);
            rule__Lieu__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__3();

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
    // $ANTLR end "rule__Lieu__Group_3__2"


    // $ANTLR start "rule__Lieu__Group_3__2__Impl"
    // InternalENIGMA.g:2990:1: rule__Lieu__Group_3__2__Impl : ( ( rule__Lieu__PersonnesAssignment_3_2 )* ) ;
    public final void rule__Lieu__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:2994:1: ( ( ( rule__Lieu__PersonnesAssignment_3_2 )* ) )
            // InternalENIGMA.g:2995:1: ( ( rule__Lieu__PersonnesAssignment_3_2 )* )
            {
            // InternalENIGMA.g:2995:1: ( ( rule__Lieu__PersonnesAssignment_3_2 )* )
            // InternalENIGMA.g:2996:2: ( rule__Lieu__PersonnesAssignment_3_2 )*
            {
             before(grammarAccess.getLieuAccess().getPersonnesAssignment_3_2()); 
            // InternalENIGMA.g:2997:2: ( rule__Lieu__PersonnesAssignment_3_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalENIGMA.g:2997:3: rule__Lieu__PersonnesAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Lieu__PersonnesAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getLieuAccess().getPersonnesAssignment_3_2()); 

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
    // $ANTLR end "rule__Lieu__Group_3__2__Impl"


    // $ANTLR start "rule__Lieu__Group_3__3"
    // InternalENIGMA.g:3005:1: rule__Lieu__Group_3__3 : rule__Lieu__Group_3__3__Impl ;
    public final void rule__Lieu__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3009:1: ( rule__Lieu__Group_3__3__Impl )
            // InternalENIGMA.g:3010:2: rule__Lieu__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lieu__Group_3__3__Impl();

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
    // $ANTLR end "rule__Lieu__Group_3__3"


    // $ANTLR start "rule__Lieu__Group_3__3__Impl"
    // InternalENIGMA.g:3016:1: rule__Lieu__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Lieu__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3020:1: ( ( '}' ) )
            // InternalENIGMA.g:3021:1: ( '}' )
            {
            // InternalENIGMA.g:3021:1: ( '}' )
            // InternalENIGMA.g:3022:2: '}'
            {
             before(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__Lieu__Group_3__3__Impl"


    // $ANTLR start "rule__Chemin__Group__0"
    // InternalENIGMA.g:3032:1: rule__Chemin__Group__0 : rule__Chemin__Group__0__Impl rule__Chemin__Group__1 ;
    public final void rule__Chemin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3036:1: ( rule__Chemin__Group__0__Impl rule__Chemin__Group__1 )
            // InternalENIGMA.g:3037:2: rule__Chemin__Group__0__Impl rule__Chemin__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalENIGMA.g:3044:1: rule__Chemin__Group__0__Impl : ( 'chemin' ) ;
    public final void rule__Chemin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3048:1: ( ( 'chemin' ) )
            // InternalENIGMA.g:3049:1: ( 'chemin' )
            {
            // InternalENIGMA.g:3049:1: ( 'chemin' )
            // InternalENIGMA.g:3050:2: 'chemin'
            {
             before(grammarAccess.getCheminAccess().getCheminKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalENIGMA.g:3059:1: rule__Chemin__Group__1 : rule__Chemin__Group__1__Impl rule__Chemin__Group__2 ;
    public final void rule__Chemin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3063:1: ( rule__Chemin__Group__1__Impl rule__Chemin__Group__2 )
            // InternalENIGMA.g:3064:2: rule__Chemin__Group__1__Impl rule__Chemin__Group__2
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
    // InternalENIGMA.g:3071:1: rule__Chemin__Group__1__Impl : ( ( rule__Chemin__EtatcAssignment_1 ) ) ;
    public final void rule__Chemin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3075:1: ( ( ( rule__Chemin__EtatcAssignment_1 ) ) )
            // InternalENIGMA.g:3076:1: ( ( rule__Chemin__EtatcAssignment_1 ) )
            {
            // InternalENIGMA.g:3076:1: ( ( rule__Chemin__EtatcAssignment_1 ) )
            // InternalENIGMA.g:3077:2: ( rule__Chemin__EtatcAssignment_1 )
            {
             before(grammarAccess.getCheminAccess().getEtatcAssignment_1()); 
            // InternalENIGMA.g:3078:2: ( rule__Chemin__EtatcAssignment_1 )
            // InternalENIGMA.g:3078:3: rule__Chemin__EtatcAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__EtatcAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getEtatcAssignment_1()); 

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
    // InternalENIGMA.g:3086:1: rule__Chemin__Group__2 : rule__Chemin__Group__2__Impl rule__Chemin__Group__3 ;
    public final void rule__Chemin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3090:1: ( rule__Chemin__Group__2__Impl rule__Chemin__Group__3 )
            // InternalENIGMA.g:3091:2: rule__Chemin__Group__2__Impl rule__Chemin__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalENIGMA.g:3098:1: rule__Chemin__Group__2__Impl : ( ( rule__Chemin__ConditioncAssignment_2 ) ) ;
    public final void rule__Chemin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3102:1: ( ( ( rule__Chemin__ConditioncAssignment_2 ) ) )
            // InternalENIGMA.g:3103:1: ( ( rule__Chemin__ConditioncAssignment_2 ) )
            {
            // InternalENIGMA.g:3103:1: ( ( rule__Chemin__ConditioncAssignment_2 ) )
            // InternalENIGMA.g:3104:2: ( rule__Chemin__ConditioncAssignment_2 )
            {
             before(grammarAccess.getCheminAccess().getConditioncAssignment_2()); 
            // InternalENIGMA.g:3105:2: ( rule__Chemin__ConditioncAssignment_2 )
            // InternalENIGMA.g:3105:3: rule__Chemin__ConditioncAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditioncAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditioncAssignment_2()); 

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
    // InternalENIGMA.g:3113:1: rule__Chemin__Group__3 : rule__Chemin__Group__3__Impl rule__Chemin__Group__4 ;
    public final void rule__Chemin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3117:1: ( rule__Chemin__Group__3__Impl rule__Chemin__Group__4 )
            // InternalENIGMA.g:3118:2: rule__Chemin__Group__3__Impl rule__Chemin__Group__4
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
    // InternalENIGMA.g:3125:1: rule__Chemin__Group__3__Impl : ( ( rule__Chemin__EtatoAssignment_3 ) ) ;
    public final void rule__Chemin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3129:1: ( ( ( rule__Chemin__EtatoAssignment_3 ) ) )
            // InternalENIGMA.g:3130:1: ( ( rule__Chemin__EtatoAssignment_3 ) )
            {
            // InternalENIGMA.g:3130:1: ( ( rule__Chemin__EtatoAssignment_3 ) )
            // InternalENIGMA.g:3131:2: ( rule__Chemin__EtatoAssignment_3 )
            {
             before(grammarAccess.getCheminAccess().getEtatoAssignment_3()); 
            // InternalENIGMA.g:3132:2: ( rule__Chemin__EtatoAssignment_3 )
            // InternalENIGMA.g:3132:3: rule__Chemin__EtatoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__EtatoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getEtatoAssignment_3()); 

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
    // InternalENIGMA.g:3140:1: rule__Chemin__Group__4 : rule__Chemin__Group__4__Impl rule__Chemin__Group__5 ;
    public final void rule__Chemin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3144:1: ( rule__Chemin__Group__4__Impl rule__Chemin__Group__5 )
            // InternalENIGMA.g:3145:2: rule__Chemin__Group__4__Impl rule__Chemin__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Chemin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__5();

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
    // InternalENIGMA.g:3152:1: rule__Chemin__Group__4__Impl : ( ( rule__Chemin__ConditionoAssignment_4 ) ) ;
    public final void rule__Chemin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3156:1: ( ( ( rule__Chemin__ConditionoAssignment_4 ) ) )
            // InternalENIGMA.g:3157:1: ( ( rule__Chemin__ConditionoAssignment_4 ) )
            {
            // InternalENIGMA.g:3157:1: ( ( rule__Chemin__ConditionoAssignment_4 ) )
            // InternalENIGMA.g:3158:2: ( rule__Chemin__ConditionoAssignment_4 )
            {
             before(grammarAccess.getCheminAccess().getConditionoAssignment_4()); 
            // InternalENIGMA.g:3159:2: ( rule__Chemin__ConditionoAssignment_4 )
            // InternalENIGMA.g:3159:3: rule__Chemin__ConditionoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditionoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditionoAssignment_4()); 

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


    // $ANTLR start "rule__Chemin__Group__5"
    // InternalENIGMA.g:3167:1: rule__Chemin__Group__5 : rule__Chemin__Group__5__Impl rule__Chemin__Group__6 ;
    public final void rule__Chemin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3171:1: ( rule__Chemin__Group__5__Impl rule__Chemin__Group__6 )
            // InternalENIGMA.g:3172:2: rule__Chemin__Group__5__Impl rule__Chemin__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__6();

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
    // $ANTLR end "rule__Chemin__Group__5"


    // $ANTLR start "rule__Chemin__Group__5__Impl"
    // InternalENIGMA.g:3179:1: rule__Chemin__Group__5__Impl : ( ( rule__Chemin__EtatvAssignment_5 ) ) ;
    public final void rule__Chemin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3183:1: ( ( ( rule__Chemin__EtatvAssignment_5 ) ) )
            // InternalENIGMA.g:3184:1: ( ( rule__Chemin__EtatvAssignment_5 ) )
            {
            // InternalENIGMA.g:3184:1: ( ( rule__Chemin__EtatvAssignment_5 ) )
            // InternalENIGMA.g:3185:2: ( rule__Chemin__EtatvAssignment_5 )
            {
             before(grammarAccess.getCheminAccess().getEtatvAssignment_5()); 
            // InternalENIGMA.g:3186:2: ( rule__Chemin__EtatvAssignment_5 )
            // InternalENIGMA.g:3186:3: rule__Chemin__EtatvAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__EtatvAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getEtatvAssignment_5()); 

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
    // $ANTLR end "rule__Chemin__Group__5__Impl"


    // $ANTLR start "rule__Chemin__Group__6"
    // InternalENIGMA.g:3194:1: rule__Chemin__Group__6 : rule__Chemin__Group__6__Impl rule__Chemin__Group__7 ;
    public final void rule__Chemin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3198:1: ( rule__Chemin__Group__6__Impl rule__Chemin__Group__7 )
            // InternalENIGMA.g:3199:2: rule__Chemin__Group__6__Impl rule__Chemin__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Chemin__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__7();

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
    // $ANTLR end "rule__Chemin__Group__6"


    // $ANTLR start "rule__Chemin__Group__6__Impl"
    // InternalENIGMA.g:3206:1: rule__Chemin__Group__6__Impl : ( ( rule__Chemin__ConditionvAssignment_6 ) ) ;
    public final void rule__Chemin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3210:1: ( ( ( rule__Chemin__ConditionvAssignment_6 ) ) )
            // InternalENIGMA.g:3211:1: ( ( rule__Chemin__ConditionvAssignment_6 ) )
            {
            // InternalENIGMA.g:3211:1: ( ( rule__Chemin__ConditionvAssignment_6 ) )
            // InternalENIGMA.g:3212:2: ( rule__Chemin__ConditionvAssignment_6 )
            {
             before(grammarAccess.getCheminAccess().getConditionvAssignment_6()); 
            // InternalENIGMA.g:3213:2: ( rule__Chemin__ConditionvAssignment_6 )
            // InternalENIGMA.g:3213:3: rule__Chemin__ConditionvAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__ConditionvAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getConditionvAssignment_6()); 

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
    // $ANTLR end "rule__Chemin__Group__6__Impl"


    // $ANTLR start "rule__Chemin__Group__7"
    // InternalENIGMA.g:3221:1: rule__Chemin__Group__7 : rule__Chemin__Group__7__Impl rule__Chemin__Group__8 ;
    public final void rule__Chemin__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3225:1: ( rule__Chemin__Group__7__Impl rule__Chemin__Group__8 )
            // InternalENIGMA.g:3226:2: rule__Chemin__Group__7__Impl rule__Chemin__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__8();

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
    // $ANTLR end "rule__Chemin__Group__7"


    // $ANTLR start "rule__Chemin__Group__7__Impl"
    // InternalENIGMA.g:3233:1: rule__Chemin__Group__7__Impl : ( 'de' ) ;
    public final void rule__Chemin__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3237:1: ( ( 'de' ) )
            // InternalENIGMA.g:3238:1: ( 'de' )
            {
            // InternalENIGMA.g:3238:1: ( 'de' )
            // InternalENIGMA.g:3239:2: 'de'
            {
             before(grammarAccess.getCheminAccess().getDeKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getDeKeyword_7()); 

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
    // $ANTLR end "rule__Chemin__Group__7__Impl"


    // $ANTLR start "rule__Chemin__Group__8"
    // InternalENIGMA.g:3248:1: rule__Chemin__Group__8 : rule__Chemin__Group__8__Impl rule__Chemin__Group__9 ;
    public final void rule__Chemin__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3252:1: ( rule__Chemin__Group__8__Impl rule__Chemin__Group__9 )
            // InternalENIGMA.g:3253:2: rule__Chemin__Group__8__Impl rule__Chemin__Group__9
            {
            pushFollow(FOLLOW_44);
            rule__Chemin__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__9();

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
    // $ANTLR end "rule__Chemin__Group__8"


    // $ANTLR start "rule__Chemin__Group__8__Impl"
    // InternalENIGMA.g:3260:1: rule__Chemin__Group__8__Impl : ( ( rule__Chemin__PrecedentAssignment_8 ) ) ;
    public final void rule__Chemin__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3264:1: ( ( ( rule__Chemin__PrecedentAssignment_8 ) ) )
            // InternalENIGMA.g:3265:1: ( ( rule__Chemin__PrecedentAssignment_8 ) )
            {
            // InternalENIGMA.g:3265:1: ( ( rule__Chemin__PrecedentAssignment_8 ) )
            // InternalENIGMA.g:3266:2: ( rule__Chemin__PrecedentAssignment_8 )
            {
             before(grammarAccess.getCheminAccess().getPrecedentAssignment_8()); 
            // InternalENIGMA.g:3267:2: ( rule__Chemin__PrecedentAssignment_8 )
            // InternalENIGMA.g:3267:3: rule__Chemin__PrecedentAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__PrecedentAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getPrecedentAssignment_8()); 

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
    // $ANTLR end "rule__Chemin__Group__8__Impl"


    // $ANTLR start "rule__Chemin__Group__9"
    // InternalENIGMA.g:3275:1: rule__Chemin__Group__9 : rule__Chemin__Group__9__Impl rule__Chemin__Group__10 ;
    public final void rule__Chemin__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3279:1: ( rule__Chemin__Group__9__Impl rule__Chemin__Group__10 )
            // InternalENIGMA.g:3280:2: rule__Chemin__Group__9__Impl rule__Chemin__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__Chemin__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chemin__Group__10();

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
    // $ANTLR end "rule__Chemin__Group__9"


    // $ANTLR start "rule__Chemin__Group__9__Impl"
    // InternalENIGMA.g:3287:1: rule__Chemin__Group__9__Impl : ( 'a' ) ;
    public final void rule__Chemin__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3291:1: ( ( 'a' ) )
            // InternalENIGMA.g:3292:1: ( 'a' )
            {
            // InternalENIGMA.g:3292:1: ( 'a' )
            // InternalENIGMA.g:3293:2: 'a'
            {
             before(grammarAccess.getCheminAccess().getAKeyword_9()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getAKeyword_9()); 

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
    // $ANTLR end "rule__Chemin__Group__9__Impl"


    // $ANTLR start "rule__Chemin__Group__10"
    // InternalENIGMA.g:3302:1: rule__Chemin__Group__10 : rule__Chemin__Group__10__Impl ;
    public final void rule__Chemin__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3306:1: ( rule__Chemin__Group__10__Impl )
            // InternalENIGMA.g:3307:2: rule__Chemin__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__Group__10__Impl();

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
    // $ANTLR end "rule__Chemin__Group__10"


    // $ANTLR start "rule__Chemin__Group__10__Impl"
    // InternalENIGMA.g:3313:1: rule__Chemin__Group__10__Impl : ( ( rule__Chemin__SuivantAssignment_10 ) ) ;
    public final void rule__Chemin__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3317:1: ( ( ( rule__Chemin__SuivantAssignment_10 ) ) )
            // InternalENIGMA.g:3318:1: ( ( rule__Chemin__SuivantAssignment_10 ) )
            {
            // InternalENIGMA.g:3318:1: ( ( rule__Chemin__SuivantAssignment_10 ) )
            // InternalENIGMA.g:3319:2: ( rule__Chemin__SuivantAssignment_10 )
            {
             before(grammarAccess.getCheminAccess().getSuivantAssignment_10()); 
            // InternalENIGMA.g:3320:2: ( rule__Chemin__SuivantAssignment_10 )
            // InternalENIGMA.g:3320:3: rule__Chemin__SuivantAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Chemin__SuivantAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCheminAccess().getSuivantAssignment_10()); 

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
    // $ANTLR end "rule__Chemin__Group__10__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalENIGMA.g:3329:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3333:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalENIGMA.g:3334:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalENIGMA.g:3341:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3345:1: ( ( 'action' ) )
            // InternalENIGMA.g:3346:1: ( 'action' )
            {
            // InternalENIGMA.g:3346:1: ( 'action' )
            // InternalENIGMA.g:3347:2: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalENIGMA.g:3356:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3360:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalENIGMA.g:3361:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

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
    // InternalENIGMA.g:3368:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3372:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // InternalENIGMA.g:3373:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:3373:1: ( ( rule__Action__NameAssignment_1 ) )
            // InternalENIGMA.g:3374:2: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:3375:2: ( rule__Action__NameAssignment_1 )
            // InternalENIGMA.g:3375:3: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Action__Group__2"
    // InternalENIGMA.g:3383:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3387:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalENIGMA.g:3388:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

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
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalENIGMA.g:3395:1: rule__Action__Group__2__Impl : ( '{' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3399:1: ( ( '{' ) )
            // InternalENIGMA.g:3400:1: ( '{' )
            {
            // InternalENIGMA.g:3400:1: ( '{' )
            // InternalENIGMA.g:3401:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalENIGMA.g:3410:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3414:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalENIGMA.g:3415:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

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
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalENIGMA.g:3422:1: rule__Action__Group__3__Impl : ( 'objets' ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3426:1: ( ( 'objets' ) )
            // InternalENIGMA.g:3427:1: ( 'objets' )
            {
            // InternalENIGMA.g:3427:1: ( 'objets' )
            // InternalENIGMA.g:3428:2: 'objets'
            {
             before(grammarAccess.getActionAccess().getObjetsKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getObjetsKeyword_3()); 

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
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalENIGMA.g:3437:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3441:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalENIGMA.g:3442:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

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
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalENIGMA.g:3449:1: rule__Action__Group__4__Impl : ( 'c' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3453:1: ( ( 'c' ) )
            // InternalENIGMA.g:3454:1: ( 'c' )
            {
            // InternalENIGMA.g:3454:1: ( 'c' )
            // InternalENIGMA.g:3455:2: 'c'
            {
             before(grammarAccess.getActionAccess().getCKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCKeyword_4()); 

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
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalENIGMA.g:3464:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3468:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalENIGMA.g:3469:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

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
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalENIGMA.g:3476:1: rule__Action__Group__5__Impl : ( '{' ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3480:1: ( ( '{' ) )
            // InternalENIGMA.g:3481:1: ( '{' )
            {
            // InternalENIGMA.g:3481:1: ( '{' )
            // InternalENIGMA.g:3482:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalENIGMA.g:3491:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3495:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // InternalENIGMA.g:3496:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Action__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__7();

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
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalENIGMA.g:3503:1: rule__Action__Group__6__Impl : ( ( rule__Action__ObjetsconsommablesAssignment_6 )* ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3507:1: ( ( ( rule__Action__ObjetsconsommablesAssignment_6 )* ) )
            // InternalENIGMA.g:3508:1: ( ( rule__Action__ObjetsconsommablesAssignment_6 )* )
            {
            // InternalENIGMA.g:3508:1: ( ( rule__Action__ObjetsconsommablesAssignment_6 )* )
            // InternalENIGMA.g:3509:2: ( rule__Action__ObjetsconsommablesAssignment_6 )*
            {
             before(grammarAccess.getActionAccess().getObjetsconsommablesAssignment_6()); 
            // InternalENIGMA.g:3510:2: ( rule__Action__ObjetsconsommablesAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalENIGMA.g:3510:3: rule__Action__ObjetsconsommablesAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Action__ObjetsconsommablesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getObjetsconsommablesAssignment_6()); 

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
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group__7"
    // InternalENIGMA.g:3518:1: rule__Action__Group__7 : rule__Action__Group__7__Impl rule__Action__Group__8 ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3522:1: ( rule__Action__Group__7__Impl rule__Action__Group__8 )
            // InternalENIGMA.g:3523:2: rule__Action__Group__7__Impl rule__Action__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Action__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__8();

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
    // $ANTLR end "rule__Action__Group__7"


    // $ANTLR start "rule__Action__Group__7__Impl"
    // InternalENIGMA.g:3530:1: rule__Action__Group__7__Impl : ( '}' ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3534:1: ( ( '}' ) )
            // InternalENIGMA.g:3535:1: ( '}' )
            {
            // InternalENIGMA.g:3535:1: ( '}' )
            // InternalENIGMA.g:3536:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Action__Group__7__Impl"


    // $ANTLR start "rule__Action__Group__8"
    // InternalENIGMA.g:3545:1: rule__Action__Group__8 : rule__Action__Group__8__Impl rule__Action__Group__9 ;
    public final void rule__Action__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3549:1: ( rule__Action__Group__8__Impl rule__Action__Group__9 )
            // InternalENIGMA.g:3550:2: rule__Action__Group__8__Impl rule__Action__Group__9
            {
            pushFollow(FOLLOW_44);
            rule__Action__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__9();

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
    // $ANTLR end "rule__Action__Group__8"


    // $ANTLR start "rule__Action__Group__8__Impl"
    // InternalENIGMA.g:3557:1: rule__Action__Group__8__Impl : ( 'objets' ) ;
    public final void rule__Action__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3561:1: ( ( 'objets' ) )
            // InternalENIGMA.g:3562:1: ( 'objets' )
            {
            // InternalENIGMA.g:3562:1: ( 'objets' )
            // InternalENIGMA.g:3563:2: 'objets'
            {
             before(grammarAccess.getActionAccess().getObjetsKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getObjetsKeyword_8()); 

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
    // $ANTLR end "rule__Action__Group__8__Impl"


    // $ANTLR start "rule__Action__Group__9"
    // InternalENIGMA.g:3572:1: rule__Action__Group__9 : rule__Action__Group__9__Impl rule__Action__Group__10 ;
    public final void rule__Action__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3576:1: ( rule__Action__Group__9__Impl rule__Action__Group__10 )
            // InternalENIGMA.g:3577:2: rule__Action__Group__9__Impl rule__Action__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Action__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__10();

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
    // $ANTLR end "rule__Action__Group__9"


    // $ANTLR start "rule__Action__Group__9__Impl"
    // InternalENIGMA.g:3584:1: rule__Action__Group__9__Impl : ( 'a' ) ;
    public final void rule__Action__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3588:1: ( ( 'a' ) )
            // InternalENIGMA.g:3589:1: ( 'a' )
            {
            // InternalENIGMA.g:3589:1: ( 'a' )
            // InternalENIGMA.g:3590:2: 'a'
            {
             before(grammarAccess.getActionAccess().getAKeyword_9()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getAKeyword_9()); 

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
    // $ANTLR end "rule__Action__Group__9__Impl"


    // $ANTLR start "rule__Action__Group__10"
    // InternalENIGMA.g:3599:1: rule__Action__Group__10 : rule__Action__Group__10__Impl rule__Action__Group__11 ;
    public final void rule__Action__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3603:1: ( rule__Action__Group__10__Impl rule__Action__Group__11 )
            // InternalENIGMA.g:3604:2: rule__Action__Group__10__Impl rule__Action__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Action__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__11();

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
    // $ANTLR end "rule__Action__Group__10"


    // $ANTLR start "rule__Action__Group__10__Impl"
    // InternalENIGMA.g:3611:1: rule__Action__Group__10__Impl : ( '{' ) ;
    public final void rule__Action__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3615:1: ( ( '{' ) )
            // InternalENIGMA.g:3616:1: ( '{' )
            {
            // InternalENIGMA.g:3616:1: ( '{' )
            // InternalENIGMA.g:3617:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Action__Group__10__Impl"


    // $ANTLR start "rule__Action__Group__11"
    // InternalENIGMA.g:3626:1: rule__Action__Group__11 : rule__Action__Group__11__Impl rule__Action__Group__12 ;
    public final void rule__Action__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3630:1: ( rule__Action__Group__11__Impl rule__Action__Group__12 )
            // InternalENIGMA.g:3631:2: rule__Action__Group__11__Impl rule__Action__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Action__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__12();

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
    // $ANTLR end "rule__Action__Group__11"


    // $ANTLR start "rule__Action__Group__11__Impl"
    // InternalENIGMA.g:3638:1: rule__Action__Group__11__Impl : ( ( rule__Action__ObjetsattribuablesAssignment_11 )* ) ;
    public final void rule__Action__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3642:1: ( ( ( rule__Action__ObjetsattribuablesAssignment_11 )* ) )
            // InternalENIGMA.g:3643:1: ( ( rule__Action__ObjetsattribuablesAssignment_11 )* )
            {
            // InternalENIGMA.g:3643:1: ( ( rule__Action__ObjetsattribuablesAssignment_11 )* )
            // InternalENIGMA.g:3644:2: ( rule__Action__ObjetsattribuablesAssignment_11 )*
            {
             before(grammarAccess.getActionAccess().getObjetsattribuablesAssignment_11()); 
            // InternalENIGMA.g:3645:2: ( rule__Action__ObjetsattribuablesAssignment_11 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalENIGMA.g:3645:3: rule__Action__ObjetsattribuablesAssignment_11
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Action__ObjetsattribuablesAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getObjetsattribuablesAssignment_11()); 

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
    // $ANTLR end "rule__Action__Group__11__Impl"


    // $ANTLR start "rule__Action__Group__12"
    // InternalENIGMA.g:3653:1: rule__Action__Group__12 : rule__Action__Group__12__Impl rule__Action__Group__13 ;
    public final void rule__Action__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3657:1: ( rule__Action__Group__12__Impl rule__Action__Group__13 )
            // InternalENIGMA.g:3658:2: rule__Action__Group__12__Impl rule__Action__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Action__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__13();

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
    // $ANTLR end "rule__Action__Group__12"


    // $ANTLR start "rule__Action__Group__12__Impl"
    // InternalENIGMA.g:3665:1: rule__Action__Group__12__Impl : ( '}' ) ;
    public final void rule__Action__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3669:1: ( ( '}' ) )
            // InternalENIGMA.g:3670:1: ( '}' )
            {
            // InternalENIGMA.g:3670:1: ( '}' )
            // InternalENIGMA.g:3671:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Action__Group__12__Impl"


    // $ANTLR start "rule__Action__Group__13"
    // InternalENIGMA.g:3680:1: rule__Action__Group__13 : rule__Action__Group__13__Impl rule__Action__Group__14 ;
    public final void rule__Action__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3684:1: ( rule__Action__Group__13__Impl rule__Action__Group__14 )
            // InternalENIGMA.g:3685:2: rule__Action__Group__13__Impl rule__Action__Group__14
            {
            pushFollow(FOLLOW_44);
            rule__Action__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__14();

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
    // $ANTLR end "rule__Action__Group__13"


    // $ANTLR start "rule__Action__Group__13__Impl"
    // InternalENIGMA.g:3692:1: rule__Action__Group__13__Impl : ( 'connaissances' ) ;
    public final void rule__Action__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3696:1: ( ( 'connaissances' ) )
            // InternalENIGMA.g:3697:1: ( 'connaissances' )
            {
            // InternalENIGMA.g:3697:1: ( 'connaissances' )
            // InternalENIGMA.g:3698:2: 'connaissances'
            {
             before(grammarAccess.getActionAccess().getConnaissancesKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getConnaissancesKeyword_13()); 

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
    // $ANTLR end "rule__Action__Group__13__Impl"


    // $ANTLR start "rule__Action__Group__14"
    // InternalENIGMA.g:3707:1: rule__Action__Group__14 : rule__Action__Group__14__Impl rule__Action__Group__15 ;
    public final void rule__Action__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3711:1: ( rule__Action__Group__14__Impl rule__Action__Group__15 )
            // InternalENIGMA.g:3712:2: rule__Action__Group__14__Impl rule__Action__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__Action__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__15();

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
    // $ANTLR end "rule__Action__Group__14"


    // $ANTLR start "rule__Action__Group__14__Impl"
    // InternalENIGMA.g:3719:1: rule__Action__Group__14__Impl : ( 'a' ) ;
    public final void rule__Action__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3723:1: ( ( 'a' ) )
            // InternalENIGMA.g:3724:1: ( 'a' )
            {
            // InternalENIGMA.g:3724:1: ( 'a' )
            // InternalENIGMA.g:3725:2: 'a'
            {
             before(grammarAccess.getActionAccess().getAKeyword_14()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getAKeyword_14()); 

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
    // $ANTLR end "rule__Action__Group__14__Impl"


    // $ANTLR start "rule__Action__Group__15"
    // InternalENIGMA.g:3734:1: rule__Action__Group__15 : rule__Action__Group__15__Impl rule__Action__Group__16 ;
    public final void rule__Action__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3738:1: ( rule__Action__Group__15__Impl rule__Action__Group__16 )
            // InternalENIGMA.g:3739:2: rule__Action__Group__15__Impl rule__Action__Group__16
            {
            pushFollow(FOLLOW_35);
            rule__Action__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__16();

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
    // $ANTLR end "rule__Action__Group__15"


    // $ANTLR start "rule__Action__Group__15__Impl"
    // InternalENIGMA.g:3746:1: rule__Action__Group__15__Impl : ( '{' ) ;
    public final void rule__Action__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3750:1: ( ( '{' ) )
            // InternalENIGMA.g:3751:1: ( '{' )
            {
            // InternalENIGMA.g:3751:1: ( '{' )
            // InternalENIGMA.g:3752:2: '{'
            {
             before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Action__Group__15__Impl"


    // $ANTLR start "rule__Action__Group__16"
    // InternalENIGMA.g:3761:1: rule__Action__Group__16 : rule__Action__Group__16__Impl rule__Action__Group__17 ;
    public final void rule__Action__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3765:1: ( rule__Action__Group__16__Impl rule__Action__Group__17 )
            // InternalENIGMA.g:3766:2: rule__Action__Group__16__Impl rule__Action__Group__17
            {
            pushFollow(FOLLOW_35);
            rule__Action__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__17();

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
    // $ANTLR end "rule__Action__Group__16"


    // $ANTLR start "rule__Action__Group__16__Impl"
    // InternalENIGMA.g:3773:1: rule__Action__Group__16__Impl : ( ( rule__Action__ConnaissancesattribuablesAssignment_16 )* ) ;
    public final void rule__Action__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3777:1: ( ( ( rule__Action__ConnaissancesattribuablesAssignment_16 )* ) )
            // InternalENIGMA.g:3778:1: ( ( rule__Action__ConnaissancesattribuablesAssignment_16 )* )
            {
            // InternalENIGMA.g:3778:1: ( ( rule__Action__ConnaissancesattribuablesAssignment_16 )* )
            // InternalENIGMA.g:3779:2: ( rule__Action__ConnaissancesattribuablesAssignment_16 )*
            {
             before(grammarAccess.getActionAccess().getConnaissancesattribuablesAssignment_16()); 
            // InternalENIGMA.g:3780:2: ( rule__Action__ConnaissancesattribuablesAssignment_16 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalENIGMA.g:3780:3: rule__Action__ConnaissancesattribuablesAssignment_16
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Action__ConnaissancesattribuablesAssignment_16();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getConnaissancesattribuablesAssignment_16()); 

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
    // $ANTLR end "rule__Action__Group__16__Impl"


    // $ANTLR start "rule__Action__Group__17"
    // InternalENIGMA.g:3788:1: rule__Action__Group__17 : rule__Action__Group__17__Impl rule__Action__Group__18 ;
    public final void rule__Action__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3792:1: ( rule__Action__Group__17__Impl rule__Action__Group__18 )
            // InternalENIGMA.g:3793:2: rule__Action__Group__17__Impl rule__Action__Group__18
            {
            pushFollow(FOLLOW_15);
            rule__Action__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__18();

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
    // $ANTLR end "rule__Action__Group__17"


    // $ANTLR start "rule__Action__Group__17__Impl"
    // InternalENIGMA.g:3800:1: rule__Action__Group__17__Impl : ( '}' ) ;
    public final void rule__Action__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3804:1: ( ( '}' ) )
            // InternalENIGMA.g:3805:1: ( '}' )
            {
            // InternalENIGMA.g:3805:1: ( '}' )
            // InternalENIGMA.g:3806:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__Action__Group__17__Impl"


    // $ANTLR start "rule__Action__Group__18"
    // InternalENIGMA.g:3815:1: rule__Action__Group__18 : rule__Action__Group__18__Impl ;
    public final void rule__Action__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3819:1: ( rule__Action__Group__18__Impl )
            // InternalENIGMA.g:3820:2: rule__Action__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__18__Impl();

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
    // $ANTLR end "rule__Action__Group__18"


    // $ANTLR start "rule__Action__Group__18__Impl"
    // InternalENIGMA.g:3826:1: rule__Action__Group__18__Impl : ( '}' ) ;
    public final void rule__Action__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3830:1: ( ( '}' ) )
            // InternalENIGMA.g:3831:1: ( '}' )
            {
            // InternalENIGMA.g:3831:1: ( '}' )
            // InternalENIGMA.g:3832:2: '}'
            {
             before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_18()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_18()); 

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
    // $ANTLR end "rule__Action__Group__18__Impl"


    // $ANTLR start "rule__Reponse__Group__0"
    // InternalENIGMA.g:3842:1: rule__Reponse__Group__0 : rule__Reponse__Group__0__Impl rule__Reponse__Group__1 ;
    public final void rule__Reponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3846:1: ( rule__Reponse__Group__0__Impl rule__Reponse__Group__1 )
            // InternalENIGMA.g:3847:2: rule__Reponse__Group__0__Impl rule__Reponse__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalENIGMA.g:3854:1: rule__Reponse__Group__0__Impl : ( 'reponse' ) ;
    public final void rule__Reponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3858:1: ( ( 'reponse' ) )
            // InternalENIGMA.g:3859:1: ( 'reponse' )
            {
            // InternalENIGMA.g:3859:1: ( 'reponse' )
            // InternalENIGMA.g:3860:2: 'reponse'
            {
             before(grammarAccess.getReponseAccess().getReponseKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalENIGMA.g:3869:1: rule__Reponse__Group__1 : rule__Reponse__Group__1__Impl rule__Reponse__Group__2 ;
    public final void rule__Reponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3873:1: ( rule__Reponse__Group__1__Impl rule__Reponse__Group__2 )
            // InternalENIGMA.g:3874:2: rule__Reponse__Group__1__Impl rule__Reponse__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalENIGMA.g:3881:1: rule__Reponse__Group__1__Impl : ( '>>' ) ;
    public final void rule__Reponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3885:1: ( ( '>>' ) )
            // InternalENIGMA.g:3886:1: ( '>>' )
            {
            // InternalENIGMA.g:3886:1: ( '>>' )
            // InternalENIGMA.g:3887:2: '>>'
            {
             before(grammarAccess.getReponseAccess().getGreaterThanSignGreaterThanSignKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalENIGMA.g:3896:1: rule__Reponse__Group__2 : rule__Reponse__Group__2__Impl rule__Reponse__Group__3 ;
    public final void rule__Reponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3900:1: ( rule__Reponse__Group__2__Impl rule__Reponse__Group__3 )
            // InternalENIGMA.g:3901:2: rule__Reponse__Group__2__Impl rule__Reponse__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalENIGMA.g:3908:1: rule__Reponse__Group__2__Impl : ( ( rule__Reponse__NameAssignment_2 ) ) ;
    public final void rule__Reponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3912:1: ( ( ( rule__Reponse__NameAssignment_2 ) ) )
            // InternalENIGMA.g:3913:1: ( ( rule__Reponse__NameAssignment_2 ) )
            {
            // InternalENIGMA.g:3913:1: ( ( rule__Reponse__NameAssignment_2 ) )
            // InternalENIGMA.g:3914:2: ( rule__Reponse__NameAssignment_2 )
            {
             before(grammarAccess.getReponseAccess().getNameAssignment_2()); 
            // InternalENIGMA.g:3915:2: ( rule__Reponse__NameAssignment_2 )
            // InternalENIGMA.g:3915:3: rule__Reponse__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getNameAssignment_2()); 

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
    // InternalENIGMA.g:3923:1: rule__Reponse__Group__3 : rule__Reponse__Group__3__Impl rule__Reponse__Group__4 ;
    public final void rule__Reponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3927:1: ( rule__Reponse__Group__3__Impl rule__Reponse__Group__4 )
            // InternalENIGMA.g:3928:2: rule__Reponse__Group__3__Impl rule__Reponse__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalENIGMA.g:3935:1: rule__Reponse__Group__3__Impl : ( 'de' ) ;
    public final void rule__Reponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3939:1: ( ( 'de' ) )
            // InternalENIGMA.g:3940:1: ( 'de' )
            {
            // InternalENIGMA.g:3940:1: ( 'de' )
            // InternalENIGMA.g:3941:2: 'de'
            {
             before(grammarAccess.getReponseAccess().getDeKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getDeKeyword_3()); 

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
    // InternalENIGMA.g:3950:1: rule__Reponse__Group__4 : rule__Reponse__Group__4__Impl rule__Reponse__Group__5 ;
    public final void rule__Reponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3954:1: ( rule__Reponse__Group__4__Impl rule__Reponse__Group__5 )
            // InternalENIGMA.g:3955:2: rule__Reponse__Group__4__Impl rule__Reponse__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Reponse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__5();

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
    // InternalENIGMA.g:3962:1: rule__Reponse__Group__4__Impl : ( 'qualification' ) ;
    public final void rule__Reponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3966:1: ( ( 'qualification' ) )
            // InternalENIGMA.g:3967:1: ( 'qualification' )
            {
            // InternalENIGMA.g:3967:1: ( 'qualification' )
            // InternalENIGMA.g:3968:2: 'qualification'
            {
             before(grammarAccess.getReponseAccess().getQualificationKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getQualificationKeyword_4()); 

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


    // $ANTLR start "rule__Reponse__Group__5"
    // InternalENIGMA.g:3977:1: rule__Reponse__Group__5 : rule__Reponse__Group__5__Impl rule__Reponse__Group__6 ;
    public final void rule__Reponse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3981:1: ( rule__Reponse__Group__5__Impl rule__Reponse__Group__6 )
            // InternalENIGMA.g:3982:2: rule__Reponse__Group__5__Impl rule__Reponse__Group__6
            {
            pushFollow(FOLLOW_48);
            rule__Reponse__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__6();

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
    // $ANTLR end "rule__Reponse__Group__5"


    // $ANTLR start "rule__Reponse__Group__5__Impl"
    // InternalENIGMA.g:3989:1: rule__Reponse__Group__5__Impl : ( ( rule__Reponse__TexteAssignment_5 ) ) ;
    public final void rule__Reponse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:3993:1: ( ( ( rule__Reponse__TexteAssignment_5 ) ) )
            // InternalENIGMA.g:3994:1: ( ( rule__Reponse__TexteAssignment_5 ) )
            {
            // InternalENIGMA.g:3994:1: ( ( rule__Reponse__TexteAssignment_5 ) )
            // InternalENIGMA.g:3995:2: ( rule__Reponse__TexteAssignment_5 )
            {
             before(grammarAccess.getReponseAccess().getTexteAssignment_5()); 
            // InternalENIGMA.g:3996:2: ( rule__Reponse__TexteAssignment_5 )
            // InternalENIGMA.g:3996:3: rule__Reponse__TexteAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__TexteAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getTexteAssignment_5()); 

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
    // $ANTLR end "rule__Reponse__Group__5__Impl"


    // $ANTLR start "rule__Reponse__Group__6"
    // InternalENIGMA.g:4004:1: rule__Reponse__Group__6 : rule__Reponse__Group__6__Impl rule__Reponse__Group__7 ;
    public final void rule__Reponse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4008:1: ( rule__Reponse__Group__6__Impl rule__Reponse__Group__7 )
            // InternalENIGMA.g:4009:2: rule__Reponse__Group__6__Impl rule__Reponse__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Reponse__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__7();

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
    // $ANTLR end "rule__Reponse__Group__6"


    // $ANTLR start "rule__Reponse__Group__6__Impl"
    // InternalENIGMA.g:4016:1: rule__Reponse__Group__6__Impl : ( 'avec' ) ;
    public final void rule__Reponse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4020:1: ( ( 'avec' ) )
            // InternalENIGMA.g:4021:1: ( 'avec' )
            {
            // InternalENIGMA.g:4021:1: ( 'avec' )
            // InternalENIGMA.g:4022:2: 'avec'
            {
             before(grammarAccess.getReponseAccess().getAvecKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getAvecKeyword_6()); 

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
    // $ANTLR end "rule__Reponse__Group__6__Impl"


    // $ANTLR start "rule__Reponse__Group__7"
    // InternalENIGMA.g:4031:1: rule__Reponse__Group__7 : rule__Reponse__Group__7__Impl ;
    public final void rule__Reponse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4035:1: ( rule__Reponse__Group__7__Impl )
            // InternalENIGMA.g:4036:2: rule__Reponse__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__7__Impl();

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
    // $ANTLR end "rule__Reponse__Group__7"


    // $ANTLR start "rule__Reponse__Group__7__Impl"
    // InternalENIGMA.g:4042:1: rule__Reponse__Group__7__Impl : ( ( rule__Reponse__ActionAssignment_7 ) ) ;
    public final void rule__Reponse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4046:1: ( ( ( rule__Reponse__ActionAssignment_7 ) ) )
            // InternalENIGMA.g:4047:1: ( ( rule__Reponse__ActionAssignment_7 ) )
            {
            // InternalENIGMA.g:4047:1: ( ( rule__Reponse__ActionAssignment_7 ) )
            // InternalENIGMA.g:4048:2: ( rule__Reponse__ActionAssignment_7 )
            {
             before(grammarAccess.getReponseAccess().getActionAssignment_7()); 
            // InternalENIGMA.g:4049:2: ( rule__Reponse__ActionAssignment_7 )
            // InternalENIGMA.g:4049:3: rule__Reponse__ActionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__ActionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getActionAssignment_7()); 

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
    // $ANTLR end "rule__Reponse__Group__7__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalENIGMA.g:4058:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4062:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalENIGMA.g:4063:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalENIGMA.g:4070:1: rule__Condition__Group__0__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4074:1: ( ( 'condition' ) )
            // InternalENIGMA.g:4075:1: ( 'condition' )
            {
            // InternalENIGMA.g:4075:1: ( 'condition' )
            // InternalENIGMA.g:4076:2: 'condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalENIGMA.g:4085:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4089:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalENIGMA.g:4090:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalENIGMA.g:4097:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4101:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // InternalENIGMA.g:4102:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // InternalENIGMA.g:4102:1: ( ( rule__Condition__NameAssignment_1 ) )
            // InternalENIGMA.g:4103:2: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // InternalENIGMA.g:4104:2: ( rule__Condition__NameAssignment_1 )
            // InternalENIGMA.g:4104:3: rule__Condition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalENIGMA.g:4112:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4116:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalENIGMA.g:4117:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalENIGMA.g:4124:1: rule__Condition__Group__2__Impl : ( '{' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4128:1: ( ( '{' ) )
            // InternalENIGMA.g:4129:1: ( '{' )
            {
            // InternalENIGMA.g:4129:1: ( '{' )
            // InternalENIGMA.g:4130:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalENIGMA.g:4139:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl rule__Condition__Group__4 ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4143:1: ( rule__Condition__Group__3__Impl rule__Condition__Group__4 )
            // InternalENIGMA.g:4144:2: rule__Condition__Group__3__Impl rule__Condition__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__4();

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
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalENIGMA.g:4151:1: rule__Condition__Group__3__Impl : ( 'obj' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4155:1: ( ( 'obj' ) )
            // InternalENIGMA.g:4156:1: ( 'obj' )
            {
            // InternalENIGMA.g:4156:1: ( 'obj' )
            // InternalENIGMA.g:4157:2: 'obj'
            {
             before(grammarAccess.getConditionAccess().getObjKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getObjKeyword_3()); 

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
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__4"
    // InternalENIGMA.g:4166:1: rule__Condition__Group__4 : rule__Condition__Group__4__Impl rule__Condition__Group__5 ;
    public final void rule__Condition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4170:1: ( rule__Condition__Group__4__Impl rule__Condition__Group__5 )
            // InternalENIGMA.g:4171:2: rule__Condition__Group__4__Impl rule__Condition__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Condition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__5();

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
    // $ANTLR end "rule__Condition__Group__4"


    // $ANTLR start "rule__Condition__Group__4__Impl"
    // InternalENIGMA.g:4178:1: rule__Condition__Group__4__Impl : ( '{' ) ;
    public final void rule__Condition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4182:1: ( ( '{' ) )
            // InternalENIGMA.g:4183:1: ( '{' )
            {
            // InternalENIGMA.g:4183:1: ( '{' )
            // InternalENIGMA.g:4184:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Condition__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__5"
    // InternalENIGMA.g:4193:1: rule__Condition__Group__5 : rule__Condition__Group__5__Impl rule__Condition__Group__6 ;
    public final void rule__Condition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4197:1: ( rule__Condition__Group__5__Impl rule__Condition__Group__6 )
            // InternalENIGMA.g:4198:2: rule__Condition__Group__5__Impl rule__Condition__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Condition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__6();

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
    // $ANTLR end "rule__Condition__Group__5"


    // $ANTLR start "rule__Condition__Group__5__Impl"
    // InternalENIGMA.g:4205:1: rule__Condition__Group__5__Impl : ( ( rule__Condition__ObjetsRequisAssignment_5 )* ) ;
    public final void rule__Condition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4209:1: ( ( ( rule__Condition__ObjetsRequisAssignment_5 )* ) )
            // InternalENIGMA.g:4210:1: ( ( rule__Condition__ObjetsRequisAssignment_5 )* )
            {
            // InternalENIGMA.g:4210:1: ( ( rule__Condition__ObjetsRequisAssignment_5 )* )
            // InternalENIGMA.g:4211:2: ( rule__Condition__ObjetsRequisAssignment_5 )*
            {
             before(grammarAccess.getConditionAccess().getObjetsRequisAssignment_5()); 
            // InternalENIGMA.g:4212:2: ( rule__Condition__ObjetsRequisAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalENIGMA.g:4212:3: rule__Condition__ObjetsRequisAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Condition__ObjetsRequisAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getObjetsRequisAssignment_5()); 

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
    // $ANTLR end "rule__Condition__Group__5__Impl"


    // $ANTLR start "rule__Condition__Group__6"
    // InternalENIGMA.g:4220:1: rule__Condition__Group__6 : rule__Condition__Group__6__Impl rule__Condition__Group__7 ;
    public final void rule__Condition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4224:1: ( rule__Condition__Group__6__Impl rule__Condition__Group__7 )
            // InternalENIGMA.g:4225:2: rule__Condition__Group__6__Impl rule__Condition__Group__7
            {
            pushFollow(FOLLOW_50);
            rule__Condition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__7();

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
    // $ANTLR end "rule__Condition__Group__6"


    // $ANTLR start "rule__Condition__Group__6__Impl"
    // InternalENIGMA.g:4232:1: rule__Condition__Group__6__Impl : ( '}' ) ;
    public final void rule__Condition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4236:1: ( ( '}' ) )
            // InternalENIGMA.g:4237:1: ( '}' )
            {
            // InternalENIGMA.g:4237:1: ( '}' )
            // InternalENIGMA.g:4238:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Condition__Group__6__Impl"


    // $ANTLR start "rule__Condition__Group__7"
    // InternalENIGMA.g:4247:1: rule__Condition__Group__7 : rule__Condition__Group__7__Impl rule__Condition__Group__8 ;
    public final void rule__Condition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4251:1: ( rule__Condition__Group__7__Impl rule__Condition__Group__8 )
            // InternalENIGMA.g:4252:2: rule__Condition__Group__7__Impl rule__Condition__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__8();

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
    // $ANTLR end "rule__Condition__Group__7"


    // $ANTLR start "rule__Condition__Group__7__Impl"
    // InternalENIGMA.g:4259:1: rule__Condition__Group__7__Impl : ( 'con' ) ;
    public final void rule__Condition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4263:1: ( ( 'con' ) )
            // InternalENIGMA.g:4264:1: ( 'con' )
            {
            // InternalENIGMA.g:4264:1: ( 'con' )
            // InternalENIGMA.g:4265:2: 'con'
            {
             before(grammarAccess.getConditionAccess().getConKeyword_7()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConKeyword_7()); 

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
    // $ANTLR end "rule__Condition__Group__7__Impl"


    // $ANTLR start "rule__Condition__Group__8"
    // InternalENIGMA.g:4274:1: rule__Condition__Group__8 : rule__Condition__Group__8__Impl rule__Condition__Group__9 ;
    public final void rule__Condition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4278:1: ( rule__Condition__Group__8__Impl rule__Condition__Group__9 )
            // InternalENIGMA.g:4279:2: rule__Condition__Group__8__Impl rule__Condition__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__Condition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__9();

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
    // $ANTLR end "rule__Condition__Group__8"


    // $ANTLR start "rule__Condition__Group__8__Impl"
    // InternalENIGMA.g:4286:1: rule__Condition__Group__8__Impl : ( '{' ) ;
    public final void rule__Condition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4290:1: ( ( '{' ) )
            // InternalENIGMA.g:4291:1: ( '{' )
            {
            // InternalENIGMA.g:4291:1: ( '{' )
            // InternalENIGMA.g:4292:2: '{'
            {
             before(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Condition__Group__8__Impl"


    // $ANTLR start "rule__Condition__Group__9"
    // InternalENIGMA.g:4301:1: rule__Condition__Group__9 : rule__Condition__Group__9__Impl rule__Condition__Group__10 ;
    public final void rule__Condition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4305:1: ( rule__Condition__Group__9__Impl rule__Condition__Group__10 )
            // InternalENIGMA.g:4306:2: rule__Condition__Group__9__Impl rule__Condition__Group__10
            {
            pushFollow(FOLLOW_35);
            rule__Condition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__10();

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
    // $ANTLR end "rule__Condition__Group__9"


    // $ANTLR start "rule__Condition__Group__9__Impl"
    // InternalENIGMA.g:4313:1: rule__Condition__Group__9__Impl : ( ( rule__Condition__ConnaissancesRequisesAssignment_9 )* ) ;
    public final void rule__Condition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4317:1: ( ( ( rule__Condition__ConnaissancesRequisesAssignment_9 )* ) )
            // InternalENIGMA.g:4318:1: ( ( rule__Condition__ConnaissancesRequisesAssignment_9 )* )
            {
            // InternalENIGMA.g:4318:1: ( ( rule__Condition__ConnaissancesRequisesAssignment_9 )* )
            // InternalENIGMA.g:4319:2: ( rule__Condition__ConnaissancesRequisesAssignment_9 )*
            {
             before(grammarAccess.getConditionAccess().getConnaissancesRequisesAssignment_9()); 
            // InternalENIGMA.g:4320:2: ( rule__Condition__ConnaissancesRequisesAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalENIGMA.g:4320:3: rule__Condition__ConnaissancesRequisesAssignment_9
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Condition__ConnaissancesRequisesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getConnaissancesRequisesAssignment_9()); 

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
    // $ANTLR end "rule__Condition__Group__9__Impl"


    // $ANTLR start "rule__Condition__Group__10"
    // InternalENIGMA.g:4328:1: rule__Condition__Group__10 : rule__Condition__Group__10__Impl rule__Condition__Group__11 ;
    public final void rule__Condition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4332:1: ( rule__Condition__Group__10__Impl rule__Condition__Group__11 )
            // InternalENIGMA.g:4333:2: rule__Condition__Group__10__Impl rule__Condition__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Condition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__11();

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
    // $ANTLR end "rule__Condition__Group__10"


    // $ANTLR start "rule__Condition__Group__10__Impl"
    // InternalENIGMA.g:4340:1: rule__Condition__Group__10__Impl : ( '}' ) ;
    public final void rule__Condition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4344:1: ( ( '}' ) )
            // InternalENIGMA.g:4345:1: ( '}' )
            {
            // InternalENIGMA.g:4345:1: ( '}' )
            // InternalENIGMA.g:4346:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Condition__Group__10__Impl"


    // $ANTLR start "rule__Condition__Group__11"
    // InternalENIGMA.g:4355:1: rule__Condition__Group__11 : rule__Condition__Group__11__Impl ;
    public final void rule__Condition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4359:1: ( rule__Condition__Group__11__Impl )
            // InternalENIGMA.g:4360:2: rule__Condition__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__11__Impl();

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
    // $ANTLR end "rule__Condition__Group__11"


    // $ANTLR start "rule__Condition__Group__11__Impl"
    // InternalENIGMA.g:4366:1: rule__Condition__Group__11__Impl : ( '}' ) ;
    public final void rule__Condition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4370:1: ( ( '}' ) )
            // InternalENIGMA.g:4371:1: ( '}' )
            {
            // InternalENIGMA.g:4371:1: ( '}' )
            // InternalENIGMA.g:4372:2: '}'
            {
             before(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Condition__Group__11__Impl"


    // $ANTLR start "rule__Jeu__NameAssignment_1"
    // InternalENIGMA.g:4382:1: rule__Jeu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Jeu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4386:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:4387:2: ( RULE_ID )
            {
            // InternalENIGMA.g:4387:2: ( RULE_ID )
            // InternalENIGMA.g:4388:3: RULE_ID
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


    // $ANTLR start "rule__Jeu__JeuelementAssignment_3"
    // InternalENIGMA.g:4397:1: rule__Jeu__JeuelementAssignment_3 : ( ruleJeuElement ) ;
    public final void rule__Jeu__JeuelementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4401:1: ( ( ruleJeuElement ) )
            // InternalENIGMA.g:4402:2: ( ruleJeuElement )
            {
            // InternalENIGMA.g:4402:2: ( ruleJeuElement )
            // InternalENIGMA.g:4403:3: ruleJeuElement
            {
             before(grammarAccess.getJeuAccess().getJeuelementJeuElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJeuElement();

            state._fsp--;

             after(grammarAccess.getJeuAccess().getJeuelementJeuElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Jeu__JeuelementAssignment_3"


    // $ANTLR start "rule__Joueur__NameAssignment_1"
    // InternalENIGMA.g:4412:1: rule__Joueur__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joueur__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4416:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:4417:2: ( RULE_ID )
            {
            // InternalENIGMA.g:4417:2: ( RULE_ID )
            // InternalENIGMA.g:4418:3: RULE_ID
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


    // $ANTLR start "rule__Joueur__LimiteAssignment_4"
    // InternalENIGMA.g:4427:1: rule__Joueur__LimiteAssignment_4 : ( RULE_INT ) ;
    public final void rule__Joueur__LimiteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4431:1: ( ( RULE_INT ) )
            // InternalENIGMA.g:4432:2: ( RULE_INT )
            {
            // InternalENIGMA.g:4432:2: ( RULE_INT )
            // InternalENIGMA.g:4433:3: RULE_INT
            {
             before(grammarAccess.getJoueurAccess().getLimiteINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJoueurAccess().getLimiteINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Joueur__LimiteAssignment_4"


    // $ANTLR start "rule__Joueur__ObjetsAssignment_7"
    // InternalENIGMA.g:4442:1: rule__Joueur__ObjetsAssignment_7 : ( ruleObjet ) ;
    public final void rule__Joueur__ObjetsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4446:1: ( ( ruleObjet ) )
            // InternalENIGMA.g:4447:2: ( ruleObjet )
            {
            // InternalENIGMA.g:4447:2: ( ruleObjet )
            // InternalENIGMA.g:4448:3: ruleObjet
            {
             before(grammarAccess.getJoueurAccess().getObjetsObjetParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getJoueurAccess().getObjetsObjetParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Joueur__ObjetsAssignment_7"


    // $ANTLR start "rule__Joueur__ConnaissancesAssignment_11"
    // InternalENIGMA.g:4457:1: rule__Joueur__ConnaissancesAssignment_11 : ( ruleConnaissance ) ;
    public final void rule__Joueur__ConnaissancesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4461:1: ( ( ruleConnaissance ) )
            // InternalENIGMA.g:4462:2: ( ruleConnaissance )
            {
            // InternalENIGMA.g:4462:2: ( ruleConnaissance )
            // InternalENIGMA.g:4463:3: ruleConnaissance
            {
             before(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleConnaissance();

            state._fsp--;

             after(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Joueur__ConnaissancesAssignment_11"


    // $ANTLR start "rule__Connaissance__NameAssignment_1"
    // InternalENIGMA.g:4472:1: rule__Connaissance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connaissance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4476:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:4477:2: ( RULE_ID )
            {
            // InternalENIGMA.g:4477:2: ( RULE_ID )
            // InternalENIGMA.g:4478:3: RULE_ID
            {
             before(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Connaissance__NameAssignment_1"


    // $ANTLR start "rule__Connaissance__QualificationAssignment_2"
    // InternalENIGMA.g:4487:1: rule__Connaissance__QualificationAssignment_2 : ( ruleQualification ) ;
    public final void rule__Connaissance__QualificationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4491:1: ( ( ruleQualification ) )
            // InternalENIGMA.g:4492:2: ( ruleQualification )
            {
            // InternalENIGMA.g:4492:2: ( ruleQualification )
            // InternalENIGMA.g:4493:3: ruleQualification
            {
             before(grammarAccess.getConnaissanceAccess().getQualificationQualificationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getQualificationQualificationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Connaissance__QualificationAssignment_2"


    // $ANTLR start "rule__Connaissance__EtatvAssignment_4"
    // InternalENIGMA.g:4502:1: rule__Connaissance__EtatvAssignment_4 : ( ruleEtatVisibilite ) ;
    public final void rule__Connaissance__EtatvAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4506:1: ( ( ruleEtatVisibilite ) )
            // InternalENIGMA.g:4507:2: ( ruleEtatVisibilite )
            {
            // InternalENIGMA.g:4507:2: ( ruleEtatVisibilite )
            // InternalENIGMA.g:4508:3: ruleEtatVisibilite
            {
             before(grammarAccess.getConnaissanceAccess().getEtatvEtatVisibiliteEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEtatVisibilite();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getEtatvEtatVisibiliteEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Connaissance__EtatvAssignment_4"


    // $ANTLR start "rule__Connaissance__EtatpAssignment_5"
    // InternalENIGMA.g:4517:1: rule__Connaissance__EtatpAssignment_5 : ( ruleEtatPossession ) ;
    public final void rule__Connaissance__EtatpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4521:1: ( ( ruleEtatPossession ) )
            // InternalENIGMA.g:4522:2: ( ruleEtatPossession )
            {
            // InternalENIGMA.g:4522:2: ( ruleEtatPossession )
            // InternalENIGMA.g:4523:3: ruleEtatPossession
            {
             before(grammarAccess.getConnaissanceAccess().getEtatpEtatPossessionEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEtatPossession();

            state._fsp--;

             after(grammarAccess.getConnaissanceAccess().getEtatpEtatPossessionEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Connaissance__EtatpAssignment_5"


    // $ANTLR start "rule__Objet__NameAssignment_1"
    // InternalENIGMA.g:4532:1: rule__Objet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Objet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4536:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:4537:2: ( RULE_ID )
            {
            // InternalENIGMA.g:4537:2: ( RULE_ID )
            // InternalENIGMA.g:4538:3: RULE_ID
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


    // $ANTLR start "rule__Objet__OccurrenceAssignment_3"
    // InternalENIGMA.g:4547:1: rule__Objet__OccurrenceAssignment_3 : ( RULE_INT ) ;
    public final void rule__Objet__OccurrenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4551:1: ( ( RULE_INT ) )
            // InternalENIGMA.g:4552:2: ( RULE_INT )
            {
            // InternalENIGMA.g:4552:2: ( RULE_INT )
            // InternalENIGMA.g:4553:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getOccurrenceINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getOccurrenceINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Objet__OccurrenceAssignment_3"


    // $ANTLR start "rule__Objet__TailleAssignment_7"
    // InternalENIGMA.g:4562:1: rule__Objet__TailleAssignment_7 : ( RULE_INT ) ;
    public final void rule__Objet__TailleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4566:1: ( ( RULE_INT ) )
            // InternalENIGMA.g:4567:2: ( RULE_INT )
            {
            // InternalENIGMA.g:4567:2: ( RULE_INT )
            // InternalENIGMA.g:4568:3: RULE_INT
            {
             before(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Objet__TailleAssignment_7"


    // $ANTLR start "rule__Objet__EtatvAssignment_9"
    // InternalENIGMA.g:4577:1: rule__Objet__EtatvAssignment_9 : ( ruleEtatVisibilite ) ;
    public final void rule__Objet__EtatvAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4581:1: ( ( ruleEtatVisibilite ) )
            // InternalENIGMA.g:4582:2: ( ruleEtatVisibilite )
            {
            // InternalENIGMA.g:4582:2: ( ruleEtatVisibilite )
            // InternalENIGMA.g:4583:3: ruleEtatVisibilite
            {
             before(grammarAccess.getObjetAccess().getEtatvEtatVisibiliteEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEtatVisibilite();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getEtatvEtatVisibiliteEnumRuleCall_9_0()); 

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
    // $ANTLR end "rule__Objet__EtatvAssignment_9"


    // $ANTLR start "rule__Objet__EtatpAssignment_10"
    // InternalENIGMA.g:4592:1: rule__Objet__EtatpAssignment_10 : ( ruleEtatPossession ) ;
    public final void rule__Objet__EtatpAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4596:1: ( ( ruleEtatPossession ) )
            // InternalENIGMA.g:4597:2: ( ruleEtatPossession )
            {
            // InternalENIGMA.g:4597:2: ( ruleEtatPossession )
            // InternalENIGMA.g:4598:3: ruleEtatPossession
            {
             before(grammarAccess.getObjetAccess().getEtatpEtatPossessionEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEtatPossession();

            state._fsp--;

             after(grammarAccess.getObjetAccess().getEtatpEtatPossessionEnumRuleCall_10_0()); 

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
    // $ANTLR end "rule__Objet__EtatpAssignment_10"


    // $ANTLR start "rule__Territoire__NameAssignment_1"
    // InternalENIGMA.g:4607:1: rule__Territoire__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Territoire__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4611:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:4612:2: ( RULE_ID )
            {
            // InternalENIGMA.g:4612:2: ( RULE_ID )
            // InternalENIGMA.g:4613:3: RULE_ID
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
    // InternalENIGMA.g:4622:1: rule__Territoire__LieuDebutAssignment_4 : ( ruleLieu ) ;
    public final void rule__Territoire__LieuDebutAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4626:1: ( ( ruleLieu ) )
            // InternalENIGMA.g:4627:2: ( ruleLieu )
            {
            // InternalENIGMA.g:4627:2: ( ruleLieu )
            // InternalENIGMA.g:4628:3: ruleLieu
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


    // $ANTLR start "rule__Territoire__LieuxintermediairesAssignment_7"
    // InternalENIGMA.g:4637:1: rule__Territoire__LieuxintermediairesAssignment_7 : ( ruleLieu ) ;
    public final void rule__Territoire__LieuxintermediairesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4641:1: ( ( ruleLieu ) )
            // InternalENIGMA.g:4642:2: ( ruleLieu )
            {
            // InternalENIGMA.g:4642:2: ( ruleLieu )
            // InternalENIGMA.g:4643:3: ruleLieu
            {
             before(grammarAccess.getTerritoireAccess().getLieuxintermediairesLieuParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getLieuxintermediairesLieuParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Territoire__LieuxintermediairesAssignment_7"


    // $ANTLR start "rule__Territoire__LieuxFinAssignment_11"
    // InternalENIGMA.g:4652:1: rule__Territoire__LieuxFinAssignment_11 : ( ruleLieu ) ;
    public final void rule__Territoire__LieuxFinAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4656:1: ( ( ruleLieu ) )
            // InternalENIGMA.g:4657:2: ( ruleLieu )
            {
            // InternalENIGMA.g:4657:2: ( ruleLieu )
            // InternalENIGMA.g:4658:3: ruleLieu
            {
             before(grammarAccess.getTerritoireAccess().getLieuxFinLieuParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleLieu();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getLieuxFinLieuParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Territoire__LieuxFinAssignment_11"


    // $ANTLR start "rule__Territoire__CheminsAssignment_15"
    // InternalENIGMA.g:4667:1: rule__Territoire__CheminsAssignment_15 : ( ruleChemin ) ;
    public final void rule__Territoire__CheminsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4671:1: ( ( ruleChemin ) )
            // InternalENIGMA.g:4672:2: ( ruleChemin )
            {
            // InternalENIGMA.g:4672:2: ( ruleChemin )
            // InternalENIGMA.g:4673:3: ruleChemin
            {
             before(grammarAccess.getTerritoireAccess().getCheminsCheminParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleChemin();

            state._fsp--;

             after(grammarAccess.getTerritoireAccess().getCheminsCheminParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__Territoire__CheminsAssignment_15"


    // $ANTLR start "rule__Choix__NameAssignment_1"
    // InternalENIGMA.g:4682:1: rule__Choix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4686:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:4687:2: ( RULE_ID )
            {
            // InternalENIGMA.g:4687:2: ( RULE_ID )
            // InternalENIGMA.g:4688:3: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Choix__NameAssignment_1"


    // $ANTLR start "rule__Choix__ReponsesAssignment_3"
    // InternalENIGMA.g:4697:1: rule__Choix__ReponsesAssignment_3 : ( ruleReponse ) ;
    public final void rule__Choix__ReponsesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4701:1: ( ( ruleReponse ) )
            // InternalENIGMA.g:4702:2: ( ruleReponse )
            {
            // InternalENIGMA.g:4702:2: ( ruleReponse )
            // InternalENIGMA.g:4703:3: ruleReponse
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


    // $ANTLR start "rule__Choix__ConditionsAssignment_6"
    // InternalENIGMA.g:4712:1: rule__Choix__ConditionsAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Choix__ConditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4716:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:4717:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:4717:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:4718:3: ( RULE_ID )
            {
             before(grammarAccess.getChoixAccess().getConditionsConditionCrossReference_6_0()); 
            // InternalENIGMA.g:4719:3: ( RULE_ID )
            // InternalENIGMA.g:4720:4: RULE_ID
            {
             before(grammarAccess.getChoixAccess().getConditionsConditionIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoixAccess().getConditionsConditionIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getChoixAccess().getConditionsConditionCrossReference_6_0()); 

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
    // $ANTLR end "rule__Choix__ConditionsAssignment_6"


    // $ANTLR start "rule__Interaction__NameAssignment_1"
    // InternalENIGMA.g:4731:1: rule__Interaction__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interaction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4735:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:4736:2: ( RULE_ID )
            {
            // InternalENIGMA.g:4736:2: ( RULE_ID )
            // InternalENIGMA.g:4737:3: RULE_ID
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
    // InternalENIGMA.g:4746:1: rule__Interaction__ChoixAssignment_3 : ( ruleChoix ) ;
    public final void rule__Interaction__ChoixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4750:1: ( ( ruleChoix ) )
            // InternalENIGMA.g:4751:2: ( ruleChoix )
            {
            // InternalENIGMA.g:4751:2: ( ruleChoix )
            // InternalENIGMA.g:4752:3: ruleChoix
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


    // $ANTLR start "rule__Interaction__ChoixFinAssignment_4"
    // InternalENIGMA.g:4761:1: rule__Interaction__ChoixFinAssignment_4 : ( ruleChoix ) ;
    public final void rule__Interaction__ChoixFinAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4765:1: ( ( ruleChoix ) )
            // InternalENIGMA.g:4766:2: ( ruleChoix )
            {
            // InternalENIGMA.g:4766:2: ( ruleChoix )
            // InternalENIGMA.g:4767:3: ruleChoix
            {
             before(grammarAccess.getInteractionAccess().getChoixFinChoixParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChoix();

            state._fsp--;

             after(grammarAccess.getInteractionAccess().getChoixFinChoixParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Interaction__ChoixFinAssignment_4"


    // $ANTLR start "rule__Personne__NameAssignment_1"
    // InternalENIGMA.g:4776:1: rule__Personne__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Personne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4780:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:4781:2: ( RULE_ID )
            {
            // InternalENIGMA.g:4781:2: ( RULE_ID )
            // InternalENIGMA.g:4782:3: RULE_ID
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


    // $ANTLR start "rule__Personne__EtatoAssignment_2"
    // InternalENIGMA.g:4791:1: rule__Personne__EtatoAssignment_2 : ( ruleEtatObligation ) ;
    public final void rule__Personne__EtatoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4795:1: ( ( ruleEtatObligation ) )
            // InternalENIGMA.g:4796:2: ( ruleEtatObligation )
            {
            // InternalENIGMA.g:4796:2: ( ruleEtatObligation )
            // InternalENIGMA.g:4797:3: ruleEtatObligation
            {
             before(grammarAccess.getPersonneAccess().getEtatoEtatObligationEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEtatObligation();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getEtatoEtatObligationEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Personne__EtatoAssignment_2"


    // $ANTLR start "rule__Personne__ConditionoAssignment_3"
    // InternalENIGMA.g:4806:1: rule__Personne__ConditionoAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__ConditionoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4810:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:4811:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:4811:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:4812:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getConditionoConditionCrossReference_3_0()); 
            // InternalENIGMA.g:4813:3: ( RULE_ID )
            // InternalENIGMA.g:4814:4: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getConditionoConditionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getConditionoConditionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPersonneAccess().getConditionoConditionCrossReference_3_0()); 

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
    // $ANTLR end "rule__Personne__ConditionoAssignment_3"


    // $ANTLR start "rule__Personne__EtatvAssignment_4"
    // InternalENIGMA.g:4825:1: rule__Personne__EtatvAssignment_4 : ( ruleEtatVisibilite ) ;
    public final void rule__Personne__EtatvAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4829:1: ( ( ruleEtatVisibilite ) )
            // InternalENIGMA.g:4830:2: ( ruleEtatVisibilite )
            {
            // InternalENIGMA.g:4830:2: ( ruleEtatVisibilite )
            // InternalENIGMA.g:4831:3: ruleEtatVisibilite
            {
             before(grammarAccess.getPersonneAccess().getEtatvEtatVisibiliteEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEtatVisibilite();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getEtatvEtatVisibiliteEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Personne__EtatvAssignment_4"


    // $ANTLR start "rule__Personne__ConditionvAssignment_5"
    // InternalENIGMA.g:4840:1: rule__Personne__ConditionvAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Personne__ConditionvAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4844:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:4845:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:4845:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:4846:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonneAccess().getConditionvConditionCrossReference_5_0()); 
            // InternalENIGMA.g:4847:3: ( RULE_ID )
            // InternalENIGMA.g:4848:4: RULE_ID
            {
             before(grammarAccess.getPersonneAccess().getConditionvConditionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonneAccess().getConditionvConditionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPersonneAccess().getConditionvConditionCrossReference_5_0()); 

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
    // $ANTLR end "rule__Personne__ConditionvAssignment_5"


    // $ANTLR start "rule__Personne__TexteAssignment_7"
    // InternalENIGMA.g:4859:1: rule__Personne__TexteAssignment_7 : ( ruleQualification ) ;
    public final void rule__Personne__TexteAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4863:1: ( ( ruleQualification ) )
            // InternalENIGMA.g:4864:2: ( ruleQualification )
            {
            // InternalENIGMA.g:4864:2: ( ruleQualification )
            // InternalENIGMA.g:4865:3: ruleQualification
            {
             before(grammarAccess.getPersonneAccess().getTexteQualificationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getTexteQualificationParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Personne__TexteAssignment_7"


    // $ANTLR start "rule__Personne__InteractionAssignment_8"
    // InternalENIGMA.g:4874:1: rule__Personne__InteractionAssignment_8 : ( ruleInteraction ) ;
    public final void rule__Personne__InteractionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4878:1: ( ( ruleInteraction ) )
            // InternalENIGMA.g:4879:2: ( ruleInteraction )
            {
            // InternalENIGMA.g:4879:2: ( ruleInteraction )
            // InternalENIGMA.g:4880:3: ruleInteraction
            {
             before(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleInteraction();

            state._fsp--;

             after(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Personne__InteractionAssignment_8"


    // $ANTLR start "rule__Lieu__NameAssignment_1"
    // InternalENIGMA.g:4889:1: rule__Lieu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lieu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4893:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:4894:2: ( RULE_ID )
            {
            // InternalENIGMA.g:4894:2: ( RULE_ID )
            // InternalENIGMA.g:4895:3: RULE_ID
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


    // $ANTLR start "rule__Lieu__PersonnesAssignment_3_2"
    // InternalENIGMA.g:4904:1: rule__Lieu__PersonnesAssignment_3_2 : ( rulePersonne ) ;
    public final void rule__Lieu__PersonnesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4908:1: ( ( rulePersonne ) )
            // InternalENIGMA.g:4909:2: ( rulePersonne )
            {
            // InternalENIGMA.g:4909:2: ( rulePersonne )
            // InternalENIGMA.g:4910:3: rulePersonne
            {
             before(grammarAccess.getLieuAccess().getPersonnesPersonneParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePersonne();

            state._fsp--;

             after(grammarAccess.getLieuAccess().getPersonnesPersonneParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Lieu__PersonnesAssignment_3_2"


    // $ANTLR start "rule__Chemin__EtatcAssignment_1"
    // InternalENIGMA.g:4919:1: rule__Chemin__EtatcAssignment_1 : ( ruleEtatChemin ) ;
    public final void rule__Chemin__EtatcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4923:1: ( ( ruleEtatChemin ) )
            // InternalENIGMA.g:4924:2: ( ruleEtatChemin )
            {
            // InternalENIGMA.g:4924:2: ( ruleEtatChemin )
            // InternalENIGMA.g:4925:3: ruleEtatChemin
            {
             before(grammarAccess.getCheminAccess().getEtatcEtatCheminEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEtatChemin();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getEtatcEtatCheminEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Chemin__EtatcAssignment_1"


    // $ANTLR start "rule__Chemin__ConditioncAssignment_2"
    // InternalENIGMA.g:4934:1: rule__Chemin__ConditioncAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ConditioncAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4938:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:4939:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:4939:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:4940:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getConditioncConditionCrossReference_2_0()); 
            // InternalENIGMA.g:4941:3: ( RULE_ID )
            // InternalENIGMA.g:4942:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getConditioncConditionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getConditioncConditionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getConditioncConditionCrossReference_2_0()); 

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
    // $ANTLR end "rule__Chemin__ConditioncAssignment_2"


    // $ANTLR start "rule__Chemin__EtatoAssignment_3"
    // InternalENIGMA.g:4953:1: rule__Chemin__EtatoAssignment_3 : ( ruleEtatObligation ) ;
    public final void rule__Chemin__EtatoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4957:1: ( ( ruleEtatObligation ) )
            // InternalENIGMA.g:4958:2: ( ruleEtatObligation )
            {
            // InternalENIGMA.g:4958:2: ( ruleEtatObligation )
            // InternalENIGMA.g:4959:3: ruleEtatObligation
            {
             before(grammarAccess.getCheminAccess().getEtatoEtatObligationEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEtatObligation();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getEtatoEtatObligationEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Chemin__EtatoAssignment_3"


    // $ANTLR start "rule__Chemin__ConditionoAssignment_4"
    // InternalENIGMA.g:4968:1: rule__Chemin__ConditionoAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ConditionoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4972:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:4973:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:4973:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:4974:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getConditionoConditionCrossReference_4_0()); 
            // InternalENIGMA.g:4975:3: ( RULE_ID )
            // InternalENIGMA.g:4976:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getConditionoConditionIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getConditionoConditionIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getConditionoConditionCrossReference_4_0()); 

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
    // $ANTLR end "rule__Chemin__ConditionoAssignment_4"


    // $ANTLR start "rule__Chemin__EtatvAssignment_5"
    // InternalENIGMA.g:4987:1: rule__Chemin__EtatvAssignment_5 : ( ruleEtatVisibilite ) ;
    public final void rule__Chemin__EtatvAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:4991:1: ( ( ruleEtatVisibilite ) )
            // InternalENIGMA.g:4992:2: ( ruleEtatVisibilite )
            {
            // InternalENIGMA.g:4992:2: ( ruleEtatVisibilite )
            // InternalENIGMA.g:4993:3: ruleEtatVisibilite
            {
             before(grammarAccess.getCheminAccess().getEtatvEtatVisibiliteEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEtatVisibilite();

            state._fsp--;

             after(grammarAccess.getCheminAccess().getEtatvEtatVisibiliteEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Chemin__EtatvAssignment_5"


    // $ANTLR start "rule__Chemin__ConditionvAssignment_6"
    // InternalENIGMA.g:5002:1: rule__Chemin__ConditionvAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__ConditionvAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5006:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:5007:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:5007:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:5008:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getConditionvConditionCrossReference_6_0()); 
            // InternalENIGMA.g:5009:3: ( RULE_ID )
            // InternalENIGMA.g:5010:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getConditionvConditionIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getConditionvConditionIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getConditionvConditionCrossReference_6_0()); 

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
    // $ANTLR end "rule__Chemin__ConditionvAssignment_6"


    // $ANTLR start "rule__Chemin__PrecedentAssignment_8"
    // InternalENIGMA.g:5021:1: rule__Chemin__PrecedentAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__PrecedentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5025:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:5026:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:5026:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:5027:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getPrecedentLieuCrossReference_8_0()); 
            // InternalENIGMA.g:5028:3: ( RULE_ID )
            // InternalENIGMA.g:5029:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getPrecedentLieuIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getPrecedentLieuIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getPrecedentLieuCrossReference_8_0()); 

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
    // $ANTLR end "rule__Chemin__PrecedentAssignment_8"


    // $ANTLR start "rule__Chemin__SuivantAssignment_10"
    // InternalENIGMA.g:5040:1: rule__Chemin__SuivantAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Chemin__SuivantAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5044:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:5045:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:5045:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:5046:3: ( RULE_ID )
            {
             before(grammarAccess.getCheminAccess().getSuivantLieuCrossReference_10_0()); 
            // InternalENIGMA.g:5047:3: ( RULE_ID )
            // InternalENIGMA.g:5048:4: RULE_ID
            {
             before(grammarAccess.getCheminAccess().getSuivantLieuIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCheminAccess().getSuivantLieuIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getCheminAccess().getSuivantLieuCrossReference_10_0()); 

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
    // $ANTLR end "rule__Chemin__SuivantAssignment_10"


    // $ANTLR start "rule__Qualification__QualificationAssignment"
    // InternalENIGMA.g:5059:1: rule__Qualification__QualificationAssignment : ( RULE_STRING ) ;
    public final void rule__Qualification__QualificationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5063:1: ( ( RULE_STRING ) )
            // InternalENIGMA.g:5064:2: ( RULE_STRING )
            {
            // InternalENIGMA.g:5064:2: ( RULE_STRING )
            // InternalENIGMA.g:5065:3: RULE_STRING
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


    // $ANTLR start "rule__Action__NameAssignment_1"
    // InternalENIGMA.g:5074:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5078:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:5079:2: ( RULE_ID )
            {
            // InternalENIGMA.g:5079:2: ( RULE_ID )
            // InternalENIGMA.g:5080:3: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Action__NameAssignment_1"


    // $ANTLR start "rule__Action__ObjetsconsommablesAssignment_6"
    // InternalENIGMA.g:5089:1: rule__Action__ObjetsconsommablesAssignment_6 : ( ruleObjet ) ;
    public final void rule__Action__ObjetsconsommablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5093:1: ( ( ruleObjet ) )
            // InternalENIGMA.g:5094:2: ( ruleObjet )
            {
            // InternalENIGMA.g:5094:2: ( ruleObjet )
            // InternalENIGMA.g:5095:3: ruleObjet
            {
             before(grammarAccess.getActionAccess().getObjetsconsommablesObjetParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getActionAccess().getObjetsconsommablesObjetParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Action__ObjetsconsommablesAssignment_6"


    // $ANTLR start "rule__Action__ObjetsattribuablesAssignment_11"
    // InternalENIGMA.g:5104:1: rule__Action__ObjetsattribuablesAssignment_11 : ( ruleObjet ) ;
    public final void rule__Action__ObjetsattribuablesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5108:1: ( ( ruleObjet ) )
            // InternalENIGMA.g:5109:2: ( ruleObjet )
            {
            // InternalENIGMA.g:5109:2: ( ruleObjet )
            // InternalENIGMA.g:5110:3: ruleObjet
            {
             before(grammarAccess.getActionAccess().getObjetsattribuablesObjetParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getActionAccess().getObjetsattribuablesObjetParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Action__ObjetsattribuablesAssignment_11"


    // $ANTLR start "rule__Action__ConnaissancesattribuablesAssignment_16"
    // InternalENIGMA.g:5119:1: rule__Action__ConnaissancesattribuablesAssignment_16 : ( ( RULE_ID ) ) ;
    public final void rule__Action__ConnaissancesattribuablesAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5123:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:5124:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:5124:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:5125:3: ( RULE_ID )
            {
             before(grammarAccess.getActionAccess().getConnaissancesattribuablesConnaissanceCrossReference_16_0()); 
            // InternalENIGMA.g:5126:3: ( RULE_ID )
            // InternalENIGMA.g:5127:4: RULE_ID
            {
             before(grammarAccess.getActionAccess().getConnaissancesattribuablesConnaissanceIDTerminalRuleCall_16_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getConnaissancesattribuablesConnaissanceIDTerminalRuleCall_16_0_1()); 

            }

             after(grammarAccess.getActionAccess().getConnaissancesattribuablesConnaissanceCrossReference_16_0()); 

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
    // $ANTLR end "rule__Action__ConnaissancesattribuablesAssignment_16"


    // $ANTLR start "rule__Reponse__NameAssignment_2"
    // InternalENIGMA.g:5138:1: rule__Reponse__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Reponse__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5142:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:5143:2: ( RULE_ID )
            {
            // InternalENIGMA.g:5143:2: ( RULE_ID )
            // InternalENIGMA.g:5144:3: RULE_ID
            {
             before(grammarAccess.getReponseAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Reponse__NameAssignment_2"


    // $ANTLR start "rule__Reponse__TexteAssignment_5"
    // InternalENIGMA.g:5153:1: rule__Reponse__TexteAssignment_5 : ( ruleQualification ) ;
    public final void rule__Reponse__TexteAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5157:1: ( ( ruleQualification ) )
            // InternalENIGMA.g:5158:2: ( ruleQualification )
            {
            // InternalENIGMA.g:5158:2: ( ruleQualification )
            // InternalENIGMA.g:5159:3: ruleQualification
            {
             before(grammarAccess.getReponseAccess().getTexteQualificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleQualification();

            state._fsp--;

             after(grammarAccess.getReponseAccess().getTexteQualificationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Reponse__TexteAssignment_5"


    // $ANTLR start "rule__Reponse__ActionAssignment_7"
    // InternalENIGMA.g:5168:1: rule__Reponse__ActionAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Reponse__ActionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5172:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:5173:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:5173:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:5174:3: ( RULE_ID )
            {
             before(grammarAccess.getReponseAccess().getActionActionCrossReference_7_0()); 
            // InternalENIGMA.g:5175:3: ( RULE_ID )
            // InternalENIGMA.g:5176:4: RULE_ID
            {
             before(grammarAccess.getReponseAccess().getActionActionIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getActionActionIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getReponseAccess().getActionActionCrossReference_7_0()); 

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
    // $ANTLR end "rule__Reponse__ActionAssignment_7"


    // $ANTLR start "rule__Condition__NameAssignment_1"
    // InternalENIGMA.g:5187:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5191:1: ( ( RULE_ID ) )
            // InternalENIGMA.g:5192:2: ( RULE_ID )
            {
            // InternalENIGMA.g:5192:2: ( RULE_ID )
            // InternalENIGMA.g:5193:3: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Condition__NameAssignment_1"


    // $ANTLR start "rule__Condition__ObjetsRequisAssignment_5"
    // InternalENIGMA.g:5202:1: rule__Condition__ObjetsRequisAssignment_5 : ( ruleObjet ) ;
    public final void rule__Condition__ObjetsRequisAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5206:1: ( ( ruleObjet ) )
            // InternalENIGMA.g:5207:2: ( ruleObjet )
            {
            // InternalENIGMA.g:5207:2: ( ruleObjet )
            // InternalENIGMA.g:5208:3: ruleObjet
            {
             before(grammarAccess.getConditionAccess().getObjetsRequisObjetParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleObjet();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getObjetsRequisObjetParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Condition__ObjetsRequisAssignment_5"


    // $ANTLR start "rule__Condition__ConnaissancesRequisesAssignment_9"
    // InternalENIGMA.g:5217:1: rule__Condition__ConnaissancesRequisesAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Condition__ConnaissancesRequisesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalENIGMA.g:5221:1: ( ( ( RULE_ID ) ) )
            // InternalENIGMA.g:5222:2: ( ( RULE_ID ) )
            {
            // InternalENIGMA.g:5222:2: ( ( RULE_ID ) )
            // InternalENIGMA.g:5223:3: ( RULE_ID )
            {
             before(grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceCrossReference_9_0()); 
            // InternalENIGMA.g:5224:3: ( RULE_ID )
            // InternalENIGMA.g:5225:4: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceCrossReference_9_0()); 

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
    // $ANTLR end "rule__Condition__ConnaissancesRequisesAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0011574214600000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0011574214400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});

}