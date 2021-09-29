package looplanjut;

/**
 * Created by 012D1N on 9/20/2016.
 */
public class Break {
    public static void main (String args[ ]) {
        boolean t = true;
        pertama: {
            kedua:   {
                ketiga:  {
                    System.out.println("Sebelum break");
                    if (t)
                        break kedua; // break keluar dari blok kedua
                    System.out.println("Perintah ini tidak dijalankan");
                }
                System.out.println("Perintah ini tidak dijalankan ");
            }
            System.out.println("Perintah sesudah blok kedua.");
        }
    }
}
