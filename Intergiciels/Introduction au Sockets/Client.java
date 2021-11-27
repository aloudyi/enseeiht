import java.net.Socket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.UnknownHostException;

public class Client {
	
	public static void main (String[] args) {
		Socket socket;
		BufferedReader in;
		PrintWriter out;
		String message_distant = "first";
		try {
			socket = new Socket(InetAddress.getLocalHost(),7054);
			while(!message_distant.equals("remote_exit")) {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				message_distant = in.readLine();
				System.out.println(message_distant);
			}
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
