//Вывести таблицу преобразований целых десятичных чисел в интервале от 10 до 100 с шагом 20 в 16-ное представление.

package lab3;

public class task1 {
    public static void main(String[] args) {
        for(int i = 10; i < 100; i += 20)
        {
            String str = String.format("Decimal: %d, Hexadecimal: %x", i, i);
            System.out.println(str);
        }
    }
}
