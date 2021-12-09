package lab5;

public interface About_fraction {
    void setNumerator(float numerator);
    float getNumerator();
    void setDenominator(float denominator);
    float getDenominator();
    void add(float new_numerator, float new_denominator);
    void minus(float new_numerator, float new_denominator);
    void multiplication(float new_numerator, float new_denominator);
    void division(float new_numerator, float new_denominator);
    boolean equals(Object o);
    int hashCode();
    float getReal_type();
    void toReal_type();
    String toString();
}
