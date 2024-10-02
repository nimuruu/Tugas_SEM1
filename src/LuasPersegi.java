import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
        double panjang, lebar, luas;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan panjang : ");
        panjang = scanner.nextDouble();

        System.out.print("Masukan lebar : ");
        lebar = scanner.nextDouble();

        luas = panjang * lebar;

        System.out.print("Luas persegnya adalah : " + luas);

        scanner.close();

    }
}
