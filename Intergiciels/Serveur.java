import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
	public static void main (String[] args) {
		ServerSocket serverSocket;
		Socket socketOfServer;
		BufferedReader in;
		PrintWriter out;
		String msg = "first";
		try {
			serverSocket = new ServerSocket(7054);
			socketOfServer = serverSocket.accept();
			System.out.println("Une connexion à été établie !");

			while(!msg.equals("exit")) {
				in = new BufferedReader(new InputStreamReader(System.in));
				msg = in.readLine();
				out = new PrintWriter(socketOfServer.getOutputStream());
				out.println(msg);
				out.flush();
			}
			serverSocket.close();
			socketOfServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
