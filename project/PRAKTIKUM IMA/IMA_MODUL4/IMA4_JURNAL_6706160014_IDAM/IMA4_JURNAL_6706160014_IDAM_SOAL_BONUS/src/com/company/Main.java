package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int i, g;
        System.out.println("#######   #######        ##  ########");
        System.out.println("##    ##       ##        ##  ##      ");
        System.out.println("##    ##  #######  ####  ##  ######  ");
        System.out.println("##   ##        ##        ##  ##      ");
        System.out.println("#####     #######        ##  ##      ");

        System.out.println();

        for (i = 3; i >= 0; i--) {

            System.out.println("WELCOME TO D3IF CHAT");
            String user, pw;
            System.out.println("==============================");

            System.out.print("USERNAME    : ");
            user = in.next();
            System.out.print("PASSWORD    : ");
            pw = in.next();
            System.out.println();

            if (user.equals("amir") && pw.equals("ganteng")) {
                System.out.println("Selamat Anda Berhasil Login!!");
                System.out.println();
                break;
            } else {
                if (i == 1) {
                    System.out.println("Username dan Password Salah");
                    System.out.println("Percobaan Sisa " + i + " lagi");
                    continue;
                }
                if (i == 2) {
                    System.out.println("Username dan Password Salah");
                    System.out.println("Percobaan Sisa " + i + " lagi");
                    System.out.println();
                    continue;
                }
                if (i == 3) {
                    System.out.println("Username dan Password Salah");
                    System.out.println("Percobaan Sisa " + i + " lagi");
                    System.out.println();
                    continue;
                }

            }
            System.out.println("Anda Sudah Salah Login Sebanyak 3 Kali");
            System.out.println("WHO ARE YOU ???");


        }
    }

}
