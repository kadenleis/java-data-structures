package arrays;

/**
 * Demonstrates how to store objects in an array.
 * 
 * Author: Kaden Leis
 * Version: 1.0
 * Since: 2025-05-05
 * Category: Java, Arrays, Objects
 * Description: Uses a simple Student class inside an array.
 */
public class ObjectArrayExample {

    // Basic class that represents a student
    static class Student {
        String name;
        int id;

        Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Kaden", 101),
            new Student("Johnny", 102)
        };

        // Loop through the student array and print their details
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", ID: " + s.id);
        }
    }
}
