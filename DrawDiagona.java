import java.util.Scanner;

public class DrawDiagona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the square size: ");
        int size = scanner.nextInt();
        
        if (size <= 0) {
            System.out.println("Square size must be a positive integer.");
        } else {
            drawDiagonalSquare(size);
        }
        
        scanner.close();
    }
    
    public static void drawDiagonalSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1 || i == j) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}