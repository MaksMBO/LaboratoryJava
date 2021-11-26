/*
—оздайте приложение дл€ поиска в списке файлов и удалени€ файла из списка.  —писок (дл€ 5 текстовых файлов с
расширением .txt) создаетс€ в программе и €вл€етс€ объектом класса HashMap, где ключом €вл€етс€ им€ файла
(типа String), а значением Ц объект типа TextFile, содержащий два элемента String Ц абсолютный путь к файлу
(без имени файла) и краткое описание содержимого файла.
 */

package lab4;

import java.util.HashMap;
import java.util.Scanner;

public class task30 {
    static class TextFile {
        String path, description;

        public TextFile(String paths, String descriptions) {
            path = paths;
            description = descriptions;
        }
    }

    public static void dell(HashMap<String, TextFile> mp, String i) {
        mp.remove(i);
    }

    public static void main(String[] args) {
        TextFile file1 = new TextFile("C:\\Users\\Maks\\IdeaProjects\\lab\\src\\main\\java\\lab4\\file",
                "This is the first file.   ");
        TextFile file2 = new TextFile("C:\\Users\\Maks\\IdeaProjects\\lab\\src\\main\\java\\lab4\\file",
                "This is the second file.");
        TextFile file3 = new TextFile("C:\\Users\\Maks\\IdeaProjects\\lab\\src\\main\\java\\lab4\\file",
                "This is the third file.");
        TextFile file4 = new TextFile("C:\\Users\\Maks\\IdeaProjects\\lab\\src\\main\\java\\lab4\\file",
                "This is the fourth file.");
        TextFile file5 = new TextFile("C:\\Users\\Maks\\IdeaProjects\\lab\\src\\main\\java\\lab4\\file",
                "This is the fifth file.");

        HashMap<String, TextFile> map = new HashMap<>();
        map.put("file1", file1);
        map.put("file2", file2);
        map.put("file3", file3);
        map.put("file4", file4);
        map.put("file5", file5);

        for (TextFile t : map.values()) {
            System.out.println("Path: " + t.path + ", description: " + t.description);
        }
        System.out.println("\n\n");

        dell(map, "file2");
        for (TextFile t : map.values()) {
            System.out.println("Path: " + t.path + ", description: " + t.description);
        }
        System.out.println("\n\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Input a name of file: ");
        String str = in.next();

        try {
            System.out.println("Path: " + map.get(str).path + ", description: " + map.get(str).description);
        }catch (NullPointerException n)
        {
            System.err.println("File not found");
        }

    }
}
