package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class Convert1DTo2DArrayTest {
    @Test
    void shouldReturnCorrectValues(){

        assertThat(Convert1DTo2DArray.construct2DArray(new int[]{1,2,3,4} , 2 , 2)).isEqualTo(new int[][]{{1,2},{3,4}});
        assertThat(Convert1DTo2DArray.construct2DArray(new int[]{1,2,3} , 1 , 3)).isEqualTo(new int[][]{{1,2,3}});
        assertThat(Convert1DTo2DArray.construct2DArray(new int[]{1,2} , 1 , 1)).isEqualTo(new int[0][0]);

    }
}