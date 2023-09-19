import java.util.Scanner;

public class ConditionVariableMutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, credits, d, time;
        boolean isBonus;

        
        System.out.print("Please enter an integer as variable 'a': ");
        a = scanner.nextInt();

        
        System.out.print("Please enter an integer between 0 and 30 as variable 'b': ");
        b = scanner.nextInt();

        System.out.print("Please enter an integer between 0 and 100 as variable 'credits': ");
        credits = scanner.nextInt();

        System.out.print("Please enter a boolean (true/false) as variable 'isBonus': ");
        isBonus = scanner.nextBoolean();

        System.out.print("Please enter an integer between 0 and 50 as variable 'd': ");
        d = scanner.nextInt();

        System.out.print("Please enter an integer between 0 and 500 as variable 'time': ");
        time = scanner.nextInt();

        int output1 = 0;
        String output2 = "";
        int output3 = 0;
        String output4 = "";

        if (a % 2 == 0) {
            output1++;
        }

        if (b >= 10 && b <= 20) {
            output2 = "Sweet!";
        } else if (b < 10) {
            output2 = "Less!";
        } else if (b > 20) {
            output2 = "More!";
        }

        if (!isBonus) {
            if (credits >= 50) {
                output3 -= 2;
            } else if (credits < 50) {
                output3--;
            }
        }

        if (d % 4 == 0 && time <= 200) {
            output4 = "Check";
        } else if (time > 200) {
            output4 = "Time out";
        } else {
            output4 = "Run Forest Run!";
        }

        System.out.println("Output 1: " + output1);
        System.out.println("Output 2: " + output2);
        System.out.println("Output 3: " + output3);
        System.out.println("Output 4: " + output4);

        scanner.close();
    }
}
