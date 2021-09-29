package loop;

/**
 * Created by 012D1N on 9/22/2016.
 */
public class Bilangan {
    public static void main(String[] args){
        int bil,sisa;
        String kalimat="";

        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        bil=input.nextInt();
        while (bil>0){
            sisa=bil%10;
            switch (sisa){
                case 0: kalimat="nol "+kalimat;break;
                case 1: kalimat="satu "+kalimat;break;
                case 2: kalimat="dua "+kalimat;break;
            }
            bil=bil/10;
        }
        System.out.println("Kalimatnya = "+kalimat);
    }
}
