import java.util.Scanner;

/**
 * Created by CHEVALIER-11 on 04-Dec-16.
 */
public class nomer4 {
    static void max(int a, int b){
        System.out.print("Bilangan yang lebih besar adalah ");
        if(a>b) System.out.println(a);
        else System.out.println(b);
    }
    static int tambah(int a, int b){return a+b;}
    static int kali(int a, int b){return a*b;}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama = ");
        int satu = in.nextInt();
        System.out.print("Masukkan bilangan kedua = ");
        int dua = in.nextInt();
        max(satu,dua);
        System.out.println("Hasil penjumlahan dua bilangan = " + tambah(satu,dua));
        System.out.println("Hasil perkalian dua bilangan = " + kali(satu,dua));
    }
}
