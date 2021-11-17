package JC_Conditional_statements_and_loops;

/**
 * Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль положительное ли число передали, или отрицательное;
 *  Замечание: ноль считаем положительным числом.
 */
public class Task5 {
    public static void main(String[] args) {
        method(10);
        method(0);
        method(-8);
    }

    public static void method(int a) {
        if (a >= 0)  System.out.println("+");
        else System.out.println("-");
    }
}
