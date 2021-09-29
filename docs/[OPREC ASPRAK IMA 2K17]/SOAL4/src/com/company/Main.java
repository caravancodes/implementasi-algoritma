package com.company;
import java.util.*;
public class Main {
    public static int[] hapus(int[] array) {
        int end = array.length;
        for (int a = 0 ; a < end ; a++) {
            for (int b = a + 1 ; b < end ; b++) {
                if (array[a] == array[b]) {
                    int x = b;
                    for (int c = b+1 ; c < end ; c++, x++) {
                        array[x] = array[c];
                    }
                    end--;
                    b--;
                }
            }
        }
        int[] number = new int[end];
        for(int a = 0; a < end; a++){
            number[a] = array[a];
        }
        return number;
    }
    void tampil(int [] array){
        for (int a = 0; a < array.length; a++){
            System.out.print(array[a]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //AmirIsBack.Inc
        Scanner in = new Scanner(System.in);
        Main call = new Main();
        System.out.println("-- Delete Duplicate --");
        System.out.println();
        System.out.print("Masukkan Besar Array : ");
        int besar = in.nextInt();
        int [] a = new int[besar];
        System.out.println();

        for (int i = 0 ; i < besar ; i++){
            System.out.print("Input Angka Ke - "+(i+1)+ " : ");
            int nilai = in.nextInt();
            a[i] = nilai;
        }
        System.out.println("==========================");
        System.out.println("\nSebelum Dihapus");
        call.tampil(a);
        System.out.println();
        System.out.println("Setelah Dihapus");
        call.tampil(hapus(a));
    }
}