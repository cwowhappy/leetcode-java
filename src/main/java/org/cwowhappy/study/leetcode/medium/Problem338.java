package org.cwowhappy.study.leetcode.medium;

public class Problem338 {
    public static class Solution {
        public int[] countBits(int num) {
            int[] sizes = new int[num + 1];
            int nearestExp = 1;
            if (0 == num) {
                sizes[0] = 0;
            } else if (1 == num) {
                sizes[0] = 0;
                sizes[1] = 1;
            } else {
                sizes[0] = 0;
                sizes[1] = 1;
                for (int i = 2; i <= num; i ++) {
                    int tmp = i - nearestExp;
                    if (tmp == nearestExp) {
                        nearestExp = i;
                        sizes[i] = 1;
                    } else {
                        sizes[i] = 1 + sizes[tmp];
                    }
                }
            }
            return sizes;
        }
    }
}
