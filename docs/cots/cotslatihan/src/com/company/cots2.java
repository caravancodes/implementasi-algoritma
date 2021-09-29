package com.company;

public class cots2 {
    public static void main(String[] Dio){
        int pacar, sisa, kurang;
        pacar=15;
        kurang=1;
        while (pacar>=0){
            sisa=pacar-kurang;
            if (sisa>0){
                System.out.println("Pacarku ada "+pacar+" Putus "+kurang+" Tinggal "+sisa);
            }
            else if(sisa==0){
                System.out.println("Pacarku ada "+pacar+" Putus "+kurang+" Jadi jomblo... :(");
            }
            pacar=sisa;
            kurang++;
        }
    }
}
