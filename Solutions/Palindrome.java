import java.util.Scanner;

/*
 * Approch: Let's consider a palindrome: repaper
 * 
 * if 
 * - first character is equals to last character, 
 * - second charater is equal to second last caracter
 * - so on until we reach the middle character
 * then we can say string is palindrome.
 * 
 * we can keep our first pointer to first index and second pointer to last index
 * we can check if they are equal we can more first pointer to one step ahead 
 * and second pointer to one step back
 * 
 * if we find any of the case false we just break the loop and return false;
 * 
 * Example: repaper
 * i = 0 , j = 6
 * str[0] = r , str[6] = r (r == r) -> True 
 * 
 * i = 1 , j = 5
 * str[1] = e , str[5] = e (e == e) -> True
 * 
 * i = 2 , j = 4
 * str[2] = p , str[4] = p (p == p) -> True  
 * 
 * Now i = 3, j = 3, this going to be equal no need check this, as both have same index
 * 
 * - first character == last character
 * - second character ==  second last character
 * - third character == third last character
 *  all these are true,hence the string palindrome.
 * 
 * we will check if first and last character is equals
 * 
 * Note: we are here converting string to lower case becasue,in case of Repaper,  R == r (false),
 *  so we want all character of same case.
 * 
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        sc.close();
        // Check if the string is a palindrome
        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void basic(String str) {
        // just reverse the string and check if the actual string and reversed string is
        // equal;
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        // Print the result
        if (reversedStr.equalsIgnoreCase(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
