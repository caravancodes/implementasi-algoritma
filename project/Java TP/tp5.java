import java.util.*;
public class tp5 {
public static void main (String [] args) {

int i, j, k;
Scanner in = new Scanner (System.in);
System.out.println("Nama\t\t: Muhammad Faisal Amir");
System.out.println("NIM\t\t: 6706160014");
System.out.println("Kelas\t\t: D3IF-40-02");
System.out.println();
System.out.print("Masukan Angka = ");
k = in.nextInt();

for (i=1; i<=k; i++) {
for (j=1; j<=i; j++) {
System.out.print ("* ");
}
System.out.println();
}



}
}