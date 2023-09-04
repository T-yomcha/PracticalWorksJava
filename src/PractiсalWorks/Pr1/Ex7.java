package PractiсalWorks.Pr1;

import java.util.Scanner;

public class Ex7 {
    public int Fac(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Ex7 ex7 = new Ex7();
        System.out.println("Факториал числа " + n + " = " + ex7.Fac(n));
    }
}
