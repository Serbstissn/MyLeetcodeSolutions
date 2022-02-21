package com.sebcio.leet_questions.easy;

public class SquaresOFSortedArray {
    /**
     * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
     *
     * @param nums - array sorted in non-decreasing order
     * @return - sorted array of squares
     */
    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];
        int fromLeft = 0;
        int fromRight = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int leftSquare = nums[fromLeft] * nums[fromLeft];
            int rightSquare = nums[fromRight] * nums[fromRight];
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                fromLeft++;
            } else {
                result[i] = rightSquare;
                fromRight--;
            }
        }
        return result;
    }
}
