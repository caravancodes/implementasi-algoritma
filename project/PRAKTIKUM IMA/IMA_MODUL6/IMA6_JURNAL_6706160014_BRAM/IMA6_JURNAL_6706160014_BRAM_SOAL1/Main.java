package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner (System.in);
        int n, b, max=-9999, min=9999;
        double rata = 0;
        int nilai [];

        System.out.print("Jumlah Input Angka  : ");
        n = in.nextInt();
        nilai = new int[n];
        System.out.println();

        for (b=0 ; b<n ; b++ ) {
            System.out.print("masukan data ke " + (b) + " :  ");
            nilai[b] = in.nextInt();
            if (max < nilai[b]) {
                max = nilai[b];
            } if (min > nilai[b]){
                min = nilai[b];
            }
             rata = rata + nilai[b];
        }
        System.out.println();
        for (b=0 ; b<n ; b++) {
            System.out.println("Angka di indeks ke  " + (b) + " adalah : " + nilai[b]);
        }

        rata= rata/n;
        System.out.println();
        System.out.println("Angka tertinggi adalah \t : " +max);
        System.out.println("Angka terendah adalah \t : " +min);
        System.out.println("Rata - ratanya adalah \t : " +rata);
    }
}
