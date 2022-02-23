package com.sebcio.leet_questions.easy;

public class Convert1DTo2DArray {

    /**
     * You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n.
     * You are tasked with creating a 2-dimensional (2D) array with m rows and n columns using all the elements from original.
     * <p>
     * The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array,
     * the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.
     * <p>
     * Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible
     *
     * @param original 1D array
     * @param m        number of rows
     * @param n        number of columns
     * @return 2D array
     */
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];

        int colCount = 0;
        int rowCount = 0;
        if(m*n < original.length) return new int[0][0];
        for (int j : original) {
            result[rowCount][colCount] = j;
            if (colCount == n - 1){
                rowCount++;
                colCount = -1;
            }
            colCount++;
        }

        return result;
    }
}
