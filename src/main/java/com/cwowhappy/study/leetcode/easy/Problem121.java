package com.cwowhappy.study.leetcode.easy;

/**
 * DP问题：
 */
public class Problem121 {
    public static class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            if (0 < prices.length) {
                int minPrice = prices[0];
                for (int index = 1; index < prices.length; index ++) {
                    minPrice = Math.min(minPrice, prices[index]);
                    maxProfit = Math.max(maxProfit, prices[index] - minPrice);
                }
            }
            return maxProfit;
        }
    }
}
