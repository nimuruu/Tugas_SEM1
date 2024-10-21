package Minggu5;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mahasiswa[] = new String[100];
        int nilai[] = new int[100];
        String keterangan[] = new String[100];
        String inputlagi = "y";
        int i = 0;


        do {
            System.out.print("Masukan nama : ");
            mahasiswa[i] = scanner.next();
            System.out.print("Masukan nilai : ");
            nilai[i] = scanner.nextInt();

            if (nilai[i] >= 70){
                keterangan[i] = "LULUS";
            } else {
                keterangan[i] = "GAGAL";
            }
            scanner.nextLine();

            System.out.print("Tambah nama? (y/n) : ");
            inputlagi = scanner.next().toLowerCase();
            i++;
        } while (i < mahasiswa.length && inputlagi.equals("y"));

        System.out.println("Daftar Mahasiswa");
        System.out.println("NO\tNAMA\tNILAI\tKETERANGAN");

        for (int j = 0; j < mahasiswa.length; j++) {
            if (mahasiswa[j] == null) {
                break;
            }
            System.out.println((j+1) + "\t" + mahasiswa[j] + "\t" + nilai[j] + "\t" + keterangan[j]);
        }



        scanner.close();
    }
}
