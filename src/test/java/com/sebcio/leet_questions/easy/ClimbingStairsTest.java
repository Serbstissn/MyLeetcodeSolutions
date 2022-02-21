package com.sebcio.leet_questions.easy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class ClimbingStairsTest {

    @Test
    void shouldReturnCorrectValue(){
        ClimbingStairs climbingStairs = new ClimbingStairs();

        assertThat(climbingStairs.climbStairs(3)).isEqualTo(3);
        assertThat(climbingStairs.climbStairs(4)).isEqualTo(5);
        assertThat(climbingStairs.climbStairs(5)).isEqualTo(8);
        assertThat(climbingStairs.climbStairs(6)).isEqualTo(13);


    }
}
