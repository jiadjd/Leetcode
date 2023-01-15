package LongestSubstringWithoutRepeatingCharacters;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        int result = 0;
        for(int i=0; i<s.length()-1; i++) {
            for(int j=i; j<s.length(); j++) {
                String subString = s.substring(i,j+1);
                result = Math.max(result, subString.length());
                if(j+1 < s.length() && subString.indexOf((s.charAt(j+1))) < 0) {
                    continue;
                } else {
                    break;
                }

            }
        }
        return result;
    }
}