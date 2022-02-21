package com.sebcio.leet_questions.easy;

public class SmallestLetterGreaterThanTarget {

    public static char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            int middle = left + (right - left + 1) / 2;
            if (letters[middle] > target) {
                right = middle - 1;
            } else
                left = middle;
        }

        if (letters[left] > target) {
            return letters[left];
        } else if (left == letters.length - 1)
            return letters[0];
        else
            return letters[left + 1];
    }

}
