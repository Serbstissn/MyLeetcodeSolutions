package com.sebcio.leet_questions.medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {

    @Test
    void shouldReturnCorrectValue(){
        //given
        Subsets sub = new Subsets();
        int[] input = new int[]{1,2,3};

        Assertions.assertThat(sub.subsets(input).size()).isEqualTo(8);
        Assertions.assertThat(sub.subsets(input)).contains(Arrays.asList() , Arrays.asList(1), Arrays.asList(2) , Arrays.asList(3) , Arrays.asList(1 , 2) ,Arrays.asList(1 , 3) , Arrays.asList(2 , 3));
    }

}