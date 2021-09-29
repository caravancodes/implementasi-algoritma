package com.company;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner kutil=new java.util.Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka=kutil.nextInt();

        if(angka%3!=0||angka%6==0){
            System.out.println("Tidak memenuhi Syarat");
        }
        else{
            System.out.println("Memenuhi Syarat");
        }
    }
}
