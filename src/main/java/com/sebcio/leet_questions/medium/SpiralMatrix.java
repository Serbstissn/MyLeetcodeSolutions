package com.sebcio.leet_questions.medium;

import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {

    /**
     * Given an m x n matrix, return all elements of the matrix in spiral order.
     *
     * @param matrix input matrix
     * @return list of matrix elements in spiral order
     */
    public static List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while (result.size() < m * n) {
            for (int i = left; i <= right && result.size() < m * n; i++) {
                result.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom - 1 && result.size() < m * n; i++) {
                result.add(matrix[i][right]);
            }
            for (int i = right; i >= left && result.size() < m * n; i--) {
                result.add(matrix[bottom][i]);
            }
            for (int i = bottom - 1; i >= top + 1 && result.size() < m * n; i--) {
                result.add(matrix[i][left]);
            }
            left++;
            right--;
            top++;
            bottom--;


        }
        return result;
    }
}
