package LexicographicallySmallestEquivalentString;

import java.util.*;

public class DumDumSolution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        ArrayList<String> equivalent = new ArrayList<String>();
        String result = "";
        for(int i=0; i<s1.length(); i++) {
            char c1 = chars1[i];
            char c2 = chars2[i];
            boolean hasEquiv = false;
            boolean rearranged = false;
            String foundString = "";
            for(int j=0; j<equivalent.size(); j++) {
                String s = equivalent.get(j);
                if((s.indexOf(c1) >= 0 || s.indexOf(c2) >= 0 ) && !hasEquiv) {
                    s = s + c1 + c2;
                    char[] cs = s.toCharArray();
                    Arrays.sort(cs);
                    s = new String(cs);
                    foundString = s;
                    equivalent.set(j, s);
                    hasEquiv = true;
                } else if ((s.indexOf(c1) >= 0 || s.indexOf(c2) >= 0 ) && hasEquiv) {
                    equivalent.set(j, "");
                    s = foundString + s;
                    char[] cs = s.toCharArray();
                    Arrays.sort(cs);
                    s = new String(cs);
                    equivalent.set(equivalent.indexOf(foundString), s);
                    rearranged = true;
                }
                if(rearranged) break;
            }
            if(!hasEquiv) {
                if(c1 == c2) {
                    equivalent.add(String.valueOf(c1));
                } else if(c1 < c2) {
                    equivalent.add(String.valueOf(c1) + String.valueOf(c2));
                } else {
                    equivalent.add(String.valueOf(c2) + String.valueOf(c1));
                }
            }
        }
        for(int i=0; i<baseStr.length(); i++) {
            char c = baseStr.charAt(i);
            boolean hasEquiv = false;
            for(String s: equivalent) {
                if(s.indexOf(c) >= 0) {
                    hasEquiv = true;
                    result += s.charAt(0);
                    break;
                }
            }
            if(!hasEquiv) {
                result += c;
            }
        }
        return result;
    }
}