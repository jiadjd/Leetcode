package Practices;

public class XNPowerRecursion {

	public static void main(String[] args) {
		System.out.println(function1(4, 6));
		System.out.println(function2(4, 6));
		System.out.println(function3(4, 6));
		System.out.println(function4(4, 6));
	}
	
	// loop time complexity O(n)
	public static int function1(int x, int n) {
		int result = 1;
		for(int i = 0; i < n; i++) {
			result *= x;
		}
		return result;
	}
	
	// recursion O(n)
	public static int function2(int x, int n) {
		if(n == 0) return 1;
		return function2(x, n-1) * x;
	}
	
	// recursion O(n)
	// this method splits running time by half every time the function is called
	// but the recursion is called twice each time
	// so still O(n)
	public static int function3(int x, int n) {
		if(n == 0) return 1;
		if(n == 1) return x;
		if(n % 2 == 1) {
			return function3(x, n/2) * function3(x, n/2) * x;
		}
		return function3(x, n/2) * function3(x, n/2);
	}
	
	// recursion O(log n)
	// this method the recursion is only called once each time
	// so overal time reduced to O(log n)
	public static int function4(int x, int n) {
		if(n == 0) return 1;
		if(n == 1) return x;
		// get the value for once, and the recursion is not called again
		int p = function4(x, n/2);
		if(n % 2 == 1) return p * p * x;
		return p * p;
	}
}
