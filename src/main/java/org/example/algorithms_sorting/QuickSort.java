package org.example.algorithms_sorting;

public class QuickSort {
    public static void main(String[] args) {
        quickSort(new int[] {11, 2, 10, 1, 9, 3, 8, 4, 7, 5, 6, 0}, 0, 11);
    }

    public static void quickSort(int[] array, int low, int high) {
        //Быстрая сортировка
        //завершить, если массив пуст или уже нечего делить
        if (array.length == 0 || low >= high) return;
        //выбирание опорного пункта
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        System.out.println("Middle number: " + opora);

        //разделение на подмассивы
        int i = low, j = high;
        while (i <= j) {
//            System.out.println("Low numbers from middle:");

            while (array[i] < opora) {
                System.out.println(i++);
            }
//            System.out.println("High numbers from middle:");
            while (array[j] > opora) {
                System.out.println(j--);
            }
            //меняем местами
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

//        рекурсия для сортировки левой и правой части
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }

//        for (int a: array) {
//            System.out.println(a);
//        }
    }
}
