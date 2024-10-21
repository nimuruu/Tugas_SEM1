package Minggu5;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mobil[] = new String[10];
        String inputlagi = "y";
        int i = 0;

        do {
            System.out.print("Masukan Brand mobil : ");
            mobil[i] = scanner.next();
            System.out.print("Tambah Brand mobil? (y/n) : ");
            inputlagi = scanner.next().toLowerCase();
            i++;
        } while (i < mobil.length && inputlagi.equals("y"));
        System.out.println("Daftar Brand mobil");

        for (int j = 0; j < mobil.length; j++) {
            if (mobil[j] == null) {
                break;
            }
            System.out.println((j + 1) + ". " + mobil[j]);
        }

        scanner.close();

        /*String mobil[] = {
            "Nissan", "Mazda", "Honda", "Toyota",
        };

        for (int i = 0; i < mobil.length; i++) {
            System.out.println(mobil[i]);
        }

        /*System.out.println(mobil[0]);
        System.out.println(mobil[1]);
        System.out.println(mobil[2]);
        System.out.println(mobil[3]);*/
    }
}
