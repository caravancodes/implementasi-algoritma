public class gg {
public static void main (String[]args) {
int b, k, n,i,sp,j;

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
        sp=n/2;
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