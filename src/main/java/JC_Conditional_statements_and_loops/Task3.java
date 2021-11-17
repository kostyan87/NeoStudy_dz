package JC_Conditional_statements_and_loops;

/**
 * Написать метод вычисляющий выражение a * (b + (c / d))
 * и возвращающий результат,где a, b, c, d – входные параметры этого метода
 */
public class Task3 {

    public static void main(String[] args) {
        System.out.println(method(5, 4, 10, 2));
    }

    public static int method(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
}
