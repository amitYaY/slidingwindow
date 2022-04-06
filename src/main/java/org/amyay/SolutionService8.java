package org.amyay;

public class SolutionService8 {

    private static int start = -1;
    private static int end = -1;

    public static void main(String[] args) {
        int[] A = {1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0};
        int k = 1;
        int res = findLongestSequence(A, k);
        System.out.println("Longest Sequence Size: "+res);
        System.out.println("Min Sum Array: ["+start+", "+end+"]");
    }

    private static int findLongestSequence(int[] a, int k) {
        int zeroCount = 0;
        int maxCount = 0;
        int count = 0;
        for (int i = 0, j = 0; j < a.length; j++) {

            if(a[j] == 0) {
                zeroCount++;
                while(zeroCount > k) {
                    if(a[i] == 0) {
                        zeroCount--;
                    } else {
                        count--;
                    }
                    i++;
                }
            }
            if(a[j] == 1) {
                count++;
            }
            if(count+zeroCount > maxCount) {
                maxCount = count+zeroCount;
                start = i;
                end = j;
            }
            System.out.println("Max: "+maxCount);
        }
        return maxCount;
    }

}
