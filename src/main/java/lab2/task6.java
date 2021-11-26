package lab2;

import java.net.SocketOption;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int firstSide, secondSide, angle;
        double result;

        Scanner num = new Scanner(System.in);
        System.out.print("Enter first side: " );
        firstSide = num.nextInt();
        System.out.print("Enter second side: " );
        secondSide = num.nextInt();
        System.out.print("Enter angle: " );
        angle = num.nextInt();


        double sine = Math.sin(Math.toRadians(angle));
        if (angle == 30)
        {
            sine = 0.5;
        }
        result = 0.5 * firstSide * secondSide * sine;
        System.out.println("Area: " + result);
    }
}