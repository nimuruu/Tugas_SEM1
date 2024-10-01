import java.util.Scanner;

public class Warunks {
    public static void main(String[] args) {
        double jeruk, kg, uang, total, kembalian;
        Scanner isian = new Scanner(System.in);

        jeruk = 24000;

        System.out.print("Masukan jumlah jeruk yang dibeli (KG) : ");
        kg = isian.nextDouble();
        System.out.print("Masukan uang : ");
        uang = isian.nextDouble();

        total = kg*jeruk;
        kembalian = uang - total;

        System.out.println("Masukan jeruk yang dibeli : " + kg + "kg");
        System.out.println("Total yang harus dibayar : " + total);
        System.out.println("Uang yang diberirkan : " + uang);
        System.out.println("Uang kembalian : " + kembalian);
    }
    
}