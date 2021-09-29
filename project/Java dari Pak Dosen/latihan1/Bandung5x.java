package latihan1;

/**
 * Created by 012D1N on 9/15/2016.
 */
public class Bandung5x {
    public static void main(String[] args) {
        int i;

        for (i=1;i<=5;i++) {
            System.out.print("BANDUNG ");
        }
        System.out.println();

        for (i=1;i<=5;i=i+2) {
            System.out.print(i+" ");
        }
        System.out.println();

        i=1;
        while (i<=5){
            System.out.print("BANDUNG ");
            i++;
        }
        System.out.println();
    }
}
