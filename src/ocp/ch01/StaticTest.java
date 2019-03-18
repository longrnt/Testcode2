package ocp.ch01;

public class StaticTest {
    private final int number = 0;
    private final String name;
    private final int total;
    private final int id;
    private Integer n;
    {
        name = "Name";
        id = 10;
    }
    public StaticTest() {
    	total = 10;
    }
//	public StaticTest() {
////        number = 1; // Compile-time error
//        total = 10;
//    }

    public void exampleMethod(final int id) {
//        id = 5; // Compile-time error
//        this.id = id; // Compile-time error
    }
}
