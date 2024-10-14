package Minggu4;

public class Tugas5 {
    public static void main(String[] args) {
        
         int a=0;
         int b=0;
         int c=0;
         int i=1;
         while (c<=89) {
             if (i==1) 
             c=0;
             else if (i==2) 
             c=1;
             else {
                 a=b;
                 b=c;
                 c=a+b;
                }
            System.out.print(c + " ");
            i++;
         }

    }
}

// 0 1 1 2 3 5 8 13 21 34 55 89 144