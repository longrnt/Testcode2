package oca;

interface CanFly {
	String type = "A";

	void fly();

	default String getType() {
		return type;
	}
}
public class q122 implements CanFly {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Inside fly method!");
	}
	
//	@Override
	public String getType() {
		// TODO Auto-generated method stub
		System.out.println("Inside overrided getType method!");
		return "getType";
	}
	
	public static void main(String[] args) {
		q122 test = new q122();
		System.out.println(test.getType());
	}
}
