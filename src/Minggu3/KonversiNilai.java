package Minggu3;

import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        String ABC;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan nilai :");
        int nilai = scanner.nextInt();

        if (nilai >= 85){
            ABC = "A";
        }   else if (nilai >= 75){
            ABC = "B";
        }   else if (nilai >= 65){
            ABC = "C";
        }   else if (nilai >= 55){
            ABC = "D";
        }   else {
            ABC = "E";
        }

        System.out.print("Nilai mu adalah : " + ABC);

        scanner.close();
    }
}
