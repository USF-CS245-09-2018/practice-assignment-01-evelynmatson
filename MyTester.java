public class MyTester {
	public static void main(String[] args) {
		Fibonacci fi = new FibonacciIterative();
		Fibonacci fr = new FibonacciRecursive();

		System.out.println("fi says fib(3) = " + fi.fibonacci(3));
		System.out.println("fr says fib(3) = " + fr.fibonacci(3));

	}

}