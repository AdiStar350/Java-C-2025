/**
 * Main class containing methods to check if any string in an array is contained within another string.
 */
public class Main {

    /**
     * Checks if any string in the array is contained within another string.
     *
     * @param strs the array of strings to check
     * @return true if any string is contained within another string, false otherwise
     */
    public static boolean isContainedArr(String[] strs) {
        // Initialize result as false
        boolean r = false;

        // Iterate over each string in the array
        for (int i = 0; i < strs.length; i++) {
            // Compare the current string with every other string in the array
            for (int j = i + 1; j < strs.length; j++) {
                // Check if the current string contains the other string
                if (strs[i].contains(strs[j])) {
                    // Print the result and set r to true
                    System.out.format("\n%s is contained in %s", strs[j], strs[i]);
                    r = true;
                // Check if the other string contains the current string
                } else if (strs[j].contains(strs[i])) {
                    // Print the result and set r to true
                    System.out.format("\n%s is contained in %s", strs[i], strs[j]);
                    r = true;
                }
            }
        }

        // Return the result
        return r;
    }

    /**
     * Main method to execute the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Initialize an array of strings
        String[] strs = {"flower", "flow", "flight", "light", "lighter", "flowchart"};
        // Check if any string is contained within another string
        boolean r = isContainedArr(strs);

        // Print the final result
        System.out.format("\n\nResult: %b", r);
    }
}
