package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    void shouldReturnCorrectValue(){
        //given
        int[] array1 = new int[] {-1,0,3,5,9,12};
        int[] array2 = new int[] {-1,0,3,5,9,12};


        //then
        assertThat(BinarySearch.search(array1, 9)).isEqualTo(4);
        assertThat(BinarySearch.search(array2, 2)).isEqualTo(-1);
    
    }
}
