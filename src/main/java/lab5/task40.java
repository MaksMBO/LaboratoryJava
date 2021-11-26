package lab5;

public class task40 {
    static class Fraction{
        float numerator, denominator;

        public Fraction(float numerator, float denominator){
            this.numerator = numerator;
            this.denominator = denominator;
        }


        public void setNumerator(float numerator){
            try{
                this.numerator = numerator;
            }catch (Exception e){
                System.err.println("Invalid value");
            }

        }

        public float getNumerator(){
            return this.numerator;
        }

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

        public float getDenominator(){
            return this.denominator;
        }

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
    }

    static class Fractional_part extends Fraction {
        public Fractional_part(float numerator, float denominator) {
            super(numerator, denominator);
        }
        float real_type;

        public float getReal_type() {
            return real_type;
        }

        public void toReal_type(){
            this.real_type = this.numerator / this.denominator;
        }

        @Override
        public String toString() {
            return "real_type= %.2f";
        }
    }

    public static void main(String[] args) {
        Fractional_part first = new Fractional_part(12, 23);

        first.add(23, 32);
        first.minus(1, 1);
        first.multiplication(2, 1);
        first.division(1, 1);

        first.toReal_type();

        System.out.println(String.format(first.toString(), first.real_type));
    }
}
