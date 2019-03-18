package oca;

public abstract class Toy1 {
	public Toy1() {}
	
	abstract int calculatePrice(Toy1 T) ;
	public abstract void printToy(Toy1 t) ;
	public final void pintToy(Toy1 t) {
	}
	
	
	protected int calc() {
		return 789;
	}
}
