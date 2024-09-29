package org.cwowhappy.study.algorithm;

import org.cwowhappy.study.algorithm.sort.BubbleSort;
import org.cwowhappy.study.algorithm.sort.MergeSort;
import org.cwowhappy.study.algorithm.sort.QuickSort;
import org.cwowhappy.study.algorithm.sort.Sort;

public class SortAlgorithm {
    private static final Sort bubbleSort = new BubbleSort();
    private static final Sort quickSort = new QuickSort();
    private static final Sort mergeSort = new MergeSort();

    public static void bubbleSort(int[] values) {
        bubbleSort.sort(values);
    }

    public static void quickSort(int[] values) {
        quickSort.sort(values);
    }

    public static void mergeSort(int[] values) {
        mergeSort.sort(values);
    }
}
