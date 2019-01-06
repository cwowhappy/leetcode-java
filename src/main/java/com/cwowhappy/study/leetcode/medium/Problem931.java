package com.cwowhappy.study.leetcode.medium;

import java.util.Arrays;

public class Problem931 {
    public static class Solution {
        public int minFallingPathSum(int[][] A) {
            int preLevelIndex = 1, curLevelIndex = 0;
            int[][] curMinSum = new int[2][A[0].length];
            System.arraycopy(A[0], 0, curMinSum[curLevelIndex], 0, A[0].length);
            if (1 < A.length) {
                if (1 == A[0].length) {
                    for (int i = 1; i < A.length; i ++) {
                        curMinSum[curLevelIndex][0] += A[i][0];
                    }
                } else {
                    for (int i = 1; i < A.length; i++) {
                        curLevelIndex = 1 - curLevelIndex;
                        preLevelIndex = 1 - preLevelIndex;
                        for (int index = 0; index < A[i].length; index++) {
                            int tmp;
                            if (0 == index) {
                                tmp = curMinSum[preLevelIndex][index + 1];
                            } else if (A[i].length - 1 == index) {
                                tmp = curMinSum[preLevelIndex][index - 1];
                            } else {
                                tmp = Math.min(curMinSum[preLevelIndex][index - 1], curMinSum[preLevelIndex][index + 1]);
                            }
                            curMinSum[curLevelIndex][index] = Math.min(curMinSum[preLevelIndex][index], tmp) + A[i][index];
                        }
                    }
                }
            }
            int minSum;
            minSum = curMinSum[curLevelIndex][0];
            for (int index = 1; index < curMinSum[curLevelIndex].length; index ++) {
                minSum = Math.min(minSum, curMinSum[curLevelIndex][index]);
            }

            return minSum;
        }
    }
}
