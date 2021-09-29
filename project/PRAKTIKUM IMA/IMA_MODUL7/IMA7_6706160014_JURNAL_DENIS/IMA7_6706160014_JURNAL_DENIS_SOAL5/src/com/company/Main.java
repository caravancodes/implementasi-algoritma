package com.company;
import java.io.PrintStream;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int b, k, g, i, p;
        int[][] m = new int[99][99];
        int[][] h = new int[99][99];
        int[][] j = new int[99][99];
        int[][] x = new int[99][99];
        System.out.print("Masukan Ukuran M : ");
        k = in.nextInt();
        System.out.println("---------------------------------------");
        b = k;
        for (i = 1; i <= b; i++) {
            for (p = 1; p <= k; p++) {
                System.out.print("Masukan Isi Matriks A ke - [" + i + "]" + " [" + p + "] : ");
                m[i][p] = in.nextInt();
            }
        }
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("Matriks A Adalah : ");
        for (i = 1; i <= b; i++) {
            System.out.print("| ");
            for (p = 1; p <= k; p++) {
                System.out.printf("%3d", m[i][p]);
            }
            System.out.println("  |");
        }
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("Transpose Matriks A Adalah : ");
        for (i = 1; i <= k; i++) {
            System.out.print("| ");
            for (p = 1; p <= b; p++) {
                System.out.printf("%3d", m[p][i]);
            }
            System.out.println("  |");
        }
        System.out.println("---------------------------------------");
        System.out.println();

        System.out.println("Matriks B = Matriks A + Transpose Matriks A : ");
        for (i = 1; i <= b; i++) {
            System.out.print("| ");
            for (p = 1; p <= k; p++) {
                j[i][p] =j[i][p] + m[i][p] + m[p][i];
                System.out.printf("%3d", j[i][p]);
            }
            System.out.println("  |");
        }

        for (i = 1; i <= b; i++) {
            for (p = 1; p <= k; p++) {
                x[i][p] = x[i][p] + m[i][p] * j[i][p];

            }
        }
            System.out.println("Matriks A x B Adalah : ");
            for (i = 1; i <= b; i++) {
                System.out.print("| ");
                for (p = 1; p <= k; p++) {
                    System.out.printf("%3d", x[i][p]);
                }
                System.out.println("  |");
            }


    }
}