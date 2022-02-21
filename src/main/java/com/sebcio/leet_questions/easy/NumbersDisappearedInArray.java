package com.sebcio.leet_questions.easy;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        // Brute Force solution - O(n^2)
        // List<Integer> result = new ArrayList<>();
        // for (int i = 1; i <= nums.length; i++) {
        // result.add(i);
        // }
        // for (int i = 0; i < nums.length; i++) {
        // if (result.contains(nums[i])) {
        // result.remove((Integer) nums[i]);
        // }
        // }

        // In Place Sort Solution - O(n)

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            while ((nums[i] != i + 1) && (nums[i] != nums[nums[i] - 1])) {
                // place current array element on its correct place and move number that was on that place
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                result.add(i + 1);
        }
        return result;
    }
}
