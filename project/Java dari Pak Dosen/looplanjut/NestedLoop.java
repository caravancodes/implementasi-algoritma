package looplanjut;

/**
 * Created by 012D1N on 9/20/2016.
 */
public class NestedLoop {
    public static void main(String args[]) {
        int i, j;
        for(i = 0; i < 10; i++) {
            for(j = 0; j < i; j++)
                System.out.print("+");
            System.out.println();
        }
    }
}
