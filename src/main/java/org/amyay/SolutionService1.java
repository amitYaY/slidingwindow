package org.amyay;

import java.util.HashSet;
import java.util.Set;

public class SolutionService1 {

    public static void main(String[] args) {
        int nums[] = { 5, 6, 8, 2, 4, 6, 9 };
        int k = 3;
        if (hasDuplicate(nums, k)) {
            System.out.println("Duplicates found");
        }
        else {
            System.out.println("No duplicates were found");
        }
    }

    private static boolean hasDuplicate(int[] nums, int k) {
        Boolean flag = false;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                flag = true;
                break;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return flag;
    }

}
