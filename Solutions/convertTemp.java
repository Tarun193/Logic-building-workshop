import java.util.Scanner;

public class convertTemp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a temperature in Celsius
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        // Double is used to store decimal value.
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result to the user
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        // close the input
        input.close();
    }
}
