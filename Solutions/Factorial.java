import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        // Initialize the factorial to 1
        int factorial = 1;

        // Calculate the factorial using a loop
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println(n + "! = " + factorial);

        // close the input;
        input.close();
    }
}
