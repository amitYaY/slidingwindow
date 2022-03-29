package org.amyay;

public class SolutionService5 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 21;
        int len = findSmallestSubArrayLen(A, k);
        if (len != Integer.MAX_VALUE) {
            System.out.print("The smallest subArray length is " + len);
        } else {
            System.out.print("No subArray exists");
        }
    }

    //{1, 2, 3, 4, 5, 6, 7, 8}
    private static int findSmallestSubArrayLen(int[] a, int k) {
        int s = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0, j = 0; j < a.length; ) {
            sum += a[j];
            while (sum > k) {
                sum -= a[i];
                i++;
            }
            if (sum == k) {
                if (j - i + 1 < s) {
                    s = j - i + 1;
                }
            }
            j++;
        }
        return s;
    }

}
