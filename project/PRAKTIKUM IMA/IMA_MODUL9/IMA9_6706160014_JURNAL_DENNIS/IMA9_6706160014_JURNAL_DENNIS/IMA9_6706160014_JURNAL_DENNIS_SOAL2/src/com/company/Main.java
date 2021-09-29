package com.company;
import java.util.*;
public class Main {
    Scanner in = new Scanner(System.in);
    void Mati(int a) {
        System.out.print("Anak Ayam ada " + a + " Mati berapa : "); int m = in.nextInt();
        if (a > m) {
            a -= m;
            Mati(a);
        }
    }
    public static void main(String[] args) {
        Main p = new Main();
        System.out.print("ANAK AYAM ADA BERAPA : "); int jumlah = p.in.nextInt();
        p.Mati(jumlah);
        System.out.println("YAH ANAK AYAM MATI SEMUA :(");
    }
}
