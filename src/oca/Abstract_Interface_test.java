package oca;
interface Interface {
	void method1();
	void method2();
	void method3();
	
}

abstract class Class1 implements Interface {

	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}
	
}

class Class2 extends Class1 {

	@Override
	public void method3() {
		System.out.println("method3");
	}
	
}

abstract class Toy {
	abstract int calculatePrice(Toy T) ;
	public abstract void printToy(Toy t) ;
	public final void pintToy(Toy t) {
		
	}
}

class SexToy extends Toy{

	protected int calculatePrice(Toy T) {
		// TODO Auto-generated method stub
		return 123;
	}

	public void printToy(Toy t) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Abstract_Interface_test {
	public static void main(String[] args) {
		Class2 clazz = new Class2();
		clazz.method3();
	}
}
