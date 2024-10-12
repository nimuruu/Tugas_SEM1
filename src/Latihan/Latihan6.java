package Latihan;

import java.util.Scanner;
public class Latihan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) { // Loop untuk setiap baris
            for (int j = 1; j <= i; j++) { // Loop untuk mencetak bintang di setiap baris
                System.out.print("* "); // Mencetak bintang
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
        scanner.close();
    }
}
