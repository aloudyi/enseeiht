package fr.n7.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
    // InternalENIGMA.g:64:1: entryRuleJeu returns [EObject current=null] : iv_ruleJeu= ruleJeu EOF ;
    public final EObject entryRuleJeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJeu = null;


        try {
            // InternalENIGMA.g:64:44: (iv_ruleJeu= ruleJeu EOF )
            // InternalENIGMA.g:65:2: iv_ruleJeu= ruleJeu EOF
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
    // InternalENIGMA.g:71:1: ruleJeu returns [EObject current=null] : (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_joueur_4_0= ruleJoueur ) ) otherlv_5= '}' ) ;
    public final EObject ruleJeu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_territoire_3_0 = null;

        EObject lv_joueur_4_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:77:2: ( (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_joueur_4_0= ruleJoueur ) ) otherlv_5= '}' ) )
            // InternalENIGMA.g:78:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_joueur_4_0= ruleJoueur ) ) otherlv_5= '}' )
            {
            // InternalENIGMA.g:78:2: (otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_joueur_4_0= ruleJoueur ) ) otherlv_5= '}' )
            // InternalENIGMA.g:79:3: otherlv_0= 'jeu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_territoire_3_0= ruleTerritoire ) ) ( (lv_joueur_4_0= ruleJoueur ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJeuAccess().getJeuKeyword_0());
            		
            // InternalENIGMA.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:85:5: lv_name_1_0= RULE_ID
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
            		
            // InternalENIGMA.g:105:3: ( (lv_territoire_3_0= ruleTerritoire ) )
            // InternalENIGMA.g:106:4: (lv_territoire_3_0= ruleTerritoire )
            {
            // InternalENIGMA.g:106:4: (lv_territoire_3_0= ruleTerritoire )
            // InternalENIGMA.g:107:5: lv_territoire_3_0= ruleTerritoire
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getTerritoireTerritoireParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_territoire_3_0=ruleTerritoire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					set(
            						current,
            						"territoire",
            						lv_territoire_3_0,
            						"fr.n7.ENIGMA.Territoire");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:124:3: ( (lv_joueur_4_0= ruleJoueur ) )
            // InternalENIGMA.g:125:4: (lv_joueur_4_0= ruleJoueur )
            {
            // InternalENIGMA.g:125:4: (lv_joueur_4_0= ruleJoueur )
            // InternalENIGMA.g:126:5: lv_joueur_4_0= ruleJoueur
            {

            					newCompositeNode(grammarAccess.getJeuAccess().getJoueurJoueurParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_joueur_4_0=ruleJoueur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJeuRule());
            					}
            					set(
            						current,
            						"joueur",
            						lv_joueur_4_0,
            						"fr.n7.ENIGMA.Joueur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getJeuAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleJoueur"
    // InternalENIGMA.g:151:1: entryRuleJoueur returns [EObject current=null] : iv_ruleJoueur= ruleJoueur EOF ;
    public final EObject entryRuleJoueur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoueur = null;


        try {
            // InternalENIGMA.g:151:47: (iv_ruleJoueur= ruleJoueur EOF )
            // InternalENIGMA.g:152:2: iv_ruleJoueur= ruleJoueur EOF
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
    // InternalENIGMA.g:158:1: ruleJoueur returns [EObject current=null] : (otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= '{' ( (lv_objet_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= '}' ) ;
    public final EObject ruleJoueur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_objet_5_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:164:2: ( (otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= '{' ( (lv_objet_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= '}' ) )
            // InternalENIGMA.g:165:2: (otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= '{' ( (lv_objet_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= '}' )
            {
            // InternalENIGMA.g:165:2: (otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= '{' ( (lv_objet_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= '}' )
            // InternalENIGMA.g:166:3: otherlv_0= 'joueur' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'objets' otherlv_4= '{' ( (lv_objet_5_0= ruleObjet ) )* otherlv_6= '}' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJoueurAccess().getJoueurKeyword_0());
            		
            // InternalENIGMA.g:170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:171:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:172:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getJoueurAccess().getObjetsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getJoueurAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalENIGMA.g:200:3: ( (lv_objet_5_0= ruleObjet ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalENIGMA.g:201:4: (lv_objet_5_0= ruleObjet )
            	    {
            	    // InternalENIGMA.g:201:4: (lv_objet_5_0= ruleObjet )
            	    // InternalENIGMA.g:202:5: lv_objet_5_0= ruleObjet
            	    {

            	    					newCompositeNode(grammarAccess.getJoueurAccess().getObjetObjetParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_objet_5_0=ruleObjet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJoueurRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objet",
            	    						lv_objet_5_0,
            	    						"fr.n7.ENIGMA.Objet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getJoueurAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleObjet"
    // InternalENIGMA.g:231:1: entryRuleObjet returns [EObject current=null] : iv_ruleObjet= ruleObjet EOF ;
    public final EObject entryRuleObjet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjet = null;


        try {
            // InternalENIGMA.g:231:46: (iv_ruleObjet= ruleObjet EOF )
            // InternalENIGMA.g:232:2: iv_ruleObjet= ruleObjet EOF
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
    // InternalENIGMA.g:238:1: ruleObjet returns [EObject current=null] : (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) ) ;
    public final EObject ruleObjet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_taille_4_0=null;


        	enterRule();

        try {
            // InternalENIGMA.g:244:2: ( (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) ) )
            // InternalENIGMA.g:245:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) )
            {
            // InternalENIGMA.g:245:2: (otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) ) )
            // InternalENIGMA.g:246:3: otherlv_0= 'objet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'de' otherlv_3= 'taille' ( (lv_taille_4_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObjetAccess().getObjetKeyword_0());
            		
            // InternalENIGMA.g:250:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:251:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:251:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:252:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getObjetAccess().getDeKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getObjetAccess().getTailleKeyword_3());
            		
            // InternalENIGMA.g:276:3: ( (lv_taille_4_0= RULE_INT ) )
            // InternalENIGMA.g:277:4: (lv_taille_4_0= RULE_INT )
            {
            // InternalENIGMA.g:277:4: (lv_taille_4_0= RULE_INT )
            // InternalENIGMA.g:278:5: lv_taille_4_0= RULE_INT
            {
            lv_taille_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_taille_4_0, grammarAccess.getObjetAccess().getTailleINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taille",
            						lv_taille_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // InternalENIGMA.g:298:1: entryRuleTerritoire returns [EObject current=null] : iv_ruleTerritoire= ruleTerritoire EOF ;
    public final EObject entryRuleTerritoire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerritoire = null;


        try {
            // InternalENIGMA.g:298:51: (iv_ruleTerritoire= ruleTerritoire EOF )
            // InternalENIGMA.g:299:2: iv_ruleTerritoire= ruleTerritoire EOF
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
    // InternalENIGMA.g:305:1: ruleTerritoire returns [EObject current=null] : (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'debut' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'fin' ( (lv_lieuxFin_6_0= ruleLieu ) )* otherlv_7= 'chemins' otherlv_8= '{' ( (lv_chemins_9_0= ruleChemin ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleTerritoire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_lieuDebut_4_0 = null;

        EObject lv_lieuxFin_6_0 = null;

        EObject lv_chemins_9_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:311:2: ( (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'debut' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'fin' ( (lv_lieuxFin_6_0= ruleLieu ) )* otherlv_7= 'chemins' otherlv_8= '{' ( (lv_chemins_9_0= ruleChemin ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalENIGMA.g:312:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'debut' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'fin' ( (lv_lieuxFin_6_0= ruleLieu ) )* otherlv_7= 'chemins' otherlv_8= '{' ( (lv_chemins_9_0= ruleChemin ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalENIGMA.g:312:2: (otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'debut' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'fin' ( (lv_lieuxFin_6_0= ruleLieu ) )* otherlv_7= 'chemins' otherlv_8= '{' ( (lv_chemins_9_0= ruleChemin ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalENIGMA.g:313:3: otherlv_0= 'territoire' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'debut' ( (lv_lieuDebut_4_0= ruleLieu ) ) otherlv_5= 'fin' ( (lv_lieuxFin_6_0= ruleLieu ) )* otherlv_7= 'chemins' otherlv_8= '{' ( (lv_chemins_9_0= ruleChemin ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTerritoireAccess().getTerritoireKeyword_0());
            		
            // InternalENIGMA.g:317:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:318:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:318:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:319:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getTerritoireAccess().getDebutKeyword_3());
            		
            // InternalENIGMA.g:343:3: ( (lv_lieuDebut_4_0= ruleLieu ) )
            // InternalENIGMA.g:344:4: (lv_lieuDebut_4_0= ruleLieu )
            {
            // InternalENIGMA.g:344:4: (lv_lieuDebut_4_0= ruleLieu )
            // InternalENIGMA.g:345:5: lv_lieuDebut_4_0= ruleLieu
            {

            					newCompositeNode(grammarAccess.getTerritoireAccess().getLieuDebutLieuParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_5=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getTerritoireAccess().getFinKeyword_5());
            		
            // InternalENIGMA.g:366:3: ( (lv_lieuxFin_6_0= ruleLieu ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalENIGMA.g:367:4: (lv_lieuxFin_6_0= ruleLieu )
            	    {
            	    // InternalENIGMA.g:367:4: (lv_lieuxFin_6_0= ruleLieu )
            	    // InternalENIGMA.g:368:5: lv_lieuxFin_6_0= ruleLieu
            	    {

            	    					newCompositeNode(grammarAccess.getTerritoireAccess().getLieuxFinLieuParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_lieuxFin_6_0=ruleLieu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lieuxFin",
            	    						lv_lieuxFin_6_0,
            	    						"fr.n7.ENIGMA.Lieu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getTerritoireAccess().getCheminsKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getTerritoireAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalENIGMA.g:393:3: ( (lv_chemins_9_0= ruleChemin ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalENIGMA.g:394:4: (lv_chemins_9_0= ruleChemin )
            	    {
            	    // InternalENIGMA.g:394:4: (lv_chemins_9_0= ruleChemin )
            	    // InternalENIGMA.g:395:5: lv_chemins_9_0= ruleChemin
            	    {

            	    					newCompositeNode(grammarAccess.getTerritoireAccess().getCheminsCheminParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_chemins_9_0=ruleChemin();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTerritoireRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chemins",
            	    						lv_chemins_9_0,
            	    						"fr.n7.ENIGMA.Chemin");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTerritoireAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalENIGMA.g:424:1: entryRuleChoix returns [EObject current=null] : iv_ruleChoix= ruleChoix EOF ;
    public final EObject entryRuleChoix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoix = null;


        try {
            // InternalENIGMA.g:424:46: (iv_ruleChoix= ruleChoix EOF )
            // InternalENIGMA.g:425:2: iv_ruleChoix= ruleChoix EOF
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
    // InternalENIGMA.g:431:1: ruleChoix returns [EObject current=null] : ( () otherlv_1= 'choix' otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= '}' ) ;
    public final EObject ruleChoix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reponses_3_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:437:2: ( ( () otherlv_1= 'choix' otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= '}' ) )
            // InternalENIGMA.g:438:2: ( () otherlv_1= 'choix' otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= '}' )
            {
            // InternalENIGMA.g:438:2: ( () otherlv_1= 'choix' otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= '}' )
            // InternalENIGMA.g:439:3: () otherlv_1= 'choix' otherlv_2= '{' ( (lv_reponses_3_0= ruleReponse ) )* otherlv_4= '}'
            {
            // InternalENIGMA.g:439:3: ()
            // InternalENIGMA.g:440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChoixAccess().getChoixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChoixAccess().getChoixKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getChoixAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalENIGMA.g:454:3: ( (lv_reponses_3_0= ruleReponse ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalENIGMA.g:455:4: (lv_reponses_3_0= ruleReponse )
            	    {
            	    // InternalENIGMA.g:455:4: (lv_reponses_3_0= ruleReponse )
            	    // InternalENIGMA.g:456:5: lv_reponses_3_0= ruleReponse
            	    {

            	    					newCompositeNode(grammarAccess.getChoixAccess().getReponsesReponseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChoixAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalENIGMA.g:481:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalENIGMA.g:481:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalENIGMA.g:482:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalENIGMA.g:488:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) )* otherlv_4= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_choix_3_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:494:2: ( (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) )* otherlv_4= '}' ) )
            // InternalENIGMA.g:495:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) )* otherlv_4= '}' )
            {
            // InternalENIGMA.g:495:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) )* otherlv_4= '}' )
            // InternalENIGMA.g:496:3: otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_choix_3_0= ruleChoix ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalENIGMA.g:500:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:501:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:501:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:502:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalENIGMA.g:522:3: ( (lv_choix_3_0= ruleChoix ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalENIGMA.g:523:4: (lv_choix_3_0= ruleChoix )
            	    {
            	    // InternalENIGMA.g:523:4: (lv_choix_3_0= ruleChoix )
            	    // InternalENIGMA.g:524:5: lv_choix_3_0= ruleChoix
            	    {

            	    					newCompositeNode(grammarAccess.getInteractionAccess().getChoixChoixParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_choix_3_0=ruleChoix();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"choix",
            	    						lv_choix_3_0,
            	    						"fr.n7.ENIGMA.Choix");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalENIGMA.g:549:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalENIGMA.g:549:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalENIGMA.g:550:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalENIGMA.g:556:1: rulePersonne returns [EObject current=null] : (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= ruleQualification ) ) ( (lv_interaction_4_0= ruleInteraction ) )? otherlv_5= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_texte_3_0 = null;

        EObject lv_interaction_4_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:562:2: ( (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= ruleQualification ) ) ( (lv_interaction_4_0= ruleInteraction ) )? otherlv_5= '}' ) )
            // InternalENIGMA.g:563:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= ruleQualification ) ) ( (lv_interaction_4_0= ruleInteraction ) )? otherlv_5= '}' )
            {
            // InternalENIGMA.g:563:2: (otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= ruleQualification ) ) ( (lv_interaction_4_0= ruleInteraction ) )? otherlv_5= '}' )
            // InternalENIGMA.g:564:3: otherlv_0= 'personne' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_texte_3_0= ruleQualification ) ) ( (lv_interaction_4_0= ruleInteraction ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonneAccess().getPersonneKeyword_0());
            		
            // InternalENIGMA.g:568:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:569:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:569:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:570:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalENIGMA.g:590:3: ( (lv_texte_3_0= ruleQualification ) )
            // InternalENIGMA.g:591:4: (lv_texte_3_0= ruleQualification )
            {
            // InternalENIGMA.g:591:4: (lv_texte_3_0= ruleQualification )
            // InternalENIGMA.g:592:5: lv_texte_3_0= ruleQualification
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getTexteQualificationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_texte_3_0=ruleQualification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"texte",
            						lv_texte_3_0,
            						"fr.n7.ENIGMA.Qualification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalENIGMA.g:609:3: ( (lv_interaction_4_0= ruleInteraction ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalENIGMA.g:610:4: (lv_interaction_4_0= ruleInteraction )
                    {
                    // InternalENIGMA.g:610:4: (lv_interaction_4_0= ruleInteraction )
                    // InternalENIGMA.g:611:5: lv_interaction_4_0= ruleInteraction
                    {

                    					newCompositeNode(grammarAccess.getPersonneAccess().getInteractionInteractionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_interaction_4_0=ruleInteraction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPersonneRule());
                    					}
                    					set(
                    						current,
                    						"interaction",
                    						lv_interaction_4_0,
                    						"fr.n7.ENIGMA.Interaction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalENIGMA.g:636:1: entryRuleLieu returns [EObject current=null] : iv_ruleLieu= ruleLieu EOF ;
    public final EObject entryRuleLieu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLieu = null;


        try {
            // InternalENIGMA.g:636:45: (iv_ruleLieu= ruleLieu EOF )
            // InternalENIGMA.g:637:2: iv_ruleLieu= ruleLieu EOF
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
    // InternalENIGMA.g:643:1: ruleLieu returns [EObject current=null] : (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_personne_3_0= rulePersonne ) ) otherlv_4= '}' ) ;
    public final EObject ruleLieu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_personne_3_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:649:2: ( (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_personne_3_0= rulePersonne ) ) otherlv_4= '}' ) )
            // InternalENIGMA.g:650:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_personne_3_0= rulePersonne ) ) otherlv_4= '}' )
            {
            // InternalENIGMA.g:650:2: (otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_personne_3_0= rulePersonne ) ) otherlv_4= '}' )
            // InternalENIGMA.g:651:3: otherlv_0= 'lieu' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_personne_3_0= rulePersonne ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLieuAccess().getLieuKeyword_0());
            		
            // InternalENIGMA.g:655:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENIGMA.g:656:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENIGMA.g:656:4: (lv_name_1_0= RULE_ID )
            // InternalENIGMA.g:657:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getLieuAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalENIGMA.g:677:3: ( (lv_personne_3_0= rulePersonne ) )
            // InternalENIGMA.g:678:4: (lv_personne_3_0= rulePersonne )
            {
            // InternalENIGMA.g:678:4: (lv_personne_3_0= rulePersonne )
            // InternalENIGMA.g:679:5: lv_personne_3_0= rulePersonne
            {

            					newCompositeNode(grammarAccess.getLieuAccess().getPersonnePersonneParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_personne_3_0=rulePersonne();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLieuRule());
            					}
            					set(
            						current,
            						"personne",
            						lv_personne_3_0,
            						"fr.n7.ENIGMA.Personne");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLieuAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalENIGMA.g:704:1: entryRuleChemin returns [EObject current=null] : iv_ruleChemin= ruleChemin EOF ;
    public final EObject entryRuleChemin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChemin = null;


        try {
            // InternalENIGMA.g:704:47: (iv_ruleChemin= ruleChemin EOF )
            // InternalENIGMA.g:705:2: iv_ruleChemin= ruleChemin EOF
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
    // InternalENIGMA.g:711:1: ruleChemin returns [EObject current=null] : (otherlv_0= 'chemin' otherlv_1= 'de' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleChemin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalENIGMA.g:717:2: ( (otherlv_0= 'chemin' otherlv_1= 'de' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalENIGMA.g:718:2: (otherlv_0= 'chemin' otherlv_1= 'de' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalENIGMA.g:718:2: (otherlv_0= 'chemin' otherlv_1= 'de' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'a' ( (otherlv_4= RULE_ID ) ) )
            // InternalENIGMA.g:719:3: otherlv_0= 'chemin' otherlv_1= 'de' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'a' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCheminAccess().getCheminKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCheminAccess().getDeKeyword_1());
            		
            // InternalENIGMA.g:727:3: ( (otherlv_2= RULE_ID ) )
            // InternalENIGMA.g:728:4: (otherlv_2= RULE_ID )
            {
            // InternalENIGMA.g:728:4: (otherlv_2= RULE_ID )
            // InternalENIGMA.g:729:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getCheminAccess().getPrecedentLieuCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCheminAccess().getAKeyword_3());
            		
            // InternalENIGMA.g:744:3: ( (otherlv_4= RULE_ID ) )
            // InternalENIGMA.g:745:4: (otherlv_4= RULE_ID )
            {
            // InternalENIGMA.g:745:4: (otherlv_4= RULE_ID )
            // InternalENIGMA.g:746:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheminRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getCheminAccess().getSuivantLieuCrossReference_4_0());
            				

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
    // InternalENIGMA.g:761:1: entryRuleQualification returns [EObject current=null] : iv_ruleQualification= ruleQualification EOF ;
    public final EObject entryRuleQualification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualification = null;


        try {
            // InternalENIGMA.g:761:54: (iv_ruleQualification= ruleQualification EOF )
            // InternalENIGMA.g:762:2: iv_ruleQualification= ruleQualification EOF
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
    // InternalENIGMA.g:768:1: ruleQualification returns [EObject current=null] : ( (lv_qualification_0_0= RULE_STRING ) ) ;
    public final EObject ruleQualification() throws RecognitionException {
        EObject current = null;

        Token lv_qualification_0_0=null;


        	enterRule();

        try {
            // InternalENIGMA.g:774:2: ( ( (lv_qualification_0_0= RULE_STRING ) ) )
            // InternalENIGMA.g:775:2: ( (lv_qualification_0_0= RULE_STRING ) )
            {
            // InternalENIGMA.g:775:2: ( (lv_qualification_0_0= RULE_STRING ) )
            // InternalENIGMA.g:776:3: (lv_qualification_0_0= RULE_STRING )
            {
            // InternalENIGMA.g:776:3: (lv_qualification_0_0= RULE_STRING )
            // InternalENIGMA.g:777:4: lv_qualification_0_0= RULE_STRING
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
    // InternalENIGMA.g:796:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalENIGMA.g:796:47: (iv_ruleAction= ruleAction EOF )
            // InternalENIGMA.g:797:2: iv_ruleAction= ruleAction EOF
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
    // InternalENIGMA.g:803:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_texte_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_texte_1_0=null;


        	enterRule();

        try {
            // InternalENIGMA.g:809:2: ( (otherlv_0= 'action' ( (lv_texte_1_0= RULE_STRING ) ) ) )
            // InternalENIGMA.g:810:2: (otherlv_0= 'action' ( (lv_texte_1_0= RULE_STRING ) ) )
            {
            // InternalENIGMA.g:810:2: (otherlv_0= 'action' ( (lv_texte_1_0= RULE_STRING ) ) )
            // InternalENIGMA.g:811:3: otherlv_0= 'action' ( (lv_texte_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalENIGMA.g:815:3: ( (lv_texte_1_0= RULE_STRING ) )
            // InternalENIGMA.g:816:4: (lv_texte_1_0= RULE_STRING )
            {
            // InternalENIGMA.g:816:4: (lv_texte_1_0= RULE_STRING )
            // InternalENIGMA.g:817:5: lv_texte_1_0= RULE_STRING
            {
            lv_texte_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_texte_1_0, grammarAccess.getActionAccess().getTexteSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"texte",
            						lv_texte_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleReponse"
    // InternalENIGMA.g:837:1: entryRuleReponse returns [EObject current=null] : iv_ruleReponse= ruleReponse EOF ;
    public final EObject entryRuleReponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReponse = null;


        try {
            // InternalENIGMA.g:837:48: (iv_ruleReponse= ruleReponse EOF )
            // InternalENIGMA.g:838:2: iv_ruleReponse= ruleReponse EOF
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
    // InternalENIGMA.g:844:1: ruleReponse returns [EObject current=null] : (otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_texte_2_0= ruleQualification ) ) otherlv_3= 'avec' ( (lv_action_4_0= ruleAction ) ) ) ;
    public final EObject ruleReponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_texte_2_0 = null;

        EObject lv_action_4_0 = null;



        	enterRule();

        try {
            // InternalENIGMA.g:850:2: ( (otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_texte_2_0= ruleQualification ) ) otherlv_3= 'avec' ( (lv_action_4_0= ruleAction ) ) ) )
            // InternalENIGMA.g:851:2: (otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_texte_2_0= ruleQualification ) ) otherlv_3= 'avec' ( (lv_action_4_0= ruleAction ) ) )
            {
            // InternalENIGMA.g:851:2: (otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_texte_2_0= ruleQualification ) ) otherlv_3= 'avec' ( (lv_action_4_0= ruleAction ) ) )
            // InternalENIGMA.g:852:3: otherlv_0= 'reponse' otherlv_1= '>>' ( (lv_texte_2_0= ruleQualification ) ) otherlv_3= 'avec' ( (lv_action_4_0= ruleAction ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getReponseAccess().getReponseKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReponseAccess().getGreaterThanSignGreaterThanSignKeyword_1());
            		
            // InternalENIGMA.g:860:3: ( (lv_texte_2_0= ruleQualification ) )
            // InternalENIGMA.g:861:4: (lv_texte_2_0= ruleQualification )
            {
            // InternalENIGMA.g:861:4: (lv_texte_2_0= ruleQualification )
            // InternalENIGMA.g:862:5: lv_texte_2_0= ruleQualification
            {

            					newCompositeNode(grammarAccess.getReponseAccess().getTexteQualificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_texte_2_0=ruleQualification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReponseRule());
            					}
            					set(
            						current,
            						"texte",
            						lv_texte_2_0,
            						"fr.n7.ENIGMA.Qualification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getReponseAccess().getAvecKeyword_3());
            		
            // InternalENIGMA.g:883:3: ( (lv_action_4_0= ruleAction ) )
            // InternalENIGMA.g:884:4: (lv_action_4_0= ruleAction )
            {
            // InternalENIGMA.g:884:4: (lv_action_4_0= ruleAction )
            // InternalENIGMA.g:885:5: lv_action_4_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getReponseAccess().getActionActionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_4_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReponseRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_4_0,
            						"fr.n7.ENIGMA.Action");
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
    // $ANTLR end "ruleReponse"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});

}