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
        for (int i = 2; i < n; i++) {
            // Calculate the next number by adding the previous two numbers.
            int next = first + second;
            // Updating first;
            first = second;
            // Update the value of the 'second' variable for the next iteration.
            second = next;
            // Print the newly generated Fibonacci number.
            System.out.print(next + " ");
        }

        // Close the input scanner.
        input.close();
    }
}
