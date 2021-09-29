public class Suhu {
public static void main (String[] args) {

double fahrenheit, kelvin;

java.util.Scanner sc = new java.util.Scanner (System.in);

System.out.print ("Fahrenheit = ");
fahrenheit = sc.nextInt ();
kelvin = fahrenheit-32 * 5/9 + 273;
System.out.print("Kelvin = " +kelvin);

}
}
