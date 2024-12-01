import java.util.Scanner;

/**
 * The Main class contains methods to find and print mutual divisors of two numbers.
 */
public class Main {
    // Create a static Scanner object for user input
    static Scanner input = new Scanner(System.in);

    /**
     * Prints the mutual divisors of two given numbers.
     *
     * @param x the first number
     * @param y the second number
     */
    public static void getMutualDivisors(int x, int y) {
        // Loop through numbers from 1 to the smaller of x and y
        for (int i = 1; i <= x && i <= y; i++) {
            // Check if i is a divisor of both x and y
            if (x % i == 0 && y % i == 0) {
                // Print the divisor
                System.out.print(i + " ");
            }
        }
    }

    /**
     * The main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)  {
        // Declare variables for user input
        int x, y;

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number from user input
        x = input.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number from user input
        y = input.nextInt();

        // Get and print the mutual divisors of the two numbers
        getMutualDivisors(x, y);
    }
}
