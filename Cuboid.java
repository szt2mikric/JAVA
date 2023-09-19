import java.util.Scanner;

public class CuboidCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the cuboid: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the cuboid: ");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the cuboid: ");
        double height = scanner.nextDouble();

        
        double surfaceArea = 2 * ((length * width) + (length * height) + (width * height));

      
        double volume = length * width * height;

        System.out.println("Surface Area of the Cuboid: " + surfaceArea);
        System.out.println("Volume of the Cuboid: " + volume);

        scanner.close();
    }
}
