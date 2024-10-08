package Minggu3;

import java.util.Scanner;

public class Hari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Masukan hari : ");
        String hari = scanner.nextLine();
        hari = hari.toLowerCase();

        if (hari.equals("sabtu") || hari.equals("minggu")) {
            System.out.print(hari + " adalah hari libur!");
        }
        else {
            System.out.print(hari + " adalah hari kerja!");
        } 

        scanner.close();

    }
}
