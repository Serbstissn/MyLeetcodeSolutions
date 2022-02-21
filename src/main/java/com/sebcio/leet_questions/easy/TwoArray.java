package com.sebcio.leet_questions.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoArray {

    public int[] twoSum(int[] nums, int target) {

        int elementsCount = nums.length;

        if (elementsCount >= 2) {
            int[] result = new int[2];
            //  Brute Force Solution - O(n^2)
            // for (int i = 0; i < elementsCount - 1; i++) {
            //     int j = i + 1;
            //     while (j < elementsCount) {
            //         if (nums[i] + nums[j] == target) {
            //             result[0] = i;
            //             result[1] = j;
            //             return result;
            //         }
            //         j++;
            //     }
            // }

            // Solution with HashMap - O(n)
            Map<Integer , Integer> differenceMap = new HashMap<>();
            for(int i = 0 ; i < elementsCount; i++){
                int diff = target - nums[i];
                if(differenceMap.containsKey(diff)){
                    result[0] = differenceMap.get(diff);
                    result[1] = i;
                    return result;
                }
                differenceMap.put(nums[i], i);
            }
            return result;
        }
        return null;
    }
}
