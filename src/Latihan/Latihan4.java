package Latihan;

import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama : ");
        String nama = scanner.next();

        System.out.print("Masukan umur : ");
        int umur = scanner.nextInt();

        System.out.print("Masukan tempat tinggal : ");
        String TTinggal = scanner.next();

        System.out.print("Masukan jumlah tabungan : ");
        int uang = scanner.nextInt();

        if (umur > 40 && (TTinggal.equals("Nevada")) 
            || (TTinggal.equals("New York")) 
            || (TTinggal.equals("Havana")) 
            && (uang >= 10000000)) {
            System.out.println(nama + " kemungkinan adalah seorang anggota Mafia dengan Don.");

        } else if (umur >= 25 && umur <= 40 && (TTinggal.equals("New Jersey") 
            || (TTinggal.equals("Manhattan")) 
            || (TTinggal.equals("Nevada")) 
            && (uang >= 1000000) && (uang <= 2000000))) {
            System.out.println(nama + " kemungkinan adalah seorang anggota Mafia dengan Underboss.");

        } else if (umur >= 18 && umur <= 24 && (TTinggal.equals("California") 
            || (TTinggal.equals("Detroit")) 
            || (TTinggal.equals("Boston")) 
            && (uang < 1000000))) {
            System.out.println(nama + " kemungkinan adalah seorang anggota Mafia dengan Capo.");

        } else {
            System.out.println(nama + " tidak mencurigakan.");
        }
    
        scanner.close();

    }
}
