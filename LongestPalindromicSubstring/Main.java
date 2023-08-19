package LongestPalindromicSubstring;

public class Main {

	public static void main(String[] args) {
		String s = "hutojimjkkjgggjkksdsads";
		String s1 = "hutojimjkkjggjkksdsads";
		System.out.println(longestPalindrome(s1));

	}
	
	
	static int low = 0;
    static int maxLen = 0;
    public static String longestPalindrome(String s) {
        if(s.length() < 2) return s;
        for(int i = 0; i < s.length(); i++) {
            expandPalindrome(s, i, i);
            expandPalindrome(s, i, i+1);
        }

        return s.substring(low, low + maxLen);
    }

    public static void expandPalindrome(String s, int a, int b) {
        while(a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)) {
            a--;
            b++;
        }
        if(b-a-1 > maxLen) {
            maxLen = b-a-1;
            low = a+1;
        }
    }

}
