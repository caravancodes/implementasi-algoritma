package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("PROGRAM PERUBAH FORMAT NO.HP");
        System.out.println("=============================");
        System.out.println("Nama\t : Muhammad Faisal Amir");
        System.out.println("NIM\t\t : 6706160014");
        System.out.println("Kelas\t : D3IF-40-02");


        String hp;
        System.out.println("_______________________________");
        System.out.print("Masukkan Nomer Handphone : ");
        hp = in.nextLine();

        StringBuilder isi = new StringBuilder(hp);
        String hp2 = hp.substring(0,2);
        if ((hp.length() > 12) ||(hp.length() < 10) || hp2.equals("08")==false) {
            System.out.println("Anda Tidak Memasukkan Nomer Yang Valid");
        }else {
            isi.deleteCharAt(0);
            isi.insert(0, "+62 ");
            isi.insert(7, "-");
            isi.insert(12, "-");
            System.out.println(isi);
        }
    }
}
