package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class BackspaceStringCompareTest {

    @Test
    void shouldReturnCorrectValue(){
        assertThat(BackspaceStringCompare.backspaceCompare("ab#c","ad#c")).isTrue();
    }
}