package latihan1;

/**
 * Created by 012D1N on 9/5/2016.
 */
import java.util.*;

public class Parkir {
    public static void main(String[] args) {
        int jmasuk,mmasuk,jkeluar,mkeluar;
        int lamaJam,lamaMenit;

        Scanner in=new Scanner(System.in);
        System.out.print("Jam Masuk ? ");
        jmasuk=in.nextInt();
        mmasuk=in.nextInt();
        System.out.print("Jam Keluar ? ");
        jkeluar=in.nextInt();
        mkeluar=in.nextInt();
        lamaJam=jkeluar-jmasuk;
        lamaMenit=mkeluar-mmasuk;
        if (lamaMenit<0) {
            lamaMenit=lamaMenit+60;
            lamaJam=lamaJam-1;
        }
        System.out.println("Lama parkir = "+lamaJam+" jam "+
                                         lamaMenit+" menit");
    }
}
