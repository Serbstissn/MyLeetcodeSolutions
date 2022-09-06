package com.sebcio.leet_questions.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {

    /**
     * Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
     * <p>
     * You must do it in place.
     *
     * @param matrix to use
     */
    public static void setZeroes(int[][] matrix) {
//        use sets to store columns and rows to zero
//        Set<Integer> rows = new HashSet<>();
//        Set<Integer> col = new HashSet<>();
//
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[i].length; j++){
//                if(matrix[i][j] == 0){
//                    rows.add(i);
//                    col.add(j);
//                }
//            }
//        }
//        for(int index : rows){
//            matrix[index] = new int[matrix[index].length];
//        }
//
//        for (int index : col){
//            for (int i = 0 ; i < matrix.length; i++){
//                matrix[i][index] = 0;
//            }
//        }

//        Store information which rows/columns to zero in first row/column

//        additional marker to specify if matrix[0][0]==0 the first column should be zero
        boolean isCol = false;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
            }
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }

            }
        }
        System.out.println(Arrays.deepToString(matrix));

//        first we zero rows, except the first one which contains information about columns
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) matrix[i] = new int[matrix[i].length];
        }

//        now time to zero columns
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }


//        last but not least we check if we should zero first row
        if (matrix[0][0] == 0) matrix[0] = new int[matrix[0].length];

//        last but not leas no. 2 zero first column
        if (isCol) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][0] = 0;
            }
        }
    }
}
