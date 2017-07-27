import java.io.*;
import java.net.*;
public class Server{
	private Socket socket;
	private ServerSocket server;
	private DataInputStream streamIn;

	public Server(int port){
		try{
			server = new ServerSocket(port);
			socket = server.accept();
			streamIn = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			while(true){
				String line = streamIn.readUTF();
				System.out.println(line);
			}
		}
		catch(IOException ioe){
			System.out.println("Error");	
		}
	}

	public static void main(String []args){
		Server server = new Server(1234);
	}
}