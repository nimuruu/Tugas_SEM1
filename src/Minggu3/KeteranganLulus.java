package Minggu3;

import java.util.Scanner;

public class KeteranganLulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai murid : ");
        int nilai = scanner.nextInt();

        if (nilai >= 75) {
            System.out.print("Nilai : " + nilai + ", Maka murid LULUS");
        }

        else {
            System.out.print("Nilai : " + nilai + ", Maka murid TIDAK LULUS");
        }

        scanner.close();


    }


}