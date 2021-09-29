import java.util.Scanner;

/**
 * Created by CHEVALIER-11 on 04-Dec-16.
 */
public class nomer3 {
    static class waktu{
        int jam;
        int menit;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        waktu awal = new waktu();
        waktu akhir = new waktu();
        System.out.print("Masukkan jam awal = ");
        awal.jam = in.nextInt();
        System.out.print("Masukkan menit awal = ");
        awal.menit = in.nextInt();
        System.out.print("Masukkan jam akhir = ");
        akhir.jam = in.nextInt();
        System.out.print("Masukkan menit akhir = ");
        akhir.menit = in.nextInt();
        if (akhir.menit<awal.menit){
            akhir.jam-=1;
            akhir.menit+=60;
        }
        System.out.print("Selisih waktu = " + (akhir.jam-awal.jam) + " jam " + (akhir.menit-awal.menit) + " menit");
    }
}
