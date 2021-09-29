import java.util.*;
public class coba {
static int a, b;
void cermin(int x, int y) {
a =  (-1) * x;
b =  (-1) * y;
}

public static void main (String [] args) {
coba isi = new coba();
Scanner in = new Scanner (System.in);
System.out.print("Masukin x dan y : ");
int c = in.nextInt();
int d = in.nextInt();

isi.cermin(c,d);
System.out.print(a + b);
}
}