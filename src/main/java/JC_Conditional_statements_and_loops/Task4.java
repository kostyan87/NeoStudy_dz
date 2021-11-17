package JC_Conditional_statements_and_loops;

/**
 * Написать метод, принимающий на вход два числа,
 * и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
 * если да – вернуть true, в противном случае – false
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println(method(10, 11));
        System.out.println(method(8, 11));
    }

    public static boolean method(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}
