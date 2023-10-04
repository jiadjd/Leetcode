package EncodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strs = new ArrayList<>();
		strs.add("appple");
		strs.add("thelonglongstring");
		strs.add("amazon");
		strs.add("tiktok");
		strs.add("meta");
		System.out.println(encode(strs));
		
		String s = encode(strs);
		decode(s);

	}
	
	
	/**
	 * @param strs
	 * @return
	 * 
	 * time complexity O(n)
	 * space complexity O(1)
	 */
	public static String encode(List<String> strs) {
		StringBuilder encoded = new StringBuilder();
		for (String s : strs) {
			encoded.append("[").append(s.length()).append("]").append(s);
		}
		return encoded.toString();
	}
	
	/**
	 * @param strs
	 * @return
	 * 
	 * time complexity O(n)
	 * space complexity O(n)
	 */
	public static List<String> decode(String strs) {
		List<String> decoded = new ArrayList<>();
		int i = 0;
		while (i < strs.length()) {
			int left = strs.indexOf("[", i);
			int right = strs.indexOf("]", i);
			int length = Integer.parseInt(strs.substring(left+1, right));
			System.out.println(length);
			i = right + length + 1;
			String s = strs.substring(right+1, i);
			
			decoded.add(s);
			System.out.println(s);
		}
		
		
		return decoded;

	}

}
