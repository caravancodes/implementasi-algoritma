import java.util.Scanner;

/**
 * Created by CHEVALIER-11 on 04-Dec-16.
 */
public class nomer2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kata/kalimat = ");
        String text = in.nextLine();
        int x = 0;
        for (int i = 1; x < text.length(); i++) {
            for (int j = 0; j < i*2; j++) {
                if (x<text.length() && text.charAt(x)!=' ') System.out.print(text.charAt(x) + " ");
                else if (x>=text.length()) System.out.print("x ");
                else j--;
                x++;
            }
            System.out.println();
        }
    }
}
