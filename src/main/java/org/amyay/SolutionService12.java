package org.amyay;

import java.util.HashMap;
import java.util.Map;

public class SolutionService12 {

    public static void main(String[] args) {
        String X = "XYYZXZYZXXYZ";
        String Y = "XYZ";
        findAllAnagrams(X, Y);
    }

    private static void findAllAnagrams(String x, String y) {
        int size = y.length();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> mapRef = new HashMap<>();

        for (int i=0; i< y.length(); i++) {
            mapRef.put(y.charAt(i), map.getOrDefault(y.charAt(i), 0)+1);
        }
        int c = 1;
        for(int i=0, j=0; j< x.length(); j++) {
            if(j - i < size) {
                if(mapRef.containsKey(x.charAt(j))) {
                    count++;
                    map.put(x.charAt(j), map.getOrDefault(x.charAt(j), 0)+1);
                    if(map.get(x.charAt(j)) > mapRef.get(x.charAt(j))) {
                        while (map.get(x.charAt(j)) > mapRef.get(x.charAt(j))) {
                            map.put(x.charAt(i), map.get(x.charAt(i))-1);
                            i++;
                            count--;
                        }
                    }
                } else {
                    count = 0;
                    map = new HashMap<>();
                    i = j++;
                }
            } else {
                count--;
                map.put(x.charAt(i), map.get(x.charAt(i))-1);
                i++;
                j--;
            }
            if(count == size) {
                System.out.println("Sequence "+(c++)+" : "+x.substring(i,j+1)+" ["+i+","+j+"] map:"+map);
            }
        }
    }

}
