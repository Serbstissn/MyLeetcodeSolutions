package com.sebcio.leet_questions.easy;

public class BinarySearch {

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middleIndex = left + ((right - left + 1) / 2);

            if (nums[middleIndex] > target) {
                right = middleIndex - 1;
            } else
                left = middleIndex;

        }
        return nums[left] == target ? left : -1;
    }
}
