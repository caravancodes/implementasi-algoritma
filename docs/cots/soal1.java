import java.util.*;
public class soal1 {
public static void main (String [] args) {
Scanner in = new Scanner (System.in);
System.out.print("Masukkan angka : ");
int isi = in.nextInt();
if ( (isi % 3 != 0) || (isi % 6 == 0) ) {
System.out.println("Tidak Memenuhi Syarat");
} else {
System.out.println("Memenuhi Syarat"); 
}
}
}