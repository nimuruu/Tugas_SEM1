package Minggu3;

import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int angka = scanner.nextInt();

        if (angka % 2 == 0) {
            System.out.print(angka + " adalah bilangan Genap");
        }

        else {
            System.out.print(angka + " adalah bilangan Ganjil");
        }

        scanner.close();

    }
}
