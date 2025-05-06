package arrays;

/**
 * Basic array operations in Java
 * 
 * @author Kaden Leis
 * @version 1.0
 * @since 2025-05-05
 * @category Java, Arrays, Loops.
 * @description This program demonstrates how to create an array, loop through it, and find the maximum value.
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 17, 23, -5, 101};

        // Loop through the array and print each number.
        // Good way to double-check what's inside the array!
        for (int num:numbers) {
            System.out.println("Element: " + num);
        }
        // Start by assuming the first element is the max.
        int max = numbers[0];
        // Go through the rest of the array to find the actual max.
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; }}
        // Print out the highest number found in the array
        System.out.println("Max value: " + max);
    }
}
