package latihan1;

/**
 * Created by 012D1N on 9/5/2016.
 */
import java.util.*;

public class PosNeg {
    public static void main(String[] args) {
        int bil;

        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        bil=in.nextInt();
        if (bil<0)
            System.out.println("Bilangan "+bil+" adalah Negatip");
        else
            System.out.println("Bilangan "+bil+" adalah Positip");
    }
}

