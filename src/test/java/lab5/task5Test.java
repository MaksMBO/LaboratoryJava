package lab5;

import org.junit.Test;

import static org.junit.Assert.*;

public class task5Test {

    @Test
    public void main() {
        task5.Message message1 = new task5.Message("Max", "purchase", "text message1", "12-10-00",
                "23-09-2021");
        message1.setAuthor("Max");
        message1.setSubject("purchase");
        message1.setText("text message1");
        message1.setDate_of_creation("23-09-2021");

        String actual = message1.getAuthor();
        String expected = "Max";
        assertEquals(expected, actual);

        actual = message1.getSubject();
        expected = "purchase";
        assertEquals(expected, actual);

        actual = message1.getText();
        expected = "text message1";
        assertEquals(expected, actual);

        actual = message1.getDate_of_creation();
        expected = "23-09-2021";
        assertEquals(expected, actual);
    }
}