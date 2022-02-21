package com.sebcio.leet_questions.easy;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        if (nums == null)
            return -1;

        int lastNumber = nums.length;

        // Sum of arithmetic series
        int arithmeticSum = (int) ((lastNumber / 2F) * (nums.length + 1));

        // Subtract all elements so only missing will remain
        for (int num : nums) {
            arithmeticSum -= num;
        }

        return arithmeticSum;
    }

}
