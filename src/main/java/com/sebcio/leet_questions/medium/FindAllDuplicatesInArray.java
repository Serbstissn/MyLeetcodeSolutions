package com.sebcio.leet_questions.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInArray {

    /**
     * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice,
     * return an array of all the integers that appears twice.
     * <p>
     * You must write an algorithm that runs in O(n) time and uses only constant extra space
     *
     * @param nums array to find duplicates
     * @return list of duplicate numbers
     */
    public static List<Integer> findDuplicates(int[] nums) {

//        Sort in place, and check for duplicates
//        first sort array in place and then check for numbers out of their places
//        Complexity: time o(n) , space O(1)
//        List<Integer> result = new ArrayList<>();
//        if (nums.length == 1) return result;
//
//        int i = 0;
//        while (i < nums.length) {
//            int tmp = nums[i];
//            nums[i] = nums[tmp - 1];
//            nums[tmp - 1] = tmp;
//            if (nums[i] == i + 1 || nums[i] == nums[nums[i] - 1]) {
//                i++;
//            }
//        }
//
//        for (int j = 0 ; j < nums.length; j ++){
//            if(nums[j] != j + 1) result.add(nums[j]);
//        }
//
//        return result;

//        Solution #2 use negative markers
//        mark already seen numbers by making them negative if negative number is found during checking
//        it means that this number was already seen, so it's a duplicate

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int target = Math.abs(nums[i]);
            if (nums[target - 1] < 0) result.add(target);
            nums[target - 1] *= -1;
        }

        return result;

    }
}
