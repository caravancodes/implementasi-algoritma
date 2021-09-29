package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b=0,c,d;
        Scanner in = new Scanner (System.in);
        System.out.print("Masukan Bilangan : ");
        a = in.nextInt();
        for (c = a ; c>=1 ; c-=2) {
            b = (a - c+1)/2;
            if (c==1)continue;
            while(b>=1) {
                System.out.print(" ");
                b--;
            }
            for (d=c ; d>=1 ; d--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for( c=1 ; c<=a ; c+=2) {
            b = (a-c+1)/2;
            while(b>=1) {
                System.out.print(" ");
                b--;
            }
            for (d=c ; d>=1 ; d--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}










