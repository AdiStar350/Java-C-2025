/**
 * Main class containing the methods to check the sum of elements in a 2D array.
 */
public class Main {

    /**
     * Checks if the sum of the last elements of each row in the array is equal to the sum of the rest of the elements.
     *
     * @param arr the 2D array to check
     * @return true if the sum of the last elements is equal to the sum of the rest, false otherwise
     */
    public static boolean isLastEqualsRest(int[][] arr) {
        // Initialize sums for the last elements and the rest of the elements
        int sumLast = 0, sumRest = 0;

        // Iterate through each row of the array
        for (int i = 0; i < arr.length; i++) {
            // Add the last element of the current row to sumLast
            sumLast += arr[i][arr.length - 1];

            // Iterate through the rest of the elements in the current row
            for (int j = 0; j < arr[i].length - 1; j++) {
                // Add the current element to sumRest
                sumRest += arr[i][j];
            }
        }

        // Return true if the sums are equal, false otherwise
        return sumLast == sumRest;
    }

    /**
     * Main method to test the isLastEqualsRest function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Initialize a 2D array with sample values
        int[][] arr = {
            {2, 1, 19},
            {6, 5, 11},
            {9, 8, 1}
        };

        // Print the result of the isLastEqualsRest function
        System.out.format("\nEvery row's last element's sum is %sequal to the sum of the rest.", (isLastEqualsRest(arr) ? "" : "not "));
    }
}
