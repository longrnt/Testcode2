package algoexpert.io;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 0;
		System.out.println(getNthFib(n));
	}

	public static int getNthFib(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		int a = 1, b = 1, ans = 0;

		for (int i = 3; i <= n; ++i) {
			ans = a + b;
			a = b;
			b = ans;
		}
		return ans;
	}
}
