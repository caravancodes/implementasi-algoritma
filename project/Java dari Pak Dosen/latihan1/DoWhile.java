package latihan1;

/**
 * Created by 012D1N on 9/20/2016.
 */
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        int pil;
        Scanner in=new Scanner(System.in);
        do {
            System.out.println("1. ...");
            System.out.println("2. ...");
            System.out.println("2. ...");
            System.out.println("2. ...");
            System.out.println("0. Keluar");

            pil=in.nextInt();
            switch(pil){
                case 1: ;
            }

        } while (pil!=0);
    }
}
