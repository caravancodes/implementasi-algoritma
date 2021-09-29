package com.company;
import java.util.*;
    public class Main {
     //AmirIsBack.INC
        public static void urutkan(Candidate a[]){
            for(int i=0; i<a.length-1; i++ ){
                int max=i;
                for(int k=i+1; k<a.length; k++){
                    if(a[k].nilai>a[max].nilai){
                        max=k;
                    }
                }
                if(max!=i){
                    Candidate temp= a[max];
                    a[max]=a[i];
                    a[i]=temp;
                }
            }
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("-- CHAMPIONSHIP --");
            System.out.print("Masukan Jumlah Peserta : ");
            int n = in.nextInt();
            Candidate a[] = new Candidate[n];
            for(int i=0; i<n; i++){
                System.out.print("Masukan Nama  : ");
                String nama= in.next();
                System.out.print("Masukan Nilai : ");
                int nilai= in.nextInt();
                System.out.print("Masukan Nomor : ");
                int nomor=in.nextInt();
                System.out.println();
                Candidate baru = new Candidate(nomor,nilai,nama);
                a[i]=baru;
            }
            urutkan(a);
            int awal = 0,hint = a[awal].nilai;
            System.out.println("**JUARA PERTAMA**");
            System.out.println("=================");
            while(awal < n ){
                if(a[awal].nilai==hint){
                    System.out.println("Nama\t: " +a[awal].nama);
                    System.out.println("Nilai\t: " +a[awal].nilai);
                    System.out.println();
                    awal++;
                }
                else{
                    break;
                }
            }
            if(awal < n) {
                hint = a[awal].nilai;
                System.out.println("==============");
                System.out.println("Juara Kedua");
                System.out.println("==============");
                while (awal < n) {
                    if (a[awal].nilai == hint) {
                        System.out.println("Nama\t: " + a[awal].nama);
                        System.out.println("Nilai\t: " + a[awal].nilai);
                        System.out.println();
                        awal++;
                    } else {
                        break;
                    }
                }
            }
            if(awal < n) {
                hint = a[awal].nilai;
                System.out.println("==============");
                System.out.println("Juara Ketiga");
                System.out.println("==============");
                while (awal < n) {
                    if (a[awal].nilai == hint) {
                        System.out.println("Nama\t: " + a[awal].nama);
                        System.out.println("Nilai\t: " + a[awal].nilai);
                        System.out.println();
                        awal++;
                    } else {
                        break;
                    }
                }
                System.out.println("==============");
            }
        }
}