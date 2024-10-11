package Latihan;

import java.util.Scanner;
public class Latihan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilaiTest;
        String keterangan, interview;

        System.out.print("Masukan nilai test coding : ");
        nilaiTest = scanner.nextInt();

        if (nilaiTest >= 80){
            System.out.println("Dengan nilai : " + nilaiTest + ", anda LOLOS tahap Test!");
        } else if (nilaiTest >= 60){
            System.out.println("Dengan nilai : " + nilaiTest + ", akan dipertimbangkan! (LOLOS tahap TEST)");
        } else if (nilaiTest >= 0){
            System.out.println("Dengan nilai : " + nilaiTest + ", anda GAGAL tahap Test!");
        }

        System.out.print("Masukan keterangan Test (LULUS/GAGAL) : ");
        keterangan = scanner.next();

        if (keterangan.equals("LULUS")){
            System.out.print("Masukan nilai interview (A/B/C) : ");
            interview = scanner.next();
            if (interview.equals("A")){
                System.out.println("Dengan nilai : " + interview + ", anda LOLOS tahap interview!");

                if (nilaiTest >= 80 || (keterangan.equals("LULUS")) || (interview.equals("A"))){
                    System.out.println("Dengan nilai : " + nilaiTest + ", dan nilai interview : " + interview);
                    System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer!");
                }

            } else if (interview.equals("B")){
                System.out.println("Dengan nilai : " + interview + ", akan dipertimbangkan!");

                if (nilaiTest >= 60 || (keterangan.equals("LULUS")) || (interview.equals("B"))){
                    System.out.println("Dengan nilai : " + nilaiTest + ", dan nilai interview : " + interview);
                    System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer!");
                }

            } else if (interview.equals("C")){
                System.out.println("Dengan nilai : " + interview + ", anda GAGAL! (Bagian interview)");
                System.out.println("Dengan nilai : " + nilaiTest + ", dan nilai interview : " + interview);
                System.out.println("Maaf kamu belum berhasil menjadi calon Programmer!");
            }
        } else if (keterangan.equals("GAGAL")) {
            System.out.println("Anda GAGAl dibagian TEST, dan tidak bisa melanjutkan ke Interview.");
        }

        scanner.close();
    }
}
