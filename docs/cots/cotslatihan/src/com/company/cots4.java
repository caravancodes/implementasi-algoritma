package com.company;

public class cots4 {
    int a,b,sem;
    void sortAscending(int array[]){
        for(a=0;a<array.length;a++){
            for(b=a+1;b<array.length;b++){
                if (array[a]>array[b]){
                    sem=array[a];
                    array[a]=array[b];
                    array[b]=sem;
                }
            }
        }
    }
    void sortDescending(int array[]){
        for(a=0;a<array.length;a++){
            for(b=a+1;b<array.length;b++){
                if (array[a]<array[b]){
                    sem=array[a];
                    array[a]=array[b];
                    array[b]=sem;
                }
            }
        }
    }
    public static void main(String Dio[]){
        cots4 cot=new cots4();
        java.util.Scanner kutil=new java.util.Scanner(System.in);
        int a;
        String pilih;
        boolean ulang=true;

        while(ulang) {
            System.out.print("Masukan banyak bilangan : ");
            int array[] = new int[kutil.nextInt()];
            for (a = 0; a < array.length; a++) {
                System.out.print("Masukan bilangan ke-" + (a + 1) + " : ");
                array[a] = kutil.nextInt();
            }
            System.out.print("Data awal\t\t: ");
            for (a = 0; a < array.length; a++) {
                System.out.print(array[a] + " ");
            }
            cot.sortAscending(array);
            System.out.print("\nUrut Ascending\t: ");
            for (a = 0; a < array.length; a++) {
                System.out.print(array[a] + " ");
            }
            cot.sortDescending(array);
            System.out.print("\nUrut Descending\t: ");
            for (a = 0; a < array.length; a++) {
                System.out.print(array[a] + " ");
            }
            System.out.println("\n=================================================");
            System.out.print("Apakah mau memasukan titik lagi(Y/T) : ");
            pilih = kutil.next();
            if (pilih.equalsIgnoreCase("T")) {
                ulang = false;
            } else {
                System.out.println("=================================================");
            }
        }
    }
}
