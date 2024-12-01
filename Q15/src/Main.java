// Import the Scanner.
import java.util.Scanner;

public class Main {
    // Create a new Scanner object.
    static Scanner input = new Scanner(System.in);

    // Create a function that returns if a string is a palindrome.
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Declare the variables.
        String str; // -> A string as input from the user.

        // Get input from the user -> A string.
        System.out.print("Please enter a string: ");
        str = input.nextLine();

        // Find out if the string is a palindrome or not and print it out.
        System.out.println("\nThe string: '" + str + "' is " + (isPalindrome(str) ? "" : "not ") + "a palindrome.");
    }
}