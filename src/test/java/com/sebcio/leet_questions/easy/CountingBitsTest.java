package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CountingBitsTest {


    @Test
    void shouldReturnCorrectValue(){
        CountingBits countingBits = new CountingBits();

        assertThat(countingBits.countBits(5)).isEqualTo(new int[]{0,1,1,2,1,2});
    }
}
