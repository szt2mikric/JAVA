import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the triangle height: ");
        int height = scanner.nextInt();
        
        if (height <= 0) {
            System.out.println("Triangle height must be a positive integer.");
        } else {
            drawTriangle(height);
        }
        
        scanner.close();
    }
    
    public static void drawTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
