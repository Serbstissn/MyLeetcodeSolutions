package com.sebcio.leet_questions.easy;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {


        //My solution , similar to kadane algorithm's in idea
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // add new element to sum of current subarray
            currentSum += nums[i];
            
            // check if current element isn't bigger than sum of current subarray
            if (currentSum <= nums[i]) {
                currentSum = nums[i];
            }

            // if current subarray sum is the biggest then remember it
            maxSum = Math.max(maxSum, currentSum);

        }

        //pure kadane algorithm solution

        // int maxSum = nums[0];
        // int maxEndsHere = nums[0];

        // for(int i = 1; i < nums.length; i++){
        //     maxEndsHere = Math.max(maxEndsHere + nums[i], nums[i]);
        //     maxSum = Math.max(maxEndsHere, maxSum);
        // }

        return maxSum;
    }

}
