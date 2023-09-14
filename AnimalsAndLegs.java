import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a csirkék számát: ");
        int csirke = scanner.nextInt();

        System.out.print("Add meg a malacok számáz: ");
        int malac = scanner.nextInt();


        int ossz = (csirke * 2) + (malac * 4);


        System.out.println("Total number of legs for all animals: " + ossz);


        scanner.close();

    }
}
