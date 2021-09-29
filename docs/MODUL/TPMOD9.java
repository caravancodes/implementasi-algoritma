import java.util.Scanner;
/**
 * Created by Johan Sutrisno on 23/10/2016.
 */
public class TPMOD9 {
    static Scanner in = new Scanner(System.in);
    static int x, gaji;
    static String nama[], jab[], nik[];
    void Tambah_pegawai(int x){
        for (int i=0; i<x; i++){
            System.out.println();
            System.out.println("Data pegawai " + (i+1));
            System.out.print("Nama      : ");
            in.nextLine();
            nama[i] = in.nextLine();
            System.out.print("NIK       : ");
            nik[i] = in.next();
            System.out.print("Jabatan   : ");
            jab[i] = in.next();
        }
    }
    int hitung_gaji(String[]nama, String[]nik, String[]jab,  int x){
        for (int i=0; i<x; i++){
            if (jab[i].equals("manager")){
                gaji = 2000000;
            }else if (jab[i].equalsIgnoreCase("hrd")){
                gaji = 15000000;
            }else if (jab[i].equalsIgnoreCase("karyawan")){
                gaji = 1000000;
            }
            System.out.println("Nama        : " + nama[i]);
            System.out.println("NIK         : " + nik[i]);
            System.out.println("Jabatan     : " + jab[i]);
            System.out.println("Gaji        : " + gaji);
            System.out.println();

        }
        return gaji;
    }
    public static void main(String[] args) {
        TPMOD9 met = new TPMOD9();
        System.out.println("Program Data Pegawai");
        System.out.print("Masukkan data : ");
        x = in.nextInt();
        nama = new String[x];
        jab = new String[x];
        nik = new String[x];
        met.Tambah_pegawai(x);
        met.hitung_gaji(nama, nik, jab, x);
    }
}
