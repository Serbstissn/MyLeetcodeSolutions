package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SmallestLetterGreaterThanTargetTest {

    @Test
    void shouldReturnCorrectValue(){
        char[] charArray = new char[] {'c' , 'f' , 'j'};

        assertThat(SmallestLetterGreaterThanTarget.nextGreatestLetter(charArray, 'a')).isEqualTo('c');
        assertThat(SmallestLetterGreaterThanTarget.nextGreatestLetter(charArray, 'c')).isEqualTo('f');
        assertThat(SmallestLetterGreaterThanTarget.nextGreatestLetter(charArray, 'z')).isEqualTo('c');
        assertThat(SmallestLetterGreaterThanTarget.nextGreatestLetter(charArray, 'g')).isEqualTo('j');

    }
}
