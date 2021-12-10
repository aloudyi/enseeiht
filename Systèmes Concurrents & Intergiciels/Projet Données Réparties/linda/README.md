
### Déterminer l'interface
* `startReading`
* `finishReading`
* `startTaking`
* `finishTaking`
* `startWriting`
* `finishWriting`

### Déterminer les prédicats d'acceptation des opérations
* On ne peut entamer le début de lecture `(startReading)`  
que s'il n'y a pas d'écriture en cours ni de prise en cours.  
`(currentlyWriting, currentlyTaking)` 
* On ne peut entamer le début de prise `(startTaking)` que  
s'il n'y a pas de lecture en cours, de lecteurs en attente,  
d'écriture en cours ni de prise en cours.  
`(currentlyWriting, currentlyTaking, readers == 0, waitingReaders == 0)`
* On ne peut entamer le début d'écriture `(startReading)` que  
s'il n'y a pas de lecture en cours, de lecteurs en attente,  
d'écriture en cours ni de prise en cours.  
`(currentlyWriting, currentlyTaking, readers == 0, waitingReaders == 0)`

### Déterminer les variables d'états pour écrire les prédicats
* *Booléens* `currentlyWriting`, `currentlyTaking`.  
* *Entiers* `readers`, `waitingReaders`.

### Déterminer l'invariant du moniteur et les prédicats
#### Prédicats :
* Pas de lecture en cours et pas de prise en cours :  
 `DebutLecture := (!currentlyWriting && ! currentlyTaking)`
* Pas de lecture/écriture/prise en cours, de lecteurs en attente :  
 `DebutPrise := (!currentlyWriting && ! currentlyTaking && (readers == 0) && (waitingReaders ==0))`
* Pas de lecture/écriture/prise en cours, de lecteurs en attente :  
 `DebutEcriture := (!currentlyWriting && ! currentlyTaking && (readers == 0) && (waitingReaders ==0))`

 ### Pour chaque prédicat définir une variable condition
 * `DebutLecture -> readPossible`
 * `DebutPrise -> takePossible`
 * `DebutEcriture -> writePossible`