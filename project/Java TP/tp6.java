public class tp6 {
public static void main(String args[]){
int jml;
int bilangan[]={4,7,5,9,12,2,10};

System.out.println("TP 6");
for (int i = 0;i< bilangan.length;i++){
System.out.print(bilangan[i]+" ");
}
System.out.println();
System.out.println("Bilangan pada indeks ke 4    :"+bilangan[4] );
System.out.println("Bilangan pada indeks ke 0    :"+bilangan[0] );
System.out.println("Bilangan pada indeks ke 6    :"+bilangan[6] );
jml = bilangan[2]+bilangan[6];
System.out.println("Jumlah Bilangan indeks 2 dan 6 adalah :"+jml);
bilangan[6]=100;
System.out.println("Bilangan pada indes ke 6 setelah di update adalah :"+bilangan[6]);
}
}
