package com.sebcio.leet_questions.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class FindAllDuplicatesInArrayTest {

    @Test
    @DisplayName("Test cases for question")
    void shouldReturnCorrectValue(){

        assertThat(FindAllDuplicatesInArray.findDuplicates(new int[]{4,3,2,7,8,2,3,1})).containsExactlyInAnyOrder(2 , 3);
        assertThat(FindAllDuplicatesInArray.findDuplicates(new int[]{1,1,2})).contains(1);
        assertThat(FindAllDuplicatesInArray.findDuplicates(new int[]{1,1})).contains(1);
        assertThat(FindAllDuplicatesInArray.findDuplicates(new int[]{1})).isEmpty();
        assertThat(FindAllDuplicatesInArray.findDuplicates(new int[]{2,1})).isEmpty();
    }
}