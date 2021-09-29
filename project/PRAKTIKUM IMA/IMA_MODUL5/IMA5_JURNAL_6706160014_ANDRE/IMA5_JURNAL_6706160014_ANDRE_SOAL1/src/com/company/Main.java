package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int a, b, c, d = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Batas Awal\t : ");
        a = in.nextInt();
        System.out.print("Masukan Batas Awal\t : ");
        b = in.nextInt();

        System.out.println("Bilangan Genap diantara bilangan " +a+ " sampai " +b+ " adalah");
        System.out.println();

        for (c = a; c <= b; c++) {
            if (c % 2 == 0) {
                System.out.print(c + ", ");
                d++;
            }
            else
                System.out.print("");
        }
        System.out.println();
        System.out.println();
        System.out.println("Jumlahnya ada " + d + " bilangan");
    }
}
