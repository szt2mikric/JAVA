import java.util.Scanner;

public class ChessTableDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the chess table size: ");
        int size = scanner.nextInt();
        
        if (size <= 0) {
            System.out.println("Chess table size must be a positive integer.");
        } else {
            drawChessTable(size);
        }
        
        scanner.close();
    }
    
    public static void drawChessTable(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}