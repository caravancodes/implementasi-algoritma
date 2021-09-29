import java.util.Scanner;

/**
 * Created by CHEVALIER-11 on 04-Dec-16.
 */
public class nomer8 {
    static list[] data;
    static class list{
        String nama;
        int umur;
    }
    static void urut(){
        for (int i = 0; i <data.length-1 ; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i].umur< data[j].umur){
                    list temp = new list();
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    static void show(){
        for (list xy: data) {
            System.out.println("Nama = "+ xy.nama);
            System.out.println("Umur = " + xy.umur);
        }
    }
    static void cari(String list){
        int i=0;
        while (!(list.equals(data[i].nama)) && i<data.length){
            i++;
        }
        if (list.equals(data[i].nama)) System.out.println(data[i].nama + " berumur " + data[i].umur);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan banyak data = ");
        int maks=0,min=0,banyak = in.nextInt();
        data = new list[banyak];
        for (int i = 0; i < data.length; i++) {
            data[i] = new list();
            System.out.print("Masukkan data user ke-" + (i+1) + " = ");
            data[i].nama = in.next();
            System.out.print("Masukkan umur user ke-" + (i+1) + " = ");
            data[i].umur = in.nextInt();
            if (data[i].umur>data[maks].umur) maks = i;
            if (data[i].umur<data[min].umur) min = i;
        }
        System.out.println("Yang paling muda adalah : " + data[min].nama);
        System.out.println("Yang paling tua adalah : " + data[maks].nama);
        urut();
        show();
        System.out.print("Mau tau umur siapa? ");
        String cari = in.next();
        cari(cari);
        System.out.print("Mau tau umur yang lain? (y/t) \nJawab : ");
        char ya = in.next().charAt(0);
        while (ya=='y'){
            System.out.print("Mau tau umur siapa? ");
            cari = in.next();
            cari(cari);
            System.out.print("Mau cari lagi? (y/t) \nJawab : ");
            ya = in.next().charAt(0);
        }
    }
}
