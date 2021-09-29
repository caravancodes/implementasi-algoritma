package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a = new int[100];
        int b=0, in1=0, in2=0, in3=0, in4=0;
        int max=0;

        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan banyaknya nilai : ");
        int x = in.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print("Input angka ke - "+(i+1)+ " : ");
            a[i] = in.nextInt();
        }

        for (int i = 0; i < x-1; i++) {
            int sel =  Math.abs(a[i] - a[i + 1]);
            if (b < sel) {
                b = Math.abs(a[i] - a[i + 1]);
                in1 = a[i];
                in2 = a[i+1];
                in3 = (i);
                in4 = (i+1);
            }
        }

        System.out.println("Rentang Terpanjang dari dua buah angka adalah : "+b);
        System.out.println("di indext ke "+in3+" : "+in1+" dan di index ke "+in4+" : "+in2);
    }
}


    }
}

