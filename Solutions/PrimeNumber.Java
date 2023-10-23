/*
 * Define: a whole number greater than 1 that cannot be exactly divided by any whole number other than 
 * itself and 1 (e.g. 2, 3, 5, 7, 11).
 * "prime numbers are very useful in cryptography"
 * 
 * Approch:
 * We can check if a number is prime by checking if it is divisible by any number
 * between 2 and number (itself) exculding.
 * 
 * Example: Number = 11
 * we will check if number is divisible by (2,3,4,5,6,7,8,9,10), if it is
 * not divisible by any of these number then it is prime.
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        // Initially we are considering the given number is prime.
        boolean isPrime = true;

        // Then we will loop throught all the numbers between 2 and number itself (excluding).
        for (int i = 2; i < num; i++) {
            // If we found out that the number is divisible by a number, that lies between the range 2 and itself (excluding). Then we we will mark the number as non prime.
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        // All the number are less than 2 are non prime.
        if (num <= 1) {
            isPrime = false;
        }

        // At last printing the message according to the result.
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

// There is an effective way of doing it, we will discuss that here.