package tasks;

import java.util.Scanner;

public class BooleanOperations {

    public static void comparisons(int number1, int number2) {
        // Задаем массив операций
        String[] booleanOperations = new String[]{">", ">=", "<", "<=", "==", "!="};

        System.out.println("\nЛогические операции с числами:");

        for (String operation : booleanOperations) {
            boolean result;
            switch (operation) {
                case ">":
                    result = number1 > number2;
                    System.out.println(number1 + " > " + number2 + " = " + result);
                    break;
                case ">=":
                    result = number1 >= number2;
                    System.out.println(number1 + " >= " + number2 + " = " + result);
                    break;
                case "<":
                    result = number1 < number2;
                    System.out.println(number1 + " < " + number2 + " = " + result);
                    break;
                case "<=":
                    result = number1 <= number2;
                    System.out.println(number1 + " <= " + number2 + " = " + result);
                    break;
                case "==":
                    result = number1 == number2;
                    System.out.println(number1 + " == " + number2 + " = " + result);
                    break;
                case "!=":
                    result = number1 != number2;
                    System.out.println(number1 + " != " + number2 + " = " + result);
                    break;
                default:
                    System.out.println("Неверная операция");
                    break;
            }
        }
    }

}
