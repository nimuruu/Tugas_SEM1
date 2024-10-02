import java.util.Scanner;

public class KelilingLingkaran {
    public static void main(String[] args) {
        double Jari_jari;
        double keliling; 
        Scanner scanner= new Scanner(System.in);

        System.out.print("Masukan jari - jari lingkaran : ");
        Jari_jari = scanner.nextDouble();

        keliling = 2 * Math.PI * Jari_jari;

        System.out.printf("Keliling lingkaran dengan jari-jari %.2f adalah: %.2f%n", Jari_jari, keliling);

        scanner.close();


    }
}
