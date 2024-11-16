package Minggu6;

public class MutliArray {
    public static void main(String[] args) {
        String[][][] mobil = {
            {
                {"NISSAN"}, {"MAZDA"}, {"TOYOTA"},
                {"SUBARU"}, {"MITSUBISHI"}, {"LUXUS"} 
            },
            {
                {"SKYLINE"}, {"RX-7"}, {"SUPRA"},
                {"IMPREZA"}, {"LANCER"}, {"LFA"}
            },
        };

        System.out.printf("%-5s %-15s %-10s \n", "No", "Brand", "Model");
        System.out.println("-" .repeat(40));

        for (int i = 0; i < mobil[0].length; i++) {
            System.out.printf("%-5d %-15s %-10s \n", (i + 1), mobil[0][i][0], mobil[1][i][0]);    
        }

        System.out.println("-" .repeat(40));

    }
}
