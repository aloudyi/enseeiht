package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.services.ENIGMAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalENIGMAParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'jeu'", "'{'", "'}'", "'joueur'", "'limite'", "'objets'", "'connaissances'", "'connaissance'", "'etat'", "'objet'", "'occurrence'", "','", "'de'", "'taille'", "'territoire'", "'depart'", "'milieu'", "'fin'", "'chemins'", "'choix'", "'conditions'", "'interaction'", "'personne'", "'lieu'", "'personnes'", "'chemin'", "'a'", "'action'", "'c'", "'reponse'", "'>>'", "'qualification'", "'avec'", "'condition'", "'obj'", "'con'", "'possede'", "'npossede'", "'visible'", "'nvisible'", "'obligatoire'", "'nobligatoire'", "'ouvert'", "'ferme'"
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

        public InternalENIGMAParser(TokenStream input, ENIGMAGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Jeu";
       	}

       	@Override
       	protected ENIGMAGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJeu"
    // InternalENIGMA.g:65:1: entryRuleJeu returns [EObject current=null] : iv_ruleJeu= ruleJeu EOF ;
    public final EObject entryRuleJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeu = null;


        try {
            // InternalENIGMA.g:65:44: (iv_ruleJeu= ruleJeu EOF )
            // InternalENIGMA.g:66:2: iv_ruleJeu= ruleJeu EOF
            {
             newCompositeNode(grammarAccess.getJeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJeu=ruleJeu();

            state._fsp--;

             current =iv_ruleJeu; 
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
    // $ANTLR end "entryRuleJeu"


    // $ANTLR start "ruleJeu"
    // InternalENIGMA.g:72:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_jeuelement_3_0= ruleJeuElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_jeuelement_3_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:78:2: ( (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_jeuelement_3_0= ruleJeuElement ) )* otherlv_4= '}' ) )
            // InternalENIGMA.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_jeuelement_3_0= ruleJeuElement ) )* otherlv_4= '}' )
            {
            // InternalENIGMA.g:79:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_jeuelement_3_0= ruleJeuElement ) )* otherlv_4= '}' )
            // InternalENIGMA.g:80:3: otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_jeuelement_3_0= ruleJeuElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
            		
            // InternalENIGMA.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJeuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJeuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getJeuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalENIGMA.g:106:3: ( (lv_jeuelement_3_0= ruleJeuElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==18||LA1_0==20||LA1_0==25||LA1_0==30||(LA1_0>=32 && LA1_0<=34)||LA1_0==36||LA1_0==38||LA1_0==40||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalENIGMA.g:107:4: (lv_jeuelement_3_0= ruleJeuElement )
            	    {
            	    // InternalENIGMA.g:107:4: (lv_jeuelement_3_0= ruleJeuElement )
            	    // InternalENIGMA.g:108:5: lv_jeuelement_3_0= ruleJeuElement
            	    {

            	    					newCompositeNode(grammarAccess.getJeuAccess().getJeuelementJeuElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_jeuelement_3_0=ruleJeuElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJeuRule());
            	    					}
            	    					add(
            	    						current,
            	    						"jeuelement",
            	    						lv_jeuelement_3_0,
            	    						"fr.n7.ENIGMA.JeuElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleJeu"


    // $ANTLR start "entryRuleJeuElement"
    // InternalENIGMA.g:133:1: entryRuleJeuElement returns [EObject current=null] : iv_ruleJeuElement= ruleJeuElement EOF ;
    public final EObject entryRuleJeuElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeuElement = null;


        try {
            // InternalENIGMA.g:133:51: (iv_ruleJeuElement= ruleJeuElement EOF )
            // InternalENIGMA.g:134:2: iv_ruleJeuElement= ruleJeuElement EOF
            {
             newCompositeNode(grammarAccess.getJeuElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJeuElement=ruleJeuElement();

            state._fsp--;

             current =iv_ruleJeuElement; 
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
    // $ANTLR end "entryRuleJeuElement"


    // $ANTLR start "ruleJeuElement"
    // InternalENIGMA.g:140:1: ruleJeuElement returns [EObject current=null] : (this_Territoire_0= ruleTerritoire | this_Joueur_1= ruleJoueur | this_Objet_2= ruleObjet | this_Choix_3= ruleChoix | this_Connaissance_4= ruleConnaissance | this_Lieu_5= ruleLieu | this_Reponse_6= ruleReponse | this_Action_7= ruleAction | this_Interaction_8= ruleInteraction | this_Personne_9= rulePersonne | this_Chemin_10= ruleChemin | this_Condition_11= ruleCondition ) ;
    public final EObject ruleJeuElement() throws RecognitionException {
        EObject current = null;

        EObject this_Territoire_0 = null;

        EObject this_Joueur_1 = null;

        EObject this_Objet_2 = null;

        EObject this_Choix_3 = null;

        EObject this_Connaissance_4 = null;

        EObject this_Lieu_5 = null;

        EObject this_Reponse_6 = null;

        EObject this_Action_7 = null;

        EObject this_Interaction_8 = null;

        EObject this_Personne_9 = null;

        EObject this_Chemin_10 = null;

        EObject this_Condition_11 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:146:2: ( (this_Territoire_0= ruleTerritoire | this_Joueur_1= ruleJoueur | this_Objet_2= ruleObjet | this_Choix_3= ruleChoix | this_Connaissance_4= ruleConnaissance | this_Lieu_5= ruleLieu | this_Reponse_6= ruleReponse | this_Action_7= ruleAction | this_Interaction_8= ruleInteraction | this_Personne_9= rulePersonne | this_Chemin_10= ruleChemin | this_Condition_11= ruleCondition ) )
            // InternalENIGMA.g:147:2: (this_Territoire_0= ruleTerritoire | this_Joueur_1= ruleJoueur | this_Objet_2= ruleObjet | this_Choix_3= ruleChoix | this_Connaissance_4= ruleConnaissance | this_Lieu_5= ruleLieu | this_Reponse_6= ruleReponse | this_Action_7= ruleAction | this_Interaction_8= ruleInteraction | this_Personne_9= rulePersonne | this_Chemin_10= ruleChemin | this_Condition_11= ruleCondition )
            {
            // InternalENIGMA.g:147:2: (this_Territoire_0= ruleTerritoire | this_Joueur_1= ruleJoueur | this_Objet_2= ruleObjet | this_Choix_3= ruleChoix | this_Connaissance_4= ruleConnaissance | this_Lieu_5= ruleLieu | this_Reponse_6= ruleReponse | this_Action_7= ruleAction | this_Interaction_8= ruleInteraction | this_Personne_9= rulePersonne | this_Chemin_10= ruleChemin | this_Condition_11= ruleCondition )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 34:
                {
                alt2=6;
                }
                break;
            case 40:
                {
                alt2=7;
                }
                break;
            case 38:
                {
                alt2=8;
                }
                break;
            case 32:
                {
                alt2=9;
                }
                break;
            case 33:
                {
                alt2=10;
                }
                break;
            case 36:
                {
                alt2=11;
                }
                break;
            case 44:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalENIGMA.g:148:3: this_Territoire_0= ruleTerritoire
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getTerritoireParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Territoire_0=ruleTerritoire();

                    state._fsp--;


                    			current = this_Territoire_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:157:3: this_Joueur_1= ruleJoueur
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getJoueurParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Joueur_1=ruleJoueur();

                    state._fsp--;


                    			current = this_Joueur_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalENIGMA.g:166:3: this_Objet_2= ruleObjet
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getObjetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Objet_2=ruleObjet();

                    state._fsp--;


                    			current = this_Objet_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalENIGMA.g:175:3: this_Choix_3= ruleChoix
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getChoixParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choix_3=ruleChoix();

                    state._fsp--;


                    			current = this_Choix_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalENIGMA.g:184:3: this_Connaissance_4= ruleConnaissance
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getConnaissanceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connaissance_4=ruleConnaissance();

                    state._fsp--;


                    			current = this_Connaissance_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalENIGMA.g:193:3: this_Lieu_5= ruleLieu
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getLieuParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lieu_5=ruleLieu();

                    state._fsp--;


                    			current = this_Lieu_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalENIGMA.g:202:3: this_Reponse_6= ruleReponse
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getReponseParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reponse_6=ruleReponse();

                    state._fsp--;


                    			current = this_Reponse_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalENIGMA.g:211:3: this_Action_7= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getActionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_7=ruleAction();

                    state._fsp--;


                    			current = this_Action_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalENIGMA.g:220:3: this_Interaction_8= ruleInteraction
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getInteractionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interaction_8=ruleInteraction();

                    state._fsp--;


                    			current = this_Interaction_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalENIGMA.g:229:3: this_Personne_9= rulePersonne
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getPersonneParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Personne_9=rulePersonne();

                    state._fsp--;


                    			current = this_Personne_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalENIGMA.g:238:3: this_Chemin_10= ruleChemin
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getCheminParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Chemin_10=ruleChemin();

                    state._fsp--;


                    			current = this_Chemin_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalENIGMA.g:247:3: this_Condition_11= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getJeuElementAccess().getConditionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_11=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleJeuElement"


    // $ANTLR start "entryRuleJoueur"
    // InternalENIGMA.g:259:1: entryRuleJoueur returns [EObject current=null] : iv_ruleJoueur= ruleJoueur EOF ;
    public final EObject entryRuleJoueur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoueur = null;


        try {
            // InternalENIGMA.g:259:47: (iv_ruleJoueur= ruleJoueur EOF )
            // InternalENIGMA.g:260:2: iv_ruleJoueur= ruleJoueur EOF
            {
             newCompositeNode(grammarAccess.getJoueurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoueur=ruleJoueur();

            state._fsp--;

             current =iv_ruleJoueur; 
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
    // $ANTLR end "entryRuleJoueur"


    // $ANTLR start "ruleJoueur"
    // InternalENIGMA.g:266:1: ruleJoueur returns [EObject current=null] : (otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'limite' ( (lv_limite_4_0= RULE_INT ) ) otherlv_5= 'objets' otherlv_6= '{' ( (lv_objets_7_0= ruleObjet ) )* otherlv_8= '}' otherlv_9= 'connaissances' otherlv_10= '{' ( (lv_connaissances_11_0= ruleConnaissance ) )* otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleJoueur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_limite_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_objets_7_0 = null;

        EObject lv_connaissances_11_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:272:2: ( (otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'limite' ( (lv_limite_4_0= RULE_INT ) ) otherlv_5= 'objets' otherlv_6= '{' ( (lv_objets_7_0= ruleObjet ) )* otherlv_8= '}' otherlv_9= 'connaissances' otherlv_10= '{' ( (lv_connaissances_11_0= ruleConnaissance ) )* otherlv_12= '}' otherlv_13= '}' ) )
            // InternalENIGMA.g:273:2: (otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'limite' ( (lv_limite_4_0= RULE_INT ) ) otherlv_5= 'objets' otherlv_6= '{' ( (lv_objets_7_0= ruleObjet ) )* otherlv_8= '}' otherlv_9= 'connaissances' otherlv_10= '{' ( (lv_connaissances_11_0= ruleConnaissance ) )* otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalENIGMA.g:273:2: (otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'limite' ( (lv_limite_4_0= RULE_INT ) ) otherlv_5= 'objets' otherlv_6= '{' ( (lv_objets_7_0= ruleObjet ) )* otherlv_8= '}' otherlv_9= 'connaissances' otherlv_10= '{' ( (lv_connaissances_11_0= ruleConnaissance ) )* otherlv_12= '}' otherlv_13= '}' )
            // InternalENIGMA.g:274:3: otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'limite' ( (lv_limite_4_0= RULE_INT ) ) otherlv_5= 'objets' otherlv_6= '{' ( (lv_objets_7_0= ruleObjet ) )* otherlv_8= '}' otherlv_9= 'connaissances' otherlv_10= '{' ( (lv_connaissances_11_0= ruleConnaissance ) )* otherlv_12= '}' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJoueurAccess().getJoueurKeyword_0());
            		
            // InternalENIGMA.g:278:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:279:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:279:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:280:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJoueurAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoueurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getJoueurAccess().getLimiteKeyword_3());
            		
            // InternalENIGMA.g:304:3: ( (lv_limite_4_0= RULE_INT ) )
            // InternalENIGMA.g:305:4: (lv_limite_4_0= RULE_INT )
            {
            // InternalENIGMA.g:305:4: (lv_limite_4_0= RULE_INT )
            // InternalENIGMA.g:306:5: lv_limite_4_0= RULE_INT
            {
            lv_limite_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_limite_4_0, grammarAccess.getJoueurAccess().getLimiteINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoueurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"limite",
            						lv_limite_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getJoueurAccess().getObjetsKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalENIGMA.g:330:3: ( (lv_objets_7_0= ruleObjet ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalENIGMA.g:331:4: (lv_objets_7_0= ruleObjet )
            	    {
            	    // InternalENIGMA.g:331:4: (lv_objets_7_0= ruleObjet )
            	    // InternalENIGMA.g:332:5: lv_objets_7_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getJoueurAccess().getObjetsObjetParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_objets_7_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJoueurRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objets",
            	    						lv_objets_7_0,
            	    						"fr.n7.ENIGMA.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getJoueurAccess().getConnaissancesKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalENIGMA.g:361:3: ( (lv_connaissances_11_0= ruleConnaissance ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalENIGMA.g:362:4: (lv_connaissances_11_0= ruleConnaissance )
            	    {
            	    // InternalENIGMA.g:362:4: (lv_connaissances_11_0= ruleConnaissance )
            	    // InternalENIGMA.g:363:5: lv_connaissances_11_0= ruleConnaissance
            	    {

            	    					newCompositeNode(grammarAccess.getJoueurAccess().getConnaissancesConnaissanceParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_connaissances_11_0=ruleConnaissance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJoueurRule());
            	    					}
            	    					add(
            	    						current,
            	    						"connaissances",
            	    						lv_connaissances_11_0,
            	    						"fr.n7.ENIGMA.Connaissance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleJoueur"


    // $ANTLR start "entryRuleConnaissance"
    // InternalENIGMA.g:392:1: entryRuleConnaissance returns [EObject current=null] : iv_ruleConnaissance= ruleConnaissance EOF ;
    public final EObject entryRuleConnaissance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnaissance = null;


        try {
            // InternalENIGMA.g:392:53: (iv_ruleConnaissance= ruleConnaissance EOF )
            // InternalENIGMA.g:393:2: iv_ruleConnaissance= ruleConnaissance EOF
            {
             newCompositeNode(grammarAccess.getConnaissanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnaissance=ruleConnaissance();

            state._fsp--;

             current =iv_ruleConnaissance; 
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
    // $ANTLR end "entryRuleConnaissance"


    // $ANTLR start "ruleConnaissance"
    // InternalENIGMA.g:399:1: ruleConnaissance returns [EObject current=null] : (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qualification_2_0= ruleQualification ) ) otherlv_3= 'etat' ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (lv_etatp_5_0= ruleEtatPossession ) ) ) ;
    public final EObject ruleConnaissance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_qualification_2_0 = null;

        Enumerator lv_etatv_4_0 = null;

        Enumerator lv_etatp_5_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:405:2: ( (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qualification_2_0= ruleQualification ) ) otherlv_3= 'etat' ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (lv_etatp_5_0= ruleEtatPossession ) ) ) )
            // InternalENIGMA.g:406:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qualification_2_0= ruleQualification ) ) otherlv_3= 'etat' ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (lv_etatp_5_0= ruleEtatPossession ) ) )
            {
            // InternalENIGMA.g:406:2: (otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qualification_2_0= ruleQualification ) ) otherlv_3= 'etat' ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (lv_etatp_5_0= ruleEtatPossession ) ) )
            // InternalENIGMA.g:407:3: otherlv_0= 'connaissance' ( (lv_name_1_0= RULE_ID ) ) ( (lv_qualification_2_0= ruleQualification ) ) otherlv_3= 'etat' ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (lv_etatp_5_0= ruleEtatPossession ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConnaissanceAccess().getConnaissanceKeyword_0());
            		
            // InternalENIGMA.g:411:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:412:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:412:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:413:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConnaissanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnaissanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalENIGMA.g:429:3: ( (lv_qualification_2_0= ruleQualification ) )
            // InternalENIGMA.g:430:4: (lv_qualification_2_0= ruleQualification )
            {
            // InternalENIGMA.g:430:4: (lv_qualification_2_0= ruleQualification )
            // InternalENIGMA.g:431:5: lv_qualification_2_0= ruleQualification
            {

            					newCompositeNode(grammarAccess.getConnaissanceAccess().getQualificationQualificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_qualification_2_0=ruleQualification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnaissanceRule());
            					}
            					set(
            						current,
            						"qualification",
            						lv_qualification_2_0,
            						"fr.n7.ENIGMA.Qualification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getConnaissanceAccess().getEtatKeyword_3());
            		
            // InternalENIGMA.g:452:3: ( (lv_etatv_4_0= ruleEtatVisibilite ) )
            // InternalENIGMA.g:453:4: (lv_etatv_4_0= ruleEtatVisibilite )
            {
            // InternalENIGMA.g:453:4: (lv_etatv_4_0= ruleEtatVisibilite )
            // InternalENIGMA.g:454:5: lv_etatv_4_0= ruleEtatVisibilite
            {

            					newCompositeNode(grammarAccess.getConnaissanceAccess().getEtatvEtatVisibiliteEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_etatv_4_0=ruleEtatVisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnaissanceRule());
            					}
            					set(
            						current,
            						"etatv",
            						lv_etatv_4_0,
            						"fr.n7.ENIGMA.EtatVisibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:471:3: ( (lv_etatp_5_0= ruleEtatPossession ) )
            // InternalENIGMA.g:472:4: (lv_etatp_5_0= ruleEtatPossession )
            {
            // InternalENIGMA.g:472:4: (lv_etatp_5_0= ruleEtatPossession )
            // InternalENIGMA.g:473:5: lv_etatp_5_0= ruleEtatPossession
            {

            					newCompositeNode(grammarAccess.getConnaissanceAccess().getEtatpEtatPossessionEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_etatp_5_0=ruleEtatPossession();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnaissanceRule());
            					}
            					set(
            						current,
            						"etatp",
            						lv_etatp_5_0,
            						"fr.n7.ENIGMA.EtatPossession");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleConnaissance"


    // $ANTLR start "entryRuleObjet"
    // InternalENIGMA.g:494:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalENIGMA.g:494:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalENIGMA.g:495:2: iv_ruleObjet= ruleObjet EOF
            {
             newCompositeNode(grammarAccess.getObjetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjet=ruleObjet();

            state._fsp--;

             current =iv_ruleObjet; 
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
    // $ANTLR end "entryRuleObjet"


    // $ANTLR start "ruleObjet"
    // InternalENIGMA.g:501:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'occurrence' ( (lv_occurrence_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'de' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) otherlv_8= 'etat' ( (lv_etatv_9_0= ruleEtatVisibilite ) ) ( (lv_etatp_10_0= ruleEtatPossession ) ) ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_occurrence_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_taille_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_etatv_9_0 = null;

        Enumerator lv_etatp_10_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:507:2: ( (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'occurrence' ( (lv_occurrence_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'de' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) otherlv_8= 'etat' ( (lv_etatv_9_0= ruleEtatVisibilite ) ) ( (lv_etatp_10_0= ruleEtatPossession ) ) ) )
            // InternalENIGMA.g:508:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'occurrence' ( (lv_occurrence_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'de' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) otherlv_8= 'etat' ( (lv_etatv_9_0= ruleEtatVisibilite ) ) ( (lv_etatp_10_0= ruleEtatPossession ) ) )
            {
            // InternalENIGMA.g:508:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'occurrence' ( (lv_occurrence_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'de' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) otherlv_8= 'etat' ( (lv_etatv_9_0= ruleEtatVisibilite ) ) ( (lv_etatp_10_0= ruleEtatPossession ) ) )
            // InternalENIGMA.g:509:3: otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'occurrence' ( (lv_occurrence_3_0= RULE_INT ) ) otherlv_4= ',' otherlv_5= 'de' otherlv_6= 'taille' ( (lv_taille_7_0= RULE_INT ) ) otherlv_8= 'etat' ( (lv_etatv_9_0= ruleEtatVisibilite ) ) ( (lv_etatp_10_0= ruleEtatPossession ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalENIGMA.g:513:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:514:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:514:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:515:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObjetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getOccurrenceKeyword_2());
            		
            // InternalENIGMA.g:535:3: ( (lv_occurrence_3_0= RULE_INT ) )
            // InternalENIGMA.g:536:4: (lv_occurrence_3_0= RULE_INT )
            {
            // InternalENIGMA.g:536:4: (lv_occurrence_3_0= RULE_INT )
            // InternalENIGMA.g:537:5: lv_occurrence_3_0= RULE_INT
            {
            lv_occurrence_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_occurrence_3_0, grammarAccess.getObjetAccess().getOccurrenceINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"occurrence",
            						lv_occurrence_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getObjetAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getObjetAccess().getDeKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getObjetAccess().getTailleKeyword_6());
            		
            // InternalENIGMA.g:565:3: ( (lv_taille_7_0= RULE_INT ) )
            // InternalENIGMA.g:566:4: (lv_taille_7_0= RULE_INT )
            {
            // InternalENIGMA.g:566:4: (lv_taille_7_0= RULE_INT )
            // InternalENIGMA.g:567:5: lv_taille_7_0= RULE_INT
            {
            lv_taille_7_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_taille_7_0, grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getObjetAccess().getEtatKeyword_8());
            		
            // InternalENIGMA.g:587:3: ( (lv_etatv_9_0= ruleEtatVisibilite ) )
            // InternalENIGMA.g:588:4: (lv_etatv_9_0= ruleEtatVisibilite )
            {
            // InternalENIGMA.g:588:4: (lv_etatv_9_0= ruleEtatVisibilite )
            // InternalENIGMA.g:589:5: lv_etatv_9_0= ruleEtatVisibilite
            {

            					newCompositeNode(grammarAccess.getObjetAccess().getEtatvEtatVisibiliteEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_16);
            lv_etatv_9_0=ruleEtatVisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjetRule());
            					}
            					set(
            						current,
            						"etatv",
            						lv_etatv_9_0,
            						"fr.n7.ENIGMA.EtatVisibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:606:3: ( (lv_etatp_10_0= ruleEtatPossession ) )
            // InternalENIGMA.g:607:4: (lv_etatp_10_0= ruleEtatPossession )
            {
            // InternalENIGMA.g:607:4: (lv_etatp_10_0= ruleEtatPossession )
            // InternalENIGMA.g:608:5: lv_etatp_10_0= ruleEtatPossession
            {

            					newCompositeNode(grammarAccess.getObjetAccess().getEtatpEtatPossessionEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_2);
            lv_etatp_10_0=ruleEtatPossession();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjetRule());
            					}
            					set(
            						current,
            						"etatp",
            						lv_etatp_10_0,
            						"fr.n7.ENIGMA.EtatPossession");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleObjet"


    // $ANTLR start "entryRuleTerritoire"
    // InternalENIGMA.g:629:1: entryRuleTerritoire returns [EObject current=null] : iv_ruleTerritoire= ruleTerritoire EOF ;
    public final EObject entryRuleTerritoire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerritoire = null;


        try {
            // InternalENIGMA.g:629:51: (iv_ruleTerritoire= ruleTerritoire EOF )
            // InternalENIGMA.g:630:2: iv_ruleTerritoire= ruleTerritoire EOF
            {
             newCompositeNode(grammarAccess.getTerritoireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerritoire=ruleTerritoire();

            state._fsp--;

             current =iv_ruleTerritoire; 
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
    // $ANTLR end "entryRuleTerritoire"


    // $ANTLR start "ruleTerritoire"
    // InternalENIGMA.g:636:1: ruleTerritoire returns [EObject current=null] : (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'depart' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'milieu' otherlv_6= '{' ( (lv_lieuxintermediaires_7_0= ruleLieu ) )* otherlv_8= '}' otherlv_9= 'fin' otherlv_10= '{' ( (lv_lieuxFin_11_0= ruleLieu ) )* otherlv_12= '}' otherlv_13= 'chemins' otherlv_14= '{' ( (lv_chemins_15_0= ruleChemin ) )* otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleTerritoire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_lieuDebut_4_0 = null;

        EObject lv_lieuxintermediaires_7_0 = null;

        EObject lv_lieuxFin_11_0 = null;

        EObject lv_chemins_15_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:642:2: ( (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'depart' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'milieu' otherlv_6= '{' ( (lv_lieuxintermediaires_7_0= ruleLieu ) )* otherlv_8= '}' otherlv_9= 'fin' otherlv_10= '{' ( (lv_lieuxFin_11_0= ruleLieu ) )* otherlv_12= '}' otherlv_13= 'chemins' otherlv_14= '{' ( (lv_chemins_15_0= ruleChemin ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // InternalENIGMA.g:643:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'depart' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'milieu' otherlv_6= '{' ( (lv_lieuxintermediaires_7_0= ruleLieu ) )* otherlv_8= '}' otherlv_9= 'fin' otherlv_10= '{' ( (lv_lieuxFin_11_0= ruleLieu ) )* otherlv_12= '}' otherlv_13= 'chemins' otherlv_14= '{' ( (lv_chemins_15_0= ruleChemin ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // InternalENIGMA.g:643:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'depart' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'milieu' otherlv_6= '{' ( (lv_lieuxintermediaires_7_0= ruleLieu ) )* otherlv_8= '}' otherlv_9= 'fin' otherlv_10= '{' ( (lv_lieuxFin_11_0= ruleLieu ) )* otherlv_12= '}' otherlv_13= 'chemins' otherlv_14= '{' ( (lv_chemins_15_0= ruleChemin ) )* otherlv_16= '}' otherlv_17= '}' )
            // InternalENIGMA.g:644:3: otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'depart' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'milieu' otherlv_6= '{' ( (lv_lieuxintermediaires_7_0= ruleLieu ) )* otherlv_8= '}' otherlv_9= 'fin' otherlv_10= '{' ( (lv_lieuxFin_11_0= ruleLieu ) )* otherlv_12= '}' otherlv_13= 'chemins' otherlv_14= '{' ( (lv_chemins_15_0= ruleChemin ) )* otherlv_16= '}' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTerritoireAccess().getTerritoireKeyword_0());
            		
            // InternalENIGMA.g:648:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:649:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:649:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:650:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTerritoireAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTerritoireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getTerritoireAccess().getDepartKeyword_3());
            		
            // InternalENIGMA.g:674:3: ( (lv_lieuDebut_4_0= ruleLieu ) )
            // InternalENIGMA.g:675:4: (lv_lieuDebut_4_0= ruleLieu )
            {
            // InternalENIGMA.g:675:4: (lv_lieuDebut_4_0= ruleLieu )
            // InternalENIGMA.g:676:5: lv_lieuDebut_4_0= ruleLieu
            {

            					newCompositeNode(grammarAccess.getTerritoireAccess().getLieuDebutLieuParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_lieuDebut_4_0=ruleLieu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            					}
            					set(
            						current,
            						"lieuDebut",
            						lv_lieuDebut_4_0,
            						"fr.n7.ENIGMA.Lieu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getTerritoireAccess().getMilieuKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalENIGMA.g:701:3: ( (lv_lieuxintermediaires_7_0= ruleLieu ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalENIGMA.g:702:4: (lv_lieuxintermediaires_7_0= ruleLieu )
            	    {
            	    // InternalENIGMA.g:702:4: (lv_lieuxintermediaires_7_0= ruleLieu )
            	    // InternalENIGMA.g:703:5: lv_lieuxintermediaires_7_0= ruleLieu
            	    {

            	    					newCompositeNode(grammarAccess.getTerritoireAccess().getLieuxintermediairesLieuParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_lieuxintermediaires_7_0=ruleLieu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lieuxintermediaires",
            	    						lv_lieuxintermediaires_7_0,
            	    						"fr.n7.ENIGMA.Lieu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_9=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getTerritoireAccess().getFinKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_10, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalENIGMA.g:732:3: ( (lv_lieuxFin_11_0= ruleLieu ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalENIGMA.g:733:4: (lv_lieuxFin_11_0= ruleLieu )
            	    {
            	    // InternalENIGMA.g:733:4: (lv_lieuxFin_11_0= ruleLieu )
            	    // InternalENIGMA.g:734:5: lv_lieuxFin_11_0= ruleLieu
            	    {

            	    					newCompositeNode(grammarAccess.getTerritoireAccess().getLieuxFinLieuParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_lieuxFin_11_0=ruleLieu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lieuxFin",
            	    						lv_lieuxFin_11_0,
            	    						"fr.n7.ENIGMA.Lieu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_12, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getTerritoireAccess().getCheminsKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_14, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalENIGMA.g:763:3: ( (lv_chemins_15_0= ruleChemin ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==36) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalENIGMA.g:764:4: (lv_chemins_15_0= ruleChemin )
            	    {
            	    // InternalENIGMA.g:764:4: (lv_chemins_15_0= ruleChemin )
            	    // InternalENIGMA.g:765:5: lv_chemins_15_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getTerritoireAccess().getCheminsCheminParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_chemins_15_0=ruleChemin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chemins",
            	    						lv_chemins_15_0,
            	    						"fr.n7.ENIGMA.Chemin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_16=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_16, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleTerritoire"


    // $ANTLR start "entryRuleChoix"
    // InternalENIGMA.g:794:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalENIGMA.g:794:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalENIGMA.g:795:2: iv_ruleChoix= ruleChoix EOF
            {
             newCompositeNode(grammarAccess.getChoixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoix=ruleChoix();

            state._fsp--;

             current =iv_ruleChoix; 
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
    // $ANTLR end "entryRuleChoix"


    // $ANTLR start "ruleChoix"
    // InternalENIGMA.g:801:1: ruleChoix returns [EObject current=null] : (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= 'conditions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_reponses_3_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:807:2: ( (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= 'conditions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalENIGMA.g:808:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= 'conditions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalENIGMA.g:808:2: (otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= 'conditions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalENIGMA.g:809:3: otherlv_0= 'choix' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= 'conditions' otherlv_5= '{' ( (otherlv_6= RULE_ID ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChoixAccess().getChoixKeyword_0());
            		
            // InternalENIGMA.g:813:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:814:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:814:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:815:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChoixAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoixRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalENIGMA.g:835:3: ( (lv_reponses_3_0= ruleReponse ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==40) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalENIGMA.g:836:4: (lv_reponses_3_0= ruleReponse )
            	    {
            	    // InternalENIGMA.g:836:4: (lv_reponses_3_0= ruleReponse )
            	    // InternalENIGMA.g:837:5: lv_reponses_3_0= ruleReponse
            	    {

            	    					newCompositeNode(grammarAccess.getChoixAccess().getReponsesReponseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_reponses_3_0=ruleReponse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChoixRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reponses",
            	    						lv_reponses_3_0,
            	    						"fr.n7.ENIGMA.Reponse");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getChoixAccess().getConditionsKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalENIGMA.g:862:3: ( (otherlv_6= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalENIGMA.g:863:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalENIGMA.g:863:4: (otherlv_6= RULE_ID )
            	    // InternalENIGMA.g:864:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getChoixRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    					newLeafNode(otherlv_6, grammarAccess.getChoixAccess().getConditionsConditionCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleChoix"


    // $ANTLR start "entryRuleInteraction"
    // InternalENIGMA.g:887:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalENIGMA.g:887:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalENIGMA.g:888:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalENIGMA.g:894:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) ) ( (lv_choixFin_4_0= ruleChoix ) ) otherlv_5= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_choix_3_0 = null;

        EObject lv_choixFin_4_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:900:2: ( (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) ) ( (lv_choixFin_4_0= ruleChoix ) ) otherlv_5= '}' ) )
            // InternalENIGMA.g:901:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) ) ( (lv_choixFin_4_0= ruleChoix ) ) otherlv_5= '}' )
            {
            // InternalENIGMA.g:901:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) ) ( (lv_choixFin_4_0= ruleChoix ) ) otherlv_5= '}' )
            // InternalENIGMA.g:902:3: otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) ) ( (lv_choixFin_4_0= ruleChoix ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalENIGMA.g:906:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:907:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:907:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:908:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalENIGMA.g:928:3: ( (lv_choix_3_0= ruleChoix ) )
            // InternalENIGMA.g:929:4: (lv_choix_3_0= ruleChoix )
            {
            // InternalENIGMA.g:929:4: (lv_choix_3_0= ruleChoix )
            // InternalENIGMA.g:930:5: lv_choix_3_0= ruleChoix
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
            lv_choix_3_0=ruleChoix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					set(
            						current,
            						"choix",
            						lv_choix_3_0,
            						"fr.n7.ENIGMA.Choix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:947:3: ( (lv_choixFin_4_0= ruleChoix ) )
            // InternalENIGMA.g:948:4: (lv_choixFin_4_0= ruleChoix )
            {
            // InternalENIGMA.g:948:4: (lv_choixFin_4_0= ruleChoix )
            // InternalENIGMA.g:949:5: lv_choixFin_4_0= ruleChoix
            {

            					newCompositeNode(grammarAccess.getInteractionAccess().getChoixFinChoixParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_choixFin_4_0=ruleChoix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInteractionRule());
            					}
            					set(
            						current,
            						"choixFin",
            						lv_choixFin_4_0,
            						"fr.n7.ENIGMA.Choix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRulePersonne"
    // InternalENIGMA.g:974:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalENIGMA.g:974:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalENIGMA.g:975:2: iv_rulePersonne= rulePersonne EOF
            {
             newCompositeNode(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonne=rulePersonne();

            state._fsp--;

             current =iv_rulePersonne; 
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
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalENIGMA.g:981:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) ( (lv_etato_2_0= ruleEtatObligation ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_texte_7_0= ruleQualification ) ) ( (lv_interaction_8_0= ruleInteraction ) )? otherlv_9= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Enumerator lv_etato_2_0 = null;

        Enumerator lv_etatv_4_0 = null;

        EObject lv_texte_7_0 = null;

        EObject lv_interaction_8_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:987:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) ( (lv_etato_2_0= ruleEtatObligation ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_texte_7_0= ruleQualification ) ) ( (lv_interaction_8_0= ruleInteraction ) )? otherlv_9= '}' ) )
            // InternalENIGMA.g:988:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) ( (lv_etato_2_0= ruleEtatObligation ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_texte_7_0= ruleQualification ) ) ( (lv_interaction_8_0= ruleInteraction ) )? otherlv_9= '}' )
            {
            // InternalENIGMA.g:988:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) ( (lv_etato_2_0= ruleEtatObligation ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_texte_7_0= ruleQualification ) ) ( (lv_interaction_8_0= ruleInteraction ) )? otherlv_9= '}' )
            // InternalENIGMA.g:989:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) ( (lv_etato_2_0= ruleEtatObligation ) ) ( (otherlv_3= RULE_ID ) ) ( (lv_etatv_4_0= ruleEtatVisibilite ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= '{' ( (lv_texte_7_0= ruleQualification ) ) ( (lv_interaction_8_0= ruleInteraction ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalENIGMA.g:993:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:994:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:994:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:995:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalENIGMA.g:1011:3: ( (lv_etato_2_0= ruleEtatObligation ) )
            // InternalENIGMA.g:1012:4: (lv_etato_2_0= ruleEtatObligation )
            {
            // InternalENIGMA.g:1012:4: (lv_etato_2_0= ruleEtatObligation )
            // InternalENIGMA.g:1013:5: lv_etato_2_0= ruleEtatObligation
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getEtatoEtatObligationEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_etato_2_0=ruleEtatObligation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"etato",
            						lv_etato_2_0,
            						"fr.n7.ENIGMA.EtatObligation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:1030:3: ( (otherlv_3= RULE_ID ) )
            // InternalENIGMA.g:1031:4: (otherlv_3= RULE_ID )
            {
            // InternalENIGMA.g:1031:4: (otherlv_3= RULE_ID )
            // InternalENIGMA.g:1032:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getConditionoConditionCrossReference_3_0());
            				

            }


            }

            // InternalENIGMA.g:1043:3: ( (lv_etatv_4_0= ruleEtatVisibilite ) )
            // InternalENIGMA.g:1044:4: (lv_etatv_4_0= ruleEtatVisibilite )
            {
            // InternalENIGMA.g:1044:4: (lv_etatv_4_0= ruleEtatVisibilite )
            // InternalENIGMA.g:1045:5: lv_etatv_4_0= ruleEtatVisibilite
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getEtatvEtatVisibiliteEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_3);
            lv_etatv_4_0=ruleEtatVisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"etatv",
            						lv_etatv_4_0,
            						"fr.n7.ENIGMA.EtatVisibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:1062:3: ( (otherlv_5= RULE_ID ) )
            // InternalENIGMA.g:1063:4: (otherlv_5= RULE_ID )
            {
            // InternalENIGMA.g:1063:4: (otherlv_5= RULE_ID )
            // InternalENIGMA.g:1064:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonneRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getConditionvConditionCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalENIGMA.g:1079:3: ( (lv_texte_7_0= ruleQualification ) )
            // InternalENIGMA.g:1080:4: (lv_texte_7_0= ruleQualification )
            {
            // InternalENIGMA.g:1080:4: (lv_texte_7_0= ruleQualification )
            // InternalENIGMA.g:1081:5: lv_texte_7_0= ruleQualification
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getTexteQualificationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_32);
            lv_texte_7_0=ruleQualification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"texte",
            						lv_texte_7_0,
            						"fr.n7.ENIGMA.Qualification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:1098:3: ( (lv_interaction_8_0= ruleInteraction ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalENIGMA.g:1099:4: (lv_interaction_8_0= ruleInteraction )
                    {
                    // InternalENIGMA.g:1099:4: (lv_interaction_8_0= ruleInteraction )
                    // InternalENIGMA.g:1100:5: lv_interaction_8_0= ruleInteraction
                    {

                    					newCompositeNode(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_interaction_8_0=ruleInteraction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPersonneRule());
                    					}
                    					set(
                    						current,
                    						"interaction",
                    						lv_interaction_8_0,
                    						"fr.n7.ENIGMA.Interaction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRuleLieu"
    // InternalENIGMA.g:1125:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalENIGMA.g:1125:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalENIGMA.g:1126:2: iv_ruleLieu= ruleLieu EOF
            {
             newCompositeNode(grammarAccess.getLieuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLieu=ruleLieu();

            state._fsp--;

             current =iv_ruleLieu; 
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
    // $ANTLR end "entryRuleLieu"


    // $ANTLR start "ruleLieu"
    // InternalENIGMA.g:1132:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'personnes' otherlv_4= '{' ( (lv_personnes_5_0= rulePersonne ) )* otherlv_6= '}' )? otherlv_7= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_personnes_5_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:1138:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'personnes' otherlv_4= '{' ( (lv_personnes_5_0= rulePersonne ) )* otherlv_6= '}' )? otherlv_7= '}' ) )
            // InternalENIGMA.g:1139:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'personnes' otherlv_4= '{' ( (lv_personnes_5_0= rulePersonne ) )* otherlv_6= '}' )? otherlv_7= '}' )
            {
            // InternalENIGMA.g:1139:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'personnes' otherlv_4= '{' ( (lv_personnes_5_0= rulePersonne ) )* otherlv_6= '}' )? otherlv_7= '}' )
            // InternalENIGMA.g:1140:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'personnes' otherlv_4= '{' ( (lv_personnes_5_0= rulePersonne ) )* otherlv_6= '}' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalENIGMA.g:1144:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:1145:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:1145:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:1146:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLieuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLieuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalENIGMA.g:1166:3: (otherlv_3= 'personnes' otherlv_4= '{' ( (lv_personnes_5_0= rulePersonne ) )* otherlv_6= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalENIGMA.g:1167:4: otherlv_3= 'personnes' otherlv_4= '{' ( (lv_personnes_5_0= rulePersonne ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getLieuAccess().getPersonnesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalENIGMA.g:1175:4: ( (lv_personnes_5_0= rulePersonne ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==33) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalENIGMA.g:1176:5: (lv_personnes_5_0= rulePersonne )
                    	    {
                    	    // InternalENIGMA.g:1176:5: (lv_personnes_5_0= rulePersonne )
                    	    // InternalENIGMA.g:1177:6: lv_personnes_5_0= rulePersonne
                    	    {

                    	    						newCompositeNode(grammarAccess.getLieuAccess().getPersonnesPersonneParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_34);
                    	    lv_personnes_5_0=rulePersonne();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLieuRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"personnes",
                    	    							lv_personnes_5_0,
                    	    							"fr.n7.ENIGMA.Personne");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLieu"


    // $ANTLR start "entryRuleChemin"
    // InternalENIGMA.g:1207:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalENIGMA.g:1207:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalENIGMA.g:1208:2: iv_ruleChemin= ruleChemin EOF
            {
             newCompositeNode(grammarAccess.getCheminRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChemin=ruleChemin();

            state._fsp--;

             current =iv_ruleChemin; 
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
    // $ANTLR end "entryRuleChemin"


    // $ANTLR start "ruleChemin"
    // InternalENIGMA.g:1214:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'chemin' ( (lv_etatc_1_0= ruleEtatChemin ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_etato_3_0= ruleEtatObligation ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_etatv_5_0= ruleEtatVisibilite ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'de' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'a' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_etatc_1_0 = null;

        Enumerator lv_etato_3_0 = null;

        Enumerator lv_etatv_5_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:1220:2: ( (otherlv_0= 'chemin' ( (lv_etatc_1_0= ruleEtatChemin ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_etato_3_0= ruleEtatObligation ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_etatv_5_0= ruleEtatVisibilite ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'de' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'a' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalENIGMA.g:1221:2: (otherlv_0= 'chemin' ( (lv_etatc_1_0= ruleEtatChemin ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_etato_3_0= ruleEtatObligation ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_etatv_5_0= ruleEtatVisibilite ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'de' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'a' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalENIGMA.g:1221:2: (otherlv_0= 'chemin' ( (lv_etatc_1_0= ruleEtatChemin ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_etato_3_0= ruleEtatObligation ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_etatv_5_0= ruleEtatVisibilite ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'de' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'a' ( (otherlv_10= RULE_ID ) ) )
            // InternalENIGMA.g:1222:3: otherlv_0= 'chemin' ( (lv_etatc_1_0= ruleEtatChemin ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_etato_3_0= ruleEtatObligation ) ) ( (otherlv_4= RULE_ID ) ) ( (lv_etatv_5_0= ruleEtatVisibilite ) ) ( (otherlv_6= RULE_ID ) ) otherlv_7= 'de' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'a' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0());
            		
            // InternalENIGMA.g:1226:3: ( (lv_etatc_1_0= ruleEtatChemin ) )
            // InternalENIGMA.g:1227:4: (lv_etatc_1_0= ruleEtatChemin )
            {
            // InternalENIGMA.g:1227:4: (lv_etatc_1_0= ruleEtatChemin )
            // InternalENIGMA.g:1228:5: lv_etatc_1_0= ruleEtatChemin
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getEtatcEtatCheminEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_etatc_1_0=ruleEtatChemin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"etatc",
            						lv_etatc_1_0,
            						"fr.n7.ENIGMA.EtatChemin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:1245:3: ( (otherlv_2= RULE_ID ) )
            // InternalENIGMA.g:1246:4: (otherlv_2= RULE_ID )
            {
            // InternalENIGMA.g:1246:4: (otherlv_2= RULE_ID )
            // InternalENIGMA.g:1247:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getConditioncConditionCrossReference_2_0());
            				

            }


            }

            // InternalENIGMA.g:1258:3: ( (lv_etato_3_0= ruleEtatObligation ) )
            // InternalENIGMA.g:1259:4: (lv_etato_3_0= ruleEtatObligation )
            {
            // InternalENIGMA.g:1259:4: (lv_etato_3_0= ruleEtatObligation )
            // InternalENIGMA.g:1260:5: lv_etato_3_0= ruleEtatObligation
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getEtatoEtatObligationEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_etato_3_0=ruleEtatObligation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"etato",
            						lv_etato_3_0,
            						"fr.n7.ENIGMA.EtatObligation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:1277:3: ( (otherlv_4= RULE_ID ) )
            // InternalENIGMA.g:1278:4: (otherlv_4= RULE_ID )
            {
            // InternalENIGMA.g:1278:4: (otherlv_4= RULE_ID )
            // InternalENIGMA.g:1279:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getConditionoConditionCrossReference_4_0());
            				

            }


            }

            // InternalENIGMA.g:1290:3: ( (lv_etatv_5_0= ruleEtatVisibilite ) )
            // InternalENIGMA.g:1291:4: (lv_etatv_5_0= ruleEtatVisibilite )
            {
            // InternalENIGMA.g:1291:4: (lv_etatv_5_0= ruleEtatVisibilite )
            // InternalENIGMA.g:1292:5: lv_etatv_5_0= ruleEtatVisibilite
            {

            					newCompositeNode(grammarAccess.getCheminAccess().getEtatvEtatVisibiliteEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_3);
            lv_etatv_5_0=ruleEtatVisibilite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheminRule());
            					}
            					set(
            						current,
            						"etatv",
            						lv_etatv_5_0,
            						"fr.n7.ENIGMA.EtatVisibilite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:1309:3: ( (otherlv_6= RULE_ID ) )
            // InternalENIGMA.g:1310:4: (otherlv_6= RULE_ID )
            {
            // InternalENIGMA.g:1310:4: (otherlv_6= RULE_ID )
            // InternalENIGMA.g:1311:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_6, grammarAccess.getCheminAccess().getConditionvConditionCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCheminAccess().getDeKeyword_7());
            		
            // InternalENIGMA.g:1326:3: ( (otherlv_8= RULE_ID ) )
            // InternalENIGMA.g:1327:4: (otherlv_8= RULE_ID )
            {
            // InternalENIGMA.g:1327:4: (otherlv_8= RULE_ID )
            // InternalENIGMA.g:1328:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_8, grammarAccess.getCheminAccess().getPrecedentLieuCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getCheminAccess().getAKeyword_9());
            		
            // InternalENIGMA.g:1343:3: ( (otherlv_10= RULE_ID ) )
            // InternalENIGMA.g:1344:4: (otherlv_10= RULE_ID )
            {
            // InternalENIGMA.g:1344:4: (otherlv_10= RULE_ID )
            // InternalENIGMA.g:1345:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_10, grammarAccess.getCheminAccess().getSuivantLieuCrossReference_10_0());
            				

            }


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
    // $ANTLR end "ruleChemin"


    // $ANTLR start "entryRuleQualification"
    // InternalENIGMA.g:1360:1: entryRuleQualification returns [EObject current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final EObject entryRuleQualification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualification = null;


        try {
            // InternalENIGMA.g:1360:54: (iv_ruleQualification= ruleQualification EOF )
            // InternalENIGMA.g:1361:2: iv_ruleQualification= ruleQualification EOF
            {
             newCompositeNode(grammarAccess.getQualificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualification=ruleQualification();

            state._fsp--;

             current =iv_ruleQualification; 
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
    // $ANTLR end "entryRuleQualification"


    // $ANTLR start "ruleQualification"
    // InternalENIGMA.g:1367:1: ruleQualification returns [EObject current=null] : ( (lv_qualification_0_0= RULE_STRING ) ) ;
    public final EObject ruleQualification() throws RecognitionException {
        EObject current = null;

        Token lv_qualification_0_0=null;


        	enterRule();

        try {
            // InternalENIGMA.g:1373:2: ( ( (lv_qualification_0_0= RULE_STRING ) ) )
            // InternalENIGMA.g:1374:2: ( (lv_qualification_0_0= RULE_STRING ) )
            {
            // InternalENIGMA.g:1374:2: ( (lv_qualification_0_0= RULE_STRING ) )
            // InternalENIGMA.g:1375:3: (lv_qualification_0_0= RULE_STRING )
            {
            // InternalENIGMA.g:1375:3: (lv_qualification_0_0= RULE_STRING )
            // InternalENIGMA.g:1376:4: lv_qualification_0_0= RULE_STRING
            {
            lv_qualification_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_qualification_0_0, grammarAccess.getQualificationAccess().getQualificationSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQualificationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"qualification",
            					lv_qualification_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleQualification"


    // $ANTLR start "entryRuleAction"
    // InternalENIGMA.g:1395:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalENIGMA.g:1395:47: (iv_ruleAction= ruleAction EOF )
            // InternalENIGMA.g:1396:2: iv_ruleAction= ruleAction EOF
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
    // InternalENIGMA.g:1402:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= 'c' otherlv_5= '{' ( (lv_objetsconsommables_6_0= ruleObjet ) )* otherlv_7= '}' otherlv_8= 'objets' otherlv_9= 'a' otherlv_10= '{' ( (lv_objetsattribuables_11_0= ruleObjet ) )* otherlv_12= '}' otherlv_13= 'connaissances' otherlv_14= 'a' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' otherlv_18= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_objetsconsommables_6_0 = null;

        EObject lv_objetsattribuables_11_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:1408:2: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= 'c' otherlv_5= '{' ( (lv_objetsconsommables_6_0= ruleObjet ) )* otherlv_7= '}' otherlv_8= 'objets' otherlv_9= 'a' otherlv_10= '{' ( (lv_objetsattribuables_11_0= ruleObjet ) )* otherlv_12= '}' otherlv_13= 'connaissances' otherlv_14= 'a' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' otherlv_18= '}' ) )
            // InternalENIGMA.g:1409:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= 'c' otherlv_5= '{' ( (lv_objetsconsommables_6_0= ruleObjet ) )* otherlv_7= '}' otherlv_8= 'objets' otherlv_9= 'a' otherlv_10= '{' ( (lv_objetsattribuables_11_0= ruleObjet ) )* otherlv_12= '}' otherlv_13= 'connaissances' otherlv_14= 'a' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' otherlv_18= '}' )
            {
            // InternalENIGMA.g:1409:2: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= 'c' otherlv_5= '{' ( (lv_objetsconsommables_6_0= ruleObjet ) )* otherlv_7= '}' otherlv_8= 'objets' otherlv_9= 'a' otherlv_10= '{' ( (lv_objetsattribuables_11_0= ruleObjet ) )* otherlv_12= '}' otherlv_13= 'connaissances' otherlv_14= 'a' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' otherlv_18= '}' )
            // InternalENIGMA.g:1410:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= 'c' otherlv_5= '{' ( (lv_objetsconsommables_6_0= ruleObjet ) )* otherlv_7= '}' otherlv_8= 'objets' otherlv_9= 'a' otherlv_10= '{' ( (lv_objetsattribuables_11_0= ruleObjet ) )* otherlv_12= '}' otherlv_13= 'connaissances' otherlv_14= 'a' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalENIGMA.g:1414:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:1415:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:1415:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:1416:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getActionAccess().getObjetsKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalENIGMA.g:1448:3: ( (lv_objetsconsommables_6_0= ruleObjet ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalENIGMA.g:1449:4: (lv_objetsconsommables_6_0= ruleObjet )
            	    {
            	    // InternalENIGMA.g:1449:4: (lv_objetsconsommables_6_0= ruleObjet )
            	    // InternalENIGMA.g:1450:5: lv_objetsconsommables_6_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getObjetsconsommablesObjetParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_objetsconsommables_6_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objetsconsommables",
            	    						lv_objetsconsommables_6_0,
            	    						"fr.n7.ENIGMA.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_36); 

            			newLeafNode(otherlv_8, grammarAccess.getActionAccess().getObjetsKeyword_8());
            		
            otherlv_9=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getActionAccess().getAKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalENIGMA.g:1483:3: ( (lv_objetsattribuables_11_0= ruleObjet ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalENIGMA.g:1484:4: (lv_objetsattribuables_11_0= ruleObjet )
            	    {
            	    // InternalENIGMA.g:1484:4: (lv_objetsattribuables_11_0= ruleObjet )
            	    // InternalENIGMA.g:1485:5: lv_objetsattribuables_11_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getActionAccess().getObjetsattribuablesObjetParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_objetsattribuables_11_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objetsattribuables",
            	    						lv_objetsattribuables_11_0,
            	    						"fr.n7.ENIGMA.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_36); 

            			newLeafNode(otherlv_13, grammarAccess.getActionAccess().getConnaissancesKeyword_13());
            		
            otherlv_14=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getActionAccess().getAKeyword_14());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_15, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalENIGMA.g:1518:3: ( (otherlv_16= RULE_ID ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalENIGMA.g:1519:4: (otherlv_16= RULE_ID )
            	    {
            	    // InternalENIGMA.g:1519:4: (otherlv_16= RULE_ID )
            	    // InternalENIGMA.g:1520:5: otherlv_16= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getActionRule());
            	    					}
            	    				
            	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    					newLeafNode(otherlv_16, grammarAccess.getActionAccess().getConnaissancesattribuablesConnaissanceCrossReference_16_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_17=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_18=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_18());
            		

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


    // $ANTLR start "entryRuleReponse"
    // InternalENIGMA.g:1543:1: entryRuleReponse returns [EObject current=null] : iv_ruleReponse= ruleReponse EOF ;
    public final EObject entryRuleReponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReponse = null;


        try {
            // InternalENIGMA.g:1543:48: (iv_ruleReponse= ruleReponse EOF )
            // InternalENIGMA.g:1544:2: iv_ruleReponse= ruleReponse EOF
            {
             newCompositeNode(grammarAccess.getReponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReponse=ruleReponse();

            state._fsp--;

             current =iv_ruleReponse; 
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
    // $ANTLR end "entryRuleReponse"


    // $ANTLR start "ruleReponse"
    // InternalENIGMA.g:1550:1: ruleReponse returns [EObject current=null] : (otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'de' otherlv_4= 'qualification' ( (lv_texte_5_0= ruleQualification ) ) otherlv_6= 'avec' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleReponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_texte_5_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:1556:2: ( (otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'de' otherlv_4= 'qualification' ( (lv_texte_5_0= ruleQualification ) ) otherlv_6= 'avec' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalENIGMA.g:1557:2: (otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'de' otherlv_4= 'qualification' ( (lv_texte_5_0= ruleQualification ) ) otherlv_6= 'avec' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalENIGMA.g:1557:2: (otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'de' otherlv_4= 'qualification' ( (lv_texte_5_0= ruleQualification ) ) otherlv_6= 'avec' ( (otherlv_7= RULE_ID ) ) )
            // InternalENIGMA.g:1558:3: otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'de' otherlv_4= 'qualification' ( (lv_texte_5_0= ruleQualification ) ) otherlv_6= 'avec' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getReponseAccess().getReponseKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReponseAccess().getGreaterThanSignGreaterThanSignKeyword_1());
            		
            // InternalENIGMA.g:1566:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalENIGMA.g:1567:4: (lv_name_2_0= RULE_ID )
            {
            // InternalENIGMA.g:1567:4: (lv_name_2_0= RULE_ID )
            // InternalENIGMA.g:1568:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getReponseAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReponseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getReponseAccess().getDeKeyword_3());
            		
            otherlv_4=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getReponseAccess().getQualificationKeyword_4());
            		
            // InternalENIGMA.g:1592:3: ( (lv_texte_5_0= ruleQualification ) )
            // InternalENIGMA.g:1593:4: (lv_texte_5_0= ruleQualification )
            {
            // InternalENIGMA.g:1593:4: (lv_texte_5_0= ruleQualification )
            // InternalENIGMA.g:1594:5: lv_texte_5_0= ruleQualification
            {

            					newCompositeNode(grammarAccess.getReponseAccess().getTexteQualificationParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_40);
            lv_texte_5_0=ruleQualification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReponseRule());
            					}
            					set(
            						current,
            						"texte",
            						lv_texte_5_0,
            						"fr.n7.ENIGMA.Qualification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getReponseAccess().getAvecKeyword_6());
            		
            // InternalENIGMA.g:1615:3: ( (otherlv_7= RULE_ID ) )
            // InternalENIGMA.g:1616:4: (otherlv_7= RULE_ID )
            {
            // InternalENIGMA.g:1616:4: (otherlv_7= RULE_ID )
            // InternalENIGMA.g:1617:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReponseRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getReponseAccess().getActionActionCrossReference_7_0());
            				

            }


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
    // $ANTLR end "ruleReponse"


    // $ANTLR start "entryRuleCondition"
    // InternalENIGMA.g:1632:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalENIGMA.g:1632:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalENIGMA.g:1633:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalENIGMA.g:1639:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'obj' otherlv_4= '{' ( (lv_objetsRequis_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= 'con' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_objetsRequis_5_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:1645:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'obj' otherlv_4= '{' ( (lv_objetsRequis_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= 'con' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalENIGMA.g:1646:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'obj' otherlv_4= '{' ( (lv_objetsRequis_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= 'con' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalENIGMA.g:1646:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'obj' otherlv_4= '{' ( (lv_objetsRequis_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= 'con' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalENIGMA.g:1647:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'obj' otherlv_4= '{' ( (lv_objetsRequis_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= 'con' otherlv_8= '{' ( (otherlv_9= RULE_ID ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalENIGMA.g:1651:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:1652:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:1652:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:1653:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getObjKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalENIGMA.g:1681:3: ( (lv_objetsRequis_5_0= ruleObjet ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalENIGMA.g:1682:4: (lv_objetsRequis_5_0= ruleObjet )
            	    {
            	    // InternalENIGMA.g:1682:4: (lv_objetsRequis_5_0= ruleObjet )
            	    // InternalENIGMA.g:1683:5: lv_objetsRequis_5_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getConditionAccess().getObjetsRequisObjetParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_objetsRequis_5_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objetsRequis",
            	    						lv_objetsRequis_5_0,
            	    						"fr.n7.ENIGMA.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_42); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getConKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalENIGMA.g:1712:3: ( (otherlv_9= RULE_ID ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalENIGMA.g:1713:4: (otherlv_9= RULE_ID )
            	    {
            	    // InternalENIGMA.g:1713:4: (otherlv_9= RULE_ID )
            	    // InternalENIGMA.g:1714:5: otherlv_9= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getConditionRule());
            	    					}
            	    				
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    					newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getConnaissancesRequisesConnaissanceCrossReference_9_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleEtatPossession"
    // InternalENIGMA.g:1737:1: ruleEtatPossession returns [Enumerator current=null] : ( (enumLiteral_0= 'possede' ) | (enumLiteral_1= 'npossede' ) ) ;
    public final Enumerator ruleEtatPossession() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENIGMA.g:1743:2: ( ( (enumLiteral_0= 'possede' ) | (enumLiteral_1= 'npossede' ) ) )
            // InternalENIGMA.g:1744:2: ( (enumLiteral_0= 'possede' ) | (enumLiteral_1= 'npossede' ) )
            {
            // InternalENIGMA.g:1744:2: ( (enumLiteral_0= 'possede' ) | (enumLiteral_1= 'npossede' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            else if ( (LA18_0==48) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalENIGMA.g:1745:3: (enumLiteral_0= 'possede' )
                    {
                    // InternalENIGMA.g:1745:3: (enumLiteral_0= 'possede' )
                    // InternalENIGMA.g:1746:4: enumLiteral_0= 'possede'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getEtatPossessionAccess().getPossedeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEtatPossessionAccess().getPossedeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:1753:3: (enumLiteral_1= 'npossede' )
                    {
                    // InternalENIGMA.g:1753:3: (enumLiteral_1= 'npossede' )
                    // InternalENIGMA.g:1754:4: enumLiteral_1= 'npossede'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getEtatPossessionAccess().getNpossedeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEtatPossessionAccess().getNpossedeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleEtatPossession"


    // $ANTLR start "ruleEtatVisibilite"
    // InternalENIGMA.g:1764:1: ruleEtatVisibilite returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'nvisible' ) ) ;
    public final Enumerator ruleEtatVisibilite() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENIGMA.g:1770:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'nvisible' ) ) )
            // InternalENIGMA.g:1771:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'nvisible' ) )
            {
            // InternalENIGMA.g:1771:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'nvisible' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            else if ( (LA19_0==50) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalENIGMA.g:1772:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalENIGMA.g:1772:3: (enumLiteral_0= 'visible' )
                    // InternalENIGMA.g:1773:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getEtatVisibiliteAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEtatVisibiliteAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:1780:3: (enumLiteral_1= 'nvisible' )
                    {
                    // InternalENIGMA.g:1780:3: (enumLiteral_1= 'nvisible' )
                    // InternalENIGMA.g:1781:4: enumLiteral_1= 'nvisible'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getEtatVisibiliteAccess().getNvisibleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEtatVisibiliteAccess().getNvisibleEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleEtatVisibilite"


    // $ANTLR start "ruleEtatObligation"
    // InternalENIGMA.g:1791:1: ruleEtatObligation returns [Enumerator current=null] : ( (enumLiteral_0= 'obligatoire' ) | (enumLiteral_1= 'nobligatoire' ) ) ;
    public final Enumerator ruleEtatObligation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENIGMA.g:1797:2: ( ( (enumLiteral_0= 'obligatoire' ) | (enumLiteral_1= 'nobligatoire' ) ) )
            // InternalENIGMA.g:1798:2: ( (enumLiteral_0= 'obligatoire' ) | (enumLiteral_1= 'nobligatoire' ) )
            {
            // InternalENIGMA.g:1798:2: ( (enumLiteral_0= 'obligatoire' ) | (enumLiteral_1= 'nobligatoire' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            else if ( (LA20_0==52) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalENIGMA.g:1799:3: (enumLiteral_0= 'obligatoire' )
                    {
                    // InternalENIGMA.g:1799:3: (enumLiteral_0= 'obligatoire' )
                    // InternalENIGMA.g:1800:4: enumLiteral_0= 'obligatoire'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getEtatObligationAccess().getObligatoireEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEtatObligationAccess().getObligatoireEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:1807:3: (enumLiteral_1= 'nobligatoire' )
                    {
                    // InternalENIGMA.g:1807:3: (enumLiteral_1= 'nobligatoire' )
                    // InternalENIGMA.g:1808:4: enumLiteral_1= 'nobligatoire'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getEtatObligationAccess().getNobligatoireEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEtatObligationAccess().getNobligatoireEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleEtatObligation"


    // $ANTLR start "ruleEtatChemin"
    // InternalENIGMA.g:1818:1: ruleEtatChemin returns [Enumerator current=null] : ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) ) ;
    public final Enumerator ruleEtatChemin() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENIGMA.g:1824:2: ( ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) ) )
            // InternalENIGMA.g:1825:2: ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) )
            {
            // InternalENIGMA.g:1825:2: ( (enumLiteral_0= 'ouvert' ) | (enumLiteral_1= 'ferme' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==53) ) {
                alt21=1;
            }
            else if ( (LA21_0==54) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalENIGMA.g:1826:3: (enumLiteral_0= 'ouvert' )
                    {
                    // InternalENIGMA.g:1826:3: (enumLiteral_0= 'ouvert' )
                    // InternalENIGMA.g:1827:4: enumLiteral_0= 'ouvert'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getEtatCheminAccess().getOuvertEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEtatCheminAccess().getOuvertEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalENIGMA.g:1834:3: (enumLiteral_1= 'ferme' )
                    {
                    // InternalENIGMA.g:1834:3: (enumLiteral_1= 'ferme' )
                    // InternalENIGMA.g:1835:4: enumLiteral_1= 'ferme'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getEtatCheminAccess().getFermeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEtatCheminAccess().getFermeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleEtatChemin"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000115742146000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});

}