package com.sebcio.leet_questions.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SpiralMatrixTest {

    @Test
    void shouldReturnCorrectValue(){

        assertThat(SpiralMatrix.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})).containsExactly(1,2,3,6,9,8,7,4,5);
    }

}