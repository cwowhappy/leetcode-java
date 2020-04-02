package com.cwowhappy.study.leetcode.other;

import java.util.Arrays;

/**
 * Count sub-arrays with equal number of 1’s and 0’s:
 * Given an array arr[] of size n containing 0 and 1 only. The problem is to count the sub-arrays having equal number of 0’s and 1’s.
 * Example:
 * Input : arr[] = {1, 0, 0, 1, 0, 1, 1}
 * Output : 8
 * The index range for the 8 sub-arrays are:
 * (0, 1), (2, 3), (0, 3), (3, 4), (4, 5), (2, 5), (0, 5), (1, 6)
 *
 * 同类型题目：
 * Count sub-arrays with same even and odd elements
 * Given an array of N integers, count number of even-odd sub-arrays. An even – odd sub-array is a sub-array that contains the same number of even as well as odd integers.
 * Example:
 * Input : arr[] = {2, 5, 7, 8}
 * Output : 3
 * Explanation : There are total 3 even-odd sub-arrays.
 *                1) {2, 5}
 *                2) {7, 8}
 *                3) {2, 5, 7, 8}
 *
 * Input : arr[] = {3, 4, 6, 8, 1, 10}
 * Output : 3
 * Explanation : In this case, 3 even-odd sub-arrays are:
 *                1) {3, 4}
 *                2) {8, 1}
 *                3) {1, 10}
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
        int totalCount = 0, difference = 0;

        int[] numberOfSameDifference = new int[2 * numbers.length + 1];
        Arrays.fill(numberOfSameDifference, -1);
        numberOfSameDifference[numbers.length] = 0;
        for (int index = 0; index < numbers.length; index ++) {
            difference += (0 == numbers[index]) ? -1 : 1;
            numberOfSameDifference[numbers.length + difference] ++;
            totalCount += numberOfSameDifference[numbers.length + difference];
        }
        return totalCount;
    }
}
