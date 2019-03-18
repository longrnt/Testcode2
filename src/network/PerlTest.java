package network;

import java.io.*;

public class PerlTest {

	public static void main(String args[]) {

		Process process;

		try {
			process = Runtime.getRuntime().exec("E:/perl.pl");
			process.waitFor();
			if (process.exitValue() == 0) {
				System.out.println("Command Successful");
				try {
					BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
					String line = null;
					while ((line = in.readLine()) != null) {
						System.out.println(line);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Command Failure");
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.toString());
		}
	}
}