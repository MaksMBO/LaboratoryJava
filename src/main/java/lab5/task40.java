package lab5;

import java.util.Objects;
import java.util.Scanner;

public class task40 {
    /**
     * Class Fraction describes fraction
     * **/
    static class Fraction{
        protected float numerator, denominator;

        /**
         * Constructor with arguments
         *
         * @param numerator   float
         * @param denominator   float
         */
        public Fraction(float numerator, float denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }

        /**
         * Setter of numerator
         * @param numerator float
         **/
        public void setNumerator(float numerator){
            try{
                this.numerator = numerator;
            }catch (Exception e){
                System.err.println("Invalid value");
            }

        }

        /**
         * Getter numerator
         * @return  numerator String
         **/
        public float getNumerator(){
            return this.numerator;
        }

        /**
         * Setter of denominator
         * @param denominator float
         **/
        public void setDenominator(float denominator) {
            try{
                this.denominator = denominator;
                if (this.denominator ==0){
                    System.err.println("Denominator can't be 0");
                }
            }catch (Exception e){
                System.err.println("Invalid value");
            }
        }

        /**
         * Getter denominator
         * @return  denominator String
         **/
        public float getDenominator(){
            return this.denominator;
        }

        /**
         * Fractions are added
         * **/
        public void add(float new_numerator, float new_denominator)
        {
            try{
                this.numerator = this.numerator * new_denominator + new_numerator * this.denominator;
                this.denominator = this.denominator * new_denominator;
                if (this.denominator ==0){
                    System.err.println("Denominator can't be 0");
                }
            }catch (Exception e){
                System.err.println("Invalid value");
            }
        }

        /**
         * Subtracts a value from a fraction
         * **/
        public void minus(float new_numerator, float new_denominator){
            try{
                this.numerator = this.numerator * new_denominator - new_numerator * this.denominator;
                this.denominator = this.denominator * new_denominator;
                if (this.denominator ==0){
                    System.err.println("Denominator can't be 0");
                }
            }catch (Exception e){
                System.err.println("Invalid value");
            }
        }

        /**
         * Multiplied by a fraction
         * **/
        public void multiplication(float new_numerator, float new_denominator){
            try{
                this.numerator *= new_numerator;
                this.denominator *= new_denominator;
                if (this.denominator ==0){
                    System.err.println("Denominator can't be 0");
                }
            }catch (Exception e){
                System.err.println("Invalid value");
            }
        }

        /**
         * Divisible into fraction
         * **/
        public void division(float new_numerator, float new_denominator){
            try{
                this.numerator /= new_numerator;
                this.denominator /= new_denominator;
                if (this.denominator ==0){
                    System.err.println("Denominator can't be 0");
                }
            }catch (Exception e){
                System.err.println("Invalid value");
            }
        }

        /**
         * Object Comparing Method
         * @param o Object
         * **/
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Fraction that = (Fraction) o;
            return Objects.equals(numerator, that.numerator) && Objects.equals(denominator, that.denominator);
        }

        /**
         * Object Comparing Method
         * **/
        @Override
        public int hashCode() {
            return Objects.hash(numerator);
        }
    }

    /**
     * Class Fractional_part describes fractional_part
     * **/
    static class Fractional_part extends Fraction {
        /**
         * Constructor with arguments
         * @param numerator   float
         * @param denominator   float
         */
        public Fractional_part(float numerator, float denominator) {
            super(numerator, denominator);
        }
        float real_type;

        /**
         * Getter real_type
         * @return  real_type String
         * **/
        public float getReal_type() {
            return real_type;
        }

        /**
         * Translates fraction real type
         * **/
        public void toReal_type(){
            this.real_type = this.getNumerator() / this.getDenominator();
        }

        /**
         * Method that returns a string
         * **/
        @Override
        public String toString() {
            return "real_type= %.2f";
        }
    }


    /**
     * Makes communication with user
     * @param args cli arguments, no one expected
     */
    public static void main(String[] args) {
        Fractional_part first = new Fractional_part(12, 23);

        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите числитель: ");
        first.setNumerator(sc.nextFloat());
        System.out.println("¬ведите знаменатель: ");
        first.setDenominator(sc.nextFloat());


        System.out.println("¬ведите значени€ дл€ действий: ");
        float new_numerator = sc.nextFloat();
        float new_denominator = sc.nextFloat();
        first.add(new_numerator, new_denominator);
        first.toReal_type();
        System.out.printf((first) + "%n", first.getReal_type());
        first.minus(new_numerator, new_denominator);
        first.toReal_type();
        System.out.printf((first) + "%n", first.getReal_type());
        first.multiplication(new_numerator, new_denominator);
        first.toReal_type();
        System.out.printf((first) + "%n", first.getReal_type());
        first.division(new_numerator, new_denominator);
        first.toReal_type();
        System.out.printf((first) + "%n", first.getReal_type());
    }
}
