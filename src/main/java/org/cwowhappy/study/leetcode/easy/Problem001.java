package org.cwowhappy.study.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Problem001 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {2, 7, 11, 13};
        int target = 9;
        for (int index : solution.twoSum(nums, target)) {
            System.out.println(index);
        }
    }

    public static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] indexes = new int[2];
            Map<Integer, Integer> numberIndexMap = new HashMap<>();
            for (int index = 0; index < nums.length; index ++) {
                int number = nums[index];
                if (numberIndexMap.containsKey(target - number)) {
                    indexes[1] = index;
                    indexes[0] = numberIndexMap.get(target - number);
                } else {
                    numberIndexMap.put(number, index);
                }
            }
            return indexes;
        }
    }
}
