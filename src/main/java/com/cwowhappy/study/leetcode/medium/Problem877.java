package com.cwowhappy.study.leetcode.medium;

public class Problem877 {
    public static class Solution {
        public boolean stoneGame(int[] piles) {
            int[][] values = new int[piles.length][piles.length];
            for (int i = 0; i < piles.length; i ++) {
                values[i][i] = piles[i];
            }
            for (int leftPilesLength = 1; leftPilesLength < piles.length; leftPilesLength ++) {
                for (int i = 0; i < piles.length - leftPilesLength; i ++) {
                    values[i][i + leftPilesLength] = Math.max(piles[i] - values[i + 1][i + leftPilesLength],
                            piles[i + leftPilesLength] - values[i][i + leftPilesLength - 1]);
                }
            }
            return values[0][piles.length - 1] > 0;
        }
    }
}
