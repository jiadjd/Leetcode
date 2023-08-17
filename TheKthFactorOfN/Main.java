package TheKthFactorOfN;

public class Main {

	public static void main(String[] args) {
		int n = 12;
		int k = 3;
		int result = kthFactor(n, k);
		System.out.println(result);

	}
	
	
	public static int kthFactor(int n, int k) {
        int count = 0;
        int i = 1;

        while(i <= n && count <= k) {
            if(n%i == 0) count ++;
            if(count == k) return i;
            i++;
        }
        return -1;
    }

}
