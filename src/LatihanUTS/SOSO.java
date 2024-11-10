package LatihanUTS;

public class SOSO {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 4; j++) {
                int k = 4-i;
                if (j<k)
                System.out.print("S ");
                else
                System.out.print("O ");
            }
            System.out.println("");
        }
    }
}
