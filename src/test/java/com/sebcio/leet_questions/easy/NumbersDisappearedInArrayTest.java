package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class NumbersDisappearedInArrayTest {

    @Test
    void correctInputShouldReturnCorrectOutput(){
        //given
        int[] input = new int[] {4,3,2,7,8,2,3,1};
        NumbersDisappearedInArray numbersDisappearedInArray = new NumbersDisappearedInArray();

        assertThat(numbersDisappearedInArray.findDisappearedNumbers(input)).containsExactly(5 , 6 );
    }

}
