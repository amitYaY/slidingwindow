package org.amyay;

import java.util.HashMap;
import java.util.Map;

public class SolutionService6 {

    public static void main(String[] args) {
        int[] A = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10};
        int k = 15;
        findSubArrayLen(A, k);
        int[] A1 = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        findSubArrayLen(A1, k);
    }

    private static void findSubArrayLen(int[] a, int k) {

        Map<Integer, Integer> sumMap = new HashMap<>();
        Integer sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sumMap.containsKey(sum - k)) {
                int start = sumMap.get(sum - k) + 1;
                int end = i;
                System.out.println("Array [" + start + ", " + end + "]");
                return;
            }
            sumMap.put(sum, i);
        }
    }
}
