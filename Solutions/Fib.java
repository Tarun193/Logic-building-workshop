/* The program prints first 'n' numbers of Fibonacci Series. 
 * The Fibonacci sequence is a type series where each number is the sum of the two that precede it.
 * 
*/

import java.util.Scanner;

public class Fib {
    public static void main(String args[]) {
        // Create a scanner object for reading user inputs.
        Scanner input = new Scanner(System.in);

        // Ask the user for the value of 'n' (the number of Fibonacci numbers to
        // generate).
        System.out.println("Enter the value of n:");
        int n = input.nextInt();

        // Initialize the first two numbers of the Fibonacci series.
        int first = 0;
        int second = 1;

        // Print the first and second numbers since they are fixed in the series.
        System.out.print(first + " ");
        System.out.print(second + " ");

        // Generate and print the next (n-2) numbers in the series.
        for (int i = 0; i < n - 2; i++) {
            // Store the current 'second' value in a temporary variable.
            int temp = second;
            // Calculate the next number by adding the previous two numbers.
            second = first + second;
            // Update the value of the 'first' variable for the next iteration.
            first = temp;
            // Print the newly generated Fibonacci number.
            System.out.print(second + " ");
        }

        // Close the input scanner.
        input.close();
    }
}
