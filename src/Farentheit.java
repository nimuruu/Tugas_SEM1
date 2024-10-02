import java.util.Scanner;

public class Farentheit {

    public static void main(String[] args) {
        double Celcius, Farentheit;
        Scanner suhu = new Scanner(System.in);

        System.out.print("Masukan suhu dalam Celcius : ");
        Celcius = suhu.nextDouble();

        Farentheit = (Celcius * 9/5) + 32;

        System.out.print("Suhu dalam Farenheit :" + Farentheit + " F");

        suhu.close();


    }
}