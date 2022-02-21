package com.sebcio.leet_questions.easy;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class BestTimeBuySellStockTest {

    @Test
    void shouldReturnCorrectValue(){

        BestTimeBuySellStock bestTimeBuySellStock = new BestTimeBuySellStock();

        assertThat(bestTimeBuySellStock.maxProfit(new int[] {7,1,5,3,6,4})).isEqualTo(5);
        assertThat(bestTimeBuySellStock.maxProfit(new int[] {7,6,4,3,1})).isEqualTo(0);


    }

}
