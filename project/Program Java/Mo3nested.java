import java.util.*;

public class Mo3nested {
public static void main (String [] args) {

Scanner in = new Scanner (System.in);

int basic, phys, bio;

System.out.print("Basic = ");
basic = in.nextInt();
System.out.print("Physic = ");
phys = in.nextInt();
System.out.print("Biology = ");
bio = in.nextInt();

if (basic >= 70) {
System.out.println("Basics Passed");
if (phys >=70) {
System.out.println("Physic Passed");
if (bio >= 70) {
System.out.println("Bio Passed");

}
}
}

else {
System.out.println("You Failed in Basic");
}
}
}