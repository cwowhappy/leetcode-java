package com.cwowhappy.study.leetcode.easy;

public class Problem053 {
    public static class Solution {
        public int maxSubArray(int[] nums) {
            int preMaxSum = nums[0], curMaxSum = nums[0];
            for (int index = 1; index < nums.length; index ++) {
                int num = nums[index];
                preMaxSum = Math.max(preMaxSum, curMaxSum);
                curMaxSum = Math.max(curMaxSum + num, num);
            }
            return Math.max(preMaxSum, curMaxSum);
        }
    }
}
