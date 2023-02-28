package org.example.algorithms_sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        insertion(new int[] {8, 2, 4, 7, 5, 6, 1, 3, 0, 9});
    }

    public static void insertion(int[] array) {
        //Сортировка вставками
        int j;
        //обход списка
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            for (j = i; j > 0 && temp < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }

        for (int a : array) {
            System.out.println(++a +": " + a);
        }
        System.out.println("================");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
