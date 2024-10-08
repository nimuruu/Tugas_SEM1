package Minggu3;

import java.util.Scanner;
public class HargaJeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan jumlah jeruk yang dibeli : ");
        int jeruk = scanner.nextInt();

        int HargaJeruk1 = 3000;
        int HargaJeruk2 = 5000;
        int HargaJeruk5 = 10000;
        int totalharga = 0;

        if (jeruk >= 5){
            int paket5 = jeruk / 5;
            totalharga += paket5 * HargaJeruk5; 
            jeruk = jeruk % 5;
        }

        if (jeruk >= 2){
            int paket2 = jeruk / 2;
            totalharga += paket2 * HargaJeruk2;
            jeruk = jeruk % 2;  
        }

        if (jeruk >= 1){
            totalharga += jeruk * HargaJeruk1;
        }

        System.out.print("Harga dari " + jeruk + " Jeruk adalah : " + totalharga);

        scanner.close();
    }
}
