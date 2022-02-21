package com.sebcio.leet_questions.easy;

public class PeakIndexMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int middle = left + ((right - left) / 2);

            if(arr[middle] < arr[middle + 1]){
                left = middle + 1;
            }else
                right = middle;            
        }

        return left;

    }

}
