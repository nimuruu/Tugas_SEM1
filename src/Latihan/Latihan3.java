package Latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total;

        System.out.print("Masukan jumlah bayar : ");
        int bayar = scanner.nextInt();

        if (bayar >= 100000){
            total = bayar * 5 / 100;
            if (total > 5000){
                total = 5000;
            }
            total = bayar - total;
            System.out.println("Total bayaran anda adalah : " + total);
        } else if (bayar >= 50000){
            total = bayar * 3 / 100;
            if (total > 2000){
                total = 2000;
            }
            total = bayar - total;
            System.out.println("Total bayar anda adalah : " + total);
        } else {
            System.out.println("Total baar anda adalah : " + bayar);
        }

        scanner.close();
    }
}
