package org.cwowhappy.study.algorithm.sort;

public interface Sort {
    void sort(int[] values);

    default void swapValue(int[] values, int i, int j) {
        int tmp = values[j];
        values[j] = values[i];
        values[i] = tmp;
    }
}
