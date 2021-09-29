import java.util.Scanner;

/**
 * Created by CHEVALIER-11 on 04-Dec-16.
 */
public class nomer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int x = in.nextInt();
        if (x%5 == 0 && x%2 ==1)System.out.print("Bilangan ganjil kelipatan 5");
        else System.out.print("Bilangan bukan ganjil kelipatan 5");
    }
}
