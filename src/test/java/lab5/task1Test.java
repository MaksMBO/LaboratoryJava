package lab5;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class task1Test {

    @Test
    public void main() {
        task1.Hyperbola firstHyperbola = new task1.Hyperbola(1f);
        task1.Hyperbola fifthHyperbola = new task1.Hyperbola(-2f);


        fifthHyperbola.setX(1f);
        Float actual = fifthHyperbola.getY();
        Float expected = -2f;
        assertEquals(actual, expected);


        float flY = 1f;
        firstHyperbola.setY(flY);
        actual = firstHyperbola.getX();
        expected = 1.0f;
        assertEquals(expected, actual);
    }
}