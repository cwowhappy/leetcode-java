package org.cwowhappy.study.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestSortAlgorithm {
    public record TestCase(int[] originValues, int[] resultValues) {

        @Override
        public int[] originValues() {
            int[] copy = new int[originValues.length];
            System.arraycopy(originValues, 0, copy, 0, originValues.length);
            return copy;
        }
    }

    public static List<TestCase> testCases = List.of(
            new TestCase(new int[]{5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5}),
            new TestCase(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
            new TestCase(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
            new TestCase(new int[]{10, 8, 6, 4, 2, 9, 7, 5, 3, 1}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
    );

    @Test
    @DisplayName("冒泡算法测试")
    public void testBubbleSort() {
        for (TestCase testCase : testCases) {
            int[] values = testCase.originValues();
            SortAlgorithm.bubbleSort(values);
            Assertions.assertArrayEquals(values, testCase.resultValues());
        }
    }

    @Test
    @DisplayName("快排算法测试")
    public void testQuickSort() {
        for (TestCase testCase : testCases) {
            int[] values = testCase.originValues();
            SortAlgorithm.quickSort(values);
            Assertions.assertArrayEquals(values, testCase.resultValues());
        }
    }

    @Test
    @DisplayName("归并算法测试")
    public void testMergeSort() {
        for (TestCase testCase : testCases) {
            int[] values = testCase.originValues();
            SortAlgorithm.mergeSort(values);
            Assertions.assertArrayEquals(values, testCase.resultValues());
        }
    }
}
