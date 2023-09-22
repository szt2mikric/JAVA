import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the diamond height: ");
        int height = scanner.nextInt();

        if (height % 2 == 0) {
            System.out.println("Diamond height must be an odd integer.");
        } else {
            drawDiamond(height);
        }

        scanner.close();
    }

    public static void drawDiamond(int height) {
        int n = (height + 1) / 2; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
