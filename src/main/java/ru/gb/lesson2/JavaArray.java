package ru.gb.lesson2;

public class JavaArray {

    public static void main(String[] args) {

//3. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

        System.out.println("Задание 1");
        int[] arr = {0, 0, 1, 0, 0, 0, 1, 1, 1, 0 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            } System.out.print(" - " + arr[i] + " , ");

        }
//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        System.out.println("\nЗадание 2");
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = i * 3;
            System.out.print(arr1[i] + " , ");
        }
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        System.out.println("\nЗадание 3");
        int[] arr2 = {1, 5, 7, 2, 11, 4, 5, 9, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]);
            if(arr2[i] < 6){
                arr2[i] = arr2[i] *2;
            } System.out.print(" - " + arr2[i] + " , ");
        }
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        System.out.println("\nЗадание 4");
        int c = 5;
        int[][] arr3 = new int[c][c];
        for (int i = 0; i < c; i++){
            for (int j = 0; j < c; j++){
                if (i == j || i + j == c - 1) {
                    arr3[i][j] = 1;
                }
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println();
        }

// 5. Задать одномерный массив c целыми числами и найти в нем минимальный и максимальный элементы (без помощи интернета);

        System.out.println("\nЗадание 5");
        int[] arr4 = {23, 45, 1, 87, -5, 45, 4, 21, -57, 90};
        int min = arr4[0], max = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " , ");
            if(arr4[i] < min){
                min = arr4[i];
            }
            if(arr4[i] > max){
                max = arr4[i];
            }
        }
        System.out.println("\nМинимальное значение массива: " + min + ", Максимальное значение массива: " + max);
        System.out.println();

// Второй вариант сделал с рандомным заполнением массива , но не понял почему если диапазон делаешь от ноля
// минимальное значение всегда ноль , хотя его в массиве нет а если с минусом то все в порядке

        int[] arr5 = new int[10];
        int min1 = arr5[0], max1 = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (int)((Math.random() * 100) - 50);
            System.out.print(arr5[i] + " , ");
            if(arr5[i] < min1){
                min1 = arr5[i];
            }
            if(arr5[i] > max1){
                max1 = arr5[i];
            }
        }
        System.out.println("\nМинимальное значение массива: " + min1 + ", Максимальное значение массива: " + max1);
    }
}
