package org.amyay;

import java.util.HashMap;
import java.util.Map;

public class SolutionService4 {

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 2, 1, 4, 5};
        int k = 5;
        findDistinctCount(arr, k);
    }

    private static void findDistinctCount(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0, j = 0; j < arr.length; j++) {
            if (j < i + k - 1) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            if (j == i + k - 1) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
                System.out.println("Count: "+map.keySet().size());
                map.put(arr[i], map.get(arr[i]) - 1);
                if(map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }
        }
    }

}
