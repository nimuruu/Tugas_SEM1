import java.util.Scanner;

public class Telor {
    public static void main(String[] args) {
        double telor, kg, uang, total, kembalian;
        Scanner scanner = new Scanner(System.in);

        telor = 28000;

        System.out.print("Masukan jumlah telor yang dieli (KG) : ");
        kg = scanner.nextDouble();

        System.out.print("Masukan jumlah uang : ");
        uang = scanner.nextDouble();

        total = kg * telor;
        kembalian = uang - total;

        System.out.println("Jumlah harga yang harus dibayar : " + total);
        System.out.println("Jumlah uang yang dimasukan : "+ uang);
        System.out.println("Kembalian anda adalah : " + kembalian);

        scanner.close();

    }
}
