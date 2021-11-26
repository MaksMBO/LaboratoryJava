package lab3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class task5Test {
    String str, str2;
    int key;

    @Before
    public void setUp() throws Exception {
        str = "Hello";
        str2 = "Ebiil";
        key = 3;
    }



    @Test
    public void cipher1() {
        String actual = task5.cipher1(key, str);
        String expected = "Ebiil";
        assertEquals(expected, actual);
    }

    @Test
    public void cipher2() {
        String actual = task5.cipher2(key, str2);
        String expected = "Hello";
        assertEquals(expected, actual);
    }
}