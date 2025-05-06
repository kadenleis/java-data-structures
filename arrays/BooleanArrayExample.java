package arrays;

/**
 * Demonstrates how to use a boolean array in Java.
 * 
 * Author: Kaden Leis
 * Version: 1.0
 * Since: 2025-05-05
 * Category: Java, Arrays, Booleans
 * Description: Shows a boolean array in action, like toggles or flags.
 */
public class BooleanArrayExample {
    public static void main(String[] args) {
        boolean[] toggles = {true, false, true};

        // Print ON or OFF depending on the value
        for (int i = 0; i < toggles.length; i++) {
            System.out.println("Toggle " + i + ": " + (toggles[i] ? "ON" : "OFF"));
        }
    }
}
