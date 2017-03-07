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
        System.out.println("Matrix to Text File:\n" + Arrays.deepToString(matrix));
        mf.matrixToTextFile(matrix);
        double[][] matrixf = mf.matrixFromTextFile();
        System.out.println("Matrix from Text File:");
        MyArrays.print2D(matrixf);

        //Zadanie 2
        double[][] matrix2 = mf.generateMatrix(4);
        System.out.println("Matrix to Binary File:\n" + Arrays.deepToString(matrix2));
        mf.matrixToBinaryFile(matrix2);
        double[][] matrixf2 = mf.matrixFromBinaryFile();
        System.out.println("Matrix from Binary File:");
        MyArrays.print2D(matrixf2);
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

            while ((line = br.readLine()) != null) {
                tempS = line.split(" ");
                for (int j = 0; j < matrix[i].length; j++) matrix[i][j] = Double.parseDouble(tempS[j]);
                i++;
            }

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

            double[][] m = new double[dis.readInt()][dis.readInt()];

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    m[i][j] = dis.readDouble();
                }
            }

            return m;

        } catch (IOException e) {

            e.printStackTrace();

        }
        return null;
    }
}
