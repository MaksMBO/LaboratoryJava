/*
Создайте приложение для добавления абонента и просмотра списка абонентов телефонной сети. Записи в списке (5 записей)
 создаются в программе и являются объектами класса HashMap, где ключом является номер телефона (типа Integer), а
 значением – объект Abonent, содержащий четыре значения типа String:  фамилию, имя, отчество и адрес. Предусмотреть
 возможность сортировки элементов коллекции по 2-3 полям.
 */

package lab4;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Abonent Maks = new Abonent("Maks", "Bredyuk", "Oleksandrovich", "Balzac 14");
        Abonent David = new Abonent("David", "Beglarashvili", "Goshev", "Tsvetaeva 36");
        Abonent Sergey = new Abonent("Sergey", "Limbakh", "Danilovich", "Mayakovsky 29");
        Abonent Evgeny = new Abonent("Evgeny", "Poludenny", "Sergeevich", "Dreiser 18");
        Abonent Oleksandr = new Abonent("Oleksandr", "Bondar", "Viktorovich", "Zakrevsky 11");
        HashMap<Integer, Abonent> map = new HashMap<>();
        map.put(973849699, Maks);
        map.put(983256293, David);
        map.put(973422245, Sergey);
        map.put(973422364, Evgeny);
        map.put(984566543, Oleksandr);

        for (Abonent k : map.values()) {
            System.out.println(k.firstName + ' ' + k.secondName + ' ' + k.patronymic + ' ' + k.address);
        }

        AbonentFirstNameComparator nameFirst = new AbonentFirstNameComparator();
        AbonentSecondNameComparator nameSecond = new AbonentSecondNameComparator();
        List<Abonent> mapValues = new ArrayList<>(map.values());

        mapValues.sort(nameFirst);
        System.out.println("\n\n");
        for (Abonent k : mapValues) {
            System.out.println(k.firstName + ' ' + k.secondName + ' ' + k.patronymic + ' ' + k.address);
        }

        mapValues.sort(nameSecond);
        System.out.println("\n\n");
        for (Abonent k : mapValues) {
            System.out.println(k.firstName + ' ' + k.secondName + ' ' + k.patronymic + ' ' + k.address);
        }

    }
}

class Abonent {

    String firstName, secondName, patronymic, address;

    public Abonent(String first, String second, String patr, String addr) {
        firstName = first;
        secondName = second;
        patronymic = patr;
        address = addr;
    }
}


class AbonentFirstNameComparator implements Comparator<Abonent> {

    public int compare(Abonent a, Abonent b) {
        return a.firstName.compareTo(b.firstName);
    }
}

class AbonentSecondNameComparator implements Comparator<Abonent> {

    public int compare(Abonent a, Abonent b) {
        return a.secondName.compareTo(b.secondName);
    }
}
