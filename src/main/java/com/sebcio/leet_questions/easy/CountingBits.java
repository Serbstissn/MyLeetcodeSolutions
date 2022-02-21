package com.sebcio.leet_questions.easy;

public class CountingBits {

    public int[] countBits(int n) {

        int[] result = new int[n+1];

        //zero ones for zero
        result[0] = 0;

        // Solution below has O(nlogn) time complexity
        // for(int i = 1; i < result.length; i++){
        //     int count = 1;
        //     int number = i;
        //     while(number > 1){
        //         if(number % 2 == 1)
        //             count++;
        //         number = number/2;
        //     }

        //     result[i] = count;
        // }

        // solution with O(n) complexity

        for(int i=1 ; i < result.length ; i++){
            result[i] = result[i>>1] + i%2; // i&1 - alternatively to omit complexity of modulo operation 
        }
        
        return result;

    }
}
