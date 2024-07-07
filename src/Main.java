public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++)
        System.out.println(i);

        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--)
            System.out.println(i);

        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i += 2)
            System.out.println(i);

        System.out.println("Задача 4");

        for (int i = 10; i>= -10; i--)
            System.out.println(i);

        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i +4)
            System.out.println(i + " год является високосным.");

        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i +7)
            System.out.println(i);

        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2)
            System.out.println(i);

        System.out.println("Задача 8");

        int theAmount = 29000;
        int theAmount1 = 0;
        for (int i = 1; i <= 12; i++) {
            theAmount1 += theAmount;
            System.out.println("Месяц " + i + ", сумма накопления равна " + theAmount1 + " рублей.");
        }

        System.out.println("Задача 9");

        int newAmount = 29000;
        int newAmount1 = 0;
        for (int i = 1; i <= 12; i++) {
            newAmount1 = newAmount1 + newAmount1 / 100;
            newAmount1 = newAmount1 + newAmount;
            System.out.println("Месяц " + i + ", сумма накопления равна " + newAmount1 + " рублей.");
        }

        System.out.println("Задача 10");

        for (int i = 1 ; i <= 10; i++)
            System.out.println("2 * " + i + " = " + (2 * i));
    }
}