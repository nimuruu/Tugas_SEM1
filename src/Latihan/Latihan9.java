package Latihan;

import java.util.ArrayList;
import java.util.Scanner;

public class Latihan9 {
    public class mains {

        static ArrayList<String> nama = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            
            int pilihan;

            do {

                System.out.println("\n=== Menu Utama ===");
                System.out.println("1. Tambah nama");
                System.out.println("2. Hapus Nama");
                System.out.println("3. Cari Nama");
                System.out.println("4. Tampilkan Semua Nama");
                System.out.println("5. Keluar");
                System.out.print("Pilih Opsi : ");
                pilihan = sc.nextInt();
                sc.nextLine();

                switch (pilihan) {
                    case 1 -> tambahElement();
                    case 2 -> hapusElement();
                    case 3 -> cariElement();
                    case 4 -> tunjukanElements();
                    case 5 -> System.out.println("Keluar dari program.");
                    default -> System.out.println("Opsi tidak valid. Coba lagi.");
                }

            } while (pilihan != 5);

        }

        public static void tambahElement() {

            System.out.print("Masukan nama : ");
            String inputnama = sc.nextLine();
            nama.add(inputnama);

            System.out.println("Nama berhasil ditambah!");
            sc.nextLine();

        }

        public static void hapusElement() {

            System.out.println("Masukan nama yang ingin dihapus : ");
            String inputnama2 = sc.nextLine();

            if (nama.remove(inputnama2)) {
                System.out.println("Nama berhasil dihapus!");
                sc.nextLine();
            } else {
                System.out.println("Nama tidak ada!");
                sc.nextLine();
            }

        }

        public static void cariElement() {

            System.out.print("Masukkan nama yang ingin dicari: ");
            String intputnama3 = sc.nextLine();
            int index = nama.indexOf(intputnama3);

            if (index != -1) {
                System.out.println("Nama ditemukan di indeks ke-" + index);
                sc.nextLine();
            } else {
                System.out.println("Nama tidak ditemukan!");
                sc.nextLine();
            }

        }

        public static void tunjukanElements() {

            if (nama.isEmpty()) {
                System.out.println("Daftar nama kosong.");
                sc.nextLine();
            } else {
                System.out.println("Daftar nama:");
                for (String name : nama) {
                    System.out.println("- " + name);
                }
                sc.nextLine();
            }

        }
    }
}
