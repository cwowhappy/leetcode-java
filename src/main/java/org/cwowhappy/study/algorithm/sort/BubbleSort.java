package org.cwowhappy.study.algorithm.sort;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] values) {
        if (values == null || values.length == 0) {
            return;
        }

        for (int i = 1; i < values.length; i++) {
            for (int j = 0; j < values.length - i; j++) {
                if (values[j] > values[j + 1]) {
                    swapValue(values, j, j + 1);
                }
            }
        }
    }
}
