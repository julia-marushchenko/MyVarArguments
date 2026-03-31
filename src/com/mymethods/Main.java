/**
 *  Java program to demonstrate methods with variable arguments.
 */

package com.mymethods;

/**
 *  Main class.
 */
public class Main {

    // Method to calculate sum of elements.
    public  static int sum(int ... number) {

        // Declaring sum variable.
        int sum = 0;

        // Iterating through arguments.
        for (int index = 0; index < number.length; index++) {

            // Adding elements.
            sum += number[index];

        }

        return sum;
    }

    // JVM entry point.
    public static void main(String[] args) {

        // Calling method with 2 arguments and printing the result.
        System.out.println(sum(2, 3)); // Output:

        // Calling method with 4 arguments and printing the result.
        System.out.println(sum(1, 3, 5, 7)); // Output:

        // Calling method with 6 arguments and printing the result.
        System.out.println(sum(0, 4, 6, 8, 9, 1)); // Output:

    }
}