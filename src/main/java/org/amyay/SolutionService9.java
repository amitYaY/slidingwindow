package org.amyay;

public class SolutionService9 {

    // SolutionService 8 with k = 1 with little modification to store Index of zero.

    public static void main(String[] args) {
        int[] A = {1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0};
//      int res = findIndexForLongestSequence(A);
        int res = findIndexForLongestSequenceV1(A);
        System.out.println("Index to be replaced: "+res);
        int[] A1 = {0, 0, 1, 0, 1, 1, 1, 0, 1, 1};
        //res = findIndexForLongestSequence(A1);
        res = findIndexForLongestSequenceV1(A1);
        System.out.println("Index to be replaced: "+res);
    }

    // If don't want MaxCount
    /*private static int findIndexForLongestSequence(int[] a) {
        int index = -1;
        int count = 0;
        int lastZeroIndex = -1;
        int maxSize = 0;

        for(int i = 0; i< a.length; i++) {
            count=i+1;
            if(a[i]==0 && lastZeroIndex > -1) {
                count = count - lastZeroIndex - 1;
                lastZeroIndex = i;
            }

            if(a[i] ==0 && lastZeroIndex == -1) {
                lastZeroIndex = i;
            }
            System.out.println("Count: "+count);
            if(count > maxSize) {
                maxSize = count;
                index = lastZeroIndex;
            }
        }
        return index;
    }*/

    // If want Correct MaxCount as well
    private static int findIndexForLongestSequenceV1(int[] a) {
        int index = -1;
        int count = 0;
        int lastZeroIndex = -1;
        int lastZeroIndexSum = -1;
        int maxSize = 0;

        for(int i = 0; i< a.length; i++) {
            count=count+1;
            if(a[i]==0 && lastZeroIndex > -1) {
                count = count - lastZeroIndexSum;
                lastZeroIndex = i;
                lastZeroIndexSum = count;
            }

            if(a[i] ==0 && lastZeroIndex == -1) {
                lastZeroIndex = i;
                lastZeroIndexSum = count;
            }
//          System.out.println("Count: "+count);
            if(count > maxSize) {
                maxSize = count;
                index = lastZeroIndex;
            }
        }
        System.out.println("Max Sequence Size: "+maxSize);
        return index;
    }

}
