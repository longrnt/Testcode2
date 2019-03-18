package oca;

public class q72 {
	public static void main(String[] args) {
		int x = 5;
		while (isAvailable(x)) {
			System.out.print(x);
			x--;
		}
		double d = 100f;
		System.out.println(d);
		StringBuilder sb = new StringBuilder();
//		sb.dele
	}
	
	public static boolean isAvailable(int x) {
		return x-- > 0 ? true: false;
	}
}
