package lab4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class task16Test {

    @Test
    public void main() {
        task16.Article ar1 = new task16.Article("a", 23.2F);
        task16.Article ar2 = new task16.Article("b", 34.4F);
        task16.Article ar3 = new task16.Article("c", 32.4F);
        TreeMap<Integer, task16.Article> map = new TreeMap<>();
        map.put(1, ar1);
        map.put(2, ar2);
        map.put(3, ar3);
        ArrayList<task16.Article> sorted = new ArrayList<>(map.values());
        assertArrayEquals(sorted.toArray(), new task16.Article[]{ar1, ar2, ar3});
    }
}