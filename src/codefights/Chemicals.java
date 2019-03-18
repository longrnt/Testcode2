package codefights;

public class Chemicals {
	public static void main(String[] args) {
		int totalAmount = 37;
		int[] containers = new int[] { 0, 3, 17, 36, 57, 81, 92 };
		System.out.println(Chemicals(totalAmount, containers));
	}

	public static int Chemicals(int totalAmount, int[] containers) {
		int[] C = new int[totalAmount + 5];
		for (int j = 0; j <= totalAmount + 1; j++) {
			C[j] = totalAmount + 1;
		}
		C[0] = 0;
		for (int i = 0; i < containers.length; i++) {
			for (int j = containers[i]; j <= totalAmount; j++) {
				if (C[j] > 1 + C[j - containers[i]]) {
					C[j] = 1 + C[j - containers[i]];
				}
			}
			
		}
		
		for (int i : C) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		if (C[totalAmount] == totalAmount + 1) {
			return -1;
		} else {
			return C[totalAmount];
		}

	}
}
