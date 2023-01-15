package MergeStringsAlternately;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        String result = "";
        for(int i=0; i<minLength; i++) {
            result += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
        }
        if(word1.length() > minLength) {
            result += word1.substring(minLength);
        } else {
            result += word2.substring(minLength);
        }
        return result;
    }
}