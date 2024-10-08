package Minggu2;

import java.util.Scanner;

public class VolumeKubus {

    public static void main(String[] args) {
        double sisi, volume;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan panjang sisi kubus : ");
        sisi = scanner.nextDouble();

        volume = sisi * sisi * sisi;

        System.out.print("Volume kubusnya adalah : " + volume);

        scanner.close();

    }
}