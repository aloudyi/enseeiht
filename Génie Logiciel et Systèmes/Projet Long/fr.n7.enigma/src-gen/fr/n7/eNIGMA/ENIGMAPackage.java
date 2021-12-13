/**
 * generated by Xtext 2.23.0
 */
package fr.n7.eNIGMA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.n7.eNIGMA.ENIGMAFactory
 * @model kind="package"
 * @generated
 */
public interface ENIGMAPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eNIGMA";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.n7.fr/ENIGMA";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eNIGMA";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ENIGMAPackage eINSTANCE = fr.n7.eNIGMA.impl.ENIGMAPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.JeuImpl <em>Jeu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.JeuImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getJeu()
   * @generated
   */
  int JEU = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEU__NAME = 0;

  /**
   * The feature id for the '<em><b>Territoire</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEU__TERRITOIRE = 1;

  /**
   * The feature id for the '<em><b>Joueur</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEU__JOUEUR = 2;

  /**
   * The number of structural features of the '<em>Jeu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JEU_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.JoueurImpl <em>Joueur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.JoueurImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getJoueur()
   * @generated
   */
  int JOUEUR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOUEUR__NAME = 0;

  /**
   * The feature id for the '<em><b>Objets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOUEUR__OBJETS = 1;

  /**
   * The feature id for the '<em><b>Connaissances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOUEUR__CONNAISSANCES = 2;

  /**
   * The number of structural features of the '<em>Joueur</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOUEUR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.ConnaissanceImpl <em>Connaissance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.ConnaissanceImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getConnaissance()
   * @generated
   */
  int CONNAISSANCE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNAISSANCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Connaissance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNAISSANCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.ObjetImpl <em>Objet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.ObjetImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getObjet()
   * @generated
   */
  int OBJET = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJET__NAME = 0;

  /**
   * The feature id for the '<em><b>Taille</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJET__TAILLE = 1;

  /**
   * The number of structural features of the '<em>Objet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.TerritoireImpl <em>Territoire</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.TerritoireImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getTerritoire()
   * @generated
   */
  int TERRITOIRE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERRITOIRE__NAME = 0;

  /**
   * The feature id for the '<em><b>Lieu Debut</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERRITOIRE__LIEU_DEBUT = 1;

  /**
   * The feature id for the '<em><b>Lieux Fin</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERRITOIRE__LIEUX_FIN = 2;

  /**
   * The feature id for the '<em><b>Chemins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERRITOIRE__CHEMINS = 3;

  /**
   * The number of structural features of the '<em>Territoire</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERRITOIRE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.ChoixImpl <em>Choix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.ChoixImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getChoix()
   * @generated
   */
  int CHOIX = 5;

  /**
   * The feature id for the '<em><b>Reponses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOIX__REPONSES = 0;

  /**
   * The number of structural features of the '<em>Choix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.InteractionImpl <em>Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.InteractionImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getInteraction()
   * @generated
   */
  int INTERACTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Choix</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__CHOIX = 1;

  /**
   * The number of structural features of the '<em>Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.PersonneImpl <em>Personne</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.PersonneImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getPersonne()
   * @generated
   */
  int PERSONNE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONNE__NAME = 0;

  /**
   * The feature id for the '<em><b>Texte</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONNE__TEXTE = 1;

  /**
   * The feature id for the '<em><b>Interaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONNE__INTERACTION = 2;

  /**
   * The number of structural features of the '<em>Personne</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSONNE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.LieuImpl <em>Lieu</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.LieuImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getLieu()
   * @generated
   */
  int LIEU = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIEU__NAME = 0;

  /**
   * The feature id for the '<em><b>Personne</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIEU__PERSONNE = 1;

  /**
   * The number of structural features of the '<em>Lieu</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIEU_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.CheminImpl <em>Chemin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.CheminImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getChemin()
   * @generated
   */
  int CHEMIN = 9;

  /**
   * The feature id for the '<em><b>Precedent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEMIN__PRECEDENT = 0;

  /**
   * The feature id for the '<em><b>Suivant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEMIN__SUIVANT = 1;

  /**
   * The number of structural features of the '<em>Chemin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHEMIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.QualificationImpl <em>Qualification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.QualificationImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getQualification()
   * @generated
   */
  int QUALIFICATION = 10;

  /**
   * The feature id for the '<em><b>Qualification</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION__QUALIFICATION = 0;

  /**
   * The number of structural features of the '<em>Qualification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.ActionImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getAction()
   * @generated
   */
  int ACTION = 11;

  /**
   * The feature id for the '<em><b>Texte</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TEXTE = 0;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.n7.eNIGMA.impl.ReponseImpl <em>Reponse</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.eNIGMA.impl.ReponseImpl
   * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getReponse()
   * @generated
   */
  int REPONSE = 12;

  /**
   * The feature id for the '<em><b>Texte</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPONSE__TEXTE = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPONSE__ACTION = 1;

  /**
   * The number of structural features of the '<em>Reponse</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPONSE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Jeu <em>Jeu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jeu</em>'.
   * @see fr.n7.eNIGMA.Jeu
   * @generated
   */
  EClass getJeu();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Jeu#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.eNIGMA.Jeu#getName()
   * @see #getJeu()
   * @generated
   */
  EAttribute getJeu_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.eNIGMA.Jeu#getTerritoire <em>Territoire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Territoire</em>'.
   * @see fr.n7.eNIGMA.Jeu#getTerritoire()
   * @see #getJeu()
   * @generated
   */
  EReference getJeu_Territoire();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.eNIGMA.Jeu#getJoueur <em>Joueur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Joueur</em>'.
   * @see fr.n7.eNIGMA.Jeu#getJoueur()
   * @see #getJeu()
   * @generated
   */
  EReference getJeu_Joueur();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Joueur <em>Joueur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Joueur</em>'.
   * @see fr.n7.eNIGMA.Joueur
   * @generated
   */
  EClass getJoueur();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Joueur#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.eNIGMA.Joueur#getName()
   * @see #getJoueur()
   * @generated
   */
  EAttribute getJoueur_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.eNIGMA.Joueur#getObjets <em>Objets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objets</em>'.
   * @see fr.n7.eNIGMA.Joueur#getObjets()
   * @see #getJoueur()
   * @generated
   */
  EReference getJoueur_Objets();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.eNIGMA.Joueur#getConnaissances <em>Connaissances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connaissances</em>'.
   * @see fr.n7.eNIGMA.Joueur#getConnaissances()
   * @see #getJoueur()
   * @generated
   */
  EReference getJoueur_Connaissances();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Connaissance <em>Connaissance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connaissance</em>'.
   * @see fr.n7.eNIGMA.Connaissance
   * @generated
   */
  EClass getConnaissance();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Connaissance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.eNIGMA.Connaissance#getName()
   * @see #getConnaissance()
   * @generated
   */
  EAttribute getConnaissance_Name();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Objet <em>Objet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Objet</em>'.
   * @see fr.n7.eNIGMA.Objet
   * @generated
   */
  EClass getObjet();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Objet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.eNIGMA.Objet#getName()
   * @see #getObjet()
   * @generated
   */
  EAttribute getObjet_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Objet#getTaille <em>Taille</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Taille</em>'.
   * @see fr.n7.eNIGMA.Objet#getTaille()
   * @see #getObjet()
   * @generated
   */
  EAttribute getObjet_Taille();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Territoire <em>Territoire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Territoire</em>'.
   * @see fr.n7.eNIGMA.Territoire
   * @generated
   */
  EClass getTerritoire();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Territoire#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.eNIGMA.Territoire#getName()
   * @see #getTerritoire()
   * @generated
   */
  EAttribute getTerritoire_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.eNIGMA.Territoire#getLieuDebut <em>Lieu Debut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lieu Debut</em>'.
   * @see fr.n7.eNIGMA.Territoire#getLieuDebut()
   * @see #getTerritoire()
   * @generated
   */
  EReference getTerritoire_LieuDebut();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.eNIGMA.Territoire#getLieuxFin <em>Lieux Fin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lieux Fin</em>'.
   * @see fr.n7.eNIGMA.Territoire#getLieuxFin()
   * @see #getTerritoire()
   * @generated
   */
  EReference getTerritoire_LieuxFin();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.eNIGMA.Territoire#getChemins <em>Chemins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Chemins</em>'.
   * @see fr.n7.eNIGMA.Territoire#getChemins()
   * @see #getTerritoire()
   * @generated
   */
  EReference getTerritoire_Chemins();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Choix <em>Choix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choix</em>'.
   * @see fr.n7.eNIGMA.Choix
   * @generated
   */
  EClass getChoix();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.eNIGMA.Choix#getReponses <em>Reponses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reponses</em>'.
   * @see fr.n7.eNIGMA.Choix#getReponses()
   * @see #getChoix()
   * @generated
   */
  EReference getChoix_Reponses();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction</em>'.
   * @see fr.n7.eNIGMA.Interaction
   * @generated
   */
  EClass getInteraction();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Interaction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.eNIGMA.Interaction#getName()
   * @see #getInteraction()
   * @generated
   */
  EAttribute getInteraction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.eNIGMA.Interaction#getChoix <em>Choix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choix</em>'.
   * @see fr.n7.eNIGMA.Interaction#getChoix()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Choix();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Personne <em>Personne</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Personne</em>'.
   * @see fr.n7.eNIGMA.Personne
   * @generated
   */
  EClass getPersonne();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Personne#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.eNIGMA.Personne#getName()
   * @see #getPersonne()
   * @generated
   */
  EAttribute getPersonne_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.eNIGMA.Personne#getTexte <em>Texte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Texte</em>'.
   * @see fr.n7.eNIGMA.Personne#getTexte()
   * @see #getPersonne()
   * @generated
   */
  EReference getPersonne_Texte();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.eNIGMA.Personne#getInteraction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interaction</em>'.
   * @see fr.n7.eNIGMA.Personne#getInteraction()
   * @see #getPersonne()
   * @generated
   */
  EReference getPersonne_Interaction();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Lieu <em>Lieu</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lieu</em>'.
   * @see fr.n7.eNIGMA.Lieu
   * @generated
   */
  EClass getLieu();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Lieu#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.eNIGMA.Lieu#getName()
   * @see #getLieu()
   * @generated
   */
  EAttribute getLieu_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.eNIGMA.Lieu#getPersonne <em>Personne</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Personne</em>'.
   * @see fr.n7.eNIGMA.Lieu#getPersonne()
   * @see #getLieu()
   * @generated
   */
  EReference getLieu_Personne();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Chemin <em>Chemin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chemin</em>'.
   * @see fr.n7.eNIGMA.Chemin
   * @generated
   */
  EClass getChemin();

  /**
   * Returns the meta object for the reference '{@link fr.n7.eNIGMA.Chemin#getPrecedent <em>Precedent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Precedent</em>'.
   * @see fr.n7.eNIGMA.Chemin#getPrecedent()
   * @see #getChemin()
   * @generated
   */
  EReference getChemin_Precedent();

  /**
   * Returns the meta object for the reference '{@link fr.n7.eNIGMA.Chemin#getSuivant <em>Suivant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Suivant</em>'.
   * @see fr.n7.eNIGMA.Chemin#getSuivant()
   * @see #getChemin()
   * @generated
   */
  EReference getChemin_Suivant();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Qualification <em>Qualification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualification</em>'.
   * @see fr.n7.eNIGMA.Qualification
   * @generated
   */
  EClass getQualification();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Qualification#getQualification <em>Qualification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualification</em>'.
   * @see fr.n7.eNIGMA.Qualification#getQualification()
   * @see #getQualification()
   * @generated
   */
  EAttribute getQualification_Qualification();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see fr.n7.eNIGMA.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.eNIGMA.Action#getTexte <em>Texte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Texte</em>'.
   * @see fr.n7.eNIGMA.Action#getTexte()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Texte();

  /**
   * Returns the meta object for class '{@link fr.n7.eNIGMA.Reponse <em>Reponse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reponse</em>'.
   * @see fr.n7.eNIGMA.Reponse
   * @generated
   */
  EClass getReponse();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.eNIGMA.Reponse#getTexte <em>Texte</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Texte</em>'.
   * @see fr.n7.eNIGMA.Reponse#getTexte()
   * @see #getReponse()
   * @generated
   */
  EReference getReponse_Texte();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.eNIGMA.Reponse#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see fr.n7.eNIGMA.Reponse#getAction()
   * @see #getReponse()
   * @generated
   */
  EReference getReponse_Action();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ENIGMAFactory getENIGMAFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.JeuImpl <em>Jeu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.JeuImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getJeu()
     * @generated
     */
    EClass JEU = eINSTANCE.getJeu();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JEU__NAME = eINSTANCE.getJeu_Name();

    /**
     * The meta object literal for the '<em><b>Territoire</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEU__TERRITOIRE = eINSTANCE.getJeu_Territoire();

    /**
     * The meta object literal for the '<em><b>Joueur</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JEU__JOUEUR = eINSTANCE.getJeu_Joueur();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.JoueurImpl <em>Joueur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.JoueurImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getJoueur()
     * @generated
     */
    EClass JOUEUR = eINSTANCE.getJoueur();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOUEUR__NAME = eINSTANCE.getJoueur_Name();

    /**
     * The meta object literal for the '<em><b>Objets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOUEUR__OBJETS = eINSTANCE.getJoueur_Objets();

    /**
     * The meta object literal for the '<em><b>Connaissances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOUEUR__CONNAISSANCES = eINSTANCE.getJoueur_Connaissances();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.ConnaissanceImpl <em>Connaissance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.ConnaissanceImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getConnaissance()
     * @generated
     */
    EClass CONNAISSANCE = eINSTANCE.getConnaissance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNAISSANCE__NAME = eINSTANCE.getConnaissance_Name();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.ObjetImpl <em>Objet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.ObjetImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getObjet()
     * @generated
     */
    EClass OBJET = eINSTANCE.getObjet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJET__NAME = eINSTANCE.getObjet_Name();

    /**
     * The meta object literal for the '<em><b>Taille</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJET__TAILLE = eINSTANCE.getObjet_Taille();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.TerritoireImpl <em>Territoire</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.TerritoireImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getTerritoire()
     * @generated
     */
    EClass TERRITOIRE = eINSTANCE.getTerritoire();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERRITOIRE__NAME = eINSTANCE.getTerritoire_Name();

    /**
     * The meta object literal for the '<em><b>Lieu Debut</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERRITOIRE__LIEU_DEBUT = eINSTANCE.getTerritoire_LieuDebut();

    /**
     * The meta object literal for the '<em><b>Lieux Fin</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERRITOIRE__LIEUX_FIN = eINSTANCE.getTerritoire_LieuxFin();

    /**
     * The meta object literal for the '<em><b>Chemins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERRITOIRE__CHEMINS = eINSTANCE.getTerritoire_Chemins();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.ChoixImpl <em>Choix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.ChoixImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getChoix()
     * @generated
     */
    EClass CHOIX = eINSTANCE.getChoix();

    /**
     * The meta object literal for the '<em><b>Reponses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHOIX__REPONSES = eINSTANCE.getChoix_Reponses();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.InteractionImpl <em>Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.InteractionImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getInteraction()
     * @generated
     */
    EClass INTERACTION = eINSTANCE.getInteraction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION__NAME = eINSTANCE.getInteraction_Name();

    /**
     * The meta object literal for the '<em><b>Choix</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__CHOIX = eINSTANCE.getInteraction_Choix();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.PersonneImpl <em>Personne</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.PersonneImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getPersonne()
     * @generated
     */
    EClass PERSONNE = eINSTANCE.getPersonne();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSONNE__NAME = eINSTANCE.getPersonne_Name();

    /**
     * The meta object literal for the '<em><b>Texte</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSONNE__TEXTE = eINSTANCE.getPersonne_Texte();

    /**
     * The meta object literal for the '<em><b>Interaction</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSONNE__INTERACTION = eINSTANCE.getPersonne_Interaction();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.LieuImpl <em>Lieu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.LieuImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getLieu()
     * @generated
     */
    EClass LIEU = eINSTANCE.getLieu();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIEU__NAME = eINSTANCE.getLieu_Name();

    /**
     * The meta object literal for the '<em><b>Personne</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIEU__PERSONNE = eINSTANCE.getLieu_Personne();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.CheminImpl <em>Chemin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.CheminImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getChemin()
     * @generated
     */
    EClass CHEMIN = eINSTANCE.getChemin();

    /**
     * The meta object literal for the '<em><b>Precedent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHEMIN__PRECEDENT = eINSTANCE.getChemin_Precedent();

    /**
     * The meta object literal for the '<em><b>Suivant</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHEMIN__SUIVANT = eINSTANCE.getChemin_Suivant();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.QualificationImpl <em>Qualification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.QualificationImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getQualification()
     * @generated
     */
    EClass QUALIFICATION = eINSTANCE.getQualification();

    /**
     * The meta object literal for the '<em><b>Qualification</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFICATION__QUALIFICATION = eINSTANCE.getQualification_Qualification();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.ActionImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__TEXTE = eINSTANCE.getAction_Texte();

    /**
     * The meta object literal for the '{@link fr.n7.eNIGMA.impl.ReponseImpl <em>Reponse</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.eNIGMA.impl.ReponseImpl
     * @see fr.n7.eNIGMA.impl.ENIGMAPackageImpl#getReponse()
     * @generated
     */
    EClass REPONSE = eINSTANCE.getReponse();

    /**
     * The meta object literal for the '<em><b>Texte</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPONSE__TEXTE = eINSTANCE.getReponse_Texte();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPONSE__ACTION = eINSTANCE.getReponse_Action();

  }

} //ENIGMAPackage
