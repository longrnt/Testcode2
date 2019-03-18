package leetCode;

public class leet93_B_reordered_power_of_2 {
	public static void main(String[] args) {
		int N = 63;
		System.out.println(powerof2(N));
		
		String S = Integer.toString(N);
        int[] A = new int[S.length()];
        for (int i = 0; i < S.length(); ++i) {
        	A[i] = S.charAt(i) - '0';
        }
        for (int i = 0; i < S.length(); ++i) {
        	System.out.print(A[i] + " ");
        }
	}
	
    public static boolean reorderedPowerOf2(int N) {
    	boolean result = false;
    	String[] power2 = new String[]{"2", "4"};
    	
    	return result;
    }
    
    public static boolean powerof2(int N) {
    	return (N&(N-1)) == 0;
    }
}
