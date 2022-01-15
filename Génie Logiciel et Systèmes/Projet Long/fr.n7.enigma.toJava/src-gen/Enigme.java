
import java.util.*;
public class Enigme {

	// SCANNER DES REPONSES DE L UTILISATEUR
	public static final Scanner in = new Scanner(System.in);
	
	// TERRITOIRE
	public Territoire territoire;
	
	public Territoire getTerritoire() {
		return this.territoire;
	}
	
	// JOUEUR
	public Joueur joueur;
	
	public Joueur getJoueur() {
		return this.joueur;
	}
	
	public static void Initialiser_Territoire(Enigme enigme) {
		List<Personne> personnes_Depart = new ArrayList<Personne>();
			List<Choix> choix_Sphinx = new ArrayList<Choix>();

				Choix choix_question = enigme.new Choix(null, null);
				List<Reponse> reponses_question = new ArrayList<Reponse>();
				
					List<Objet> objets_c_Ouarzazate = new ArrayList<Objet>();
						objets_c_Ouarzazate.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
					List<Objet> objets_a_Ouarzazate = new ArrayList<Objet>();
						objets_a_Ouarzazate.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
					List<Objet> connaissances_a_Ouarzazate = new ArrayList<Connaissance>();
						connaissances_a_Ouarzazate.add(enigme.new Connaissance("", EtatVisibilite.visible, EtatObligation.obligatoire));
					Action action_Ouarzazate =  enigme.new Action("Ouarzazate", objets_c_Ouarzazate, objets_a_Ouarzazate, connaissances_a_Ouarzazate);
					Reponse reponse_Ouarzazate = enigme.new Reponse("Ouarzazate", enigme.new Qualification("mauvaise"), action_Ouarzazate);
					reponses_question.add(reponse_Ouarzazate);			
					List<Objet> objets_c_Ifrane = new ArrayList<Objet>();
						objets_c_Ifrane.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
					List<Objet> objets_a_Ifrane = new ArrayList<Objet>();
						objets_a_Ifrane.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
					List<Objet> connaissances_a_Ifrane = new ArrayList<Connaissance>();
						connaissances_a_Ifrane.add(enigme.new Connaissance("", EtatVisibilite.visible, EtatObligation.obligatoire));
					Action action_Ifrane =  enigme.new Action("Ifrane", objets_c_Ifrane, objets_a_Ifrane, connaissances_a_Ifrane);
					Reponse reponse_Ifrane = enigme.new Reponse("Ifrane", enigme.new Qualification("mauvaise"), action_Ifrane);
					reponses_question.add(reponse_Ifrane);			
					List<Objet> objets_c_Casablanca = new ArrayList<Objet>();
						objets_c_Casablanca.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
					List<Objet> objets_a_Casablanca = new ArrayList<Objet>();
						objets_a_Casablanca.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
					List<Objet> connaissances_a_Casablanca = new ArrayList<Connaissance>();
						connaissances_a_Casablanca.add(enigme.new Connaissance("", EtatVisibilite.visible, EtatObligation.obligatoire));
					Action action_Casablanca =  enigme.new Action("Casablanca", objets_c_Casablanca, objets_a_Casablanca, connaissances_a_Casablanca);
					Reponse reponse_Casablanca = enigme.new Reponse("Casablanca", enigme.new Qualification("mauvaise"), action_Casablanca);
					reponses_question.add(reponse_Casablanca);			
					List<Objet> objets_c_Rabat = new ArrayList<Objet>();
						objets_c_Rabat.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
					List<Objet> objets_a_Rabat = new ArrayList<Objet>();
						objets_a_Rabat.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
					List<Objet> connaissances_a_Rabat = new ArrayList<Connaissance>();
						connaissances_a_Rabat.add(enigme.new Connaissance("", EtatVisibilite.visible, EtatObligation.obligatoire));
					Action action_Rabat =  enigme.new Action("Rabat", objets_c_Rabat, objets_a_Rabat, connaissances_a_Rabat);
					Reponse reponse_Rabat = enigme.new Reponse("Rabat", enigme.new Qualification("bonne"), action_Rabat);
					reponses_question.add(reponse_Rabat);			
				
				// CHOIX DE L INTERACTION
				choix_question.setName("question");
				choix_question.setReponses(reponses_question);
				choix_Sphinx.add(choix_question);


			// INTERACTION DE LA PERSONNE
			Interaction interaction_Sphinx = enigme.new Interaction("question", choix_Sphinx);
			// QUALIFICATION DE LA PERSONNE
			Qualification texte_Sphinx = enigme.new Qualification("Quel est la capitale du Maroc ?");
			// PERSONNE DU LIEU DE DEBUT
			Personne personne_Sphinx = enigme.new Personne("Sphinx", EtatObligation.obligatoire, EtatVisibilite.visible, texte_Sphinx, interaction_Sphinx);	
			personnes_Depart.add(personne_Sphinx);

		// CONSTRUCTEUR DU LIEU DE DEBUT
		Lieu Depart = enigme.new Lieu("Depart", personnes_Depart);
		
		// LIEUXINTERMEDIAIRES
		List<Lieu> lieuxintermediaires = new ArrayList<Lieu>();
			List<Personne> personnes_ = new ArrayList<Personne>();
			Lieu  = enigme.new Lieu("", personnes_);
			lieuxintermediaires.add();
			
		
		// LIEUXFIN
		List<Lieu> lieuxfin = new ArrayList<Lieu>();
			List<Personne> personnes_Fin = new ArrayList<Personne>();
				List<Choix> choix_Final = new ArrayList<Choix>();
	
					Choix choix_finDePartie = enigme.new Choix(null, null);
					List<Reponse> reponses_finDePartie = new ArrayList<Reponse>();
					
						List<Objet> objets_c_ = new ArrayList<Objet>();
							objets_c_.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
						List<Objet> objets_a_ = new ArrayList<Objet>();
							objets_a_.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
						List<Objet> connaissances_a_ = new ArrayList<Connaissance>();
							connaissances_a_.add(enigme.new Connaissance("", EtatVisibilite.visible, EtatObligation.obligatoire));
						Action action_ =  enigme.new Action("Quitter", objets_c_, objets_a_, connaissances_a_);
						Reponse reponse_ = enigme.new Reponse("", enigme.new Qualification("quitter"), action_);
						reponses_finDePartie.add(reponse_);			
						List<Objet> objets_c_ = new ArrayList<Objet>();
							objets_c_.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
						List<Objet> objets_a_ = new ArrayList<Objet>();
							objets_a_.add(enigme.new Objet("", 0, 0, EtatVisibilite.visible));
						List<Objet> connaissances_a_ = new ArrayList<Connaissance>();
							connaissances_a_.add(enigme.new Connaissance("", EtatVisibilite.visible, EtatObligation.obligatoire));
						Action action_ =  enigme.new Action("Rejouer", objets_c_, objets_a_, connaissances_a_);
						Reponse reponse_ = enigme.new Reponse("", enigme.new Qualification("rejouer"), action_);
						reponses_finDePartie.add(reponse_);			
					
					// CHOIX DE L INTERACTION
					choix_finDePartie.setName("finDePartie");
					choix_finDePartie.setReponses(reponses_finDePartie);
					choix_Final.add(choix_finDePartie);
	
	
				// INTERACTION DE LA PERSONNE
				Interaction interaction_Final = enigme.new Interaction("finDePartie", choix_Final);
				// QUALIFICATION DE LA PERSONNE
				Qualification texte_Final = enigme.new Qualification("");
				// PERSONNE DU LIEU DE DEBUT
				Personne personne_Final = enigme.new Personne("Final", EtatObligation.obligatoire, EtatVisibilite.visible, texte_Sphinx, interaction_Final);	
				personnes_Fin.add(personne_Sphinx);
	
			Lieu Fin = enigme.new Lieu("Fin", personnes_Fin);
			lieuxfin.add(Fin);
		
		// CHEMINS
		List<Chemin> chemins = new ArrayList<Chemin>();
			Chemin chemin_fr.n7.eNIGMA.impl.LieuImpl@546ccad7 (name: Depart)_fr.n7.eNIGMA.impl.LieuImpl@f0e995e (name: Fin) = enigme.new Chemin(EtatChemin.ouvert, EtatObligation.obligatoire, EtatVisibilite.visible, fr.n7.eNIGMA.impl.LieuImpl@546ccad7 (name: Depart), fr.n7.eNIGMA.impl.LieuImpl@f0e995e (name: Fin));
			chemins.add(chemin_Depart_Fin);
	
		// AJOUT DE TOUT CECI AU TERRITOIRE
		enigme.territoire = enigme.new Territoire(, Depart, lieuxintermediaires, lieuxfin, chemins);
	}
	
	private static void Initialiser_Joueur(Enigme enigme) {
		ArrayList<Objet> objets = new ArrayList<Objet>();
			objets.add(enigme.new Objet("Tentative", 3, 1, EtatVisibilite.visible));
		ArrayList<Connaissance> connaissances = new ArrayList<Connaissance>();
			connaissances.add(enigme.new Connaissance("Connaissances", EtatVisibilite.visible, EtatObligation.obligatoire));
		enigme.joueur = enigme.new Joueur(Moi, 1, objets, connaissances);
	}

	public static void main(String[] args) throws InterruptedException {

		// PROGRAMME PRINCIPAL
		System.out.println("BONJOUR, BIENVENUE AU JEU Enigme");
		System.out.println("Pour démarrer le jeu, taper D");
		System.out.println("Pour quitter le jeu, taper Q");

		// LIRE L ENTREE DE L UTILISATEUR
		boolean b = true;
		while(b) {
			String rep = in.nextLine();
			if (rep.contentEquals("Q")) {
				System.out.println("MERCI, A BIENTOT !");
				System.exit(0);
			}
			else if (rep.contentEquals("D")) {
				Demarrer();
				b = false;
			}
			else {
				System.out.println("Veuillez taper soit D soit Q");
			}
		}
	}

	public static void Demarrer() throws InterruptedException {
		System.out.println("Le jeu démarre dans 3 secondes");
		System.out.println("A vos marques");
		Thread.sleep(1000);
		System.out.println("Prets");
		Thread.sleep(1000);
		System.out.println("Partez !");
		Thread.sleep(1000);

		Enigme enigme = new Enigme();
		Initialiser_Territoire(enigme);
		Initialiser_Joueur(enigme);
		
		/**initialiser_Sphinx_reponses();	
		initialiser_Final_reponses();
		initialiser_chemins();
		initialiser_objets_joueur(); */

		System.out.println("Vous etes maintenant au lieu" + enigme.getTerritoire().lieuDebut.name);
		Interagir(enigme);
	}

	public static void Interagir(Enigme_avec_actions enigme) throws InterruptedException {
		// OBJET DU JOUEUR
		int nbtentative = enigme.getJoueur().getObjets().get(0).getOccurrence();
		// ON BOUCLE SUR LES PERSONNES DU TERRITOIRE
		for (int i = 0; i < enigme.getTerritoire().getLieuDebut().getPersonnes().size(); i++) {
			System.out.println("Bonjour, je suis la personne " + enigme.getTerritoire().getLieuDebut().getPersonnes().get(i).getName());
			System.out.println("Vous devez à la question suivante : " + enigme.getTerritoire().getLieuDebut().getPersonnes().get(i).getTexte().getQualification());
			// LA CONDITION DE SORTIE DE LA BOUCLE EST QUE LES TENTATIVES SOIENT TOUTES CONSOMMES
			while(nbtentative != 0) {
				System.out.println("Choisissez entre les réponses suivantes : ");
				for(Reponse r : enigme.getTerritoire().getLieuDebut().getPersonnes().get(i).getInteraction().getChoix().get(0).getReponses()) {
					System.out.println(r.getName());
				}
				String re = in.nextLine();
				String r = re;
				boolean b = true;
				while(b) {
					// AU CAS OU LE JOUEUR N AS PAS TAPE UNE DES REPONSES EXISTANTES
					if(!(enigme.getTerritoire().getLieuDebut().getPersonnes().get(i).getInteraction().getChoix().get(0).getNames().contains(r))) {
						System.out.println("Vous devez taper une des réponses suivantes : ");
						for (Reponse rep : enigme.getTerritoire().getLieuDebut().getPersonnes().get(i).getInteraction().getChoix().get(0).getReponses()) {
	                		System.out.println(rep.getName());
	                	}
	            		r = in.nextLine();
					}
					else {
	        			b = false;
	        		}
				}
				int pos = enigme.getTerritoire().getLieuDebut().getPersonnes().get(i).getInteraction().getChoix().get(0).getNames().indexOf(r);
				String etat = enigme.getTerritoire().getLieuDebut().getPersonnes().get(i).getInteraction().getChoix().get(0).getReponses().get(pos).getTexte().getQualification();
	        	if (etat.contentEquals("bonne")) {
	        		System.out.println("Félicitations, Bonne réponse !");
	        		Thread.sleep(1000);
	        		System.exit(0);
	        	}
				else {
					// ON DIMINUE LE NOMBRE DE TENTATIVES DU JOUEUR SELON L ACTION CORRESPONDANTE 
					nbtentative = nbtentative - enigme.getTerritoire().getLieuDebut().getPersonnes().get(i).getInteraction().getChoix().get(0).getReponses().get(pos).getAction().getObjetsconsommables().get(0).getOccurrence();
					enigme.getTerritoire().getLieuDebut().getPersonnes().get(i).getInteraction().getChoix().get(0).getReponses().remove(pos);
	        		if (nbtentative == 0) {
	        			break;
	        		}
	        		System.out.println("Mauvaise réponse, il ne vous reste que " + nbtentative + " " + enigme.getJoueur().getObjets().get(0).getName());
	        	}
			}
		}
		
		System.out.println("Mauvaise réponse !");
    	Thread.sleep(1000);;
    	System.out.println("Malheureusement, vous avez perdu toutes vos tentatives");
    	System.exit(0);
	}
	
	public class Joueur {
		public String name;
		public int limite;
		public ArrayList<Objet> objets;
		public ArrayList<Connaissance> connaissances;
		public Joueur (String name, int limite, ArrayList<Objet> objets, ArrayList<Connaissance> connaissances) {
			this.connaissances = connaissances;
			this.limite = limite;
			this.name = name;
			this.objets = objets;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getLimite() {
			return limite;
		}
		public void setLimite(int limite) {
			this.limite = limite;
		}
		public ArrayList<Objet> getObjets() {
			return objets;
		}
		public void setObjets(ArrayList<Objet> objets) {
			this.objets = objets;
		}
		public ArrayList<Connaissance> getConnaissances() {
			return connaissances;
		}
		public void setConnaissances(ArrayList<Connaissance> connaissances) {
			this.connaissances = connaissances;
		}
	}
	
	public class Objet {
		public String name;
		public int occurrence;
		public int taille;
		public EtatVisibilite etatvi;
		public Objet(String name, int occurrence, int taille, EtatVisibilite etatvi) {
			this.etatvi = etatvi;
			this.name = name;
			this.occurrence = occurrence;
			this.taille = taille;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getOccurrence() {
			return occurrence;
		}
		public void setOccurrence(int occurrence) {
			this.occurrence = occurrence;
		}
		public int getTaille() {
			return taille;
		}
		public void setTaille(int taille) {
			this.taille = taille;
		}
		public EtatVisibilite getEtatvi() {
			return etatvi;
		}
		public void setEtatvi(EtatVisibilite etatvi) {
			this.etatvi = etatvi;
		}
	}
	
	public class Connaissance {
		public String name;
		public EtatVisibilite etatvi;
		public EtatObligation etatob;
		public Connaissance(String name, EtatVisibilite etatvi, EtatObligation etatob) {
			this.etatob = etatob;
			this.etatvi = etatvi;
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public EtatVisibilite getEtatvi() {
			return etatvi;
		}
		public void setEtatvi(EtatVisibilite etatvi) {
			this.etatvi = etatvi;
		}
		public EtatObligation getEtatob() {
			return etatob;
		}
		public void setEtatob(EtatObligation etatob) {
			this.etatob = etatob;
		}
	}
	
	public class Territoire {
		public String name;
		public Lieu lieuDebut;
		public List<Lieu> lieuxintermediaires;
		public List<Lieu> lieuxFin;
		public List<Chemin> chemins;
		public Territoire(String name, Lieu lieudebut, List<Lieu> lieuxintermediaires2, List<Lieu> lieuxfin2, List<Chemin> chemins2) {
			this.chemins = chemins2;
			this.lieuDebut = lieudebut;
			this.lieuxintermediaires = lieuxintermediaires2;
			this.lieuxFin = lieuxfin2;
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Lieu getLieuDebut() {
			return lieuDebut;
		}
		public void setLieuDebut(Lieu lieuDebut) {
			this.lieuDebut = lieuDebut;
		}
		public List<Lieu> getLieuxintermediaires() {
			return lieuxintermediaires;
		}
		public void setLieuxintermediaires(List<Lieu> lieuxintermediaires) {
			this.lieuxintermediaires = lieuxintermediaires;
		}
		public List<Lieu> getLieuxFin() {
			return lieuxFin;
		}
		public void setLieuxFin(List<Lieu> lieuxFin) {
			this.lieuxFin = lieuxFin;
		}
		public List<Chemin> getChemins() {
			return chemins;
		}
		public void setChemins(List<Chemin> chemins) {
			this.chemins = chemins;
		}
		
		
	}
	
	public class Lieu {
		public String name;
		public List<Personne> personnes;
		public Lieu (String name, List<Personne> personnes) {
			this.name = name;
			this.personnes = personnes;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Personne> getPersonnes() {
			return personnes;
		}
		public void setPersonnes(List<Personne> personnes) {
			this.personnes = personnes;
		}
	}
	
	public class Chemin {
		public EtatChemin etatch;
		public EtatObligation etatob;
		public EtatVisibilite etatvi;
		public Lieu precedent;
		public Lieu suivant;
		public Chemin(EtatChemin etatch, EtatObligation etatob, EtatVisibilite etatvi, Lieu precedent, Lieu suivant) {
			this.etatch = etatch;
			this.etatob = etatob;
			this.etatvi = etatvi;
			this.precedent = precedent;
			this.suivant = suivant;
		}
		public EtatChemin getEtatch() {
			return etatch;
		}
		public void setEtatch(EtatChemin etatch) {
			this.etatch = etatch;
		}
		public EtatObligation getEtatob() {
			return etatob;
		}
		public void setEtatob(EtatObligation etatob) {
			this.etatob = etatob;
		}
		public EtatVisibilite getEtatvi() {
			return etatvi;
		}
		public void setEtatvi(EtatVisibilite etatvi) {
			this.etatvi = etatvi;
		}
		public Lieu getPrecedent() {
			return precedent;
		}
		public void setPrecedent(Lieu precedent) {
			this.precedent = precedent;
		}
		public Lieu getSuivant() {
			return suivant;
		}
		public void setSuivant(Lieu suivant) {
			this.suivant = suivant;
		}
	}
	
	public class Personne {
		public String name;
		public EtatObligation etatob;
		public EtatVisibilite etatvi;
		public Qualification texte;
		public Interaction interaction;
		public Personne(String name, EtatObligation etatob, EtatVisibilite etatvi, Qualification texte, Interaction interaction) {
			this.name = name;
			this.etatob = etatob;
			this.etatvi = etatvi;
			this.texte = texte;
			this.interaction = interaction;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public EtatObligation getEtatob() {
			return etatob;
		}
		public void setEtatob(EtatObligation etatob) {
			this.etatob = etatob;
		}
		public EtatVisibilite getEtatvi() {
			return etatvi;
		}
		public void setEtatvi(EtatVisibilite etatvi) {
			this.etatvi = etatvi;
		}
		public Qualification getTexte() {
			return texte;
		}
		public void setTexte(Qualification texte) {
			this.texte = texte;
		}
		public Interaction getInteraction() {
			return interaction;
		}
		public void setInteraction(Interaction interaction) {
			this.interaction = interaction;
		}
	}
	
	public class Qualification {
		public String qualification;
		public Qualification(String qualification) {
			this.qualification = qualification;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
	}
	
	public class Interaction {
		public String name;
		public List<Choix> choix;
		public Interaction (String name, List<Choix> choix) {
			this.choix = choix;
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Choix> getChoix() {
			return choix;
		}
		public void setChoix(List<Choix> choix) {
			this.choix = choix;
		}
	}
	
	public class Choix {
		public String name;
		public List<Reponse> reponses;
		public Choix(String name, List<Reponse> reponses) {
			this.name = name;
			this.reponses = reponses;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Reponse> getReponses() {
			return reponses;
		}
		public void setReponses(List<Reponse> reponses) {
			this.reponses = reponses;
		}
		public ArrayList<String> getNames() {
			ArrayList<String> names = new ArrayList<String>();
			reponses.forEach((n) -> names.add(n.getName()));
			return names;
		}
	}
	
	public class Reponse {
		public String name;
		public Qualification texte;
		public Action action;
		public Reponse(String name, Qualification texte, Action action) {
			this.name = name;
			this.action = action;
			this.texte = texte;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Qualification getTexte() {
			return texte;
		}
		public void setTexte(Qualification texte) {
			this.texte = texte;
		}
		public Action getAction() {
			return action;
		}
		public void setAction(Action action) {
			this.action = action;
		}
	}
	
	public class Action {
		public String texte;
		public List<Objet> objetsconsommables;
		public List<Objet> objetsattribuables;
		public List<Connaissance> connaissancesattribuables;
		public Action(String texte, List<Objet> oc, List<Objet> oa, List<Connaissance> ca) {
			this.texte = texte;
			this.objetsconsommables = oc;
			this.objetsattribuables = oa;
			this.connaissancesattribuables = ca;
		}
		public String getTexte() {
			return texte;
		}
		public void setTexte(String texte) {
			this.texte = texte;
		}
		public List<Objet> getObjetsconsommables() {
			return objetsconsommables;
		}
		public void setObjetsconsommables(List<Objet> objetsconsommables) {
			this.objetsconsommables = objetsconsommables;
		}
		public List<Objet> getObjetsattribuables() {
			return objetsattribuables;
		}
		public void setObjetsattribuables(List<Objet> objetsattribuables) {
			this.objetsattribuables = objetsattribuables;
		}
		public List<Connaissance> getConnaissancesattribuables() {
			return connaissancesattribuables;
		}
		public void setConnaissancesattribuables(List<Connaissance> connaissancesattribuables) {
			this.connaissancesattribuables = connaissancesattribuables;
		}
	}
	
	private enum EtatVisibilite {
		visible, nonvisible
	}
	
	private enum EtatObligation {
		obligatoire, nonobligatoire
	}
	
	private enum EtatChemin {
		ouvert, ferme
	}
	
	private enum EtatObtention {
		obtenue, nonobtenue
	}
	
}

