/**
 * Main class to check if the number of elements in each row of a 2D array
 * matches the row number.
 */
public class Main {

    /**
     * Checks if the number of elements in each row of the given 2D array
     * matches the row number.
     *
     * @param arr the 2D array to check
     * @return true if the number of elements in each row matches the row number, false otherwise
     */
    public static boolean isRowNumberElementsEqual(int[][] arr) {
        // Iterate through each row of the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the length of the row matches the row number (i + 1)
            if (arr[i].length != i + 1) {
                return false; // Return false if any row does not match
            }
        }
        return true; // Return true if all rows match
    }

    /**
     * Main method to test the isRowNumberElementsEqual function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Define a 2D array with rows having increasing number of elements
        int[][] arr = {
            {1},
            {2, 3},
            {4, 5, 6},
            {7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20, 21}
        };

        // Print the result of the check
        System.out.format("The array's row number is %s to the number of elements in the row.", isRowNumberElementsEqual(arr) ? "equal" : "not equal");
    }
}
