package oca;

public class q18 {
	public static String maskCC(String creditCard) {
		String x = "XXXX-XXXX-XXXX-XXXX";
		
		StringBuilder sb = new StringBuilder(creditCard);
		StringBuilder s = sb.insert(0, x);
		
		return s.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-9012-3456"));
	}
}
