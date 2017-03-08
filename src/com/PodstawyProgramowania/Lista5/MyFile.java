package com.PodstawyProgramowania.Lista5;

import com.PodstawyProgramowania.Lista2.MyArrays;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kokoseq on 19.12.2016.
 */
public class MyFile {

    public static void main(String args[]) {

        //Zadanie 1
        MyFile mf = new MyFile();
        double[][] matrix = mf.generateMatrix(5);
        System.out.println("Matrix to Text File:");
        print2D(matrix);
        mf.matrixToTextFile(matrix);
        System.out.println("\nMatrix from Text File:");
        double[][] matrixf = mf.matrixFromTextFile();

        //Zadanie 2
        double[][] matrix2 = mf.generateMatrix(4);
        System.out.println("\nMatrix to Binary File:");
        print2D(matrix2);
        mf.matrixToBinaryFile(matrix2);
        System.out.println("\nMatrix from Binary File:");
        double[][] matrixf2 = mf.matrixFromBinaryFile();

    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public double[][] generateMatrix(int n) {
        double[][] t = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = round(Math.random() * 100, 2);
            }
        }
        return t;
    }

    public boolean matrixToTextFile(double[][] m) {

        try (FileWriter fw = new FileWriter("matrix.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {

            String content = matrixToString(m);
            bw.write("Macierz\n");
            bw.write("" + m.length + "\n");
            bw.write("" + m[0].length + "\n");
            bw.write(content);

            return true;

        } catch (IOException e) {

            e.printStackTrace();

        }

        return false;
    }

    private String matrixToString(double[][] m) {
        String content = "";

        for (double[] d : m) {
            for (double i : d) {
                content = content + i + " ";
            }
            content = content + "\n";
        }
        return content;
    }

    public double[][] matrixFromTextFile() {

        try (FileReader fr = new FileReader("matrix.txt");
             BufferedReader br = new BufferedReader(fr)){

            br.readLine();
            double[][] matrix = new double[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())];
            String line;
            String[] tempS;
            int i = 0;
            double maxValue = -1;
            int maxValueI = 0;
            int maxValueJ = 0;

            while ((line = br.readLine()) != null) {
                tempS = line.split(" ");
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Double.parseDouble(tempS[j]);
                    if (matrix[i][j] > maxValue) {
                        maxValue = matrix[i][j];
                        maxValueI = i;
                        maxValueJ = j;
                    }
                }
                i++;
            }

            print2D(matrix);
            System.out.println("Element o indeksach " + maxValueI + ", " + maxValueJ + " zawiera największą wartość: " + maxValue);

            return matrix;

        } catch (IOException e) {

            e.printStackTrace();

        }

        return null;
    }

    public boolean matrixToBinaryFile(double[][] m) {

        File file = new File("matrix.dat");


        try (FileOutputStream fos = new FileOutputStream(file);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             DataOutputStream dos = new DataOutputStream(bos)) {


            if (!file.exists()) file.createNewFile();

            dos.writeInt(m.length);
            dos.writeInt(m[0].length);
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    dos.writeDouble(m[i][j]);
                }

            }

            return true;

        } catch (IOException e) {

            e.printStackTrace();

        }
        return false;
    }

    public double[][] matrixFromBinaryFile() {

        File file = new File("matrix.dat");


        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis);
             DataInputStream dis = new DataInputStream(bis)) {

            double maxValue = -1;
            int maxValueI = 0;
            int maxValueJ = 0;

            double[][] m = new double[dis.readInt()][dis.readInt()];

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    m[i][j] = dis.readDouble();
                    if (m[i][j] > maxValue){
                        maxValue = m[i][j];
                        maxValueI = i;
                        maxValueJ = j;
                    }
                }
            }
            print2D(m);
            System.out.println("Element o indeksach " + maxValueI + ", " + maxValueJ + " zawiera największą wartość: " + maxValue);

            return m;

        } catch (IOException e) {

            e.printStackTrace();

        }
        return null;
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
}
