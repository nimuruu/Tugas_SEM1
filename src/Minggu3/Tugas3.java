package Minggu3;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        double total, harga;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total bayar : ");
        double bayar = scanner.nextInt();

        //ternary 50000 ? 50000 : harga

        if (bayar >= 200000){
            total = bayar*12/100;
            if (total > 50000){
                total = 50000;
            }
            harga = bayar - total;

            System.out.print("Total anda adalah : " + harga);
        }
        else if (bayar >= 100000){
            total = bayar*10/100;
            if (total > 15000) {
                total = 15000;
            }
            harga = bayar - total;

            System.out.print("Total anda adalah : " + harga);
        }
        else if (bayar >= 50000){
            total = bayar*5/100;
            if (total > 4000) {
                total = 4000;
            }
            harga = bayar - total;

            System.out.print("Total anda adalah : " + harga);
        }
        else {
            System.out.println("Total bayar anda : " + bayar);
        }

        scanner.close();
    }
}
