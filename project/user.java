import java.util.*;
public class user {
public static void main (String [] args) {

Scanner in = new Scanner (System.in);
String name, pw, b1="", b2="", b3="", b4="", b5="";

int bil, sisa;

System.out.print("USERNAME  : ");
name= in.next();
System.out.print("PASSWORD  : ");
pw= in.next();

if (name.equals("amirisback") || pw.equals("amir11762")) {
System.out.println("Welcome Mr. Amir");

int i, j;
for (i=1; i<=50; i++) {
for (j=1; j<=i; j++) {
System.out.print (j+ " ");
}
System.out.println();
}
}


Scanner in = new Scanner (System.in);
System.out.print("Masukan bilangan : ");
bil = in.nextInt();

while (bil>0) {
sisa = bil%10;
switch (sisa) {

case 2 : b1 ="2 2 2 2 2 " +b1;
         b2 ="        2 " +b2;
         b3 ="2 2 2 2 2 " +b3;
         b4 ="2         " +b4;
         b5 ="2 2 2 2 2 " +b5;

}
case 3 : b1 ="3 3 3 3 3 " +b1;
         b2 ="        3 " +b2;
         b3 ="3 3 3 3 3 " +b3;
         b4 ="        3 " +b4;
         b5 ="3 3 3 3 3 " +b5;
break;

}
bil = bil/10;


System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(b4);
System.out.println(b5);
}
}





else 
System.out.println("WHO ARE YOU ??");


}
}