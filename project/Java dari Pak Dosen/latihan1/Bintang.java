package nested;

/**
 * Created by 012D1N on 9/21/2016.
 */
public class Bintang {
    public static void main(String args[]) {
        int b, k, n;

        java.util.Scanner in=new java.util.Scanner(System.in);
        System.out.print("Masukkan panjang kotak : ");
        n=in.nextInt();
        /*for(b = 1; b <= n; b++) {
            for(k = 1; k <= n; k++){
                if (b<=k)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }*/
        int i,sp=n/2;
        for (b=1;b<=n;b=b+2){
            for (i=1;i<=sp;i++)
                System.out.print(" ");
            for (k=1;k<=b;k++)
              System.out.print("*");
            System.out.println();
            sp--;
        }
    }
}
