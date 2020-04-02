package com.cwowhappy.study.leetcode.other;

import java.util.Arrays;

/**
 * Count subarrays with equal number of 1’s and 0’s:
 * Given an array arr[] of size n containing 0 and 1 only. The problem is to count the subarrays having equal number of 0’s and 1’s.
 * Sample:
 * Input : arr[] = {1, 0, 0, 1, 0, 1, 1}
 * Output : 8
 * The index range for the 8 sub-arrays are:
 * (0, 1), (2, 3), (0, 3), (3, 4), (4, 5), (2, 5), (0, 5), (1, 6)
 */
public class Problem0001 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 0, 0, 1, 0, 1, 1};
        System.out.println(countSubArrays(numbers));
    }

    /**
     * 时间复杂度：O(n)，空间复杂度：O(n)
     * @param numbers 0、1数组
     * @return 0和1个数相等的子串个数
     */
    public static int countSubArrays(int[] numbers) {
        int[] numberOfSameDifference = new int[2 * numbers.length + 1];
        Arrays.fill(numberOfSameDifference, -1);
        numberOfSameDifference[numbers.length] = 0;
        int totalCount = 0, difference = 0;

        for (int index = 0; index < numbers.length; index ++) {
            difference += (0 == numbers[index]) ? -1 : 1;
            numberOfSameDifference[numbers.length + difference] ++;
            totalCount += numberOfSameDifference[numbers.length + difference];
        }
        return totalCount;
    }
}
