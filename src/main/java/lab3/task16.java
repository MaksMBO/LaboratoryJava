//������ ����� ����������, ���������� ��� ������� ���������. ���� �������� �������� ���������� ����� ������
// (������: ���� ��� ��������� ����, ������ �������� ����� ���� ���� �����,  ���� ���� "+" ��� "-"), ��  ���
// ��������� "Integer", ����� "String". ��������� ������� ���������� �������� ���������� �, ��� ������� ���������,
// ��� ��� � ��������.

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
