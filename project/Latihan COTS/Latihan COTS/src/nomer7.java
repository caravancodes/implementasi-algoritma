import java.util.Scanner;

/**
 * Created by CHEVALIER-11 on 04-Dec-16.
 */
public class nomer7 {
    static class data{
        String nama;
        int umur;
    }
    static void cari(String nama, data[] array){
        int i=0;
        while (!(nama.equals(array[i].nama)) && i<array.length){
            i++;
        }
        if (nama.equals(array[i].nama)) System.out.println(array[i].nama + " berumur " + array[i].umur);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan banyak data = ");
        int maks=0,min=0,banyak = in.nextInt();
        data[] nama = new data[banyak];
        for (int i = 0; i < nama.length; i++) {
            nama[i] = new data();
            System.out.print("Masukkan nama user ke-" + (i+1) + " = ");
            nama[i].nama = in.next();
            System.out.print("Masukkan umur user ke-" + (i+1) + " = ");
            nama[i].umur = in.nextInt();
            if (nama[i].umur>nama[maks].umur) maks = i;
            if (nama[i].umur<nama[min].umur) min = i;
        }
        System.out.println("Yang paling muda adalah : " + nama[min].nama);
        System.out.println("Yang paling tua adalah : " + nama[maks].nama);
        System.out.print("Mau tau umur siapa? ");
        String cari = in.next();
        cari(cari,nama);
        System.out.print("Mau tau umur yang lain? (y/t) \nJawab : ");
        char ya = in.next().charAt(0);
        while (ya=='y'){
            System.out.print("Mau tau umur siapa? ");
            cari = in.next();
            cari(cari,nama);
            System.out.print("Mau cari lagi? (y/t) \nJawab : ");
            ya = in.next().charAt(0);
        }
    }
}
