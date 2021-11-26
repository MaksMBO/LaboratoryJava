//Создайте программу для шифрования\расшифровки текста методом Цезаря. В нем ключом является целое число,
// а шифрование\расшифровка заключается в суммировании\ вычитании кодов символов открытого текста\криптотекста
// с ключом.
package lab3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        System.out.print("Input a number: ");
        int key = in.nextInt();
        System.out.print("Input a string: ");
        String first = in2.nextLine();

        System.out.println(cipher1(key, first));
        System.out.println(cipher2(key, cipher1(key, first)));
    }

    public static String cipher1(int key, String first) {
        char[] chars = first.toCharArray();
        for (char aChar : chars) {
            if (!((aChar <= 'z' && aChar >= 'a') || (aChar <= 'Z' && aChar >= 'A') || aChar == ' ')) {
                System.out.println("Incorrect data entered");
                System.exit(1);
            }
        }
        StringBuilder second = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            int ind = (int) chars[i] - key;
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                if (ind < 'a') {
                    chars[i] = (char) ('z' - ('a' - ind - 1));
                } else {
                    chars[i] = (char) (chars[i] - key);
                }

            } else if (chars[i] <= 'Z' && chars[i] >= 'A') {
                if (ind < 'A') {
                    chars[i] = (char) ('Z' - ('A' - ind - 1));
                } else {
                    chars[i] = (char) (chars[i] - key);
                }
            }
            second.append((chars[i]));
        }
        return second.toString();
    }

    public static String cipher2(int key, String second) {
        StringBuilder third = new StringBuilder();
        String temp = second.toString();
        char[] chars2 = temp.toCharArray();
        for (int i = 0; i < second.length(); i++) {
            int ind = (int) chars2[i] + key;
            if (chars2[i] <= 'z' && chars2[i] >= 'a') {
                if (ind > 'z') {
                    chars2[i] = (char) ('a' + (ind - 'z' - 1));
                } else {
                    chars2[i] = (char) (chars2[i] + key);
                }
            } else if (chars2[i] <= 'Z' && chars2[i] >= 'A') {
                if (ind > 'Z') {
                    chars2[i] = (char) ('A' + (ind - 'Z' - 1));
                } else {
                    chars2[i] = (char) (chars2[i] + key);
                }
            }
            third.append((chars2[i]));
        }
        return third.toString();
    }
}
