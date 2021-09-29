import java.util.*;

public class iwan{
    public static void main(String args[]){

System.out.println("Program M. IWAN SETIAWAN");

        int nilaiBilangan;
        Scanner in = new Scanner (System.in);
       
        System.out.print("MASUKKAN BILANGAN BULAT (MAX 2M) : ");
        nilaiBilangan = in.nextInt();
      
        if(nilaiBilangan >= 1000000000 && nilaiBilangan <= 2000000000){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {milyar, ratusanJuta, puluhanJuta, jutaan, ratusanRibu, puluhanRibu, ribuan, ratusan, puluhan, satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

        else if(nilaiBilangan >= 100000000){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {ratusanJuta, puluhanJuta, jutaan, ratusanRibu, puluhanRibu, ribuan, ratusan, puluhan, satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

        else if(nilaiBilangan >= 10000000){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {puluhanJuta, jutaan, ratusanRibu, puluhanRibu, ribuan, ratusan, puluhan, satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

        else if(nilaiBilangan >= 1000000){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {jutaan, ratusanRibu, puluhanRibu, ribuan, ratusan, puluhan, satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

        else if(nilaiBilangan >= 100000){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {ratusanRibu, puluhanRibu, ribuan, ratusan, puluhan, satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

        else if(nilaiBilangan >= 10000){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {puluhanRibu, ribuan, ratusan, puluhan, satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

        else if(nilaiBilangan >= 1000){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {ribuan, ratusan, puluhan, satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

        else if(nilaiBilangan >= 100){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {ratusan, puluhan, satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

        else if(nilaiBilangan >= 10){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {puluhan, satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

        else if(nilaiBilangan >= 1){
            int milyar, ratusanJuta, puluhanJuta, jutaan;
            int ratusanRibu, puluhanRibu, ribuan;
            int ratusan, puluhan, satuan;

            milyar = nilaiBilangan / 1000000000;
            ratusanJuta = nilaiBilangan / 100000000 % 10;
            puluhanJuta = nilaiBilangan / 10000000 % 10;
            jutaan = nilaiBilangan / 1000000 % 10;

            ratusanRibu = nilaiBilangan / 100000 % 10;
            puluhanRibu = nilaiBilangan / 10000 % 10;
            ribuan = nilaiBilangan / 1000 % 10;

            ratusan = nilaiBilangan / 100 % 10;
            puluhan = nilaiBilangan / 10 % 10;
            satuan = nilaiBilangan / 1 % 10;

            int nilai[] = {satuan};

            for(int i:nilai){
                if(i == 0){
                    System.out.print("nol ");
                }
                if(i == 1){
                    System.out.print("satu ");
                }
                if(i == 2){
                    System.out.print("dua ");
                }
                if(i == 3){
                    System.out.print("tiga ");
                }
                if(i == 4){
                    System.out.print("empat ");
                }
                if(i == 5){
                    System.out.print("lima ");
                }
                if(i == 6){
                    System.out.print("enam ");
                }
                if(i == 7){
                    System.out.print("tujuh ");
                }
                if(i == 8){
                    System.out.print("delapan ");
                }
                if(i == 9){
                    System.out.print("sembilan ");
                }
            }
        }

    }
}