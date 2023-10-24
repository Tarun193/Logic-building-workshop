/*
 * A Caesar cipher is a simple method of encoding messages. Caesar ciphers use a substitution method where letters in the alphabet are shifted by some fixed number of spaces to yield an encoding alphabet.
 * 
 * For sake of simplicity we will replace character with it's next alphabet character.
 * for examlpe  a -> b, b -> c, c -> d, ...., z -> a
 * So, String 'mom' -> 'npn' (encrypted version);
 * 
 * Approch:
 * Itreate through each charcter and just replace it with charcter next to it alphabatically 
 */

public class Cipher {
    public static String encrypt(String message) {
        // Encrpyted String
        String encryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            // getting current character;
            char currentChar = message.charAt(i);
            // Checking if the current caracter is a letter or not, i.e. is from a-z or A-Z.
            if (Character.isLetter(currentChar)) {
                // Now each character has it assci number, eg. a -> 97, 97+1 = 98, 98 -> b;
                char newChar = (char) (currentChar + 1); // this will return next alphabatic character

                // If the new character is greater than 'z' that is 'z' + 1, and we are
                // replacing 'z' with 'a';
                if (newChar > 'z') {
                    newChar = 'a';
                    // Uppercase, A -> 65 condition for lower case
                } else if (newChar > 'Z' && newChar < 'a') {
                    newChar = 'A';
                }
                encryptedMessage += newChar;
            } else {
                encryptedMessage += currentChar;
            }
        }
        return encryptedMessage;
    }

    public static String decode(String message) {
        // Encrpyted String
        String decodedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            // getting current character;
            char currentChar = message.charAt(i);
            // Checking if the current caracter is a letter or not, i.e. is from a-z or A-Z.
            if (Character.isLetter(currentChar)) {
                // Now each character has it assci number, eg. b -> 98, 98-1 = 97, 97 -> a;
                char newChar = (char) (currentChar - 1); // this will return next alphabatic character

                // If the new character is less than 'a' that is 'a' - 1, and we are
                // replacing 'a' with 'z';
                if (newChar < 'A') {
                    newChar = 'Z';
                    // Uppercase, A -> 65 condition for lower case
                } else if (newChar < 'a' && newChar > 'Z') {
                    newChar = 'z';
                }
                decodedMessage += newChar;
            } else {
                decodedMessage += currentChar;
            }
        }
        return decodedMessage;
    }

    public static void main(String[] args) {
        String message = "hello worldA";
        String encryptedMessage = Cipher.encrypt(message);
        String decodedMessage = Cipher.decode(encryptedMessage);

        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decoded message: " + decodedMessage);
    }

}
