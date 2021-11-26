package lab4;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class task5Test {
    @Test
    public void main() {
        task5.Book book1 = new task5.Book("a", 2, 3);
        task5.Book book2 = new task5.Book("b", 1, 2);
        task5.Book book3 = new task5.Book("c", 3, 1);
        HashMap<Integer, task5.Book> map = new HashMap<>();
        map.put(1, book1);
        map.put(2, book2);
        map.put(3, book3);
        ArrayList<task5.Book> sor = new ArrayList<>(map.values());
        Collections.sort(sor, new task5.nameComparator());
        assertArrayEquals(sor.toArray(), new task5.Book[]{book1, book2, book3});
        Collections.sort(sor, new task5.yearComparator());
        assertArrayEquals(sor.toArray(), new task5.Book[]{book2, book1, book3});
        Collections.sort(sor, new task5.priceComparator());
        assertArrayEquals(sor.toArray(), new task5.Book[]{book3, book2, book1});
        task5.dell(map, 3);
        ArrayList<task5.Book> new_sor = new ArrayList<>(map.values());
        assertArrayEquals(new_sor.toArray(), new task5.Book[]{book1, book2});
    }
}