package com.sebcio.leet_questions.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
public class LetterCasePermutation {

    private Set<String> permList = new HashSet<>();

    /**
     * Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
     * <p>
     * Return a list of all possible strings we could create. Return the output in any order.
     *
     * @param s string to permute
     * @return list of permutations
     */
    public List<String> letterCasePermutation(String s) {

        permList.add(s);
        char[] chars = s.toCharArray();
        letterCasePermutation(chars, 0);

        return new ArrayList<>(permList);
    }

    private void letterCasePermutation(char[] s, int currEl) {
        if (currEl == s.length) return;
        if (!Character.isDigit(s[currEl])) {
            log.info(currEl + "->" + String.valueOf(s));
            permList.add(String.valueOf(s));
            letterCasePermutation(s, currEl + 1);
            if (Character.isLowerCase(s[currEl])) {
                s[currEl] = Character.toUpperCase(s[currEl]);
            } else {
                s[currEl] = Character.toLowerCase(s[currEl]);
            }
            permList.add(String.valueOf(s));
            letterCasePermutation(s, currEl + 1);

        } else {
            letterCasePermutation(s, currEl + 1);
        }
    }
}
