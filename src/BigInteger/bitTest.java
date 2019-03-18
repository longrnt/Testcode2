package BigInteger;

import java.math.BigInteger;

public class bitTest {
	public static void main(String[] args) {
		byte         rootScidBytes[] = new byte[2];
		//before save -16 2 		
//		rootScidBytes[0] = -16;
//		rootScidBytes[1] = 2;
		
		//after save -9 0 		
		rootScidBytes[0] = -9;
		rootScidBytes[1] = 0;
		rootScidBytes[0] = (byte)(rootScidBytes[0] & 0x0F); // 0 out the 4 reserved bits set to 1 
	    int rootScid                        = new BigInteger(1, rootScidBytes).intValue();
	    System.out.println(rootScid);
	}
}
