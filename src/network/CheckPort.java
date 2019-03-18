package network;

import java.net.Socket;

public class CheckPort {
	
	public static void main(String[] args) {
		String host = "127.0.0.1";
		int port = 443;
		System.out.println(serverListening(host, port));
	}
	
	public static boolean serverListening(String host, int port) {
		Socket s = null;
		try {
			s = new Socket(host, port);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (s != null)
				try {
					s.close();
				} catch (Exception e) {
				}
		}
	}
}
