import java.util.Scanner;

class OddEven {
    public static void main(String args[]) {
        // Creating a scanner object for scanning user inputs.
        Scanner input = new Scanner(System.in);

        // Scanning user input number and storing it in variable.
        System.out.println("Enter the number:");
        int num = input.nextInt();

        // Now, a number is even if it is divisible by 2
        // means if we divide that number by 2, then the remainder will be zero.
        // example: 6 / 2 = 3, remainder = 0. 6 % 2 = 0, as '%'
        // modulo operator return remainder.
        int isEven = num % 2;

        if (isEven == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // Closing the input.
        input.close();
    }
}