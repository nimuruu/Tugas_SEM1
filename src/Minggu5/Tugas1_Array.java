package Minggu5;

import java.util.Scanner;

public class Tugas1_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] brandmobil = {"Nissan", "Honda", "Toyota"};
        String[] jenis = {"Silvia S15", "NSX", "Supra MK4"};

        System.out.print("Masukan Brand [0, 1, 2, 3] : ");
        int cars = scanner.nextInt();

        if (cars == 2) {
            System.out.println("Mobil anda : " + brandmobil[2] + ", Jenis nya : " + jenis[2]);
        } else if (cars == 1) {
            System.out.println("Mobil anda : " + brandmobil[1] + ", Jenis nya : " + jenis[1]);
        } else if (cars == 0) {
            System.out.println("Mobil anda : " + brandmobil[0] + ", Jenis nya : " + jenis[0]);
        } else {
            System.err.println("Tolong masukan nomor yang benar");
        }
        scanner.close();
    }
}
