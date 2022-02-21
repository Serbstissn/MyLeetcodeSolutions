package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

    @Test
    void shouldReturnCorrectValue() {

        MaximumSubarray maximumSubarray = new MaximumSubarray();

        assertThat(maximumSubarray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4})).isEqualTo(6);
        assertThat(maximumSubarray.maxSubArray(new int[] {1})).isEqualTo(1);
        assertThat(maximumSubarray.maxSubArray(new int[] {5,4,-1,7,8})).isEqualTo(23);


    }

}
