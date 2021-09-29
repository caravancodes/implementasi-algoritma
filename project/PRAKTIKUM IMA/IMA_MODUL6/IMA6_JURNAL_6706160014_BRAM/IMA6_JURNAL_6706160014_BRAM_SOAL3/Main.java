package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n, b, i, j;
        int nilai[] =  new int[100];

        System.out.print("Masukan Jumlah Data  : ");
        n = in.nextInt();
            nilai = new int[n];
            for (b = 0; b < n; b++) {
                System.out.print("Data " + (b) + " :  ");
                nilai[b] = in.nextInt();
            }
        System.out.println("Input Data Selesai");
        System.out.println();
        System.out.println("Data :");
            for (i = 0; i<=n; i++) {
                for (j = 0; j<=i; j++) {
                    System.out.print(nilai[i] + " ");
                }
                System.out.println();
            }


        }
    }
