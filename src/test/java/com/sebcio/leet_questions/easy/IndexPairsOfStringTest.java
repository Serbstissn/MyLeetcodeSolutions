package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class IndexPairsOfStringTest {

    @Test
    void shouldReturnCorrectValue(){
        List<Integer[]> result = IndexPairsOfString.pairsOfString("thestoryofleetcodeandme" , new String[]{"story","fleet","leetcode"});
        List<Integer[]> result2 = IndexPairsOfString.pairsOfString("ababa" , new String[]{"aba","ab"});


        assertThat(result).containsExactly(new Integer[]{3,7} , new Integer[]{9,13} ,new Integer[]{10,17});
        assertThat(result2).containsExactly(new Integer[]{0,1} , new Integer[]{0,2} ,new Integer[]{2,3} , new Integer[]{2,4});
    }
}