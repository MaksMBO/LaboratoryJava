package lab5;

import org.junit.Test;

import static org.junit.Assert.*;

public class task40Test {

    @Test
    public void main() {
        task40.Fractional_part first = new task40.Fractional_part(1, 2);

        first.add(1, 2);
        Float actual_n = first.numerator;
        Float actual_d = first.denominator;
        Float expected_n = 4f;
        Float expected_d = 4f;
        assertEquals(expected_n, actual_n);
        assertEquals(expected_d, actual_d);

        first.minus(1, 2);
        actual_n = first.numerator;
        actual_d = first.denominator;
        expected_n = 4f;
        expected_d = 8f;
        assertEquals(expected_n, actual_n);
        assertEquals(expected_d, actual_d);

        first.division(4, 4);
        actual_n = first.numerator;
        actual_d = first.denominator;
        expected_n = 1f;
        expected_d = 2f;
        assertEquals(expected_n, actual_n);
        assertEquals(expected_d, actual_d);

        first.multiplication(2, 3);
        actual_n = first.numerator;
        actual_d = first.denominator;
        expected_n = 2f;
        expected_d = 6f;
        assertEquals(expected_n, actual_n);
        assertEquals(expected_d, actual_d);
    }
}