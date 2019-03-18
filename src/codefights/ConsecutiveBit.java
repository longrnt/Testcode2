package codefights;

public class ConsecutiveBit {

	public static void main(String[] args) {
		System.out.println(consecutiveBit(12));
	}
	
	static boolean consecutiveBit(int num) {
		int temp = 1;
		int consecutive = 0;
		for (int i = 0; i < 32 ; ++i) {
			if ((num & (temp << i)) != 0) {
				consecutive++;
			} else {
				consecutive = 0;
			}
			if (consecutive == 2) {
				return true;
			}
		}
		return false;
	}
}
