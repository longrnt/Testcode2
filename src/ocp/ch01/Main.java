package ocp.ch01;
import java.lang.Runtime;

class Singleton {
	private static volatile Singleton instance;
	protected Singleton() { }
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
public class Main extends Singleton {
	public static void main(String[] args) {
		Singleton.getInstance();
		System.out.println(Integer.getInteger("123"));
	}
}