package com.sebcio.leet_questions.easy;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        // solution with HashSet - runtime complexity O(n) but space complexity also O(n)

        // Set<Integer> numbers = new HashSet<>();

        // for (int num : nums) {
        //     if (numbers.contains(num))
        //         numbers.remove(num);
        //     else
        //         numbers.add(num);
        // }

        // int result = numbers.iterator().next();


        // solution with XOR - time complexity O(n) , space complexity - O(1)

        int result = 0;

        for(int num : nums){
            result ^= num;
        }

        return result;
    }

}
