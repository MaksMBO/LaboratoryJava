/*
Создайте приложение для просмотра списка товаров и изменения цены товара в электронном магазине. Список товаров
(5 записей) создается в программе и является объектом класса TreeMap. Ключом записи является артикул товара marking
(типа Integer), а значением – объект Article, содержащий наименование товара (типа String) и цену товара (типа float).
 Предусмотреть возможность проверки уникальности наименования товара с помощью HashSet.
 */

package lab4;

import java.util.*;

public class task16 {
    static class Article {
        String name;
        float price;

        public Article(String nm, float pr) {
            name = nm;
            price = pr;
        }

        public void setPrice(float f) {
            price = f;
        }
    }

    public static void duplicate_entry(List<Article> inp) {
        HashSet<String> unique = new HashSet<>();
        boolean ind = false;
        for (Article obj : inp) {
            if (!unique.add(obj.name)) {
                System.out.println("Duplicate Entry is: " + obj.name + ' ' + obj.price);
                ind = true;
            }
        }
        if (!ind) {
            System.out.println("No duplicates.");
        }
    }

    public static void price_change(TreeMap<Integer, Article> a, int i) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a new price: ");
        float num = in.nextFloat();
        Article temp = a.get(i);
        a.remove(i);
        temp.setPrice(num);
        a.put(i, temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Article apple = new Article("apple", 23.2F);
        Article orange = new Article("orange", 34.4F);
        Article banana = new Article("banana", 12.3F);
        Article carrot = new Article("carrot", 23.2F);
        Article potatoes = new Article("potatoes", 23.2F);
        Article meat = new Article("potatoes", 100F);

        TreeMap<Integer, Article> map = new TreeMap<>();
        map.put(1, apple);
        map.put(2, orange);
        map.put(3, banana);
        map.put(4, carrot);
        map.put(5, potatoes);
        map.put(6, meat);

        price_change(map, 5);

        ArrayList<Article> sorted = new ArrayList<>(map.values());
        for (Article a : sorted)
            System.out.println("Name: " + a.name + " ,price: " + a.price);
        System.out.println("\n\n");

        duplicate_entry(sorted);
    }
}

