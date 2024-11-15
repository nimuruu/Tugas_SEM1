package Latihan;

import java.util.Scanner;
import java.util.ArrayList;

public class NilaiTable {

    static ArrayList<String> matkul = new ArrayList<>();
    static ArrayList<Integer> sks = new ArrayList<>();
    static ArrayList<String> nilai = new ArrayList<>();
    static ArrayList<Double> bobot = new ArrayList<>();
    static ArrayList<Double> Hbobot = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // NAMA + SEMESTER
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Semester : ");
        int semester = sc.nextInt();
        // NAMA + SEMESTER

        String inputlagi = "y";
        double nilaiNOMBER = 0.0;
        double JumlahBobot = 0.0;
        double JumlahNilai = 0.0;
        double bobot = 0.0;
        int jumlahSKS = 0; 
        sc.nextLine();

        //LOOP PERTANYAAN
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
            
            jumlahSKS =jumlahSKS +inputSKS;
            JumlahNilai = inputSKS * nilaiNOMBER; 
            JumlahBobot = JumlahNilai / inputSKS;
            matkul.add(inputMatkul);
            sks.add(inputSKS);
            nilai.add(inputNilai);
            Hbobot.add(JumlahBobot);
        }

            System.out.print("Masukkan data lagi? (y/n): ");
            inputlagi = sc.nextLine().toLowerCase();
            
        } while (inputlagi.equals("y"));
        // LOOP PERTANYAAN

        //TABLE OUTPUT
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Semester\t: " + semester);
        System.out.println("=".repeat(80));
        System.out.printf("%-5s %15s %10s %-20s %-10s %10s%n", "No.","Mata Kuliah", "SKS", "Nilai", "Konversi Nilai", "Bobot");
        for (int i = 0; i < matkul.size(); i++) {
            String inputMatkul = matkul.get(i);
            int inputSKS = sks.get(i);
            String inputNilai  = nilai.get(i);
            double Konversi = nilaiNOMBER;
            double HasilBobot = Hbobot.get(i); 
            System.out.printf("%-5d %-22s %-8s %-15s %-15s %-5s%n", i+1, matkul.get(i), sks.get(i), nilai.get(i), nilaiNOMBER, Hbobot.get(i));
        }
        //TABLE OUTPUT

        System.out.println("=".repeat(80));
        System.out.println("Jumalah SKS : " + jumlahSKS);

        sc.close();
    }
}