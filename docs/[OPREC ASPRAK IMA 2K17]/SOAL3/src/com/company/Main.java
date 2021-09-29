package com.company;
import java.util.*;
public class Main {
    //AmirIsBack.INC
    public static void tampilkan(int a[]){
        for(int i = 0; i < a.length ; i++){
            System.out.printf("% 4d",a[i]);
        }
    }
    public static void urutkan(int a[]){
        for(int j = 0; j < a.length-1 ; j++){
            int min = j;
            for(int k = j+1 ; k < a.length; k++){
                if(a[k] < a[min]){
                    min = k;
                }
            }
            if(min != j){
                int temp = a[min];
                a[min] = a[j];
                a[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("++ SORTING DATA ++\n");
        System.out.print("Masukan Banyak Data : ");
        int n=in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Masukan Angka : ");
            a[i] = in.nextInt();
        }
        System.out.println("Sebelum Diurutkan ");
            tampilkan(a);
            urutkan(a);
            System.out.println();
            System.out.println("Sesudah Diurutkan ");
            tampilkan(a);
    }
}
