package arrays;

/**
 * Demonstrates how to work with a 3D array in Java.
 * 
 * @author Kaden Leis
 * @version 1.0
 * @since 2025-05-05
 * @category Java, Arrays, Loops.
 * @description This program demonstrates how to create a 3D array.
 */

public class ThreeDArrayExample {
    public static void main(String[] args) {
        int[][][] cube = new int[2][2][2];

        int count = 1;

        // Loop through all dimensions of the 3D array and fill it with values.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    cube[i][j][k] = count++;
                    System.out.println("cube[" + i + "][" + j + "][" + k + "] = " + cube[i][j][k]);
                }
            }
        }
    }
}