package Classes;

public class RecursiveFibonacci {

	public static long fib(int n) { 
		   if (n == 1 || n == 0) return 1; 
		   else return fib(n-1) + fib(n-2); 
		} 
	public static Pair<Integer> fib2(int n) { 
		   if (n==0 || n==1) return new Pair<Integer>(1, 1); 
	   Pair<Integer> p = fib2(n-1); 
	   return new Pair<Integer>(p.getFirst() + p.second(), p.getFirst());}

	
}
