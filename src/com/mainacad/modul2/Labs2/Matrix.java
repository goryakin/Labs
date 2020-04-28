package com.mainacad.modul2.Labs2;


public class Matrix {

    // int[][] matrix1 = new int[][]{{1,2},{3,4}};
    // int[][] matrix2 = new int[][]{{8,4},{3,1}};
    // int[][] sum = sum(matrix1, matrix2);
    //   for (int[] aSum : sum) {
    //    System.out.printf(Arrays.toString(aSum));
    // }
    public static void sum(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[matrix1.length][matrix2.length];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix (sum);

    }
    public static void printMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
