package com.sebcio.leet_questions.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class RotateImageTest {

    @Test
    void shouldReturnCorrectValue(){

        //given
        int[][] matrix1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        //when
        RotateImage.rotate(matrix1);
        RotateImage.rotate(matrix2);

        //then
        assertThat(matrix1).isEqualTo(new int[][]{{7,4,1},{8,5,2},{9,6,3}});
        assertThat(matrix2).isEqualTo(new int[][]{{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}});
    }

}