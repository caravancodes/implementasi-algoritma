import java.util.*;

public class Mo3switch {
public static void main (String [] args) {

Scanner in = new Scanner (System.in);
int bulan;

System.out.println("PROGRAM BULAN MASEHI");

System.out.print("Masukan Angka Yang Anda Inginkan = ");
bulan = in.nextInt();

switch (bulan) {
case 1 :
System.out.println("January");
break;
case 2 :
System.out.println("February");
break;
case 3 :
System.out.println("March");
break;
case 4 :
System.out.println("April");
break;
case 5 :
System.out.println("May");
break;
case 6 :
System.out.println("June");
break;
case 7 :
System.out.println("July");
break;
case 8 :
System.out.println("August");
break;
case 9 :
System.out.println("September");
break;
case 10 :
System.out.println("October");
break;
case 11 :
System.out.println("November");
break;
case 12 :
System.out.println("Desember");
break;

default :
System.out.println("Bukan Termasuk Tahun Masehi, Mungkin Tahun Ajaran Baru");

}
}
}