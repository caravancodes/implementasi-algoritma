package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        String kata;
        String pil;
        Scanner in = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("   PROGRAM MANIPULASI KALIMAT");
        System.out.println("==================================");
        System.out.print("Masukkan Kalimat : ");
        kata = in.nextLine();
        System.out.println("----------------------------------");
        System.out.println(kata);
        System.out.println("----------------------------------");
        System.out.println("A. Menambah Kata");
        System.out.println("B. Mengurangi Kata");
        System.out.println("C. Mengganti Kata");
        System.out.println("D. Exit");
        System.out.println("Masukkan Pilihan (A/B/C/D) : ");
        pil = in.next();
        String a,b,c1,c2;
        switch(pil) {
            case "A":
                System.out.println("Masukan kata tambahan : ");
                a = in.next();
                System.out.println("----------------------------------");
                System.out.println(kata + a);
                System.out.println("----------------------------------");
                break;
            case "B":
                System.out.println("Masukkan Kata yang mau di hapus : ");
                b = in.nextLine();
                System.out.println("----------------------------------");
                System.out.println(kata);
                System.out.println("----------------------------------");
                break;
            case "C":
                System.out.println("Masukkan Kata yang ingin di ganti : ");
                c1 = in.nextLine();
                System.out.println("Masukkan Kata pengganti : ");
                c2 = in.nextLine();
                System.out.println("----------------------------------");
                System.out.println(kata);
                System.out.println("----------------------------------");
                break;
            case "D":
                System.out.println("THANKS");
        }

    }
}