package Practices;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {-2, 4, 6, 7, 9, 12, 13, 20};
		System.out.println(binarySearch1(arr, 0, (arr.length-1), 9));
		System.out.println(binarySearch2(arr, 9));
		System.out.println(binarySearch3(arr, 9));

	}
	
	// time complexity O(log n)
	// space complexity O(log n)
	public static int binarySearch1(int[] arr, int l, int r, int x) {
		if (r >= 1) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) return mid;
			if (arr[mid] > x) return binarySearch1(arr, l, mid-1, x);
			return binarySearch1(arr, mid+1, r, x);
		}
		
		return -1;
	}
	
	// [left, right]
	public static int binarySearch2(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == target) return mid;
			else if(arr[mid] < target) left = mid + 1;
			else right = mid - 1;
		}
		return -1;
	}
	
	// [left, right)
	public static int binarySearch3(int[] arr, int target) {
		int left = 0;
		int right = arr.length;
		while(left < right) {
			int mid = left + (right - left) / 2;
			if(arr[mid] == target) return mid;
			else if(arr[mid] < target) left = mid;
			else right = mid - 1;
		}
		return -1;
	}

}
