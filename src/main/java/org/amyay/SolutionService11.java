package org.amyay;

import java.util.HashMap;
import java.util.Map;

public class SolutionService11 {

    public static void main(String[] args) {
        String str = "findlongestsubstring";
        findLongestSubStrWithUniqueChars(str);
        str = "longestsubstr";
        findLongestSubStrWithUniqueChars(str);
        str = "abbcdafeegh";
        findLongestSubStrWithUniqueChars(str);
        str = "aaaaaa";
        findLongestSubStrWithUniqueChars(str);
    }

    private static void findLongestSubStrWithUniqueChars(String str) {

        Map<Character, Boolean> map =  new HashMap<>();
        int maxLength = 0;
        int start = -1;
        int end = -1;
        int count = 0;
        for(int i=0, j=0 ; j< str.length(); j++) {
            if(!map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), true);
                count++;
                if(count > maxLength) {
                    maxLength = count;
                    start = i;
                    end = j;
                }
            } else {
                while(map.containsKey(str.charAt(j))) {
                    count--;
                    map.remove(str.charAt(i++));
                }
            }
        }
        System.out.println("Longest subString: "+str.substring(start, end+1));
    }

}

