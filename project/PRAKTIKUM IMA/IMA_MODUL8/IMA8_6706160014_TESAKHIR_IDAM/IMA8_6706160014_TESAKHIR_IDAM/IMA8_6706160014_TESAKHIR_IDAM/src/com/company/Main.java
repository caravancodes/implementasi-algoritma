package com.company;

import java.util.Scanner;
public class Main {
static class Mahasiswa {
    String judul;
    String penulis;
    String penerbit;
    String harga;
    String tahun;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Masukkan Judul        : ");
        mhs.judul = sc.next();
        System.out.print("Masukkan Penulis      : ");
        mhs.penulis = sc.next();
        System.out.print("Masukkan Penerbit     : ");
        mhs.penerbit = sc.next();
        System.out.print("Masukkan Harga        : ");
        mhs.harga = sc.next();
        System.out.print("Masukkan Tahun Terbit : ");
        mhs.tahun = sc.next();
        System.out.println();
        System.out.println("=====================================");
        System.out.println("      Data Novel Yang Diinputkan");
        System.out.println("=====================================");
        System.out.println("Judul        : " +mhs.judul);
        System.out.println("Penulis      : " +mhs.penulis);
        System.out.println("Penerbit     : " +mhs.penerbit);
        System.out.println("Harga        : " +mhs.harga);
        System.out.println("Tahun Terbit : " +mhs.tahun);
    }
}
