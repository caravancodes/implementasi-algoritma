package loop;

/**
 * Created by 012D1N on 9/24/2016.
 */
public class Input {
    public static void main(String args[]) {
        int bil,ctr;

        java.util.Scanner in=new java.util.Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        bil=in.nextInt();
        ctr=1;
        while (bil%2==0 && ctr<3) {
            System.out.println("bilangan anda salah");
            System.out.print("Masukkan bilangan : ");
            bil=in.nextInt();
            ctr++;
        }
        System.out.println("Ganjil");
    }
}
