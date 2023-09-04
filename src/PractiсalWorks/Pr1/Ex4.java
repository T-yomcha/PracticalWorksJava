package PractiсalWorks.Pr1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите элементы ");
        int arr[] = new int[n];
        int i = 0;
        int sum = 0;
        int min = 1000;
        int max = 0;
        do {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        } while (i < n);
        System.out.println(Arrays.toString(arr) + " Sum " + sum + " Max " + max + " Min " + min);
    }
}
