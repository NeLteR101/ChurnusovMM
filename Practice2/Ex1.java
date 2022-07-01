package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[] {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31}; // Массив разрешенных значений
        int[] arr2 = new int[arr.length]; // Общий массив
        int[] arr3 = new int[arr.length]; // Результативный массив
        System.out.println("Общий массив:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = ((int)(Math.random() * 31) + 0);
            System.out.print(arr2[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Результативный массив:");

        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr.length ;j++) {
                if (arr[i] == arr2[j]) {
                    arr3[0+i] = arr[i];
                    System.out.print(arr3[i]);
                    System.out.print(" ");

                }
            }
        }


    }
}
