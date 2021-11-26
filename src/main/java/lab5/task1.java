package lab5;

import java.util.Scanner;

public class task1 {
    public static class Hyperbola {
        float y, x, k;

        public Hyperbola(float k) {
            this.k = k;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getX() {
            try {
                this.x = this.k / this.y;
            } catch (ArithmeticException a) {
                System.err.println("Invalid value");
            }
            return this.x;
        }

        public float getY() {
            if (this.x == 0) {
                System.err.println("Invalid value");
            }
            try {
                this.y = this.k / this.x;
            } catch (ArithmeticException a) {
                System.err.println("Invalid value");
            }

            return this.y;
        }

        @Override
        public String toString() {
            return "y = " + y +
                    ", x = " + x +
                    ", k = " + k;
        }
    }

    public static void main(String[] args) {
        Hyperbola firstHyperbola = new Hyperbola(1f);
        Hyperbola secondHyperbola = new Hyperbola(-1f);
        Hyperbola thirdHyperbola = new Hyperbola(3.5f);
        Hyperbola fourthHyperbola = new Hyperbola(11f);
        Hyperbola fifthHyperbola = new Hyperbola(-2f);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a x: ");
        float flX = in.nextFloat();
        fifthHyperbola.setX(flX);
        System.out.println(fifthHyperbola.getY());

        System.out.print("Input a y: ");
        float flY = in.nextFloat();
        firstHyperbola.setY(flY);

        System.out.println(firstHyperbola.getX());
        System.out.println(firstHyperbola.toString());
        System.out.println(fifthHyperbola.toString());
    }

}