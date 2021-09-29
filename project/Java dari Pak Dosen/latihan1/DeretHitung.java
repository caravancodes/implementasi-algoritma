package latihan1;

/**
 * Created by 012D1N on 9/15/2016.
 */
public class DeretHitung {
    public static void main(String[] args) {
        int bil,awal,akhir,selisih;

        java.util.Scanner in=new java.util.Scanner(System.in);
        System.out.print("Bilangan Awal  : ");
        awal=in.nextInt();
        System.out.print("Bilangan Akhir : ");
        akhir=in.nextInt();
        System.out.print("Selisih        : ");
        selisih=in.nextInt();
        for (bil=awal;bil<=akhir;bil=bil+selisih)
            System.out.print(bil+" ");
        System.out.println();
    }
}
