## SOCKETS

#### R�cup�rer une adresse IP avec InetAdress :

Le package **java.net** fournit une classe InetAdress, qui nous permet  
de r�cup�rer et manipuler son **adresse internet** (**IP**).  
Cette classe n'a pas de constructeur, pour avoir une instance de cette  
classe on a besoin de **m�thode de classe** :  
##### M�thode de classe InetAdress (Qui la g�n�re) :
* **getLocalHost()** : elle retourne un objet qui contient l'addresse  
IP de la machine locale.
* **getByName(String nomdelamachine)** : elle retourne un objet qui  
contient l'addresse IP de la machine dont le nom est pass� en param�tre.
* **getAllByName(String nomdelamachine)** : elle retourne un tableau  
d'objet qui contient l'ensemble d'adresses IP de la machine qui correspond  
au nom pass� en param�tre.

##### M�thode de la classe InetAdress (Applicable dessus) :
* **getHostName()** : elle retourne le nom de la machine dont l'adresse  
est stock�e dans l'objet.
* **getAdress()** : elle retourne l'adresse IP stock�e dans l'objet  
sous forme d'un tableau de 4 octets.
* **toString()** : elle retourne un String qui correspond au nom de la  
machine et son adresse.

#### Qu'est ce qu'un Socket ?
Un **socket** est un point de terminaison d'une communication **bidirectionnelle**,   
c'est-�-dire **entre** un client et un serveur **en cours d'ex�cution** sur un r�seau  
donn�. Les deux sont li�s par un m�me num�ro de port TCP de sorte que la couche  
puisse identifier la demande de partage de donn�es.

##### Classe ServerSocket sur java.net :
Le **ServerSocket** est une sorte de prise que les serveurs utilisent pour �couter  
et accepter les connextion des clients. On l'instantie par :  
* **ServerSocket ss = new ServerSocket(portnumber)**  
Si le portnumber est �gal � 0, **le socket est cr�e sur n'importe quel port libre**.
* **ServerSocket ss = new ServerSocket(portnumber, maxnumber)**  
Le param�tre **maxnumber** est le nombre de connexions trait�es simultan�ment.  
Par exemple, apr�s **maxnumber** de tentative de connexions cons�cutives autoris�es  
les connexions son refus�es jusqu'� lib�ration de slots.
* **ServerSocket ss = new ServerSocket(portnumber, maxnumber, localadress)**  
(self explanatory).

##### Classe Socket sur java.net :
Pour le client, il doit conna�tre le nom de la machine sur laquelle le serveur est en  
ex�cution et le num�ro de port sur lequel il va �couter. Le client demande alors une  
connexion au serveur en s'identifiant avec son adresse IP et le num�ro de port auquel  
il est li�.
* **Socket s = new Socket(param1, param2)**  
 * **param1** correspond � l'identit� du client, il peut soit �tre une cha�ne de  
 caract�res ou de type InetAdress.
 * **param2** correspond au num�ro de port sur lequel on souhaite se connecter sur  
 le serveur.
* **Socket s = new Socket(adressedistante, portdistant, adresselocale, portlocale)**  
On peut aussi ajouter l'adresse locale en troisi�me param�tre, et le num�ro de port local  
en quatri�me param�tre.  
  
Apr�s tentative de connexion, le serveur accepte la connexion du client, et re�oit un  
nouveau socket li� au m�me port local (Pour communiquer avec le socket du client).  
** Socket socketduserveur = ss.server.accept()**
> Une fois le socket cr��, l'attente de connexion provenant du client se fait � l'aide  
de la m�thode accept().  
La m�thode accept() reste bloquante tant qu'elle n'a pas d�tect� de connexion.  
Afin d'�viter une attente infinie, il est possible de sp�cifier un d�lai maximal d'attente  
� l'aide d'un mutateur setSoTimeout, si d�lai max d�pass� une exception  
**InterrupterIOException** est lev�e.  

#### Echange de message :
Il est possible de r�cup�rer les flux d'entr�es/sorties entre sockets une fois leur connexion  
est �tablie. Il existe deux m�thode pour r�cup�rer ces flux :  
* **getInputStream()** : de la classe **InputStream**, elle permet de g�rer les flux entrants.
* **getOutputStream()** : de la classe **OutputStream**, elle permet de g�rer les flux sortants.
En g�n�ral, le type d'entr�e/sortie utilis�e **BufferedReader** et **InputStreamReader** pour  
la lecture, et **PrintWriter** pour l'�criture.
* **BufferedReader** : cette classe permet de lire des caract�res d'un flux tamponn�,  
afin de faire des lectures plus rapides.
* **InputStreamReader** : convertit un flux binaire en flux de caract�res, elle convertit  
un objet de type **InputStream** en objet de type **Reader**.
* **PrintWriter** : cette classe ajoute � un flux la possibilit� de faire des �critures sous  
forme de texte des types primitifs Java, et des cha�nes de caract�res.  

##### C�t� Serveur
>Apr�s �tablissement de la connexion, le serveur obtient son socket qu'il utilise pour g�rer le  
flux sortant � l'aide de socketduserveur.getOutputStream() ; ensuite, � l'aide de la m�thode println  
on envoie un message au client, on utilise flush pour vider le buffer tout simplement. Et pour finir   
on ferme la connexion. 
 
##### C�t� Client
>Apr�s avoir obtenu notre socket, on utilise socket.getInputStream() pour r�cup�rer le flux sortant.  
La m�thode readLine() nous permet de lire une cha�ne de caract�res.  
Pour finir, on affiche le message re�u et on ferme notre socket.

#### Utilisation des threads :
Apr�s avoir cr�er un objet ServerSocket par le serveur, on le place comme param�tre � un constructeur  
de la classe qui impl�mente **Runnable** ou la classe **Thread**, d�s qu'un client souhaite  
se connecter au serveur, un **Thread** s'occupe de la connexion, il ne sera plus la peine de faire  
appel au serveur lorsqu'un client souhaite se connecter, tout le boulot sera confi� au Thread.