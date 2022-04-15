package linda.search.concurrentServer;
public enum Code {
    Request, // Request, UUID, String
    Value,   // Value, String
    Result,   // Result, UUID, String, Int
    Searcher, // Result, "done", UUID
    Taille, // nombre de valeurs dans la mémoire
    RequetePriseEnCharge, //RequetePriseEnCharge par un searcher
    FinPriseEnCharge, //FinPriseEnCharge par un chercheur
    nbValeurDejaTraite, //nbValeurDejaTraitées pour une requete donnée par différent chercheurs
    estEnTraitement,
    Annuler,
}
