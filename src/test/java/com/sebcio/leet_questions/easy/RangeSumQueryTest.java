package com.sebcio.leet_questions.easy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RangeSumQueryTest {

    @Test
    void shouldReturnCorrectValue(){

        RangeSumQuery rangeSumQuery = new RangeSumQuery(new int[] {-2, 0, 3, -5, 2, -1});

        assertThat(rangeSumQuery.sumRange(0, 2)).isEqualTo(1);
        assertThat(rangeSumQuery.sumRange(2, 5)).isEqualTo(-1);
        assertThat(rangeSumQuery.sumRange(0, 5)).isEqualTo(-3);


    }
}
