package arrays;

/**
 * Demonstrates how to use a char array in Java.
 * 
 * Author: Kaden Leis
 * Version: 1.0
 * Since: 2025-05-05
 * Category: Java, Arrays, Characters
 * Description: Prints out each letter from a word using a char array.
 */
public class CharArrayExample {
    public static void main(String[] args) {
        char[] letters = {'H', 'e', 'l', 'l', 'o'};

        // Print each character in a single line
        for (char c : letters) {
            System.out.print(c);
        }

        System.out.println(); // move to the next line
    }
}
