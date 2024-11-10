package LatihanUTS;

import java.util.Scanner;

public class GajiLembur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Masukan Gaji : ");
        int gaji = scanner.nextInt();

        System.out.print("Masukan total lembur (JAM) : ");
        int lemburjam = scanner.nextInt();
        // input

        int lemburlebih = 0;

        // ngitung total bonus lembur
        if (lemburjam > 4) {
            lemburlebih = lemburjam - 4;
            lemburjam = 4;
        }
        // ngitung total bonus lembur

        //hitung
        int UpahLembur = (int) Math.ceil(gaji / 173);
        int totalgaji = gaji + (lemburjam*UpahLembur) + (lemburlebih*2*UpahLembur);
        //hitung

        //output
        System.out.println("====================================");
        System.out.println("Upah Lembur : " + UpahLembur + " (Jika lembur > 4 jam, maka kelebihannya X 2)");
        System.out.println("Total gaji anda : " + totalgaji);

        scanner.close();
    }
}
