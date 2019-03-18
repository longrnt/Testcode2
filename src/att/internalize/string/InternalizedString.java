package att.internalize.string;

public class InternalizedString {
	public static void main(String[] args) {
		String one = "hello";
		String two = "hello";
		
		if (one.equals(two)) {
			System.out.println("They are the same string.");
		} else {
			System.out.println("They are different strings");
		}
		
		System.out.println("String 1: " + one.hashCode());
		System.out.println("String 2: " + two.hashCode());
		
		two = "abc";
		System.out.println(one);
		System.out.println(two);
		
		System.out.println("String 1: " + one.hashCode());
		System.out.println("String 2: " + two.hashCode());
		
	}
}
