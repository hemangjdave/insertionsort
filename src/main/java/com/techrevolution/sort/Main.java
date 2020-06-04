package com.techrevolution.sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        int array[] = {82, 42, 23, 28, 92, 6, 52, 28, 88, 17};

        int array2[] = {25 , 66 , 56 , 37 , 39 , 82 , 34 , 32 , 48 , 46};

        sort.arrangeArrayInAscOrder(array);

        sort.arrangeArrayInAscOrder(array2);


        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }
}
