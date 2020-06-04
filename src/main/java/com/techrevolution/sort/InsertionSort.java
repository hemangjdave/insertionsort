package com.techrevolution.sort;

public class InsertionSort {

    // 82 42 23 28 92 6 52 28 88 17

    // 42 82 23

    // 42 23 82
    // 23 42 82 28

    // 23 42 28 82
    // 23 28 42 82 92

    // no swap

    // 23 28 42 82 6 92
    // 23 28 42 6 82 92
    // 23 28 6 42 82 92
    // 23 6 28 42 82 92
    // 6 23 28 42 82 92 52


    // 6 23 28 42 82 52 92
    // 6 23 28 42 52 82 92 28
    // no swap

    // 6 23 28 42 52 82 28 92
    // 6 23 28 42 52 28 82 92
    // 6 23 28 42 28 52 82 92
    // 6 23 28 28 42 52 82 92 88

    // 6 23 28 28 42 52 82 88 92 17

    // 6 23 28 28 42 52 82 88 17 92
    // 6 23 28 28 42 52 82 17 88 92
    // 6 23 28 28 42 52 17 82 88 92
    // 6 23 28 28 42 17 52 82 88 92
    // 6 23 28 28 17 42 52 82 88 92
    // 6 23 28 17 28 42 52 82 88 92
    // 6 23 17 28 28 42 52 82 88 92
    // 6 17 23 28 28 42 52 82 88 92

    public void arrangeArrayInAscOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int mainVariable = array[i];
            for (int j = i; j > 0; j--) {
                if (mainVariable < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = mainVariable;
                    array[j] = temp;
                }

            }
        }
    }
}
