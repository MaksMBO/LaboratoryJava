package lab4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class task30Test {

    @Test
    public void main() {
        task30.TextFile file1 = new task30.TextFile("C:\\Users\\Maks\\IdeaProjects\\lab\\src\\main\\java\\lab4\\file",
                "This is the first file.   ");
        task30.TextFile file2 = new task30.TextFile("C:\\Users\\Maks\\IdeaProjects\\lab\\src\\main\\java\\lab4\\file",
                "This is the second file.");
        task30.TextFile file3 = new task30.TextFile("C:\\Users\\Maks\\IdeaProjects\\lab\\src\\main\\java\\lab4\\file",
                "This is the third file.");
        HashMap<String, task30.TextFile> map = new HashMap<>();
        map.put("file1", file1);
        map.put("file2", file2);
        map.put("file3", file3);
        task30.dell(map, "file2");
        ArrayList<task30.TextFile> sorted = new ArrayList<>(map.values());
        assertArrayEquals(sorted.toArray(), new task30.TextFile[]{file3, file1});
    }
}