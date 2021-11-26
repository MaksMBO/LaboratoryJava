/*
Создайте приложение для просмотра списка книг и удаления книг в  библиотечном каталоге. Записи в списке (5 записей)
 являются объектами класса HashMap, где ключом является индекс ISBN книги (типа Integer), а значением – объект Book,
 содержащий наименование книги, фамилию, имя и отчество (ФИО) автора, издательство (все поля типа String), год издания
 (типа int) и цену книги (типа float). Предусмотреть возможность сортировки книг по 2-3 полям.
 */


package lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class task5 {
    static class Book
    {
        String fio;
        int year;
        float price;

        public Book(String f, int y, float p)
        {
            fio = f;
            year = y;
            price = p;
        }
    }

    static class nameComparator implements Comparator<Book> {
        @Override
        public int compare(Book a, Book b) {
            return a.fio.compareTo(b.fio);
        }
    }

    static class yearComparator implements Comparator<Book> {
        @Override
        public int compare(Book a, Book b) {
            return Integer.compare(a.year, b.year);
        }
    }

    static class priceComparator implements Comparator<Book>{
        @Override
        public int compare(Book a, Book b) {
            return Float.compare(a.price, b.price);
        }
    }

    public static void dell(HashMap<Integer, Book> mp, int i)
    {
        mp.remove(i);
    }


    public static void main(String[] args) {
        Book book1 = new Book("Lev Nikolaevich Tolstoy", 1865, 200.4F);
        Book book2  = new Book("Erich Maria Remarque", 1950, 323.2F);
        Book book3 = new Book("Alexander Sergeevich Pushkin", 1820, 432.34F);
        Book book4 = new Book("Fedor Mikhailovich Dostoevsky", 1863, 342F);
        Book book5 = new Book("Vladimir Vladimirovich Mayakovsky", 1920, 254.6F);

        HashMap<Integer, Book> map = new HashMap<>();

        map.put(1, book1);
        map.put(2, book2);
        map.put(3, book3);
        map.put(4, book4);
        map.put(5, book5);

        for (Book b : map.values())
        {
            System.out.println("Full name: " + b.fio + ", year: " + b.year + ", price: " + b.price);
        }
        System.out.println("\n\n");

        ArrayList<Book> sor = new ArrayList<>(map.values());
        sor.sort(new nameComparator());
        for (Book b : sor)
        {
            System.out.println("Full name: " + b.fio + ", year: " + b.year + ", price: " + b.price);
        }
        System.out.println("\n\n");

        sor.sort(new yearComparator());
        for (Book b : sor)
        {
            System.out.println("Full name: " + b.fio + ", year: " + b.year + ", price: " + b.price);
        }
        System.out.println("\n\n");

        sor.sort(new priceComparator());
        for (Book b : sor)
        {
            System.out.println("Full name: " + b.fio + ", year: " + b.year + ", price: " + b.price);
        }
        System.out.println("\n\n");

        dell(map, 3);
        for (Book b : map.values())
        {
            System.out.println("Full name: " + b.fio + ", year: " + b.year + ", price: " + b.price);
        }
        System.out.println("\n\n");
    }


}
