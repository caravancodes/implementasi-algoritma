package com.company;
import java.io.PrintStream;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int b, k, g, i, p;
        int[][] m = new int[9999][9999];
        System.out.print("Masukan Ukuran Baris : ");
        b = in.nextInt();
        System.out.print("Masukan Ukuran Kolom : ");
        k = in.nextInt();
        System.out.println("---------------------------------------");
        for (i = 1; i <= b; i++) {
            for (p = 1; p <= k; p++) {
                System.out.print("Masukan Isi Matriks ke - [" + i + "]" + " [" + p + "] : ");
                m[i][p] = in.nextInt();
            }
        }
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.println("Bentuk Matriksnya Adalah : ");
        for (i = 1; i <= b; i++) {
            System.out.print("| ");
            for (p = 1; p <= k; p++) {
                System.out.printf("%3d", m[i][p]);
            }
            System.out.println("  |");
        }
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Matriks Transposenya Adalah : ");
        for (i = 1; i <= k; i++) {
            System.out.print("| ");
            for (p = 1; p <= b; p++) {
                System.out.printf("%3d", m[p][i]);
            }
            System.out.println("  |");
        }
        System.out.println("---------------------------------------");


    }
}
