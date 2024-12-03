/**
 * Main class containing methods to check if all letters from A to Z are present in an array of strings.
 */
public class Main {

    /**
     * Checks if all letters from A to Z are present in the given array of strings.
     *
     * @param strs the array of strings to check
     * @return true if all letters from A to Z are present, false otherwise
     */
    public static boolean hasAllLetters(String[] strs) {
        // Concatenate all strings in the array
        String joined = "";
        
        for (int i = 0; i < strs.length; i++) {
            joined += strs[i];
        }

        // Check for each letter from A to Z
        for (char c = 'A'; c <= 'Z'; c++) {
            if (joined.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }

    /**
     * Main method to test the hasAllLetters function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Define an array of strings to test
        String[] strs = {"ABCDEFG", "HIJKHJGDCRTYDC", "LN", "OPQRABF", "SKJHT", "UBVKWIXYZ"};

        // Print the result of the hasAllLetters function
        System.out.format("\nHas all letters? %b", hasAllLetters(strs));
    }
}
