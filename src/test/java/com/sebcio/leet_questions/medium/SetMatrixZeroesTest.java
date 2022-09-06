package com.sebcio.leet_questions.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class SetMatrixZeroesTest {

    @Test
    void shouldReturnCorrectValues() {
//        given
        int[][] matrix1 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix2 = new int[][]{{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        int[][] matrix3 = new int[][]{{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};

//        when
        SetMatrixZeroes.setZeroes(matrix1);
        SetMatrixZeroes.setZeroes(matrix2);
        SetMatrixZeroes.setZeroes(matrix3);

//        then
        assertThat(matrix1).isEqualTo(new int[][]{{1,0,1},{0,0,0},{1,0,1}});
        assertThat(matrix2).isEqualTo(new int[][]{{0,0,0,0},{0,4,5,0},{0,3,1,0}});
        assertThat(matrix3).isEqualTo(new int[][]{{0,0,3,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}});
    }

}