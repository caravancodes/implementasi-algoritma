package looplanjut;

/**
 * Created by 012D1N on 9/20/2016.
 */
public class DemoContinue {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            System.out.print (i + " ");
            if (i % 2 == 0)
                continue;
            System.out.print(2*i + " ");
        }
    }
}
