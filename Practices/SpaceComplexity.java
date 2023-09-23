package Practices;

public class SpaceComplexity {

	//
	public static void main(String[] args) {
		System.out.println(fibonacci1(20));
		System.out.println(fibonacci2(1, 1, 20));

	
	}
	
	// time complexity O(2^n)
	// each recursion calls itself twice, making this complexity multiple by 2 with each recursion
	public static int fibonacci1(int i) {
		if (i <= 0) return 0;
		if (i == 1) return 1;
		return fibonacci1(i-1) + fibonacci1(i-2);
	}
	
	// time complexity O(n)
	// because recursion calls itself once each time
	// space complexity O(n)
	// space complexity = (space complexity of each recursion) * (depth of recursion stack)
	// depth of recursion is n, each recursion space is O(1)
	// so total space complexity is O(n)
	public static int fibonacci2(int first, int second, int n) {
		if (n <= 0) return 0;
		if (n < 3) return 1;
		if (n == 3) return first + second;
		//second becomes first, their sum becomes second
		//because the [first, second] pair moves down the sequence each time
		else return fibonacci2(second, first+second, n-1);
	}

}
