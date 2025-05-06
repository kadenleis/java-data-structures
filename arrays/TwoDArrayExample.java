package arrays;

/**
 * Demonstrates how to work with a 2D array (matrix) in Java.
 * 
 * @author Kaden Leis
 * @version 1.0
 * @since 2025-05-05
 * @category Java, Arrays, Loops.
 * @description This program demonstrates how to create a 2D array (matrix), loop through the rows, print each value in the matrix.
 */

public class TwoDArrayExample {
    public static void main(String[] args) {
        // Create a 2D array (matrix) with 3 rows and 4 columns.
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        // Loop through the rows of the matrix.
        for (int i = 0; i < matrix.length; i++) {
            // Loop through the columns of the current row.
            for (int j = 0; j < matrix[i].length; j++) {
                // Print each element in the matrix.
                System.out.print(matrix[i][j] + " ");
            }
            // Print a new line after each row.
            System.out.println();
        }
    }
}
