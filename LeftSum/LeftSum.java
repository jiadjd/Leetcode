package LeftSum;

public class LeftSum {

	public static void main(String[] args) {
		// given an array of numbers
		// return the sum of all the numbers on the left of each number
		// return the sum

		/*
		 * int[] arr = {1,3,4,2,5}
		 * 1:0
		 * 3:1
		 * 4:1,3
		 * 2:1
		 * 5:1,3,4,2
		 * sum  = 1+1+3+1+1+3+4+2 = 16
		 * 		= 1*4 + 3*2 + 4*1 + 2*1 = 16
		 * 
		 * approach: mergesort -- divide
 		 */
		int[] arr = new int[] {1, 3, 4, 2, 5};
		System.out.println(leftSum(arr));
	}
	
	public static int leftSum(int[] arr) {
		if(arr == null || arr.length == 0) throw new RuntimeException("error");
		return mergeSort(arr, 0, arr.length-1);
	}
	
	private static int mergeSort(int[] arr, int l, int r) {
		if(l == r) return 0;
		int mid = (l + r) >> 1; // divide by 2 is equals to move the 2-binary digit to the left by 1
		
		return mergeSort(arr, l, mid) + mergeSort(arr, mid+1, r) + merge(arr, l, mid, r);
	}

	private static int merge(int[] arr, int l, int m, int r) {
		int p1 = l;
		int p2 = m + 1;
		int[] help = new int[r-l+1];
		int index = 0;
		int sum = 0;
		while(p1 <= m && p2 <= r) {
			sum += arr[p1] < arr[p2] ? (r-p2+1) *arr[p1] : 0;
			help[index++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		
		while(p1 <= m) help[index++] = arr[p1++];
		while(p2 <= r) help[index++] = arr[p2++];
		
		for(int i = 0; i < help.length; i++) {
			arr[l+i] = help[i];
		}
		return sum;
	}

}
