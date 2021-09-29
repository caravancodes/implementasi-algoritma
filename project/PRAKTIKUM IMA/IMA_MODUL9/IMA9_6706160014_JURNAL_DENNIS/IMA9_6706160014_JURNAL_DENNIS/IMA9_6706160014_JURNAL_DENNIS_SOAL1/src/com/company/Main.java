package com.company;
import java.util.*;
public class Main {
    Scanner in = new Scanner(System.in);
    double Luas(double a) {
        a = a*a;
        return a;
    }
    double Luas(double a,double b) {
        double c = a*b;
        return c;
    }
    double Luas(double a,double b,double c) {
        double max = a;
        double min = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (min > b) min = b;
        if (min > c) min = c;
        double t = Math.sqrt((max)-(min));
        double d = min * t;
        return d;
    }
    double Luas2(double a, double b){
        double c = a*b;
        return c;
    }
    double Luas2(double a, double b, double c, double d){
        double l = a*b;
        return l;
    }
    double Keliling(double a) {
        a = a*4;
        return a;
    }
    double Keliling(double a,double b) {
        double c = 2 * (a + b);
        return c;
    }

    double Keliling(double a,double b, double c) {
        double d = a + b + c;
        return d;
    }
    double Keliling2(double a,double b) {
        double c = 2 * (a + b);
        return c;
    }
    double Keliling2(double a,double b,double c,double d) {
        double k = 2 * (a + b);
        return k;
    }

    void Pilihan(double pi) {
        if (pi == 1) {
            System.out.print("MASUKKAN SISI : ");
            double x = in.nextDouble();
            System.out.println("Luas = " + Luas(x));
            System.out.println("Keliling = " + Keliling(x));
        }
        if (pi == 2) {
            System.out.print("MASUKKAN LEBAR : ");
            double x = in.nextDouble();
            System.out.print("MASUKKAN PANJANG : ");
            double y = in.nextDouble();
            System.out.println("Luas = " + Luas(x, y));
            System.out.println("Keliling = " + Keliling(x, y));
        }
        if (pi == 3) {
            System.out.print("MASUKKAN PANJANG SISI 1: ");
            double x = in.nextDouble();
            System.out.print("MASUKKAN PANJANG SISI 2 : ");
            double y = in.nextDouble();
            System.out.print("MASUKKAN PANJANG SISI 3 : ");
            double z = in.nextDouble();
            System.out.println("Luas = " + Luas(x, y, z));
            System.out.println("Keliling = " + Keliling(x, y, z));
        }
        if (pi == 4) {
            System.out.print("MASUKKAN TINGGI: ");
            double x = in.nextDouble();
            System.out.print("MASUKKAN SISI 1 : ");
            double y = in.nextDouble();
            System.out.print("MASUKKAN SISI 2 : ");
            double z = in.nextDouble();
            System.out.println("Luas = " + Luas2(x, y));
            System.out.println("Keliling = " + Keliling2(y, z));
        }
        if (pi == 5) {
            System.out.print("MASUKKAN SISI 1 : ");
            double w = in.nextDouble();
            System.out.print("MASUKKAN SISI 2 : ");
            double x = in.nextDouble();
            System.out.print("MASUKKAN Diagonal 1: ");
            double y = in.nextDouble();
            System.out.print("MASUKKAN Diagonal 2: ");
            double z = in.nextDouble();
            System.out.println("Luas = " + Luas2(w, x, y, z));
            System.out.println("Keliling = " + Keliling2(w, x, y, z));
        }
    }
    public static void main(String[] args) {
        Main p = new Main();
        int infinite = 0;
        while (infinite == 0) {
            System.out.println("===HITUNG LUAS DAN KELILING===");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Jajar Genjang");
            System.out.println("5. Layang - Layang");
            System.out.print("PILIH MENU PERHITUNGAN : ");
            double pilih = p.in.nextDouble();
            p.Pilihan(pilih);
            System.out.println();
        }
    }
}
