import java.util.*;
public class tp7amir {
public static void main (String [] args) {
Scanner in = new Scanner (System.in);
int m, g, i, j;
int [][] matriks = new int[10][10];
System.out.print("Masukan Ukuran Matriks M : ");
m = in.nextInt();
for (g=0 ; g<=40; g++) {
System.out.print("-");
}
System.out.println();
for (i=1 ; i <= m ; i++) {
for (j=1 ; j <= m ; j++) {
System.out.print("Masukan Isi Matriks ke - ["+i+"]["+j+"] : ");
matriks [i][j] = in.nextInt();
}
}
for (g=0 ; g<=40; g++) {
System.out.print("-");
}
System.out.println();
System.out.println("Bentuk Matriknya Adalah : ");
for (i=1 ; i <= m ; i++) {
for (j=1 ; j <= m ; j++) {
if (j==1) {
System.out.print("| ");
}
System.out.printf("%5d",matriks[i][j],"%5d");
if (j==m) {
System.out.print(" |");
}
}
System.out.println();
System.out.println();
}
}
}
