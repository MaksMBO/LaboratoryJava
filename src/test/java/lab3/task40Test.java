package lab3;

import org.junit.Before;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class task40Test {
    Pattern p = Pattern.compile("[à-ÿ¸a-z]+", Pattern.UNICODE_CHARACTER_CLASS);
    Pattern p2 = Pattern.compile("[A-ZÀ-ß]", Pattern.UNICODE_CHARACTER_CLASS);
    String str;

    @Before
    public void setUp() throws Exception {
        str = "abcd";
    }

    @Test
    public void check() {
        String actual = task40.check(str, p, p2);
        String expected = "Before: abcd, after: ABCD";
        assertEquals(expected, actual);
    }
}

