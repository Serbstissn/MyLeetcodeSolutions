package com.sebcio.leet_questions.medium;

public class WordSearch {

    /**
     * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
     * <p>
     * The word can be constructed from letters of sequentially adjacent cells,
     * where adjacent cells are horizontally or vertically neighboring.
     * The same letter cell may not be used more than once.
     *
     * @param board 2D array with letters
     * @param word  Word to find in array
     * @return whether word was found
     */
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && exist(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    private static boolean exist(char[][] board, String word, int i, int j, int currentChar) {
        if (currentChar == word.length()) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(currentChar))
            return false;

        board[i][j] = ' ';
        boolean exist = exist(board, word, i - 1, j, currentChar + 1)
                || exist(board, word, i + 1, j, currentChar + 1)
                || exist(board, word, i, j - 1, currentChar + 1)
                || exist(board, word, i, j + 1, currentChar + 1);

        board[i][j] = word.charAt(currentChar);

        return exist;
    }
}
