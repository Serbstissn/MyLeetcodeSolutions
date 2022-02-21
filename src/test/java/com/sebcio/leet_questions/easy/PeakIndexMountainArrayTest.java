package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PeakIndexMountainArrayTest {

    @Test
    void shouldReturnCorrectValue(){
        // given
        int[] mountainArray1 = new int[] {0,1,0};

        //then
        assertThat(PeakIndexMountainArray.peakIndexInMountainArray(mountainArray1)).isEqualTo(1);
    }
}
