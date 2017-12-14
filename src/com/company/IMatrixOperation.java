package com.company;

/**
 * Created by Andrea on 2017.12.14..
 */
public interface IMatrixOperation {

        void printMatrix(int[][] matrix);
        int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max);
        int [][] multiplyWithScalar(int scalar, int [][] matrix);
        int[][] sum(int [][] matrix1, int [][] matrix2);


}
