public class FactorialRecursive implements Factorial {
	public int factorial(int n) {

		// BASE CASE: Check for input 1 or 0, return 1 if found
		if ( n==0 || n == 1) {
			return 1;
		}

		// Iterative step:
		return n * factorial(n-1);
		

	}
}