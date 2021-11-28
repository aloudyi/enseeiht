import java.net.InetAddress;
import java.net.UnknownHostException;

/* InetAdressExemple */
public class Adressage {
	
	public static void main(String[] zero) {
		
		InetAddress LocaleAdresse ;
		InetAddress ServeurAdresse;

		try {

			LocaleAdresse = InetAddress.getLocalHost();
			System.out.println("L'adresse locale est : "+LocaleAdresse ); 
			
			ServeurAdresse= InetAddress.getByName("www.google.com");
                        System.out.println("L'adresse du serveur du site du www.google.com est : "+ServeurAdresse);
                 
            System.out.println(LocaleAdresse.toString());
            System.out.println(ServeurAdresse.toString());
            // Meme chose que ce qu'il ya la haut
            System.out.println(LocaleAdresse);
            System.out.println(ServeurAdresse);


		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}

}