package algorithm.solving;

import java.io.*;

class M {
	public static void main(String args[]) throws Exception {

		FileInputStream fin = new FileInputStream("src/algorithm/solving/C.java");
		FileOutputStream fout = new FileOutputStream("src/algorithm/solving/M.java");

		int i = 0;
		while ((i = fin.read()) != -1) {
			fout.write((byte) i);
		}

		fin.close();
	}
}