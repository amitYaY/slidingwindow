package org.amyay;

public class SolutionService7 {

    public static void main(String[] args) {
        int[] A = {10, 4, 2, 5, 6, 3, 8, 1};
        int k = 2;
        findMinSumSubArrayOfSize(A, k);
    }

    private static void findMinSumSubArrayOfSize(int[] a, int k) {
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        int start = -1;
        int end = -1;
        for(int i=0, j=0; j<a.length; j++) {
            sum+=a[j];
            if(j-i > k) {
                sum-=a[i];
                i++;
            }
            if(sum < minSum && j-1 == k) {
                start = i;
                end = j;
                minSum = sum;
            }
        }
        System.out.println("Min Sum Array: ["+start+", "+(end-1)+"]");
    }
}
