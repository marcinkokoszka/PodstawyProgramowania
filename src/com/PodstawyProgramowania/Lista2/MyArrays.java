package com.PodstawyProgramowania.Lista2;

/**
 * Class with methods dealing with tasks from List 2
 *
 * @author Marcin Kokoszka
 * @version 20-10-2016
 */
public class MyArrays
{
    public static void print2D(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print2D(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%05.2f", matrix[i][j]) + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    double[] randomDoubleArray(int n) {
        double[] randomArray = new double[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10000) / 100.0;
        }
        return randomArray;
    }

    double[][] randomDoubleArray2D(int n, int m) {
        double[][] randomArray = new double[n][m];
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < m; j++) {
                randomArray[i][j] = (int) (Math.random() * 10000) / 100.0;
            }
        }
        return randomArray;
    }

    int[] randomIntArray(int n) {
        int[] randomArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }
        return randomArray;
    }

    int[][] randomIntArray2D(int n, int m) {
        int[][] randomArray = new int[n][m];
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < m; j++) {
                randomArray[i][j] = (int) (Math.random() * 100);
            }
        }
        return randomArray;
    }

    double findMax(double[] array) {
        double maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) maxValue = array[i];
        }
        return maxValue;
    }

    int findMax(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) maxValue = array[i];
        }
        return maxValue;
    }

    double findMax(double[][] array) {
        double maxValue = array[0][0];
        for (double[] anArray : array) {
            for (double value : anArray) {
                if (maxValue < value) maxValue = value;
            }
        }
        return maxValue;
    }

    int findMax(int[][] array) {
        int maxValue = array[0][0];
        for (int[] anArray : array) {
            for (int value : anArray) {
                if (maxValue < value) maxValue = value;
            }
        }
        return maxValue;
    }

    double[] findRowsMax(double[][] array) {
        double[] maxValue = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            maxValue[i] = array[i][0];
        }

        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array[j].length; i++) {
                if (maxValue[j] < array[j][i]) maxValue[j] = array[j][i];
            }
        }
        return maxValue;
    }

    int[] findRowsMax(int[][] array) {
        int[] maxValue = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            maxValue[i] = array[i][0];
        }

        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array[j].length; i++) {
                if (maxValue[j] < array[j][i]) maxValue[j] = array[j][i];
            }
        }
        return maxValue;
    }

    double[] findColumnsMax(double[][] array) {
        double[] maxValue = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            maxValue[i] = array[0][i];
        }

        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array[j].length; i++) {
                if (maxValue[j] < array[i][j]) maxValue[j] = array[i][j];
            }
        }
        return maxValue;
    }

    int[] findColumnsMax(int[][] array) {
        int[] maxValue = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            maxValue[i] = array[0][i];
        }

        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array[j].length; i++) {
                if (maxValue[j] < array[i][j]) maxValue[j] = array[i][j];
            }
        }
        return maxValue;
    }

    int[][] multiply(int[][] a, int[][] b) {
        int[][] product = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    product[i][j] = product[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    double[][] multiply(double[][] a, double[][] b) {
        double[][] product = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    product[i][j] = product[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return product;
    }

    int[] combineArrays(int[] array1, int[] array2) {

        int[] combinedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            combinedArray[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            combinedArray[j + array1.length] = array2[j];
        }

        return combinedArray;
    }

    double[] combineArrays(double[] array1, double[] array2) {

        double[] combinedArray = new double[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            combinedArray[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            combinedArray[j + array1.length] = array2[j];
        }

        return combinedArray;
    }

    double sumArrayElements(double[] array) {
        double arraySum = 0;
        for (double item : array) arraySum += item;
        return arraySum;
    }

    double sumPositiveArrayElements(double[] array) {
        double arraySum = 0;
        for (double item : array) if (item > 0) arraySum += item;
        return arraySum;
    }

    double numberOfPositiveArrayElements(double[] array) {
        double arrayPositiveQty = 0;
        for (double item : array) if (item > 0) arrayPositiveQty += 1;
        return arrayPositiveQty;
    }

    double averageOfArrayElements(double[] array) {
        return sumArrayElements(array) / array.length;
    }

    double averageOfPositiveArrayElements(double[] array) {
        return sumPositiveArrayElements(array) / numberOfPositiveArrayElements(array);
    }

    // Needs some work, doesn't show correct results in all cases
    /*
    double findMin(double[] array)
    {
        double minValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (minValue > array[i]) minValue = array[i];
        }
        return minValue;
    }

    int findMin(int[] array)
    {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++){
            if (minValue > array[i]) minValue = array[i];
        }
        return minValue;
    }

    double findMin(double[][] array)
    {
        double minValue = array[0][0];
        for (double[] anArray : array) {
            for (int i = 1; i < anArray.length; i++) {
                if (minValue > anArray[i]) minValue = anArray[i];
            }
        }
        return minValue;
    }

    int findMin(int[][] array)
    {
        int minValue = array[0][0];
        for (int[] anArray : array) {
            for (int i = 1; i < anArray.length; i++) {
                if (minValue > anArray[i]) minValue = anArray[i];
            }
        }
        return minValue;
    }

    double[] findRowsMin(double[][] array)
    {
        double[] minValue = new double[array.length];
        for (int j = 0; j < array.length; j++){
            for (int i = 1; i < array[j].length; i++){
                if (minValue[j] > array[j][i]) minValue[j] = array[j][i];
            }
        }
        return minValue;
    }

    int[] findRowsMin(int[][] array)
    {
        int[] minValue = new int[array.length];
        for (int j = 0; j < array.length; j++){
            for (int i = 1; i < array[j].length; i++){
                if (minValue[j] > array[j][i]) minValue[j] = array[j][i];
            }
        }
        return minValue;
    }
    */
}
