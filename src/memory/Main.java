package memory;

public class Main {
	public static void main(String[] args) {
		Integer n = 5;
		calc(n);
		System.out.println(n);
		
		boolean[] tried = new boolean[3];
		for (boolean b : tried) {
			System.out.println(b);
		}
 	}
	
	public static void calc(Integer value) {
		value *= 100;
	}
}
