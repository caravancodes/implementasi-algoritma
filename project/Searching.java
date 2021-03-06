public class Searching {
    void selectionSort(int[]array){
        for (int a = 0; a < array.length - 1; a++) {
            int min = a;
            for (int b = a + 1; b < array.length; b++) {
                if (array[b] < array[min]) {
                    min = b;
                }
            }
            if (min!= a) {
                int sem = array[a];
                array[a] = array[min];
                array[min] = sem;
            }
        }
    }
    void binarySearch(int[] array, int cari) {
        int kiri = 0;
        int kanan = array.length - 1;
        int tengah = (kiri + kanan) / 2;
        int temu = 0;

        while (kiri <= kanan) {
            tengah = (kiri + kanan) / 2;
            if (cari == array[tengah]) {
                System.out.print("Nilai " + cari + " Ditemukan Pada Baris Ke-" + (tengah + 1));
                break;
            }
            if (cari < array[tengah]) {
                kanan = tengah - 1;
            } else {
                kiri = tengah + 1;
            }
        }
        if(kiri > kanan){System.out.print("Nilai " + cari + " Tidak Ditemukan.");}
    }
    public static void main(String[] Dio){
        Searching searching=new Searching();
        java.util.Random rand=new java.util.Random();
        java.util.Scanner kutil=new java.util.Scanner(System.in);
        int[] array= new int[20];

        for(int a=0;a<20;a++) {
            array[a] = rand.nextInt(100)+1;
        }
        System.out.println("Angka Dalam Array :");
        for(int a=0;a<array.length;a++){
            System.out.print(array[a]+" ");
        }
        searching.selectionSort(array);
        System.out.println("\n");
        System.out.println("Angka Dalam Array Setelah Di Sorting : ");
        for(int a=0;a<array.length;a++){
            System.out.print(array[a]+" ");
        }
        System.out.println("\n");
        System.out.print("Angka yang ingin di cari (1-100): ");
        int cari=kutil.nextInt();
        searching.binarySearch(array,cari);
    }
}



