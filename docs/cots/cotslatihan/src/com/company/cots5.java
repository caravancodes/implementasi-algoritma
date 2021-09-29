package com.company;

public class cots5 {
    public static void main(String Dio[]){
        java.util.Scanner kutil=new java.util.Scanner(System.in);
        int a, b, bm1, km1bm2, km2, cari;

        System.out.print("Jumlah Baris matrik 1 = ");
        bm1=kutil.nextInt();
        System.out.print("Jumlah Kolom matrik 1/Baris matrik 2 = ");
        km1bm2=kutil.nextInt();
        System.out.print("Jumlah Kolom matrik 2 = ");
        km2=kutil.nextInt();
        System.out.print("Masukan nilai yang dicari = ");
        cari=kutil.nextInt();
        int matrik1[][]=new int[bm1][km1bm2];
        int matrik2[][]=new int[km1bm2][km2];

        for(a=0;a<bm1;a++){
            System.out.print("Masukan Matrik1 baris ke-"+(a+1)+" : ");
            for(b=0;b<km1bm2;b++){
                matrik1[a][b]=kutil.nextInt();
            }
        }
        for(a=0;a<km1bm2;a++){
            System.out.print("Masukan Matrik2 baris ke-"+(a+1)+" : ");
            for(b=0;b<km2;b++){
                matrik2[a][b]=kutil.nextInt();
            }
        }

        System.out.println("Matrik1 : ");
        for(a=0;a<bm1;a++){
            for(b=0;b<km1bm2;b++){
                System.out.printf("%4d", matrik1[a][b]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Matrik2 : ");
        for(a=0;a<km1bm2;a++){
            for(b=0;b<km2;b++){
                System.out.printf("%4d", matrik2[a][b]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Hasil Kali Matrik 1 dengan Matrik2 : ");

    }
}
