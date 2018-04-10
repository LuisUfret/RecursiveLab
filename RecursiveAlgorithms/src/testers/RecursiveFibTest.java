package testers;

import Classes.RecursiveFibonacci;

public class RecursiveFibTest extends RecursiveFibonacci{
	private static int n = 5;
	public static void main(String[] args) {
		long t = System.nanoTime();
		System.out.println(fib(n));
		long t2 = System.nanoTime();
		System.out.println(t2-t);
		System.out.println(fib2(n));

	}

}
