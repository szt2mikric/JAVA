import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg a testsúlyát(Kg): ");
        double suly = scanner.nextDouble();

        System.out.println("Adja meg a magasságát(M):");
        double magassag = scanner.nextDouble();

        double magassagnegyzet = (magassag*magassag);

        double bmi = (suly/magassagnegyzet);

        System.out.println("A testtömeg Indexe:"+bmi);

    }
}
