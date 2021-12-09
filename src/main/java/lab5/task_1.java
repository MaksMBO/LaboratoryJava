/*Построить программу для работы с классом для хранения данных о кривой второго порядка - гиперболе. Программа
должна обеспечивать: расчет у по х и наоборот, ввод значений, вывод значений.
 */
package lab5;

import java.util.Objects;
import java.util.Scanner;


public abstract class task_1 implements Options{
    /**
     * Class Hyperbola  describing hyperbole
     * **/
    public static class Hyperbola implements Options{
        private float y;
        private float x;
        private final float k;

        /**
         * Constructor with arguments
         *
         * @param k   float
         */
        public Hyperbola(float k) {
            this.k = k;
        }

        /**
         * Setter of  y
         * @param y float
         **/
        public void setY(float y) {
            this.y = y;
        }

        /**
         * Setter of  x
         * @param  x float
         **/
        public void setX(float x) {
            this.x = x;
        }

        /**
         * Getter x
         * @return x float
         **/
        public float getX() {
            try {
                this.x = this.k / this.y;
            } catch (ArithmeticException a) {
                System.err.println("Invalid value");
            }
            return this.x;
        }

        /**
         * Getter y
         * @return y float
         **/
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

        /**
         * Method that returns a string
         * **/
        @Override
        public String toString() {
            return "y = " + y +
                    ", x = " + x +
                    ", k = " + k;
        }

        /**
         * Object Comparing Method
         * @param o Object
         * **/
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hyperbola that = (Hyperbola) o;
            return Objects.equals(y, that.y) && Objects.equals(x, that.x) &&
                    Objects.equals(k, that.k);
        }

        /**
         * Object Comparing Method
         * **/
        @Override
        public int hashCode() {
            return Objects.hash(x);
        }
    }

    /**
     * Makes communication with user
     * @param args cli arguments, no one expected
     */
    public static void main(String[] args) {
        Hyperbola firstHyperbola = new Hyperbola(1f);
        Hyperbola fifthHyperbola = new Hyperbola(-2f);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a x: ");
        float flX = in.nextFloat();
        fifthHyperbola.setX(flX);
        System.out.println("y = " + fifthHyperbola.getY());

        System.out.print("Input a y: ");
        float flY = in.nextFloat();
        firstHyperbola.setY(flY);
        System.out.println("x = " + firstHyperbola.getX());

        System.out.println(firstHyperbola);
        System.out.println(fifthHyperbola);
    }

}
