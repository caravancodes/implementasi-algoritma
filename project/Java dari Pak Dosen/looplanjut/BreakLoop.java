package looplanjut;

/**
 * Created by 012D1N on 9/20/2016.
 */
public class BreakLoop {
    public static void main (String args[]) {
        for (int i=1; i<=50; i++) {

            if (i==10)
                break;
            System.out.print(i+" ");
        }
        System.out.println("Perulangan selesai");


    }
}
