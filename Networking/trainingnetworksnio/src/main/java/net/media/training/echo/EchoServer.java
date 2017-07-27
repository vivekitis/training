package net.media.training.echo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private static final int BUFFER_SIZE = 256;
	private static final int listenPort = 4444;

	public static void main(String[] args) throws Exception {
		ServerSocket serverSock = new ServerSocket(listenPort);
		System.out.println("listening on port " + listenPort);
		Socket sock = serverSock.accept();
		System.out.println("new connection " + sock);

		InputStream sockIn = sock.getInputStream();
		OutputStream sockOut = sock.getOutputStream();
		byte[] buffer = new byte[BUFFER_SIZE];
		while (true) {
			Thread.sleep(50);
			int count = 0;
			if ((count = sockIn.available()) > 0) {
				if (count >= buffer.length) {
					count = buffer.length;
				}
				count = sockIn.read(buffer, 0, count);
				System.out.println("echoing " + count + " bytes");
				sockOut.write(buffer, 0, count);
				sockOut.flush();
			}
		}
	}

}
