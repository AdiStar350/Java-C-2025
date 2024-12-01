import java.util.Scanner;

/**
 * The Main class contains methods to generate a random string and find the most frequent character in it.
 */
public class Main {
    // Create a static Scanner object for user input
    static Scanner input = new Scanner(System.in);

    /**
     * Finds the most frequent character in a given string.
     *
     * @param str the input string
     * @return the most frequent characters in the string
     */
    public static char[] getMostFrequent(String str) {
        // Array to store frequency of each character
        int[] freq = new int[26];
        // Variable to store the maximum frequency
        int maxFreq = 0;
        // Index to keep track of the position in the result array
        int index = 0;
        // Array to store the most frequent characters
        char[] mostFrequentChar = new char[str.length()];

        // Calculate frequency of each character
        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'A']++;
        }

        // Find the maximum frequency
        for(int i = 0; i < freq.length; i++) {
            if (freq[i] >= maxFreq) {
                maxFreq = freq[i];
            }
        }

        // Collect all characters with the maximum frequency
        for(int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                mostFrequentChar[index] = (char) (i + 'A');
                index++;
            }
        }

        return mostFrequentChar;
    }

    /**
     * Generates a random string of a given length.
     *
     * @param num the length of the string
     * @return the randomly generated string
     */
    public static String getString(int num) {
        // Initialize an empty string
        String str = "";

        // Generate random characters and append to the string
        for (int i = 0; i < num; i++) {
            str += (char) (Math.random() * 26 + 'A');
        }

        return str;
    }

    /**
     * The main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int num;
        String str;
        char[] mostFrequentChars;

        // Prompt user for the number of characters
        System.out.print("Enter the number of characters: ");
        num = input.nextInt();

        // Generate a random string of the specified length
        str = getString(num);
        System.out.println("Randomly generated string: " + str);

        // Find the most frequent characters in the string
        mostFrequentChars = getMostFrequent(str);

        // Print the most frequent characters
        System.out.print("Most frequent character(s): ");
        for(int i = 0; i < mostFrequentChars.length; i++) {
            if (mostFrequentChars[i] != '\u0000') {
                System.out.print(mostFrequentChars[i] + " ");
            }
        }
    }
}
