package tasks;

public class DataOverflow {

    public static void outputOverflow(int number1, int number2) {

        System.out.println("\nПереполнение пример:");
        System.out.println("2147483647 + " + number1);
        System.out.println("-2147483648 + " + number2);

    }

}
