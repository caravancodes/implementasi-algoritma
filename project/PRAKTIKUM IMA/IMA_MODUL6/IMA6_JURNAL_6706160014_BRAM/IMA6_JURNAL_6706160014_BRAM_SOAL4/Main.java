package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner (System.in);
        String nama = null;
        int anak=0, n, b, g=0, t=0, j;
        long nik=0;
        int pegawai [] = new int[100];

        System.out.print("Masukan banyak pegawai\t : ");
        n = in.nextInt();
        pegawai = new int[n];

        for (b=1; b<=n ; b++) {
            System.out.print("Masukan nama pegawai\t : ");
            nama = in.next ();
            System.out.print("Masukan NIK \t\t\t : ");
            nik = in.nextLong();
            System.out.print("Masukan jumlah anak\t\t : ");
            anak = in.nextInt();
            if ((nik % 1000000000 == 1) || (nik % 1000000000 == 6) ) {
                g = 3000000;
            } else if ((nik % 1000000000 == 2) || (nik % 1000000000 == 7) ) {
                g = 4000000;
            } else if ((nik % 1000000000 == 3) || (nik % 1000000000 == 8) ) {
                g = 5000000;
            } else if ((nik % 1000000000 == 4) || (nik % 1000000000 == 9) ) {
                g = 6000000;
            } else
                g = 7000000;

            if (anak == 1) {
                t = g * 5/100 ;
            } else if (anak == 2) {
                t = g * 10/100 ;
            }else if (anak > 2) {
                t = g * 20/100 ;
            }

        }

            System.out.println("Nama\t\t : " + nama);
            System.out.println("NIK\t\t\t : " + nik);
            System.out.println("Jumlah Anak\t : " + anak);
            System.out.println("Gaji\t\t : " + g);
            System.out.println("Tunjangan\t : " + t);



    }
}
