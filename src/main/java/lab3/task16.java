//Анализ типов аргументов, задаваемых при запуске программы. Если аргумент является правильным целым числом
// (шаблон: одна или несколько цифр, первым символом может быть либо цифра,  либо знак "+" или "-"), то  тип
// аргумента "Integer", иначе "String". Программа выводит количество заданных аргументов и, для каждого аргумента,
// его тип и значение.

package lab3;

public class task16 {
    public static void main(String[] args) {
        System.out.println("Total items: " + args.length + "\n\n");
        for (String arg : args) {
            System.out.println(tp(arg) + "\n" + arg + "\n");
        }
    }

    public static String tp(String arg)
    {
        if (arg.matches("[-+]?\\d+")) {
            return "Integer";
        } else {
            return "String";
        }
    }
}
