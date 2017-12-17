package com.company;

public class Main {

    public static void main(String[] args) {
        MatrixOperation mo = new MatrixOperation();
       int[][]matrix= mo.initMatrixWithRandomNumbers(2,2,1,10);
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
        }
    }
}
