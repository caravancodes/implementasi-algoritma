package latihan1;

/**
 * Created by 012D1N on 9/3/2016.
 */
public class EmpatPersegiPanjang {

    public static void main(String[] args) {
        int p,l,luas;
        char jawab;

        java.util.Scanner in=new java.util.Scanner(System.in);
        do {
            System.out.print("Masukkan panjang : ");
            p = in.nextInt();
            System.out.print("Masukkan lebar : ");
            l = in.nextInt();
            luas = p * l;
            System.out.println("Luas = " + luas);
            System.out.print("Mau coba lagi (y/t)? ");
            jawab = in.next().charAt(0);
        } while (jawab!='t');
    }
}
