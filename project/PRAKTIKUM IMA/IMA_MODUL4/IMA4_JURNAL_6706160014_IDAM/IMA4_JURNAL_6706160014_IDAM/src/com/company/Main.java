
package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int x, y;

        for (y = 1; y < 2; ) {
            System.out.println("Maukah Kau menjadi Temanku?");
            System.out.println("1. Ya");
            System.out.println("1. Tidak");
            System.out.print("Jawab : ");
            x = in.nextInt();

            if (x == 1) {
                System.out.println("Terima kasih ^^");
                break;
            } else if (x == 2) {
                System.out.println("Yakin?");
                continue;
            } else {
                System.out.println("Jawab dong -,-");
                continue;
            }

        }
    }
}





