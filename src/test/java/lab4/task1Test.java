package lab4;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class task1Test {
    @Test
    public void main() {
        Abonent abon1 = new Abonent("a", "c", "b", "aboba");
        Abonent abon2 = new Abonent("b", "a", "c", "aboba");
        Abonent abon3 = new Abonent("c", "b", "a", "aboba");
        Map<Integer, Abonent> map = new HashMap<>();
        map.put(1, abon1);
        map.put(2, abon2);
        map.put(3, abon3);
        List<Abonent> mapValues = new ArrayList<>(map.values());
        Collections.sort(mapValues, new AbonentFirstNameComparator());
        assertArrayEquals(mapValues.toArray(), new Abonent[]{abon1, abon2, abon3});
        Collections.sort(mapValues, new AbonentSecondNameComparator());
        assertArrayEquals(mapValues.toArray(), new Abonent[]{abon2, abon3, abon1});
    }
}