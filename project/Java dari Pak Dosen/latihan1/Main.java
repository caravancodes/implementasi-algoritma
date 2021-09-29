package latihan1;

public class Main {

    public static void main(String[] args) {
        //kamus
        boolean b;
        char ch;
        int bil;
        String nama1,nama2;

        //main program
        b = (true || true) && false;
        System.out.println(b);
        ch = 10;
        System.out.println("Budiman"+ch+"susan");
        bil=5<<1;
        System.out.println(bil);
        bil=5>>1;
        System.out.println(bil);
        bil=5 & 6;
        System.out.println(bil);
        nama1="Budi";
        nama2="budi";
        b=nama1.equals(nama2);
        System.out.println(b);
    }
}
