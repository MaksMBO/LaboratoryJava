package lab2;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        int numeric, result = 1;

        Scanner num = new Scanner(System.in);
        System.out.print("Enter numeric: " );
        numeric = num.nextInt();

        for (int i = numeric; i >= 1; i--)
            result *= i;
        System.out.println("Numeric: " + result);
    }
}