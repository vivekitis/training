import java.io.*;
import java.net.*;
public class Client{
	private Socket socket;
	private DataOutputStream streamOut;
	private DataInputStream console;

	public Client(String serverName, int serverPort){
		try{
			socket = new Socket(serverName,serverPort);
			console = new DataInputStream(System.in);
			streamOut = new DataOutputStream(socket.getOutputStream());
		}
		catch(Exception e){}

		while(true){
			try{
				String line = "";
				line = console.readLine();
				streamOut.writeUTF(line);
				streamOut.flush();
			}
			catch(IOException ioe){
				System.out.println("Error");
			}
		}
	}

	public static void main(String []args){
		Client client = new Client(args[0],Integer.parseInt(args[1]));
	}
}