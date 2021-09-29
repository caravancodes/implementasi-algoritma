public class soal2 {
public static void main (String [] args) {
int sisa, pacar, putus;
putus = 1;
pacar = 15;


while (pacar > 0) {
sisa = pacar - putus;
if (sisa > 0 ) {
System.out.println("PACARKU ADA " +pacar+ " PUTUS " +putus+ " TINGGAL " +sisa);
} else {
System.out.println("PACARKU ADA " +pacar+ " PUTUS " +putus+ " JADI LEH UGHA CARI YANG BARU");
}

putus++;
pacar=sisa;
}



}
}