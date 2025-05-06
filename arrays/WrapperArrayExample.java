package arrays;

/**
 * Demonstrates arrays using wrapper types like Integer.
 * 
 * Author: Kaden Leis
 * Version: 1.0
 * Since: 2025-05-05
 * Category: Java, Arrays, Wrappers
 * Description: Uses Integer[] instead of int[] to take advantage of objects.
 */
public class WrapperArrayExample {
    public static void main(String[] args) {
        Integer[] scores = {90, 85, 100};

        int total = 0;

        // Add up all the scores
        for (Integer score : scores) {
            total += score;
        }

        System.out.println("Total score: " + total);
    }
}
