package com.sebcio.leet_questions.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCasePermutationTest {

    @Test
    void shouldReturnCorrectValue(){

        LetterCasePermutation lcp = new LetterCasePermutation();

        Assertions.assertThat(lcp.letterCasePermutation("a1b2")).contains("a1b2","a1B2","A1b2","A1B2");
        Assertions.assertThat(new LetterCasePermutation().letterCasePermutation("12345")).contains("12345");
    }
}