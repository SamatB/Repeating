package org.example.algorithms_sorting;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        sorT( new int[] {3, 1, 5, 4, 9, 0});
    }

    public static void sorT(int[] array) {
        //Пузырьковая сортировка
        //Внешний цикл отвечает за номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            //Внутренний цикл отвечает за перебор элементов в одном проходе
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    //переменная temp отвечает за обмен значений
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int a : array) {
            System.out.println(a);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
