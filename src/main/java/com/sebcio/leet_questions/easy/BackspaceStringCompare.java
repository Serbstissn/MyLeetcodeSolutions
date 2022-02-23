package com.sebcio.leet_questions.easy;

public class BackspaceStringCompare {

    /**
     * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
     * <p>
     * Note that after backspacing an empty text, the text will continue empty.
     *
     * @param s first String
     * @param t second String
     * @return if compared strings are the same after backspaces
     */
    public static boolean backspaceCompare(String s, String t) {
//        idea: compare two strings starting from back if backspace (#) skip next non-backspace character
//        if characters that stay in both strings are different return false
//        complexity: time O(n) , space O(1)
        int i = s.length() - 1;
        int j = t.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {

//            process backspaces in s String
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else break;
            }

//            process backspaces in t String
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else break;
            }
//            if one string ended before second one - return false
            if (i >= 0 != j >= 0) return false;
//            if character that stays are different - return false
            if (i >= 0 && s.charAt(i) != t.charAt(j)) return false;

            i--;
            j--;
        }


        return true;
    }

}
