package tasks;

import java.util.Scanner;

import static tasks.BooleanOperations.comparisons;
import static tasks.DataOverflow.outputOverflow;
import static tasks.MathematicalOperations.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Получаем два числа от пользователя
        System.out.print("Введите первое число тип 'int' : ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число тип 'int' : ");
        int number2 = scanner.nextInt();
        System.out.print("Введите третье число тип 'double' через запятую, пример (1,1): ");
        double numberDouble = scanner.nextDouble();

        printAddition(number1, number2);
        printMultiplication(number1, number2);
        printSubtraction(number1, number2);
        printDivision(number1, number2);
        comparisons(number1, number2);
        outputOverflow(number1, number2);
        printCombinationDouble(number1, numberDouble);

    }

}
