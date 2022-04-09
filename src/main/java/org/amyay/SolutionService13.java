package org.amyay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SolutionService13 {

    public static void main(String[] args) {
        String x = "abcbdbdbbdcdabd";
        int k = 2;
        findLongestSubStrWithKDistinctChars(x, k);
        k = 3;
        findLongestSubStrWithKDistinctChars(x, k);
        k = 5;
        findLongestSubStrWithKDistinctChars(x, k);
    }

    private static void findLongestSubStrWithKDistinctChars(String x, int k) {

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
        int start = -1, end = -1;
        for (int i = 0, j = 0; j < x.length(); j++) {
            map.put(x.charAt(j), map.getOrDefault(x.charAt(j), 0) + 1);
            count++;
            if (map.keySet().size() > k) {
                while (map.keySet().size() > k) {
                    map.put(x.charAt(i), map.get(x.charAt(i)) - 1);
                    count--;
                    if (map.get(x.charAt(i)) == 0) {
                        map.remove(x.charAt(i));
                    }
                    i++;
                }
            }
            if(count > max && map.keySet().size() == k) {
                max = count;
                start = i;
                end = j;
            }
        }
        if(count == x.length()) {
            System.out.println(x);
        } else {
            System.out.println(x.substring(start, end + 1));
        }
    }
}
