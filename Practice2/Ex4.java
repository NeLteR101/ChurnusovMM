package com.company;

import java.util.Random;


public class Main {


    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        int sum = 1;
        System.out.println("Матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int element = -7 + new Random().nextInt(17);
                matrix[i][j] = element;
                System.out.print(matrix[i][j] + " ");
                if (j != 0 && i == j && matrix[i][j - 1] < 0) {
                    sum *= matrix[i][j - 1];
                }
            }
            System.out.print("\n");
        }
        System.out.println(sum);
        double averageSum = Math.pow(sum, 1. / 3);
        System.out.print("Среднее геометрическое отрицательных элементов параллели главной диагонали, расположенной под диагональю: " + averageSum);
    }
}
