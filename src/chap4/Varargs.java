package chap4;

public class Varargs {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		char z = 'A';
		
		test(x,y,z);
	}
	
	public static void test(int... args) {
		for (int i = 0; i < args.length; ++i) {
			System.out.println(args[i]);
		}
	}
}
