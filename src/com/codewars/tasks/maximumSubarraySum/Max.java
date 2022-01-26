package com.codewars.tasks.maximumSubarraySum;

public class Max {
    public static int sequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int maxSumEver = 0;
        int maxSumNow = 0;
        for (int value : arr) {
            maxSumNow = maxSumNow + value;
            if (maxSumEver < maxSumNow)
                maxSumEver = maxSumNow;
            if (maxSumNow < 0)
                maxSumNow = 0;
        }
        return maxSumEver;
    }
}