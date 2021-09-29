package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // write your code here
        String kata;
        int i, j;
        Main p = new Main();
        Scanner in = new Scanner(System.in);
        System.out.print("MASUKKAN KATA : ");
        kata = in.next();
        for (i=1 ; i<= kata.length() ; i++) {
            for (j=1 ; j <= kata.length() ; j++){
                if (i==1 || i==kata.length() || j==1 || j==kata.length()) {
                    System.out.print(kata+ "");
                }
            }
            System.out.println();
        }


    }
}
