package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int p,l,v,h;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan panjang  : ");
        p = in.nextInt();
        System.out.print("Masukan tinggi   : ");
        l = in.nextInt();
        System.out.print("Persegi panjang\n");
        System.out.println();

        for(v = 1 ; v <= l ; v++){
            for(h = 1 ; h < p ; h++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.print("Persegi panjang (outline)\n");
        for(v = 1 ; v <= l ; v++){
            for(h = 1 ; h <= p ; h++){
                if((v==1)||(v==l)){
                    System.out.print("*");
                }
                else if((h==1)||(h==p)){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
