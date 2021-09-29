package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner (System.in);
        int a, random, h=0;

        System.out.print("Masukan Bilangan (1-10) \t : ");
        a = in.nextInt();

        System.out.println("Bilangan \t\t Random Number");
        System.out.println("-----------------------------");


        do{
            random = 1 + (int)(Math.random()*((10-1)+1));
            System.out.println("\t"+a+"\t\t : \t\t"+random);
            h++;
        }while(a != random);
        System.out.println("\t\t\t Sama!!");
        System.out.println("Bilangan bisa sama besar dengan " + h + " kali perulangan");
    }
}





















