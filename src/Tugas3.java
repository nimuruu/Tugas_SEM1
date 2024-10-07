import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        double total, harga;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total bayar :");
        double bayar = scanner.nextInt();

        if (bayar >= 200000){
            total = bayar*12/100;
            harga = bayar - total;
            System.out.print("Total anda adalah : " + harga);
        }
        else if (bayar >= 100000 && bayar <=200000){
            total = bayar*10/100;
            harga = bayar - total;
            System.out.print("Total anda adalah : " + harga);
        }
        else if (bayar >= 50000 ){
            total = bayar*5/100;
            harga = bayar - total;
            System.out.print("Total anda adalah : " + harga);
        }
        else {
            System.out.println("Total bayar anda : " + bayar);
        }

        scanner.close();
    }
}
