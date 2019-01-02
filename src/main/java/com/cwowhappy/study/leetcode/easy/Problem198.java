package com.cwowhappy.study.leetcode.easy;

public class Problem198 {
    public static class Solution {
        public int rob(int[] nums) {
            if (0 == nums.length) {
                return 0;
            }
            int maxProfitWithLast = nums[0], maxProfitWithoutLast = 0;
            for (int index = 1; index < nums.length; index ++) {
                int tmp = maxProfitWithLast;
                maxProfitWithLast = maxProfitWithoutLast + nums[index];
                maxProfitWithoutLast = Math.max(tmp, maxProfitWithoutLast);
            }
            return Math.max(maxProfitWithLast, maxProfitWithoutLast);
        }
    }
}
