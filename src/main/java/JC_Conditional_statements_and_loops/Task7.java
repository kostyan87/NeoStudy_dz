package JC_Conditional_statements_and_loops;

/**
 * Написать метод, которому в качестве параметра передается строка,
 * обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
 */
public class Task7 {
    public static void main(String[] args) {
        method("Kostya");
    }

    public static void method(String name) {
        System.out.println("Привет, " + name + "!");
    }
}
