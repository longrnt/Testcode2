package att.functional.function;

public class Main {
	public static void main(String[] args) {
		functionalTest ft = (String s1, String s2) -> System.out.println(s1 + " " + s2);
		ft.print("Long", "Tran");
	}
}
