

import java.util.Scanner;

public class Sum {

    // Define a main method, which is the entry point of the program
    public static void main(String[] args) {
        // Creating a scanner object for scanning user inputs.
        Scanner input = new Scanner(System.in);

        // Scanning user input numbers and storing them in variables.
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();

        // Declare an integer variable to hold the sum of the two numbers
        int sum;

        // Add the two numbers and store the result in the sum variable
        sum = num1 + num2;

        // Print out the sum to the console
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        input.close();
    }
}
