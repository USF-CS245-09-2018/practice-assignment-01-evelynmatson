public class FactorialIterative implements Factorial {
	public int factorial(int n) {
		int toReturn = 1;	

		// Check for input 1 or 0, return 1 if found
		if ( n==0 || n == 1) {
			return 1;
		}

		// Keep multiplying by bigger numbers until n is reached
		for (int i = 1; i <= n; i++) {
			toReturn *= i;
		}

		return toReturn;
	}
}