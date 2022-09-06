package com.sebcio.leet_questions.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    List<List<Integer>> result = new ArrayList<>();

    /**
     * Given an integer array nums of unique elements, return all possible subsets (the power set).
     * <p>
     * The solution set must not contain duplicate subsets. Return the solution in any order.
     *
     * @param nums input array
     * @return list of all possible subsets of an array
     */

    // My first solution including recurency and helper method

    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            subsets(nums, i, new ArrayList<>());
        }
        return result;
    }

    private void subsets(int[] nums, int currIndex, List<Integer> prevList) {
        if (currIndex == nums.length) return;
        List<Integer> currList = new ArrayList<>(prevList);
        currList.add(nums[currIndex]);
        result.add(currList);
        for(int i = 1 ; i < nums.length - currIndex; i ++) {
            subsets(nums, currIndex + i, currList);
        }

    }


    // Solution with cascading through existing elements
    // public List<List<Integer>> subsets(int[] nums) {
    //     List<List<Integer>> res = new ArrayList<>();
    //     res.add(new ArrayList<>());

    //     for(Integer i : nums){
    //         int currSize = res.size();
    //         for(int j = 0 ; j < currSize; j++){
    //             List<Integer> tmp = new ArrayList<>(res.get(j));
    //             tmp.add(i);
    //             res.add(tmp);
    //             System.out.println(res.toString());
    //         }
    //     }
    //     return res;
    // }


}
