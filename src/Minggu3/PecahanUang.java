package Minggu3;

import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan jumlah uang : ");
        int masukanuang = scanner.nextInt();

        int seratusRibu, limapuluhRibu, duapuluhRibu, sepuluhRibu, limaRibu, duaRibu, seribu, limaRatus, seratus;

        if (masukanuang >= 100000){
            seratusRibu = masukanuang / 100000;
            masukanuang = masukanuang % 100000;
            System.out.println(seratusRibu + (" Lembar 100Ribu"));
        }

        if (masukanuang >= 50000){
            limapuluhRibu = masukanuang / 50000;
            masukanuang = masukanuang % 50000;
            System.out.println(limapuluhRibu + (" Lembar 50Ribu"));
        }

        if (masukanuang >= 20000){
            duapuluhRibu = masukanuang / 20000;
            masukanuang = masukanuang % 20000;
            System.out.println(duapuluhRibu + (" Lembar 20Ribu"));
        }

        if (masukanuang >= 10000){
            sepuluhRibu = masukanuang / 10000;
            masukanuang = masukanuang % 10000;
            System.out.println(sepuluhRibu + (" Lembar 10Ribu"));
        }
        
        if (masukanuang >= 5000){
            limaRibu = masukanuang / 5000;
            masukanuang = masukanuang % 5000;
            System.out.println(limaRibu + (" Lembar 5Ribu"));
        }

        if (masukanuang >= 2000){
            duaRibu = masukanuang / 2000;
            masukanuang = masukanuang % 2000;
            System.out.println(duaRibu + (" Lembar 2Ribu"));
        }

        if (masukanuang >= 1000){
            seribu = masukanuang / 1000;
            masukanuang = masukanuang % 1000;
            System.out.println(seribu + (" Lembar (1)SeRibu"));
        }

        if (masukanuang >= 500){
            limaRatus = masukanuang / 500;
            masukanuang = masukanuang % 500;
            System.out.println(limaRatus + (" Perak 500"));
        }

        if (masukanuang >= 100){
            seratus = masukanuang / 100;
            masukanuang = masukanuang % 100;
            System.out.println(seratus + (" Perak 100"));
        }

        scanner.close();
    }
}

