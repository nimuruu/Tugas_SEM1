package Latihan;

import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int nilai = scanner.nextInt();

        if (nilai >= 90){
            System.out.println("Nilai " + nilai + (" adalah : A"));
        } else if (nilai >=80){
            System.out.println("Nilai " + nilai + (" adalah : B"));
        } else if (nilai >= 70){
            System.out.println("Nilai " + nilai + (" adalah : C"));
        } else if (nilai >= 60){
            System.out.println("Nilai " + nilai + (" adalah : D"));
        } else if (nilai >= 0){
            System.out.println("Nilai " + nilai + (" adalah : E"));
        }

        scanner.close();
    }
}
