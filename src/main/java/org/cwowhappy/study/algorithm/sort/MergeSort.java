package org.cwowhappy.study.algorithm.sort;

public class MergeSort implements Sort {
    @Override
    public void sort(int[] values) {
        recursive(values, 0, values.length - 1);
    }

    private void recursive(int[] values, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        recursive(values, left, mid);
        recursive(values, mid + 1, right);

        int length = right - left + 1;
        int[] tmpArray = new int[length];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (values[i] < values[j]) {
                tmpArray[k] = values[i];
                i ++;
            } else {
                tmpArray[k] = values[j];
                j ++;
            }
            k ++;
        }
        while (i <= mid) {
            tmpArray[k] = values[i];
            i ++;
            k ++;
        }
        while (j <= right) {
            tmpArray[k] = values[j];
            j ++;
            k ++;
        }
        System.arraycopy(tmpArray, 0, values, left, length);
    }
}
