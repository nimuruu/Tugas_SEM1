import java.util.Scanner;

public class Warunks2 {
    public static void main(String[] args) {
        Double apple, kg, uang, total, kembalian;
        Scanner isi = new Scanner(System.in);

        apple = 25000.0;

        System.out.println("Masukan jumlah apple yang ingin dibeli : ");
        kg = isi.nextDouble();

        System.out.println("Masukan jumlah uang : ");
        uang = isi.nextDouble();

        total = kg*apple;
        kembalian = uang-total;

        System.out.println("Masukan apple yang dibeli : " + kg + "kg");
        System.out.println("Total yang harus dibayar : " + total);
        System.out.println("Uang yang diberirkan : " + uang);
        System.out.println("Uang kembalian : " + kembalian);

    }
}
