package arrays;

/**
 * Demonstrates how jagged arrays work in Java.
 * 
 * Author: Kaden Leis
 * Version: 1.0
 * Since: 2025-05-05
 * Category: Java, Arrays, Jagged
 * Description: Each row can have a different length in a jagged array.
 */
public class JaggedArrayExample {
    public static void main(String[] args) {
        int[][] jagged = {
            {1, 2, 3},
            {4, 5},
            {6}
        };

        // Print out each value, even though rows have different lengths
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println(); // separate rows visually
        }
    }
}
