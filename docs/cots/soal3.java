import java.util.*;

public class soal3 {
public static void main (String [] args) {
Scanner in = new Scanner (System.in);
int x, y, cerminX, cerminY, i;
boolean ulang = true;
while (ulang) {
System.out.print("Masukkan sebuah titik koordinat(koordinat X, koordinat Y) : ");
x = in.nextInt();
y = in.nextInt();
cerminX = (-1) * y;
cerminY = (-1) * x;
System.out.println("Pencerminan terhadap sumbu X : " +x+ " " +cerminX);
System.out.println("Pencerminan terhadap sumbu Y : " +cerminY+ " " +y);
System.out.println("Pencerminan terhadap SumbuKoordinat(0,0) : " +cerminX+ " " +cerminY);
System.out.println();
System.out.print("Apakah Anda Ingin Mengulanginya (y/t) : ");
String pilih = in.next();
System.out.println();
if (pilih.equalsIgnoreCase("T")) {
ulang = false;
}
}
}
}