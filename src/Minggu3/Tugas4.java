package Minggu3;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diskon, kembalian, telur, harga, jumlah;

        System.out.print("Masukan jumlah beli telur (KG) : ");
        telur = scanner.nextInt();

        harga = 28000;
        
        jumlah = harga * telur;

        if (telur >= 3) {
            diskon = jumlah * 0.1;      
        }else {
            diskon = 0.0;
        }

        kembalian = jumlah - diskon;

        System.out.println("Total telur (KG) : " + telur);
        System.out.println("Total harga : " + jumlah);
        System.out.println("Diskon : " + diskon);
        System.out.println("Uang yang harus dibayar : " + jumlah);
        System.out.println("Uang kembalian : " + kembalian);

        scanner.close();
    }
}
