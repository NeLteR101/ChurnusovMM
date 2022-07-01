package com.company;

import java.util.Random;


public class Main {


    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        int[] vectorB = new int[4];
        System.out.println("\nМатрица:");
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                int element = -7 + new Random().nextInt(17);
                matrix[i][j] = element;
                if (element % 2 == 0) {
                    count++;
                }
            }
            vectorB[i] = count;
        }

        for (int[] matrixItem : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrixItem[j] + " ");
            }
            System.out.print("\n");
        }


        for (int j : vectorB) {
            System.out.print("\nКоличество четных чисел в i-й строке: " + j);
        }


    }
}
