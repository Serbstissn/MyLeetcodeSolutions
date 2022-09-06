package com.sebcio.leet_questions.medium;

public class RotateImage {

    /**
     * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
     * <p>
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
     * DO NOT allocate another 2D matrix and do the rotation.
     *
     * @param matrix to rotate
     */
    public static void rotate(int[][] matrix) {

//        My solution - rotate a pack of four elements
//        Quite hard to read and to write as well

//        int n = matrix.length;
//        int layer = 0;
//        while (layer < n - 1 - layer) {
//            for (int i = layer; i < n - 1 - layer; i++) {
//                int tmp = matrix[i][n - 1 - layer];
//                matrix[i][n - 1 - layer] = matrix[layer][i];
//                int tmp2 = matrix[n - 1 - layer][n - 1 - i];
//                matrix[n - 1 - layer][n - 1 - i] = tmp;
//                tmp = matrix[n - 1 - i][layer];
//                matrix[n - 1 - i][layer] = tmp2;
//                matrix[layer][i] = tmp;
//            }
//            layer++;
//        }

//        Solution using algebra operations on matrix
        transpose(matrix);
        reflect(matrix);
    }

    /**
     * Helper method to transpose matrix - reverse elements around main diagonal
     *
     * @param matrix to transpose
     */
    private static void transpose(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    /**
     * Helper method to reflect matrix - swap matrix elements from left to right
     *
     * @param matrix to reflect
     */
    private static void reflect(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tmp;
            }
        }
    }
}
