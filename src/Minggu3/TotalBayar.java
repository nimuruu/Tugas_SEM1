package Minggu3;

import java.util.Scanner;

public class TotalBayar {
    public static void main(String[] args) {
        int total;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total belanja : ");
        int bayar = scanner.nextInt();

        if (bayar >= 50000) {
            total = bayar-10000;
            System.out.print("Bayaran anda adalah : " + bayar + ", dapat diskon 10rb = " + total);
        }
        else {
            total = bayar-2000; 
            System.out.print("Bayaran anda adalah : " + bayar + ", dapat diskon 2rb = " + total);
        }

        scanner.close();

    }
}
