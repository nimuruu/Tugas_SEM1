package Latihan;

import java.util.ArrayList;
import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        
        ArrayList<String> matkul = new ArrayList<>();
        ArrayList<Integer> sks = new ArrayList<>();
        ArrayList<String> nilai = new ArrayList<>();
        ArrayList<Integer> konvert = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String inputlagi;
        int inputNilaiKONV = 0;
        int totalNilai = 0;
        int totalNilaiMataKuliahSKS = 0;
        double rata2 = 0.0;
        

        System.out.print("Masukan nama : ");
        String nama = sc.nextLine();
        System.out.print("Semester : ");
        int semester = sc.nextInt();
        sc.nextLine();

        do {
            System.out.print("Mata Kuliah : ");
            String inputMatkul = sc.nextLine();
            matkul.add(inputMatkul);
            
            System.out.print("SKS : ");
            int inputSKS = sc.nextInt();
            sks.add(inputSKS);
            sc.nextLine();

            System.out.print("Nilai (A-E) : ");
            String inputNilai = sc.nextLine();
            nilai.add(inputNilai);
            if (inputNilai.equals("A")) {
                inputNilaiKONV = 4;
                konvert.add(inputNilaiKONV);
            } else if (inputNilai.equals("B")) {
                inputNilaiKONV = 3;
                konvert.add(inputNilaiKONV);
            } else if (inputNilai.equals("C")) {
                inputNilaiKONV = 2;
                konvert.add(inputNilaiKONV);
            } else if (inputNilai.equals("D")) {
                inputNilaiKONV = 1;
                konvert.add(inputNilaiKONV);
            } else if (inputNilai.equals("E")) {
                inputNilaiKONV = 0;
                konvert.add(inputNilaiKONV);
            } else {
                System.out.println("Masukan Nilai yang benar! (A-E)");
            }
            
            //konvert.add(inputNilaiKONV);

            System.out.print("Masukkan data lagi? (y/n): ");
            inputlagi = sc.nextLine().toLowerCase();

        } while (inputlagi.equals("y"));

        System.out.println("-".repeat(50));
        System.out.println("Nama : " + nama);
        System.out.println("Semester : " + semester);
        System.out.println("-".repeat(50));
        
        for (int i = 0; i < matkul.size(); i++) {
            String mataKuliah = matkul.get(i);
            int matkulSks = sks.get(i);
            String matkulNilai = nilai.get(i);
            int matkulNilaiKONV = konvert.get(i);
            
            totalNilaiMataKuliahSKS += matkulSks;

            int totalNilaiMataKuliah = matkulNilaiKONV * matkulSks;
            totalNilai += totalNilaiMataKuliah;

            rata2 = totalNilai / totalNilaiMataKuliahSKS;

            System.out.println("Mata Kuliah \t: " + mataKuliah);
            System.out.println("SKS \t\t: " + matkulSks);
            System.out.println("Nilai \t\t: " + matkulNilai);
            System.out.println("Nilai (Convert) :"+ "(" + matkulNilai + ") = " + matkulNilaiKONV);
            System.out.println("-".repeat(50));
        }

        System.out.println("Total SKS : " + totalNilaiMataKuliahSKS);
        System.out.print("Rata - rata : " + String.format("%.2f", rata2));
        
        sc.close();
    }
}
