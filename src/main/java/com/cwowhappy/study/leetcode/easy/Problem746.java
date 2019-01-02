package com.cwowhappy.study.leetcode.easy;

public class Problem746 {
    public static class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int minCostWithLast = 0, minCostWithoutLast = 0;
            if (cost.length > 1) {
                minCostWithLast = cost[0];
                for (int index = 1; index < cost.length; index ++) {
                    int tmp = minCostWithoutLast;
                    minCostWithoutLast = minCostWithLast;
                    minCostWithLast = Math.min(tmp, minCostWithLast) + cost[index];
                }
            }
            return Math.min(minCostWithLast, minCostWithoutLast);
        }
    }
}
