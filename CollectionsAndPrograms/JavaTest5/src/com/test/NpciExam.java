package com.test;
import java.util.Scanner;

public class NpciExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input N
        int N = scanner.nextInt();

        // Calculate and print the minimum number of operations
        int minOperations = calculateMinOperations(N);
        System.out.println(minOperations);

        // Close the scanner
        scanner.close();
    }

    static int calculateMinOperations(int N) {
        int operations = 0;

        while (N > 1) {
            // Find the highest divisor less than N
            int highestDivisor = findHighestDivisor(N);

            // If a divisor is found, divide N by it
            if (highestDivisor > 0) {
                N /= highestDivisor;
            } else {
                // If no divisor is found, subtract 1
                N -= 1;
            }
            operations++;
        }

        return operations;
    }

    // Function to find the highest divisor less than N
    static int findHighestDivisor(int N) {
        for (int i = N - 1; i > 1; i--) {
            if (N % i == 0) {
                return i;
            }
        }
        return 0; // If no divisor is found
    }
}
