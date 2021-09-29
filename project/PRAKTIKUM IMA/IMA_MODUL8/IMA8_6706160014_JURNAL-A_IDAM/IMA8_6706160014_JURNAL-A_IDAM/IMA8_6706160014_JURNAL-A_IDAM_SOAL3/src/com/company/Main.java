package com.company;
import java.util.*;
public class Main {
    static class karyawan {
        String nama;
        String nip;
    }
    static class masuk {
        int jam, menit, detik;
    }
    static class pulang {
        int jam, menit, detik;
    }
    public static void main(String[] args) {
	// write your code here
        int tjam, tmenit, tdetik;
        Scanner in = new Scanner (System.in);
        karyawan isi = new karyawan();
        masuk msk = new masuk();
        pulang plg = new pulang();
        System.out.println("=============================");
        System.out.println("    PROGRAM DATA KARYAWAN");
        System.out.println("=============================");
        System.out.print("Nama Karyawan\t : ");
        isi.nama = in.nextLine();
        System.out.print("NIP\t\t\t\t : ");
        isi.nip = in.nextLine();
        System.out.println();
        System.out.println("Input Waktu Datang");
        System.out.print("Jam\t\t : ");
        msk.jam = in.nextInt();
        System.out.print("Menit\t : ");
        msk.menit = in.nextInt();
        System.out.print("Detik\t : ");
        msk.detik = in.nextInt();
        System.out.println();
        System.out.println("Input Waktu Pulang");
        System.out.print("Jam\t\t : ");
        plg.jam = in.nextInt();
        System.out.print("Menit\t : ");
        plg.menit = in.nextInt();
        System.out.print("Detik\t : ");
        plg.detik = in.nextInt();
        System.out.println();

        tjam = plg.jam - msk.jam;
        tmenit = plg.menit - msk.menit;
        tdetik = plg.detik - msk.detik;


        System.out.println("Pekerja dengan nama : " + isi.nama + ", Dengan NIP " +isi.nip);
        System.out.println("Memiliki lama kerja : " +tjam+ "jam, " +tmenit+ " menit, " +tdetik+ " detik");
    }
}
