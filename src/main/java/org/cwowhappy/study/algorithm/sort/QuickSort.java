package org.cwowhappy.study.algorithm.sort;

public class QuickSort implements Sort {
    @Override
    public void sort(int[] values) {
        recursive(values, 0, values.length - 1);
    }

    private void recursive(int[] values, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = values[left];
        int i = left + 1, j = right;
        while (i <= j) {
            while (i <= j && values[i] < pivot) { i++; }
            while (i <= j && values[j] > pivot) { j--; }
            if (i < j) {
                swapValue(values, i, j);
            }
        }
        if (left < j) {
            swapValue(values, left, j);
        }

        recursive(values, left, j - 1);
        recursive(values, j + 1, right);
    }
}
