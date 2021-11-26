package lab5;

import org.junit.Test;

import static org.junit.Assert.*;

public class task16Test {

    @Test
    public void main() {
        task16.Employee Max = new task16.Employee("Bredyuk", "Max", "Oleksandrovich",
                "27-08-2003", "male", "the average", "gymnasium ¹283",
                "11-11-2021", "Mayakovsky 3", 1456789 );

        String actual = Max.toString();
        String expected = "surname = Bredyuk\n" +
                "name = Max'patronymic = Oleksandrovich\n" +
                "date_of_birth = 27-08-2003\n" +
                "gender = male\n" +
                "education = the average\n" +
                "educational_institution_that_issued_the_document = gymnasium ¹283\n" +
                "date_of_employment = 11-11-2021\n" +
                "home_address = Mayakovsky 3\n" +
                "educational_document_number = 1456789";
        assertEquals(expected, actual);
    }
}