package latihan1;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by 012D1N on 9/19/2016.
 */
public class ForEach {
    public static void main(String[] args) {
        int koleksi[] = {10, 8, 30, 13, 50};
        int i, jml, b,td;

        for (int bil : koleksi){
            System.out.print(bil+" ");
        }
        System.out.println();
        b=31;
        while (b<=59){
            System.out.print(b+" ");
            b += 2;     //b=b+2
        }
        System.out.println();
        for (i=10;i<=100;i++){
            if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
                System.out.print(i+" ");
        }
        System.out.println();
        // 1 + 2 + 3 + 4 + 5 = 15
        jml=0;
        for (b=1;b<5;b++) {
            System.out.print(b+" + ");
            jml = jml +b;
        }
        jml = jml +b;
        System.out.println(b+" = "+jml);
        // 1 - 2 + 3 - 4 + 5 - 6 + 7 = 4
        jml=0;
        for (b=1;b<7;b++) {
            if (b%2==1) {
                System.out.print(b + " - ");
                jml = jml + b;
            }
            else {
                System.out.print(b+" + ");
                jml = jml - b;
            }
        }
        if (b%2==1)
            jml = jml + b;
        else
            jml = jml - b;
        System.out.println(b+" = "+jml);

        jml=0;
        td=1;
        for (b=1;b<7;b++) {
            if (td<0)
                System.out.print(b+" + ");
            else
                System.out.print(b+" - ");
            jml = jml + b * td;
            td = -td;
        }
        if (td<0)
            jml = jml - b;
        else
            jml = jml + b;
        System.out.println(b+" = "+jml);

        /*for (i = 10; i < 50; i = i + 10) {
            System.out.print(i + ",");
        }
        System.out.println(i);
        //====
        i = 10;
        System.out.print(i);
        for (i = 20; i <= 50; i = i + 10) {
            System.out.print("," + i);
        }
        System.out.println();
        jml = 0;
        b = 10;
        jml = jml + b; //10
        b = b + 10;    //20
        jml = jml + b; //30
        b = b + 10;    //30
        jml = jml + b; //60
        b = b + 10;    //40
        jml = jml + b; //100
        b = b + 10;    //50
        jml = jml + b; //150
        b = b + 10;   //60
        System.out.println(jml);//150

        jml = 0;
        b = 10;;;;
        while (b <= 50) {
            jml = jml + b; //10  30  60  100  150
            b = b + 10;    //20  30  40  50   60
        }
        System.out.println(jml);//150
        jml = 0;
        b = 10;
        while (b < 50) {
            System.out.print(b+" + ");
            jml = jml + b; //10  30  60  100  150
            b = b + 10;    //20  30  40  50   60
        }
        jml = jml + b;
        System.out.println(b+" = "+jml);*/
    }
}
