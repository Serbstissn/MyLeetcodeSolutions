package com.sebcio.leet_questions.easy;

public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int startingPrice= prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < startingPrice)
                startingPrice = prices[i];
            
            int diff = prices[i] - startingPrice;
            if(diff > maxProfit)
                maxProfit = diff;
        }

        return maxProfit;
    }

}
