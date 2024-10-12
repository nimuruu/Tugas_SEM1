package Latihan;

public class Latihan7 {
    public static void main(String[] args) {

        int num = 1; // Inisialisasi angka awal

        // Loop untuk mencetak 4 baris
        for (int i = 1; i <= 4; i++) {
            // Loop untuk mencetak angka dalam setiap baris
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(num + " "); // Mencetak angka
                num++; // Meningkatkan angka untuk iterasi berikutnya
            }
            System.out.println(); // Pindah ke baris berikutnya
            num += (i * 2); // Menambah angka untuk baris berikutnya sesuai pola
        }

    }
}
