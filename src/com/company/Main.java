package com.company;

public class Main {

    public static void main(String[] args) {
        MatrixOperation mo = new MatrixOperation();
      /* int[][]matrix= mo.initMatrixWithRandomNumbers(2,2,1,10);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        int [][] newMatrix=mo.multiplyWithScalar(5, matrix);

        for (int i = 0; i <newMatrix.length ; i++) {
            for (int j = 0; j <newMatrix[i].length ; j++) {
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }*/

        int[][]matrix1= mo.initMatrixWithRandomNumbers(2, 3, 1, 10);
        for (int i = 0; i <matrix1.length ; i++) {
            for (int j = 0; j <matrix1[i].length ; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        } System.out.println();
        int[][]matrix2= mo.initMatrixWithRandomNumbers(2, 3, 10, 20);
        for (int i = 0; i <matrix2.length ; i++) {
            for (int j = 0; j <matrix2[i].length ; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        } System.out.println();
        int [][] sumMatrix=mo.sum(matrix1, matrix2);

        for (int i = 0; i <sumMatrix.length ; i++) {
            for (int j = 0; j <sumMatrix[i].length ; j++) {
                System.out.print(sumMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }


}
