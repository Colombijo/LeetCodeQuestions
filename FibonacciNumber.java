
public class FibonacciNumber {
	public static void main(String[] args) {
		System.out.println(fib(10));
	}
	
	public static int fib(int N) {
		int[] array = new int[N + 1];
		if (N == 0) {
			return 0;
		} else if (N == 1) {
			return 1;
		}
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i <= N; i++) {
			array[i] = array[i - 1] + array[i -2];
		}
		return array[N];
	}
}
