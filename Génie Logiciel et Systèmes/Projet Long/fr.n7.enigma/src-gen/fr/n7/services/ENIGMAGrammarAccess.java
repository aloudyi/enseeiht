/*
 * generated by Xtext 2.23.0
 */
package fr.n7.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ENIGMAGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class JeuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Jeu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cJeuKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTerritoireAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTerritoireTerritoireParserRuleCall_3_0 = (RuleCall)cTerritoireAssignment_3.eContents().get(0);
		private final Assignment cJoueurAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cJoueurJoueurParserRuleCall_4_0 = (RuleCall)cJoueurAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Jeu:
		//	'jeu' name=ID '{'
		//	territoire=Territoire
		//	joueur=Joueur
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'jeu' name=ID '{' territoire=Territoire joueur=Joueur '}'
		public Group getGroup() { return cGroup; }
		
		//'jeu'
		public Keyword getJeuKeyword_0() { return cJeuKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//territoire=Territoire
		public Assignment getTerritoireAssignment_3() { return cTerritoireAssignment_3; }
		
		//Territoire
		public RuleCall getTerritoireTerritoireParserRuleCall_3_0() { return cTerritoireTerritoireParserRuleCall_3_0; }
		
		//joueur=Joueur
		public Assignment getJoueurAssignment_4() { return cJoueurAssignment_4; }
		
		//Joueur
		public RuleCall getJoueurJoueurParserRuleCall_4_0() { return cJoueurJoueurParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class JoueurElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Joueur");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cJoueurKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cObjetsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cObjetAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cObjetObjetParserRuleCall_5_0 = (RuleCall)cObjetAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Joueur:
		//	'joueur' name=ID '{'
		//	'objets' '{'
		//	objet+=Objet*
		//	'}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'joueur' name=ID '{' 'objets' '{' objet+=Objet* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'joueur'
		public Keyword getJoueurKeyword_0() { return cJoueurKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'objets'
		public Keyword getObjetsKeyword_3() { return cObjetsKeyword_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//objet+=Objet*
		public Assignment getObjetAssignment_5() { return cObjetAssignment_5; }
		
		//Objet
		public RuleCall getObjetObjetParserRuleCall_5_0() { return cObjetObjetParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ObjetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Objet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cDeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTailleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTailleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTailleINTTerminalRuleCall_4_0 = (RuleCall)cTailleAssignment_4.eContents().get(0);
		
		//Objet:
		//	'objet' name=ID 'de' 'taille' taille=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'objet' name=ID 'de' 'taille' taille=INT
		public Group getGroup() { return cGroup; }
		
		//'objet'
		public Keyword getObjetKeyword_0() { return cObjetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'de'
		public Keyword getDeKeyword_2() { return cDeKeyword_2; }
		
		//'taille'
		public Keyword getTailleKeyword_3() { return cTailleKeyword_3; }
		
		//taille=INT
		public Assignment getTailleAssignment_4() { return cTailleAssignment_4; }
		
		//INT
		public RuleCall getTailleINTTerminalRuleCall_4_0() { return cTailleINTTerminalRuleCall_4_0; }
	}
	public class TerritoireElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Territoire");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTerritoireKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDebutKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLieuDebutAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLieuDebutLieuParserRuleCall_4_0 = (RuleCall)cLieuDebutAssignment_4.eContents().get(0);
		private final Keyword cFinKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cLieuxFinAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLieuxFinLieuParserRuleCall_6_0 = (RuleCall)cLieuxFinAssignment_6.eContents().get(0);
		private final Keyword cCheminsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cLeftCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cCheminsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cCheminsCheminParserRuleCall_9_0 = (RuleCall)cCheminsAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Territoire:
		//	'territoire' name=ID '{'
		//	'debut' lieuDebut=Lieu
		//	'fin' lieuxFin+=Lieu*
		//	'chemins' '{'
		//	chemins+=Chemin*
		//	'}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'territoire' name=ID '{' 'debut' lieuDebut=Lieu 'fin' lieuxFin+=Lieu* 'chemins' '{' chemins+=Chemin* '}' '}'
		public Group getGroup() { return cGroup; }
		
		//'territoire'
		public Keyword getTerritoireKeyword_0() { return cTerritoireKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'debut'
		public Keyword getDebutKeyword_3() { return cDebutKeyword_3; }
		
		//lieuDebut=Lieu
		public Assignment getLieuDebutAssignment_4() { return cLieuDebutAssignment_4; }
		
		//Lieu
		public RuleCall getLieuDebutLieuParserRuleCall_4_0() { return cLieuDebutLieuParserRuleCall_4_0; }
		
		//'fin'
		public Keyword getFinKeyword_5() { return cFinKeyword_5; }
		
		//lieuxFin+=Lieu*
		public Assignment getLieuxFinAssignment_6() { return cLieuxFinAssignment_6; }
		
		//Lieu
		public RuleCall getLieuxFinLieuParserRuleCall_6_0() { return cLieuxFinLieuParserRuleCall_6_0; }
		
		//'chemins'
		public Keyword getCheminsKeyword_7() { return cCheminsKeyword_7; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_8() { return cLeftCurlyBracketKeyword_8; }
		
		//chemins+=Chemin*
		public Assignment getCheminsAssignment_9() { return cCheminsAssignment_9; }
		
		//Chemin
		public RuleCall getCheminsCheminParserRuleCall_9_0() { return cCheminsCheminParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}
	public class ChoixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Choix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cChoixAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cChoixKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cReponsesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cReponsesReponseParserRuleCall_3_0 = (RuleCall)cReponsesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Choix:
		//	{Choix} 'choix' '{'
		//	reponses+=Reponse*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Choix} 'choix' '{' reponses+=Reponse* '}'
		public Group getGroup() { return cGroup; }
		
		//{Choix}
		public Action getChoixAction_0() { return cChoixAction_0; }
		
		//'choix'
		public Keyword getChoixKeyword_1() { return cChoixKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//reponses+=Reponse*
		public Assignment getReponsesAssignment_3() { return cReponsesAssignment_3; }
		
		//Reponse
		public RuleCall getReponsesReponseParserRuleCall_3_0() { return cReponsesReponseParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class InteractionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Interaction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInteractionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cChoixAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cChoixChoixParserRuleCall_3_0 = (RuleCall)cChoixAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Interaction:
		//	'interaction' name=ID '{'
		//	choix+=Choix*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'interaction' name=ID '{' choix+=Choix* '}'
		public Group getGroup() { return cGroup; }
		
		//'interaction'
		public Keyword getInteractionKeyword_0() { return cInteractionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//choix+=Choix*
		public Assignment getChoixAssignment_3() { return cChoixAssignment_3; }
		
		//Choix
		public RuleCall getChoixChoixParserRuleCall_3_0() { return cChoixChoixParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class PersonneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Personne");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPersonneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTexteAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTexteQualificationParserRuleCall_3_0 = (RuleCall)cTexteAssignment_3.eContents().get(0);
		private final Assignment cInteractionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInteractionInteractionParserRuleCall_4_0 = (RuleCall)cInteractionAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Personne:
		//	'personne' name=ID '{'
		//	texte=Qualification
		//	interaction=Interaction?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'personne' name=ID '{' texte=Qualification interaction=Interaction? '}'
		public Group getGroup() { return cGroup; }
		
		//'personne'
		public Keyword getPersonneKeyword_0() { return cPersonneKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//texte=Qualification
		public Assignment getTexteAssignment_3() { return cTexteAssignment_3; }
		
		//Qualification
		public RuleCall getTexteQualificationParserRuleCall_3_0() { return cTexteQualificationParserRuleCall_3_0; }
		
		//interaction=Interaction?
		public Assignment getInteractionAssignment_4() { return cInteractionAssignment_4; }
		
		//Interaction
		public RuleCall getInteractionInteractionParserRuleCall_4_0() { return cInteractionInteractionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class LieuElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Lieu");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLieuKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPersonneAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPersonnePersonneParserRuleCall_3_0 = (RuleCall)cPersonneAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Lieu:
		//	'lieu' name=ID '{'
		//	personne=Personne
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'lieu' name=ID '{' personne=Personne '}'
		public Group getGroup() { return cGroup; }
		
		//'lieu'
		public Keyword getLieuKeyword_0() { return cLieuKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//personne=Personne
		public Assignment getPersonneAssignment_3() { return cPersonneAssignment_3; }
		
		//Personne
		public RuleCall getPersonnePersonneParserRuleCall_3_0() { return cPersonnePersonneParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class CheminElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Chemin");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCheminKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cPrecedentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cPrecedentLieuCrossReference_2_0 = (CrossReference)cPrecedentAssignment_2.eContents().get(0);
		private final RuleCall cPrecedentLieuIDTerminalRuleCall_2_0_1 = (RuleCall)cPrecedentLieuCrossReference_2_0.eContents().get(1);
		private final Keyword cAKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSuivantAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cSuivantLieuCrossReference_4_0 = (CrossReference)cSuivantAssignment_4.eContents().get(0);
		private final RuleCall cSuivantLieuIDTerminalRuleCall_4_0_1 = (RuleCall)cSuivantLieuCrossReference_4_0.eContents().get(1);
		
		//Chemin:
		//	'chemin' 'de' precedent=[Lieu] 'a' suivant=[Lieu];
		@Override public ParserRule getRule() { return rule; }
		
		//'chemin' 'de' precedent=[Lieu] 'a' suivant=[Lieu]
		public Group getGroup() { return cGroup; }
		
		//'chemin'
		public Keyword getCheminKeyword_0() { return cCheminKeyword_0; }
		
		//'de'
		public Keyword getDeKeyword_1() { return cDeKeyword_1; }
		
		//precedent=[Lieu]
		public Assignment getPrecedentAssignment_2() { return cPrecedentAssignment_2; }
		
		//[Lieu]
		public CrossReference getPrecedentLieuCrossReference_2_0() { return cPrecedentLieuCrossReference_2_0; }
		
		//ID
		public RuleCall getPrecedentLieuIDTerminalRuleCall_2_0_1() { return cPrecedentLieuIDTerminalRuleCall_2_0_1; }
		
		//'a'
		public Keyword getAKeyword_3() { return cAKeyword_3; }
		
		//suivant=[Lieu]
		public Assignment getSuivantAssignment_4() { return cSuivantAssignment_4; }
		
		//[Lieu]
		public CrossReference getSuivantLieuCrossReference_4_0() { return cSuivantLieuCrossReference_4_0; }
		
		//ID
		public RuleCall getSuivantLieuIDTerminalRuleCall_4_0_1() { return cSuivantLieuIDTerminalRuleCall_4_0_1; }
	}
	public class QualificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Qualification");
		private final Assignment cQualificationAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cQualificationSTRINGTerminalRuleCall_0 = (RuleCall)cQualificationAssignment.eContents().get(0);
		
		//Qualification:
		//	qualification=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//qualification=STRING
		public Assignment getQualificationAssignment() { return cQualificationAssignment; }
		
		//STRING
		public RuleCall getQualificationSTRINGTerminalRuleCall_0() { return cQualificationSTRINGTerminalRuleCall_0; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTexteAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTexteSTRINGTerminalRuleCall_1_0 = (RuleCall)cTexteAssignment_1.eContents().get(0);
		
		//Action:
		//	'action' texte=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'action' texte=STRING
		public Group getGroup() { return cGroup; }
		
		//'action'
		public Keyword getActionKeyword_0() { return cActionKeyword_0; }
		
		//texte=STRING
		public Assignment getTexteAssignment_1() { return cTexteAssignment_1; }
		
		//STRING
		public RuleCall getTexteSTRINGTerminalRuleCall_1_0() { return cTexteSTRINGTerminalRuleCall_1_0; }
	}
	public class ReponseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.ENIGMA.Reponse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReponseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cGreaterThanSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTexteAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTexteQualificationParserRuleCall_2_0 = (RuleCall)cTexteAssignment_2.eContents().get(0);
		private final Keyword cAvecKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cActionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cActionActionParserRuleCall_4_0 = (RuleCall)cActionAssignment_4.eContents().get(0);
		
		//Reponse:
		//	'reponse' '>>' texte=Qualification 'avec' action=Action;
		@Override public ParserRule getRule() { return rule; }
		
		//'reponse' '>>' texte=Qualification 'avec' action=Action
		public Group getGroup() { return cGroup; }
		
		//'reponse'
		public Keyword getReponseKeyword_0() { return cReponseKeyword_0; }
		
		//'>>'
		public Keyword getGreaterThanSignGreaterThanSignKeyword_1() { return cGreaterThanSignGreaterThanSignKeyword_1; }
		
		//texte=Qualification
		public Assignment getTexteAssignment_2() { return cTexteAssignment_2; }
		
		//Qualification
		public RuleCall getTexteQualificationParserRuleCall_2_0() { return cTexteQualificationParserRuleCall_2_0; }
		
		//'avec'
		public Keyword getAvecKeyword_3() { return cAvecKeyword_3; }
		
		//action=Action
		public Assignment getActionAssignment_4() { return cActionAssignment_4; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_4_0() { return cActionActionParserRuleCall_4_0; }
	}
	
	
	private final JeuElements pJeu;
	private final JoueurElements pJoueur;
	private final ObjetElements pObjet;
	private final TerritoireElements pTerritoire;
	private final ChoixElements pChoix;
	private final InteractionElements pInteraction;
	private final PersonneElements pPersonne;
	private final LieuElements pLieu;
	private final CheminElements pChemin;
	private final QualificationElements pQualification;
	private final ActionElements pAction;
	private final ReponseElements pReponse;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ENIGMAGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pJeu = new JeuElements();
		this.pJoueur = new JoueurElements();
		this.pObjet = new ObjetElements();
		this.pTerritoire = new TerritoireElements();
		this.pChoix = new ChoixElements();
		this.pInteraction = new InteractionElements();
		this.pPersonne = new PersonneElements();
		this.pLieu = new LieuElements();
		this.pChemin = new CheminElements();
		this.pQualification = new QualificationElements();
		this.pAction = new ActionElements();
		this.pReponse = new ReponseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.ENIGMA".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Jeu:
	//	'jeu' name=ID '{'
	//	territoire=Territoire
	//	joueur=Joueur
	//	'}';
	public JeuElements getJeuAccess() {
		return pJeu;
	}
	
	public ParserRule getJeuRule() {
		return getJeuAccess().getRule();
	}
	
	//Joueur:
	//	'joueur' name=ID '{'
	//	'objets' '{'
	//	objet+=Objet*
	//	'}'
	//	'}';
	public JoueurElements getJoueurAccess() {
		return pJoueur;
	}
	
	public ParserRule getJoueurRule() {
		return getJoueurAccess().getRule();
	}
	
	//Objet:
	//	'objet' name=ID 'de' 'taille' taille=INT;
	public ObjetElements getObjetAccess() {
		return pObjet;
	}
	
	public ParserRule getObjetRule() {
		return getObjetAccess().getRule();
	}
	
	//Territoire:
	//	'territoire' name=ID '{'
	//	'debut' lieuDebut=Lieu
	//	'fin' lieuxFin+=Lieu*
	//	'chemins' '{'
	//	chemins+=Chemin*
	//	'}'
	//	'}';
	public TerritoireElements getTerritoireAccess() {
		return pTerritoire;
	}
	
	public ParserRule getTerritoireRule() {
		return getTerritoireAccess().getRule();
	}
	
	//Choix:
	//	{Choix} 'choix' '{'
	//	reponses+=Reponse*
	//	'}';
	public ChoixElements getChoixAccess() {
		return pChoix;
	}
	
	public ParserRule getChoixRule() {
		return getChoixAccess().getRule();
	}
	
	//Interaction:
	//	'interaction' name=ID '{'
	//	choix+=Choix*
	//	'}';
	public InteractionElements getInteractionAccess() {
		return pInteraction;
	}
	
	public ParserRule getInteractionRule() {
		return getInteractionAccess().getRule();
	}
	
	//Personne:
	//	'personne' name=ID '{'
	//	texte=Qualification
	//	interaction=Interaction?
	//	'}';
	public PersonneElements getPersonneAccess() {
		return pPersonne;
	}
	
	public ParserRule getPersonneRule() {
		return getPersonneAccess().getRule();
	}
	
	//Lieu:
	//	'lieu' name=ID '{'
	//	personne=Personne
	//	'}';
	public LieuElements getLieuAccess() {
		return pLieu;
	}
	
	public ParserRule getLieuRule() {
		return getLieuAccess().getRule();
	}
	
	//Chemin:
	//	'chemin' 'de' precedent=[Lieu] 'a' suivant=[Lieu];
	public CheminElements getCheminAccess() {
		return pChemin;
	}
	
	public ParserRule getCheminRule() {
		return getCheminAccess().getRule();
	}
	
	//Qualification:
	//	qualification=STRING;
	public QualificationElements getQualificationAccess() {
		return pQualification;
	}
	
	public ParserRule getQualificationRule() {
		return getQualificationAccess().getRule();
	}
	
	//Action:
	//	'action' texte=STRING;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Reponse:
	//	'reponse' '>>' texte=Qualification 'avec' action=Action;
	public ReponseElements getReponseAccess() {
		return pReponse;
	}
	
	public ParserRule getReponseRule() {
		return getReponseAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
