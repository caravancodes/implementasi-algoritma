import java.util.*;
public class tp5 {
public static void main (String [] args) {

int i, j, k;
Scanner in = new Scanner (System.in);
System.out.println("Nama	: Muhammad Faisal Amir");
System.out.println("NIM		: 6706160014");
System.out.println("Kelas	: D3IF-40-02");
System.out.println();
System.out.print("Masukan Angka = ");
j = in.nextInt();

for (i=1 ; i<=j ; i++) {
for (k=1 ; k<=i ; k++) {
if ((k==1) || (k==i)) {
System.out.println("* ");
} else if ((i!=1) || (i!=j)) {
System.out.println("* ");
} else
System.out.println(" ");
}

}
System.out.println();
}
}