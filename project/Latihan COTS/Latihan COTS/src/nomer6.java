import java.util.Scanner;

/**
 * Created by CHEVALIER-11 on 04-Dec-16.
 */
public class nomer6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Masukkan bilangan pada indeks (%d,%d) = ", (i+1),(j+1));
                array[i][j] = in.nextInt();
            }
        }
        System.out.println("Matriksnya : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] +  " ");
            }
            System.out.println();
        }
        System.out.println("Matriks setelah dijumlahkan");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j!=2) System.out.print((array[i][j]+array[i][j+1]) + " ");
                else System.out.print((array[i][j]+array[i][0]));
            }
            System.out.println();
        }
    }
}
