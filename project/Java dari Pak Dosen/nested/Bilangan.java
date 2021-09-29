package nested;

/**
 * Created by 012D1N on 9/21/2016.
 */
public class Bilangan {
    public static void main(String args[]) {
        int bil,sisa;
        String b1="",b2="",b3="",b4="",b5="";

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Masukkan bilangan : ");bil=in.nextInt();
        while (bil>0) {
            sisa=bil%10;
            switch (sisa) {
                case 2: b1="2 2 2 2 2   "+b1;
                        b2="        2   "+b2;
                        b3="2 2 2 2 2   "+b3;
                        b4="2           "+b4;
                        b5="2 2 2 2 2   "+b5;
                        break;
                case 3: b1="3 3 3 3 3   "+b1;
                        b2="        3   "+b2;
                        b3="3 3 3 3 3   "+b3;
                        b4="        3   "+b4;
                        b5="3 3 3 3 3   "+b5;
                        break;
            }
            bil=bil/10;
        }
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
