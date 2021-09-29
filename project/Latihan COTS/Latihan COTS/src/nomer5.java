import java.util.Scanner;

/**
 * Created by CHEVALIER-11 on 04-Dec-16.
 */
public class nomer5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maks=0, min=0, banyak;
        float sum=0;
        System.out.print("Masukkan banyak bilangan = ");
        banyak = in.nextInt();
        int array[] = new int[banyak];
        for (int i = 0; i < banyak; i++) {
            System.out.print("Data ke " + (i+1) + " = ");
            array[i] = in.nextInt();
            if (i==0){
                maks = array[i];
                min= array[i];
            }
            else {
                if (maks<array[i]) maks = array[i];
                if (min>array[i]) min = array[i];
            }
            sum+=array[i];
        }
        System.out.println("Terbesarnya = " + maks);
        System.out.println("Terkecilnya = " + min);
        System.out.println("Selisih terbesar dan terkecilnya = " + (maks-min));
        System.out.println("Rata-rata bilangannya = " + (sum/banyak));
    }
}
