package algorithm.solving;

public class Power {
	public static int nroot(int num, int root) {
		int base = 1;
		int result = 0;
		if (num > 1) {
			for (int i = 2; i <= num / 2; i++) {
				result = num;
				if (num % i == 0) {
					for (int j = 0; j < root; ++j) {
						if (result % i == 0) {
							result /= i; 
						}
					}
					if (result == 1) {
						base = i;
					}
				}
			}
		} else {
			return base;
		}
		return base;
	}

	public static void main(String[] args) {
		int num = 26;
		int root = 5;
		System.out.println(nroot(num, root));
	}
}
