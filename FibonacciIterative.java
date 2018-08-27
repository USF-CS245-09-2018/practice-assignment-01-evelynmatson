public class FibonacciIterative implements Fibonacci{
	public int fibonacci(int n) {

		// easy case: if n is 1 or 0, return 1
		if ( n == 0 ) {
			return 0;
		
		} else if (n==1) {
			return 1;
		}

		int nMinusOne = 1;
		int nMinusTwo = 0;

		// iterate from 2 through n
		// System.out.println("About to iterate. n = " + n);
		for (int i = 2; i < n; i++) {
			// System.out.println("\t hello, i is " + i);

			// if we haven't reached n yet, update previouses
			int newNMinusTwo = nMinusOne;	// save the last n-1 number
			nMinusOne = nMinusOne + nMinusTwo;	// the n-1 number adds n-2
			nMinusTwo = newNMinusTwo;	// the n-2 number becomes the old n-1
		}

		return nMinusOne + nMinusTwo;

	}

	public static void main(String[] args) {
		Fibonacci fi = new FibonacciIterative();
		System.out.println("fi says fib(0) = " + fi.fibonacci(0));
		System.out.println("fi says fib(1) = " + fi.fibonacci(1));
		System.out.println("fi says fib(2) = " + fi.fibonacci(2));
		System.out.println("fi says fib(3) = " + fi.fibonacci(3));
		System.out.println("fi says fib(4) = " + fi.fibonacci(4));
		System.out.println("fi says fib(5) = " + fi.fibonacci(5));
		System.out.println("fi says fib(6) = " + fi.fibonacci(6));
		System.out.println("fi says fib(7) = " + fi.fibonacci(7));
		System.out.println("fi says fib(8) = " + fi.fibonacci(8));
	}
}