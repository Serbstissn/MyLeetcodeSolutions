package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class MajorityElementTest {
    @Test
    void shouldReturnCorrectValue(){

        assertThat(MajorityElement.majorityElement(new int[]{3,2,3})).isEqualTo(3);
        assertThat(MajorityElement.majorityElement(new int[]{2,2,1,1,1,2,2})).isEqualTo(2);

    }
}