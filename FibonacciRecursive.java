public class FibonacciRecursive implements Fibonacci {
	public int fibonacci(int n) {
		// base case: if n is 1 or 0, return 1

		if ( n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		// iterative step
		return fibonacci(n-1) + fibonacci(n-2);
		
	}

	public static void main(String[] args) {
		Fibonacci fr = new FibonacciRecursive();
		System.out.println("fr says fib(0) = " + fr.fibonacci(0));
		System.out.println("fr says fib(1) = " + fr.fibonacci(1));
		System.out.println("fr says fib(2) = " + fr.fibonacci(2));
		System.out.println("fr says fib(3) = " + fr.fibonacci(3));
		System.out.println("fr says fib(4) = " + fr.fibonacci(4));
		System.out.println("fr says fib(5) = " + fr.fibonacci(5));
		System.out.println("fr says fib(6) = " + fr.fibonacci(6));
		System.out.println("fr says fib(7) = " + fr.fibonacci(7));
		System.out.println("fr says fib(8) = " + fr.fibonacci(8));
	}
}
