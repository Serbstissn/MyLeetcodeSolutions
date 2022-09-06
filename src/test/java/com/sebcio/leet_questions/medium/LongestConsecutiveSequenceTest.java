package com.sebcio.leet_questions.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    void shouldReturnCorrectValues(){
        Assertions.assertThat(LongestConsecutiveSequence.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1})).isEqualTo(9);
    }

}