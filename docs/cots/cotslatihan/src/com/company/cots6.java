package com.company;

class Mahasiswa{
    String nama,nim;
    int nilai,rata;
}
public class cots6 {
    void sort(Mahasiswa array[]){
        int a,b, nilaisem;
        String nimsem,namasem;
        for (a=0;a<array.length;a++){
            for (b=a+1;b<array.length;b++){
                if (array[a].nilai>array[b].nilai){
                    nilaisem=array[a].nilai;
                    nimsem=array[a].nim;
                    namasem=array[a].nama;

                    array[a].nilai=array[b].nilai;
                    array[a].nim=array[b].nim;
                    array[a].nama=array[b].nama;

                    array[b].nilai=nilaisem;
                    array[b].nim=nimsem;
                    array[b].nama=namasem;
                }
            }
        }
    }
    public static void main(String[] Dio){
        cots6 cot=new cots6();
        Mahasiswa mhs=new Mahasiswa();
        java.util.Scanner kutil=new java.util.Scanner(System.in);
        int a,b,jlh;
        boolean ulang;

        System.out.print("Jumlah Data yang ingin dimasukan : ");
        jlh=kutil.nextInt();
        Mahasiswa arraymhs[]=new Mahasiswa[jlh];

        for(a=0;a<jlh;a++){
            System.out.println("Masukan Data Mahasiswa Ke-"+(a+1)+" : ");
            System.out.print("NIM\t\t: ");
            arraymhs[a].nim=kutil.next();
            System.out.print("Nama\t: ");
            arraymhs[a].nama=kutil.nextLine();
            System.out.print("Nilai\t: ");
            arraymhs[a].nilai=kutil.nextInt();
            mhs.rata=mhs.rata+arraymhs[a].nilai;
        }
        cot.sort(arraymhs);
        mhs.rata=mhs.rata/jlh;

        System.out.println("Nilai rata-rata mahasiswa = "+mhs.rata);
        System.out.println("Mahasiswa nilai terbesar "+arraymhs[(arraymhs.length-1)].nim+", "+arraymhs[(arraymhs.length-1)].nama+", "+arraymhs[(arraymhs.length-1)].nilai);
        System.out.println("Mahasiswa nilai terkecil "+arraymhs[0].nim+", "+arraymhs[0].nama+", "+arraymhs[0].nilai);
    }
}