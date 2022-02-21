package com.sebcio.leet_questions.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        
        if(nums == null)
            return false;
        
        Set<Integer> numbers = new HashSet<>();

        for (Integer number : nums) {
            if (numbers.contains(number))
                return true;
            numbers.add(number);
        }
        return false;
    }

}
