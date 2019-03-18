package ocp.ch02;

public class Inheritance {
	public static void main(String[] args) {
		Hammer hammer = new Hammer();
		System.out.println(hammer.getSize());
	}
}


class Tool {
    public int size;
    protected int getSize() { return size; }
}

class Hammer extends Tool {
    private int size; // No problem!
    // Compile-time error
    public int getSize() { return size; }
}