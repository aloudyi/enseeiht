## SOCKETS

#### Récupérer une adresse IP avec InetAdress :

Le package **java.net** fournit une classe InetAdress, qui nous permet  
de récupérer et manipuler son **adresse internet** (**IP**).  
Cette classe n'a pas de constructeur, pour avoir une instance de cette  
classe on a besoin de **méthode de classe** :  
##### Méthode de classe InetAdress (Qui la génère) :
* **getLocalHost()** : elle retourne un objet qui contient l'addresse  
IP de la machine locale.
* **getByName(String nomdelamachine)** : elle retourne un objet qui  
contient l'addresse IP de la machine dont le nom est passé en paramètre.
* **getAllByName(String nomdelamachine)** : elle retourne un tableau  
d'objet qui contient l'ensemble d'adresses IP de la machine qui correspond  
au nom passé en paramètre.

##### Méthode de la classe InetAdress (Applicable dessus) :
* **getHostName()** : elle retourne le nom de la machine dont l'adresse  
est stockée dans l'objet.
* **getAdress()** : elle retourne l'adresse IP stockée dans l'objet  
sous forme d'un tableau de 4 octets.
* **toString()** : elle retourne un String qui correspond au nom de la  
machine et son adresse.

#### Qu'est ce qu'un Socket ?
Un **socket** est un point de terminaison d'une communication **bidirectionnelle**,   
c'est-à-dire **entre** un client et un serveur **en cours d'exécution** sur un réseau  
donné. Les deux sont liés par un même numéro de port TCP de sorte que la couche  
puisse identifier la demande de partage de données.

##### Classe ServerSocket sur java.net :
Le **ServerSocket** est une sorte de prise que les serveurs utilisent pour écouter  
et accepter les connextion des clients. On l'instantie par :  
* **ServerSocket ss = new ServerSocket(portnumber)**  
Si le portnumber est égal à 0, **le socket est crée sur n'importe quel port libre**.
* **ServerSocket ss = new ServerSocket(portnumber, maxnumber)**  
Le paramètre **maxnumber** est le nombre de connexions traitées simultanément.  
Par exemple, après **maxnumber** de tentative de connexions consécutives autorisées  
les connexions son refusées jusqu'à libération de slots.
* **ServerSocket ss = new ServerSocket(portnumber, maxnumber, localadress)**  
(self explanatory).

##### Classe Socket sur java.net :
Pour le client, il doit connaître le nom de la machine sur laquelle le serveur est en  
exécution et le numéro de port sur lequel il va écouter. Le client demande alors une  
connexion au serveur en s'identifiant avec son adresse IP et le numéro de port auquel  
il est lié.
* **Socket s = new Socket(param1, param2)**  
 * **param1** correspond à l'identité du client, il peut soit être une chaîne de  
 caractères ou de type InetAdress.
 * **param2** correspond au numéro de port sur lequel on souhaite se connecter sur  
 le serveur.
* **Socket s = new Socket(adressedistante, portdistant, adresselocale, portlocale)**  
On peut aussi ajouter l'adresse locale en troisième paramètre, et le numéro de port local  
en quatrième paramètre.  
  
Après tentative de connexion, le serveur accepte la connexion du client, et reçoit un  
nouveau socket lié au même port local (Pour communiquer avec le socket du client).  
** Socket socketduserveur = ss.server.accept()**
> Une fois le socket créé, l'attente de connexion provenant du client se fait à l'aide  
de la méthode accept().  
La méthode accept() reste bloquante tant qu'elle n'a pas détecté de connexion.  
Afin d'éviter une attente infinie, il est possible de spécifier un délai maximal d'attente  
à l'aide d'un mutateur setSoTimeout, si délai max dépassé une exception  
**InterrupterIOException** est levée.  

#### Echange de message :
Il est possible de récupérer les flux d'entrées/sorties entre sockets une fois leur connexion  
est établie. Il existe deux méthode pour récupérer ces flux :  
* **getInputStream()** : de la classe **InputStream**, elle permet de gérer les flux entrants.
* **getOutputStream()** : de la classe **OutputStream**, elle permet de gérer les flux sortants.
En général, le type d'entrée/sortie utilisée **BufferedReader** et **InputStreamReader** pour  
la lecture, et **PrintWriter** pour l'écriture.
* **BufferedReader** : cette classe permet de lire des caractères d'un flux tamponné,  
afin de faire des lectures plus rapides.
* **InputStreamReader** : convertit un flux binaire en flux de caractères, elle convertit  
un objet de type **InputStream** en objet de type **Reader**.
* **PrintWriter** : cette classe ajoute à un flux la possibilité de faire des écritures sous  
forme de texte des types primitifs Java, et des chaînes de caractères.  

##### Côté Serveur
>Après établissement de la connexion, le serveur obtient son socket qu'il utilise pour gérer le  
flux sortant à l'aide de socketduserveur.getOutputStream() ; ensuite, à l'aide de la méthode println  
on envoie un message au client, on utilise flush pour vider le buffer tout simplement. Et pour finir   
on ferme la connexion. 
 
##### Côté Client
>Après avoir obtenu notre socket, on utilise socket.getInputStream() pour récupérer le flux sortant.  
La méthode readLine() nous permet de lire une chaîne de caractères.  
Pour finir, on affiche le message reçu et on ferme notre socket.

#### Utilisation des threads :
Après avoir créer un objet ServerSocket par le serveur, on le place comme paramètre à un constructeur  
de la classe qui implémente **Runnable** ou la classe **Thread**, dès qu'un client souhaite  
se connecter au serveur, un **Thread** s'occupe de la connexion, il ne sera plus la peine de faire  
appel au serveur lorsqu'un client souhaite se connecter, tout le boulot sera confié au Thread.