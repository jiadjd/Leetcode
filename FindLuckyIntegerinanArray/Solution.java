package FindLuckyIntegerinanArray;

import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        int result = -1;
        Arrays.sort(arr);
        int[] frequencies = new int[arr[arr.length-1]+1];
        for(int num: arr) {
            frequencies[num] += 1;
        }
        for(int i=1; i<frequencies.length; i++) {
            System.out.print(frequencies[i] + ", ");
            if(frequencies[i] == i) {
                result = Math.max(result, i);
            }
        }
        return result;
    }
}