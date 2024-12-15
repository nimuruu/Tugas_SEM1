package Latihan;

public class Latihan12 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int dicari = 4;            
        int hasil = -1;           

        for (int i = 0; i < A.length; i++) {
            if (dicari == A[i]) {
                hasil = i; 
                break;    
            }
        }

        // hasil
        if (hasil != -1) {
            System.out.println("Target ditemukan di indeks: " + hasil);
        } else {
            System.out.println("Target tidak ditemukan.");
        }
    }
}
