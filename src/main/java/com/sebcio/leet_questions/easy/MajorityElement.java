package com.sebcio.leet_questions.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     * Given an array nums of size n, return the majority element.
     * <p>
     * The majority element is the element that appears more than ⌊n / 2⌋ times.
     * You may assume that the majority element always exists in the array.
     *
     * @param nums array of numbers to check
     * @return majority element
     */
    public static int majorityElement(int[] nums) {

//        Approach with storing numbers frequency in a HashMap
//        Complexity - time: O(n) , space:O(n)
//        Map<Integer , Integer> numberFreq = new HashMap<>();
//
//        int majEle = 0;
//        int majCount = 0;
//
//        for(int n : nums){
//            if(!numberFreq.containsKey(n)){
//                numberFreq.put(n , 0);
//            }
//            int count = numberFreq.get(n);
//            count ++;
//            if(count > majCount){
//                majCount = count;
//                majEle = n;
//            }
//            numberFreq.put(n , count);
//        }
//
//        return majEle;

//        Boyer-Moore voting algorithm approach
//        general idea: majority element cannot be 'outvoted' by rest of elements
//        complexity- time:O(n) , space:O(1)

        int currEle = 0, count = 0;

        for (int n : nums) {
            if (count == 0) {
                currEle = n;
                count++;
            } else if (currEle == n)
                count++;
            else count--;
        }
        return currEle;
    }
}
