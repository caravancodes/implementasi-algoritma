package com.company;
class Sumbu{
    int x,y,cerminy,cerminx;
}
public class cots3 {
    public static void main(String Dio[]){
        Sumbu sumbu=new Sumbu();
        String pilih;
        boolean ulang=true;
        java.util.Scanner kutil=new java.util.Scanner(System.in);
        while(ulang) {
            System.out.print("Masukan sebuah Sumbu Koordinat(Koordinat x, koordinat y) : ");
            sumbu.x = kutil.nextInt();
            sumbu.y = kutil.nextInt();
            sumbu.cerminx = (-1) * sumbu.x;
            sumbu.cerminy = (-1) * sumbu.y;

            System.out.println("Pencerminan terhadap sumbu X : " + sumbu.x + ", " + sumbu.cerminy);
            System.out.println("Pencerminan terhadap sumbu Y : " +sumbu.cerminx+ ", " + sumbu.y);
            System.out.println("Pencerminan terhadap sumbu koordinat (0,0) : " + sumbu.cerminx + ", " +sumbu.cerminy);
            System.out.println("=================================================");
            System.out.print("Apakah mau memasukan titik lagi(Y/T) : ");
            pilih=kutil.next();
            if(pilih.equalsIgnoreCase("T")){
                ulang=false;
            }
            else {
                System.out.println("=================================================");
            }
        }
    }
}
