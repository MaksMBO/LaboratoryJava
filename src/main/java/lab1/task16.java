package lab1;

import java.util.Scanner;

class task16{
    public static void main(String[] args) {
        int firstSide, secondSide;
        double diagonal, perimeter;

        Scanner num = new Scanner(System.in);
        System.out.print("Enter first side: " );
        firstSide = num.nextInt();
        System.out.print("Enter second side: " );
        secondSide = num.nextInt();

        diagonal = Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        perimeter = 2 * (firstSide + secondSide);
        System.out.println("Diagonal: " + diagonal);
        System.out.println("Perimeter: " + perimeter);
    }
}