package Latihan;

import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargajeruk;
        int totalharga;
        int kembalian;

        System.out.print("Masukan jumlah jeruk yang ingin dibeli (KG) : ");
        int jerukbeli = scanner.nextInt();

        hargajeruk = 24000;

        totalharga = hargajeruk * jerukbeli;
        
        System.out.println("Total harga : " + totalharga);
        
        System.out.print("Masukan jumlah uang yang ingin diberikan : ");
        int uang = scanner.nextInt();
        
        kembalian = uang - totalharga;

        System.out.println("Uang yang anda berikan adalah : " + uang);

        System.out.println("Kembalian anda adalah : " + kembalian);

        scanner.close();
    }
}
