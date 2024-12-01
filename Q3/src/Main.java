import java.util.Scanner;

/**
 * Main class to find the maximum digit in a given number.
 */
public class Main {
    /**
     * Scanner object to take input from the user.
     */
    static Scanner input = new Scanner(System.in);

    /**
     * Returns the maximum digit in the given number.
     *
     * @param num the number to find the maximum digit in
     * @return the maximum digit in the number
     */
    public static int getMaxDigit(int num) {
        int max = 0;

        // Loop through each digit of the number
        while (num > 0) {
            int digit = num % 10;
            if (digit > max) {
                max = digit;
            }
            num /= 10;
        }
        
        return max;
    }

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        // Print the maximum digit in the given number
        System.out.println("The maximum digit in " + num + " is " + getMaxDigit(num));
    }
}
