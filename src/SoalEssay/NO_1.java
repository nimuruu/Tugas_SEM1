package SoalEssay;

import java.util.Scanner;

public class NO_1 {
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
        if (lemburjam > 5) {
            lemburlebih = lemburjam - 5;
            lemburjam = 5;
        }
        // ngitung total bonus lembur

        //hitung
        int UpahLembur = (int) Math.ceil(gaji / 150);
        float totalgaji = gaji + (lemburjam*UpahLembur) + (lemburlebih*1.5f*UpahLembur);
        //hitung

        //output
        System.out.println("====================================");
        System.out.println("Upah Lembur : " + UpahLembur + " (Jika lembur > 5 jam, maka kelebihannya X 1,5)");
        System.out.println("Total gaji anda : " + totalgaji);

        scanner.close();
    }
}
