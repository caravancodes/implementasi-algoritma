package com.company;
import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    String word;
    int a = 0, b = 0, i;
    void palindrom() {
        System.out.print("INPUT\t : ");
        word = in.next();
        for (i = word.length(); i > 0; i--) {
            String c = word.substring(i - 1, i);
            a = a + 1;
            String d = word.substring(a - 1, a);
            if (c.equals(d)) {
                b += 1;
            }
        }
        if (b == word.length()) {
            System.out.println("OUTPUT\t : TRUE");
        } else {
            System.out.println("OUTPUT\t : FALSE");
        }
    }

    public static void main(String[] args) {
        // AmirIsBack.INC
        Main call = new Main();
        Boolean loop = true;
        System.out.println("PALINDROM CHECKER");
        call.palindrom();
    }
}
