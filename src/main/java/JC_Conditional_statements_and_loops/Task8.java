package JC_Conditional_statements_and_loops;

/**
 * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
 */
public class Task8 {

    public static void main(String[] args) {
        method(400);
        method(500);
        method(344);
    }

    public static void method(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Високосный");
        else System.out.println("Не високосный");
    }
}
