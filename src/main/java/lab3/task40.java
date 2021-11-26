//Преобразование аргументов, задаваемых при запуске программы. Программа преобразует русские и латинские буквы
// в аргументах в верхний регистр (если они являются строчными). Шаблон аргумента: либо строки латинских букв,
// либо строки букв кириллицы. Программа выводит количество заданных аргументов, их значения, а также новые
// значения аргументов.

package lab3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task40 {
    public static void main(String[] args) {
        System.out.println("Total items: " + args.length + "\n\n");
        Pattern p = Pattern.compile("[а-яёa-z]+", Pattern.UNICODE_CHARACTER_CLASS);
        Pattern p2 = Pattern.compile("[A-ZА-Я]", Pattern.UNICODE_CHARACTER_CLASS);

        for (String arg : args) {
            System.out.println(check(arg, p, p2));
        }
    }

    public static String check(String arg, Pattern p, Pattern p2) {

        Matcher m = p.matcher(arg);
        Matcher m2 = p2.matcher(arg);

        if (m.find()) {
            if (!m2.find()) {
                return "Before: " + arg + ", after: " + arg.toUpperCase();
            }
        }
        return "Before: " + arg;
    }
}
