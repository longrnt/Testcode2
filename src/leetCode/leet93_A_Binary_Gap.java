package leetCode;

public class leet93_A_Binary_Gap {
	
	public static void main(String[] args) {
		int n = 7;
		System.out.println(binaryGap(n));
	}
	
    public static int binaryGap(int N) {
        int binaryGap = 0;

        // remove trailing zeroes if not counted; credit to Peter Taylor
        while (N % 2 == 0) {
            N /= 2;
        }
        
        int odd = 0;
        
        for (int j = 0; N > 0; N /= 2) {
            if (N % 2 == 0) {
                j++;
            } else {
            	++odd;
                if (j > binaryGap) {
                    binaryGap = j;
                }

                j = 0;
            }
        }
        if ((binaryGap == 0 && odd > 1) || binaryGap > 0) {
        	++binaryGap;
        }
        return binaryGap;
    }
}
