package lab1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int firstNum, secondNum, thirdNum;
        double middle;

        Scanner num = new Scanner(System.in);
        System.out.print("Enter first: " );
        firstNum = num.nextInt();
        System.out.print("Enter second: " );
        secondNum = num.nextInt();
        System.out.print("Enter third: " );
        thirdNum = num.nextInt();

        middle = (firstNum + secondNum + thirdNum) / 3.0;
        System.out.println("\nArithmetic mean:" + middle);

        System.out.println("Rounded value: " + Math.round(middle));
    }
}
