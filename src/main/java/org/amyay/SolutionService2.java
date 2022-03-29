package org.amyay;

import java.util.*;

public class SolutionService2 {

    public static void main(String[] args)
    {
        List<Integer> input = Arrays.asList(-1, -1, 0, 1, 1, 1);

        System.out.println("The total number of distinct absolute values is "
                + findDistinctCountV1(input));
        System.out.println("The total number of distinct absolute values is "
                + findDistinctCountV2(input));
    }

    private static Integer findDistinctCountV1(List<Integer> input) {
        Set<Integer> set = new HashSet<>();
        for(Integer in : input) {
            set.add(Math.abs(in));
        }
        return set.size();
    }

    private static Integer findDistinctCountV2(List<Integer> input) {
        int count =input.size();
        int i = 0, j = count - 1;

        while(i < j) {
            while(i < j && Objects.equals(input.get(i), input.get(i + 1))) {
                i++;
                count--;
            }
            while(i < j && Objects.equals(input.get(j), input.get(j - 1))) {
                j--;
                count--;
            }
            if(i == j) {
                break;
            }
            int sum = input.get(i) + input.get(j);
            if(sum == 0) {
                i++;
                j--;
                count--;
            } else if(sum < 0) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

}
