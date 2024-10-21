package Minggu5;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mahasiswa[] = new String[10];
        int nilai[] = new int[10];
        String inputlagi = "y";
        int i = 0;
        String keterangan;

        do {
            System.out.print("Masukan nama : ");
            mahasiswa[i] = scanner.next();
            System.out.print("Masukan nilai : ");
            nilai[i] = scanner.nextInt();

            if (nilai[i] >= 70){
                keterangan = "LULUS";
            } else {
                keterangan = "GAGAL";
            }
            scanner.nextLine();

            System.out.print("Tambah nama? (y/n) : ");
            inputlagi = scanner.next().toLowerCase();
            i++;
        } while (i < mahasiswa.length && inputlagi.equals("y"));

        System.out.println("Daftar Mahasiswa");
        System.out.println("NO\tNAMA\tNILAI\tKETERANGAN");

        

        scanner.close();
    }
}
