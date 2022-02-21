package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SingleNumberTest {

    @Test
    void correctInputShouldReturnCorrectResult(){
        //given
        SingleNumber singleNumber = new SingleNumber();
        int[] input = {4,1,2,1,2};

        //then
        assertThat(singleNumber.singleNumber(input)).isEqualTo(4);
    }
}
