package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c=0;
        String hasil="";
        Scanner in = new Scanner (System.in);

        System.out.print("Masukan Bilangan : ");
        a = in.nextInt();
        for (b=2; b <=a ; b++) {
            if (a % b == 0) {
                if (b != a) {
                    hasil = "bukan";
                } else {
                    hasil = "merupakan";
                }
                c=b;
                break;
            }

        }

        System.out.println("Bilangan terkecil yang habis membagi " +a+ " (selain 1) adalah " +c);
        System.out.print(a+ " " +hasil+ " " + "bilangan prima");

    }
}







