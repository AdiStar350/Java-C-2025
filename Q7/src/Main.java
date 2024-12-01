/**
 * Main class containing methods to check digit values in a string.
 */
public class Main {

    /**
     * Checks if the string has digit values matching their counts.
     *
     * @param str the input string to check
     * @return true if each digit appears as many times as its value, false otherwise
     */
    public static boolean hasDigitValue(String str) {
        // Initialize an array to count occurrences of each digit
        int[] count = new int[10];

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is a digit
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                // Increment the count for the corresponding digit
                count[str.charAt(i) - '0']++;
            }
        }

        // Check if each digit appears as many times as its value
        for (int i = 0; i < count.length; i++) {
            if (count[i] != i) {
                return false;
            }
        }

        // Return true if all digits match their counts
        return true;
    }

    /**
     * Main method to test the hasDigitValue function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Test strings
        String str1 = "ABC0123456789";
        String str2 = "122333444455555666666777777788888888999999999";

        // Print results of hasDigitValue for test strings
        System.out.println(hasDigitValue(str1));
        System.out.println(hasDigitValue(str2));
    }
}
