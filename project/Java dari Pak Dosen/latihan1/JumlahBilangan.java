package latihan1;

/**
 * Created by 012D1N on 9/15/2016.
 */
public class JumlahBilangan {
    public static void main(String[] args) {
        int jumlah,a,i;

        java.util.Scanner in=new java.util.Scanner(System.in);
        /*
        jumlah=0;
        System.out.print("Masukkan bilangan ke-1 : "); a=in.nextInt();
        jumlah=jumlah+a;
        System.out.print("Masukkan bilangan ke-2 : "); a=in.nextInt();
        jumlah=jumlah+a;
        System.out.print("Masukkan bilangan ke-3 : "); a=in.nextInt();
        jumlah=jumlah+a;
        System.out.print("Masukkan bilangan ke-4 : "); a=in.nextInt();
        jumlah=jumlah+a;
        System.out.print("Masukkan bilangan ke-5 : "); a=in.nextInt();
        jumlah=jumlah+a;
        System.out.println("Jumlahnya = "+jumlah);
        */
        jumlah=0;
        for (i=1;i<=5;i++) {
            System.out.print("Masukkan bilangan ke-"+i+" : ");
            a = in.nextInt();
            jumlah = jumlah + a;
        }
        System.out.println("Jumlahnya = "+jumlah);

    }
}