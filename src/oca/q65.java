package oca;

public class q65 {
	void readCar(int a) throws Exception {
		System.out.println("Reading Card");
	}
	void checkCard(int a) throws RuntimeException {
		System.out.println("Check Card");
	}
	
	public static void main(String[] args) {
		q65 ex = new q65();
		int a = 123;
		ex.checkCard(a);
//		ex.readCar(a);
	}
}
