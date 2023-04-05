package tasks;

public class DataOverflow {

    public static void outputOverflow(int number, int number4) {

        System.out.println("\nПереполнение пример:");
        System.out.println(("2147483647 + " + number + " = ") + (2147483647 + number));
        System.out.println(("-2147483647 + " + number4 + " = ") + (-2147483647 + number4));

    }

}
