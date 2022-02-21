package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class SquaresOFSortedArrayTest {

    @Test
    void shouldReturnCorrectValue() {
        //given
        int[] arr1 = new int[]{-4, -1, 0, 3, 10};
        int[] arr2 = new int[]{-7,-3,2,3,11};
        int[] arr3 = new int[]{1,2,3,4};

        //then
        assertThat(SquaresOFSortedArray.sortedSquares(arr1)).containsExactly(0,1,9,16,100);
        assertThat(SquaresOFSortedArray.sortedSquares(arr2)).containsExactly(4,9,9,49,121);
        assertThat(SquaresOFSortedArray.sortedSquares(arr3)).containsExactly(1,4,9,16);
    }

}