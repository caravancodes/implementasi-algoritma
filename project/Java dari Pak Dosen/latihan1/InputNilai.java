package latihan1;

/**
 * Created by 012D1N on 9/20/2016.
 */
import java.util.Scanner;
public class InputNilai {

    public static void main(String[] args){

        int nilai;
        Scanner in=new Scanner(System.in);
        //bila salah input, tidak diberi pesan
        do {
            System.out.print("Masukkan Nilai : ");
            nilai=in.nextInt();
        } while (nilai>100 || nilai<0);
        //....perintah lanjutannya

        //bila salah input, diberi pesan
        System.out.print("Masukkan Nilai : ");
        nilai=in.nextInt();
        while (nilai>100 || nilai<0) {
            System.out.println("Salah input, Ulangi!");
            System.out.print("Masukkan Nilai : ");
            nilai=in.nextInt();
        }

    }
}
