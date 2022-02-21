package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MissingNumberTest {

    private MissingNumber missingNumber;

    @BeforeEach
    void setUp() {
        this.missingNumber = new MissingNumber();
    }

    @Test
    void missingNumberWhenNullOrNoAnswershouldReturnMinusOne() {
        assertThat(missingNumber.missingNumber(null)).isEqualTo(-1);
    }

    @Test
    void missingNumberWhenCorrectInputShouldReturnCorrectNumber() {
        assertThat(missingNumber.missingNumber(new int[] { 3, 0, 1 })).isEqualTo(2);
        assertThat(missingNumber.missingNumber(new int[] { 2, 4, 5, 7, 3, 0, 1 })).isEqualTo(6);

    }

    @Test
    void maxArraySizeShouldNotOverflow() {
        // given
        int[] maxArray = new int[(int) Math.pow(10, 4) - 1];
        for (int i = 1; i < Math.pow(10, 4); i++) {
            maxArray[i - 1] = i;
        }

        // then
        assertThat(missingNumber.missingNumber(maxArray)).isEqualTo(0);

    }

}
