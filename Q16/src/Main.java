/**
 * Main class containing methods to check if an array of strings is ordered by length.
 */
public class Main {

    /**
     * Checks if the given array of strings is ordered by length.
     *
     * @param strs the array of strings to check
     * @return true if the array is ordered by length, false otherwise
     */
    public static boolean isOrderedByLength(String[] strs) {
        // Iterate through the array
        for (int i = 0; i < strs.length - 1; i++) {
            // Check if the current string is longer than the next string
            if (strs[i].length() > strs[i + 1].length()) {
                return false; // Return false if the order is violated
            }
        }
        return true; // Return true if the array is ordered by length
    }

    /**
     * Main method to test the isOrderedByLength function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Define an array of strings
        String[] strs = {"try", "test", "flow", "flight", "flower", "encounter", "encountered"};

        // Print whether the array is ordered by length
        System.out.format("\nThe array is %sordered by length\n", isOrderedByLength(strs) ? "" : "not ");
    }
}
