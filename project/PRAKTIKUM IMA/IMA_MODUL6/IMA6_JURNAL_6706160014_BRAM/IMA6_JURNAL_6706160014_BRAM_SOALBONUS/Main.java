import java.util.*;
public class Main {
public static void main (String [] args) {

Scanner in = new Scanner (System.in);
String kata;
int a=0;
int b=0;
int i;
System.out.print("Masukan kata\t : ");
kata = in.next();
System.out.println("Kata\t\t : " +kata);

for (i = kata.length() ; i>0 ; i--) {
String c = kata.substring(i-1, i);

a=a+1;
String d = kata.substring(a-1, a);
if(c.equals(d))
{
b+=1; 
}

}
if (b==kata.length()) {
System.out.println("Merupakan kata palindrome");
}
else 
System.out.println("Bukan kata palindrome");

}
}