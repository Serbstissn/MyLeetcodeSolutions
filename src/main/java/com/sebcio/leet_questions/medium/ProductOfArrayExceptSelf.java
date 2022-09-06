package com.sebcio.leet_questions.medium;

public class ProductOfArrayExceptSelf {

    /**
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     * <p>
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * <p>
     * You must write an algorithm that runs in O(n) time and without using the division operation
     *
     * @param nums original array
     * @return array of product except self
     */
    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = 1;

//        count product of all numbers on the left of current index
//        last element has correct value the rest lacks product of elements on the right of them
        for(int i = 1; i < nums.length; i ++){
            result[i] = result[i-1] * nums[i-1];
        }

//        run from right and counting product of all numbers to the right of index
        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] = result[i] * right;
            right *= nums[i];
        }

        return result;

    }
}
