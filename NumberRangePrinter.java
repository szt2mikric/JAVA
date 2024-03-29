import java.util.Scanner;

public class NumberRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (secondNumber <= firstNumber) {
            System.out.println("The second number should be bigger");
        } else {
            System.out.println("Integers between " + firstNumber + " and " + secondNumber + ":");
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}