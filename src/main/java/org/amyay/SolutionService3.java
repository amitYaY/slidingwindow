package org.amyay;

import java.util.HashSet;
import java.util.Set;

public class SolutionService3 {

    public static void main(String[] args) {
        int[] in = {5, 2, 3, 5, 4, 3};
        calculate(in);
    }

    private static void calculate(int[] in) {
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<>();
        Integer breakPoint = null;
        while(j < in.length) {
            while (j < in.length && !set.contains(in[j])) {
                set.add(in[j]);
                j++;
            }
            if(j < in.length) {
                breakPoint = in[j];
            }
            printSubarray(in, i, j - 1, in.length);

            while (breakPoint != null && in[i] != breakPoint) {
                i++;
            }
            set.remove(in[i++]);
        }

    }

    public static void printSubarray(int[] A, int i, int j, int n)
    {
        if (i < 0 || i > j || j >= n) { // invalid input
            return;
        }

        for (int index = i; index < j; index++) {
            System.out.print(A[index] + ", ");
        }

        System.out.println(A[j]);
    }


}
