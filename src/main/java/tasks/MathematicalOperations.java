package tasks;

public class MathematicalOperations {

    public static void printAddition(int a, int b) {

        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b) + "\n");

    }

    public static void printMultiplication(int a, int b) {

        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b) + "\n");

    }

    public static void printSubtraction(int a, int b) {

        System.out.println("Вычетание: " + a + " - " + b + " = " + (a - b) + "\n");

    }

    public static void printDivision(int a, int b) {

        System.out.println("Операция деления двух чисел: " + a + " / " + b + " = " + (a / b) + "\n");
        System.out.println("Получение остатка от деления двух чисел: " + a + " % " + b + " = " + (a % b) + "\n");

    }

    public static void printCombinationDouble(int number1, double numberDouble) {

        System.out.println("\nКомбинирование:");
        System.out.println(String.format("%s + %s = ", number1, numberDouble) + ((double) number1 + numberDouble));
        System.out.println(String.format("%s * %s = ", number1, numberDouble) + ((double) number1 * numberDouble));
        System.out.println(String.format("%s / %s = ", number1, numberDouble) + ((double) number1 / numberDouble));

    }

}
