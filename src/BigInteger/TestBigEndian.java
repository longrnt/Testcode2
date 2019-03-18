package BigInteger;

import java.math.BigInteger;

public class TestBigEndian {
	public static void main(String[] args) {
//		byte[] barSign = {(byte)0xfe,(byte)0x31}; // 2 bytes of a Unicode text
//		BigInteger value = new BigInteger(1,barSign);  // 65073
//		byte[] barSignConverted = value.toByteArray();
//		System.out.println("Length: "+barSignConverted.length);
//		System.out.println(barSign);
//		System.out.println(barSignConverted);
//		
//		BigInteger bigInt = new BigInteger("9");
//		System.out.println(bigInt.intValue());
//		System.out.println(bigInt.testBit(3));
//		
		int a = 12;
		String hex = "0x1C";
		
		String s = "C";
		BigInteger bi = new BigInteger(s, 16);
		System.out.println(bi.intValue());
	}
}
