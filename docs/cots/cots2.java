import java.util.*;
public class cots2 {
public static void main (String [] args) {
Scanner in = new Scanner (System.in);
System.out.print("Masukkan kalimat : ");
String kalimat = in.nextLine();
int batas = kalimat.length();
int bil = 0;
int n = 1;
while (bil <= batas )  {
  for (int j = 1; j < n ; j++) {
     if (bil <= kalimat.length()) {
     System.out.print(kalimat.charAt(bil) + " ");
     } else if (kalimat.charAt(bil)==' ')
	bil++;    
       System.out.print(kalimat.charAt(bil) + " ");
      } else 
     System.out.print("x ");     
     bil++;
  }
  System.out.println();
  n++ ;
  }
}
}