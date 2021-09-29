package com.company;

import java.util.*;
public class Main {
    static class kata {
        String kata1;
        String kata2;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        kata isi = new kata();
        System.out.println("=============================");
        System.out.println("PROGRAM PENGECEK 2 BUAH KATA");
        System.out.println("=============================");
        System.out.println("Nama\t : Muhammad Faisal Amir");
        System.out.println("NIM\t\t : 6706160014");
        System.out.println("Kelas\t : D3IF-40-02");

        System.out.println("______________________________");
        System.out.print("Masukan Kata Pertama\t : ");
        isi.kata1 = in.nextLine();
        System.out.print("Masukan Kata Kedua\t\t : ");
        isi.kata2 = in.nextLine();

        System.out.println("===================================");
        System.out.println("Perbandingan dari kedua kata adalah");
        System.out.println("===================================");
        if (isi.kata1.equals(isi.kata2)) {
            System.out.println("Kedua Kata Sama");
            System.out.println("-------------------");
        } else {
            System.out.println("Kedua Kata Berbeda");
            System.out.println("-------------------");
            System.out.println();
            System.out.println("- Kata Pertama mempunyai " + isi.kata1.length() + " huruf");
            System.out.println("- Kata Kedua mempunyai " + isi.kata2.length() + " huruf");
            System.out.println();

            if (isi.kata1.length() > isi.kata2.length()) {
                System.out.println("Kata pertama mempunyai huruf " + (isi.kata1.length() - isi.kata2.length()) + " lebih banyak dari kata kedua");
            } else if (isi.kata2.length() > isi.kata1.length()) {
                System.out.println("Kata kedua mempunyai huruf " + (isi.kata2.length() - isi.kata1.length()) + " lebih banyak dari kata pertama");
            } else {
                System.out.println("Kedua kata memiliki jumlah huruf yang sama");
            }
            System.out.println("_______________________________________________");

        }

    }
}