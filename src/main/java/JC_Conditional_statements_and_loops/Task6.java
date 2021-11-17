package JC_Conditional_statements_and_loops;

/**
 * Написать метод,
 * которому в качестве параметра передается целое число,
 * метод должен вернуть true, если число отрицательное
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(method(10));
        System.out.println(method(-446));
        System.out.println(method(0));
    }

    public static boolean method(int a) {
        return a < 0;
    }
}
