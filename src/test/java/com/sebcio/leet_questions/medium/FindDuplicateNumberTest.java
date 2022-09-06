package com.sebcio.leet_questions.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class FindDuplicateNumberTest {

    @Test
    void shouldReturnCorrectValue(){
        assertThat(FindDuplicateNumber.findDuplicate(new int[]{1,3,4,2,2})).isEqualTo(2);
        assertThat(FindDuplicateNumber.findDuplicate(new int[]{3,1,3,4,2})).isEqualTo(3);
        assertThat(FindDuplicateNumber.findDuplicate(new int[]{2,2,2,2,2})).isEqualTo(2);
    }

}