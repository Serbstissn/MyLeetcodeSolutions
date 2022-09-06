package com.sebcio.leet_questions.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    /**
     * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
     * <p>
     * You must write an algorithm that runs in O(n) time.
     *
     * @param nums array of integers
     * @return length of longest consecutive sequence
     */
    public static int longestConsecutive(int[] nums) {

        int max = 0;
        Set<Integer> numbers = new HashSet<>();

        for(int i : nums) {
            numbers.add(i);
        }

        for(Integer i : numbers){
            if(!numbers.contains(i - 1)){
                int count = 1;
                int currNum = i + 1;
                while (numbers.contains(currNum)){
                    count++;
                    currNum++;
                }
                if(count > max) max = count;
            }
        }

        return max;
    }
}
