package com.techrevolution.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortShould {

    private static final InsertionSort sort = new InsertionSort();

    @Test
    public void sortArray1() {
        int[] array = {82, 42, 23, 28, 92, 6, 52, 28, 88, 17};

        sort.arrangeArrayInAscOrder(array);

        int[] expected = {6, 17, 23, 28, 28, 42, 52, 82, 88, 92};

        assertEquals(Arrays.toString(expected), Arrays.toString(array));
    }

    @Test
    public void sortArray2() {
        int[] array = {25 , 66 , 56 , 37 , 39 , 82 , 34 , 32 , 48 , 46};

        sort.arrangeArrayInAscOrder(array);

        int[] expected = {25, 32, 34, 37, 39, 46, 48, 56, 66, 82};

        assertEquals(Arrays.toString(expected), Arrays.toString(array));
    }

    @Test
    public void sortArray3() {
        int[] array = {9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1};

        sort.arrangeArrayInAscOrder(array);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertEquals(Arrays.toString(expected), Arrays.toString(array));
    }

}
