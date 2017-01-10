package com.PodstawyProgramowania.Lista2;
/**
 * Presentation of MyArrays methods
 *
 * @author Marcin Kokoszka
 * @version 31-10-2016
 */
import java.util.Arrays;
public class List2
{
    public static void main(String[] args) {

        MyArrays arrayModificator = new MyArrays();

        double[] sampleDoubleArray = arrayModificator.randomDoubleArray(7);
        double[] sampleDoubleArray2 = arrayModificator.randomDoubleArray(7);
        int[] sampleIntArray = arrayModificator.randomIntArray(7);
        int[] sampleIntArray2 = arrayModificator.randomIntArray(7);
        double[][] sampleDoubleArray2D = arrayModificator.randomDoubleArray2D(3, 3);
        double[][] sampleDoubleArray2D_2 = arrayModificator.randomDoubleArray2D(3, 3);
        int[][] sampleIntArray2D = arrayModificator.randomIntArray2D(3, 3);
        int[][] sampleIntArray2D_2 = arrayModificator.randomIntArray2D(3, 3);

        System.out.println();
        //Zad. 1
        System.out.println("Zad. 1\n" + "Największa wartość w tablicy jednowymiarowej "
                + Arrays.toString(sampleDoubleArray) + " wynosi " + arrayModificator.findMax(sampleDoubleArray));
        System.out.println("Największa wartość w tablicy jednowymiarowej "
                + Arrays.toString(sampleIntArray) + " wynosi " + arrayModificator.findMax(sampleIntArray));
        System.out.println("");
    
        //Zad. 2
        System.out.println("Zad. 2\n" + "Największa wartość w tablicy dwuwymiarowej "
                + Arrays.deepToString(sampleDoubleArray2D) + " wynosi " + arrayModificator.findMax(sampleDoubleArray2D));
        System.out.println("Największa wartość w tablicy dwuwymiarowej "
                + Arrays.deepToString(sampleIntArray2D) + " wynosi " + arrayModificator.findMax(sampleIntArray2D));
        System.out.println("");
        
        //Zad. 3
        System.out.println("Zad. 3\n" + "Największa wartość każego wiersza tablicy dwuwymiarowej "
                + Arrays.deepToString(sampleDoubleArray2D) + " wynosi " + Arrays.toString(arrayModificator.findRowsMax(sampleDoubleArray2D)));
        System.out.println("Największa wartość każego wiersza tablicy dwuwymiarowej "
                + Arrays.deepToString(sampleIntArray2D) + " wynosi " + Arrays.toString(arrayModificator.findRowsMax(sampleIntArray2D)));
        System.out.println("");

        //Zad. 4
        System.out.println("Zad. 4\n" + "Największa wartość każej kolumny tablicy dwuwymiarowej "
                + Arrays.deepToString(sampleDoubleArray2D) + " wynosi " + Arrays.toString(arrayModificator.findColumnsMax(sampleDoubleArray2D)));
        System.out.println("Największa wartość każej kolumny tablicy dwuwymiarowej "
                + Arrays.deepToString(sampleIntArray2D) + " wynosi " + Arrays.toString(arrayModificator.findColumnsMax(sampleIntArray2D)));
        System.out.println("");

        //Zad. 5
        System.out.println("Zad. 5\n" + "Tablica \n" + Arrays.toString(sampleIntArray) + "\noraz \n" + Arrays.toString(sampleIntArray2)
                + "\nskopiowane do jednej: \n" + Arrays.toString(arrayModificator.combineArrays(sampleIntArray, sampleIntArray2)));
        System.out.println("\nTablica \n" + Arrays.toString(sampleDoubleArray) + "\noraz \n" + Arrays.toString(sampleDoubleArray2)
                + "\nskopiowane do jednej: \n" + Arrays.toString(arrayModificator.combineArrays(sampleDoubleArray, sampleDoubleArray2)));
        System.out.println("");

        //Zad. 6
        System.out.println("Zad. 6\n" + "Wynik mnożenia macierzy \n" + Arrays.deepToString(sampleDoubleArray2D) + "\n oraz \n"
                + Arrays.deepToString(sampleDoubleArray2D_2) + "\n wynosi \n" + Arrays.deepToString(arrayModificator.multiply(sampleDoubleArray2D, sampleDoubleArray2D_2)));
        System.out.println("\nWynik mnożenia macierzy \n" + Arrays.deepToString(sampleIntArray2D) + "\n oraz \n"
                + Arrays.deepToString(sampleIntArray2D_2) + "\n wynosi \n" + Arrays.deepToString(arrayModificator.multiply(sampleIntArray2D, sampleIntArray2D_2)));

        System.out.println();
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{1, 2}, {3, 4}, {5, 6}};
        MyArrays.print2D(arrayModificator.multiply(a, b));

    }
}
