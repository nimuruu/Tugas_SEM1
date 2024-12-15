package Latihan;

import java.util.Arrays;

public class Latihan10 {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[]) {
        int arr[] = {5, 12, 10, 7, 1, 3};
        System.out.println("Array yang belum terurut:");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array yang telah terurut:");
        System.out.println(Arrays.toString(arr));
    }
}