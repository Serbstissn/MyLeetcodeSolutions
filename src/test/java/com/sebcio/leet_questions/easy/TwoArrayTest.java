package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TwoArrayTest {

    private TwoArray twoArray;

    @BeforeEach
    void setUp() {
        twoArray = new TwoArray();
    }

    @Test
    @DisplayName("given empty array method returns null")
    void twoSumWhenEmptyArrayShouldReturnNull() {

        // when
        int[] returnArray = twoArray.twoSum(new int[0], 0);

        // then
        assertThat(returnArray).isNull();
    }

    @Test
    @DisplayName("when array size bigger than 2 return array with size 2")
    void twoSumWhenArrayBiggerThanTwoShouldReturnArray() {
        // given
        int[] inputArray = { 1, 2, 3, 4 };

        // when
        int[] returnArray = twoArray.twoSum(inputArray, 0);

        // then
        assertThat(returnArray).isNotNull();
        assertThat(returnArray.length).isEqualTo(2);
    }

    @Test
    @DisplayName("two element array with target sum should return o and 1 index")
    void twoSumTwoElementArrayWithTargetSumShouldReturnTheirIndecies() {
        // given
        int[] inputArray = { 1, 2 };
        int target = 3;
        int[] expectedOutput = { 0, 1 };

        // when
        int[] returnArray = twoArray.twoSum(inputArray, target);

        // then
        assertThat(returnArray).isEqualTo(expectedOutput);

    }

    @Test
    void checkAgainstTestExamplesShouldReturnCorrectArrays() {
        // given
        int[] inputArray1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] expectedOutput1 = { 0, 1 };

        int[] inputArray2 = { 3, 2, 4 };
        int target2 = 6;
        int[] expectedOutput2 = { 1, 2 };

        int[] inputArray3 = { 3, 3 };
        int target3 = 6;
        int[] expectedOutput3 = { 0, 1 };

        assertThat(twoArray.twoSum(inputArray1, target1)).isEqualTo(expectedOutput1);
        assertThat(twoArray.twoSum(inputArray2, target2)).isEqualTo(expectedOutput2);
        assertThat(twoArray.twoSum(inputArray3, target3)).isEqualTo(expectedOutput3);

    }

}
