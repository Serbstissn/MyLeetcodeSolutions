package com.sebcio.leet_questions.easy;

public class RangeSumQuery {
    
    private int[] numArray;

    public RangeSumQuery(int[] numArray){
        this.numArray = new int[numArray.length];

        this.numArray[0] = numArray[0];

        for(int i = 1 ; i < numArray.length; i++){
            this.numArray[i] = this.numArray[i-1] + numArray[i];
        }
    }

    public int sumRange(int left, int right) {

        // with aggregate sum array as parameter each querry is O(1) runtime complexity
        if(left == 0)
            return numArray[right];
        
        return numArray[right] - numArray[left - 1];
       
       // code below makes each querry a O(n) time complexity
        // int sum = 0;

        // for(int i = left; i <= right; i ++){
        //     sum += numArray[i];
        // }
        
        // return sum;
    }

}
