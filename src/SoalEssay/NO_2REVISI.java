package SoalEssay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MataKuliah {
    String namaMataKuliah;
    int sks;
    char nilai;
    int bobot;

   
    public MataKuliah(String namaMataKuliah, int sks, char nilai) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilai = nilai;
        this.bobot = konversiNilai(nilai); 
    }

   
    private int konversiNilai(char nilai) {
        switch (nilai) {
            case 'A': 
                return 4;
            case 'B': 
                return 3;
            case 'C': 
                return 2;
            case 'D': 
                return 1;
            case 'E': 
                return 0;
            default: 
                return 0;
        }
    }
}

public class NO_2REVISI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
         
        List<MataKuliah> mataKuliahList = new ArrayList<>();
        mataKuliahList.add(new MataKuliah("Algoritma", 3, 'A'));
        mataKuliahList.add(new MataKuliah("Struktur Data", 2, 'B'));
        mataKuliahList.add(new MataKuliah("Basis Data", 3, 'A'));
        mataKuliahList.add(new MataKuliah("Pemrograman", 2, 'C'));
        

        double nilaiNOMBER = 0.0;
        String inputlagi;

        
        ArrayList<String> matkul = new ArrayList<>();
        ArrayList<Integer> sks = new ArrayList<>();
        ArrayList<String> nilai = new ArrayList<>();
        

        System.out.print("Masukan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Semester : ");
        int semester = sc.nextInt();
        /* 
        do {
            System.out.print("Mata kuliah : ");
            String inputMatkul = sc.nextLine();
            System.out.print("SKS : ");
            int inputSKS = sc.nextInt();
            sc.nextLine();
            
            while (true) {
                System.out.print("Nilai (A-E): ");
                String inputNilai = sc.nextLine().toUpperCase();
                
            if (inputNilai.equals("E")) {
                nilaiNOMBER = 0.0;
                break;
            } else if (inputNilai.equals("D")) {
                nilaiNOMBER = 1.0;
                break;
            } else if (inputNilai.equals("C")) {
                nilaiNOMBER = 2.0;
                break;
            } else if (inputNilai.equals("B")) {
                nilaiNOMBER = 3.0;
                break;
            } else if (inputNilai.equals("A")) {
                nilaiNOMBER = 4.0;
                break;
            } else {
                System.out.print("Masukan Nilai yang benar! (A-E)");
            }
            
            matkul.add(inputMatkul);
            sks.add(inputSKS);
            nilai.add(inputNilai);
        }

            System.out.print("Masukkan data lagi? (y/n): ");
            inputlagi = sc.nextLine().toLowerCase();
            
        } while (inputlagi.equals("y"));
        */

        System.out.println("-".repeat(50));
        System.out.println("Nama : " + nama);
        System.out.println("Semester : " + semester);

        System.out.println("=".repeat(50));
        System.out.println("Mata Kuliah\tSKS\tNilai\tBobot");
        int totalSks = 0;
        int totalBobot = 0;

        for (MataKuliah mk : mataKuliahList) {
            System.out.println(mk.namaMataKuliah + "\t" + mk.sks + "\t" + mk.nilai + "\t" + mk.bobot);
            totalSks += mk.sks;
            totalBobot += mk.sks * mk.bobot;  
        }
        System.out.print("=".repeat(50));
        
        double nilaiRataRata = (double) totalBobot / totalSks;

       
        System.out.println("\nTotal SKS yang diambil: " + totalSks);
        System.out.println("Nilai rata-rata: " + nilaiRataRata);
        
        sc.close();
    }
}