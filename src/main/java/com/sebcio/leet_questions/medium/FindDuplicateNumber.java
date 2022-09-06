package com.sebcio.leet_questions.medium;

public class FindDuplicateNumber {

    /**
     * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
     * <p>
     * There is only one repeated number in nums, return this repeated number.
     * <p>
     * <p>
     * You must solve the problem without modifying the array nums and uses only constant extra space.
     *
     * @param nums input array
     * @return integer -  duplicate number
     */
    public static int findDuplicate(int[] nums) {
//        Brute force - O(n^2)
//        for (int i = 0; i < nums.length - 1; i++){
//            for(int j = i + 1; j < nums.length; j ++){
//                if(nums[i] == nums[j]) return nums[i];
//            }
//        }
//        return -1;

//        Treat an array as linked list and look for cycle using tortoise and hare algorithm
//        Complexity : time O(n) , space O(1)
//        int slow = nums[0];
//        int fast = nums[0];
//
//        do{
//            slow = nums[slow];
//            fast = nums[nums[fast]];
//        }while(slow != fast);
//
//        slow = nums[0];
//        while (slow != fast){
//            slow = nums[slow];
//            fast = nums[fast];
//        }
//
//        return slow;

//        Binary search
//        for each number in array the amount of lower or equal numbers is lower of equal to the number
//        using binary search we are looking for lowest possible number that does not fulfill this condition
//        Complexity: time - O(nlogn) (n - numbers to scan, logn - complexity of binary search) , space - O(1)

        int low = 1;
        int high = nums.length;

        while (low < high) {
            int candidate = (low + high) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= candidate) count++;
            }
            if (count > candidate) high = candidate;
            else low = candidate + 1;
        }
        return low;
    }
}
