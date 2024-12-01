/**
 * Main class to demonstrate displaying a 2D array by columns.
 */
public class Main {

    /**
     * Displays the elements of a 2D array column by column.
     *
     * @param arr the 2D array to be displayed
     */
    public static void displayByColumn(int[][] arr) {
        // Loop through each column
        for (int i = 0; i < arr[0].length; i++) {
            // Print the column number
            System.out.format("\nColumn %d: ", (i + 1));

            // Loop through each row in the current column
            for (int j = 0; j < arr.length; j++) {
                // Print the element at the current row and column
                System.out.print(arr[j][i] + " ");
            }

            // Print a newline after each column
            System.out.println();
        }
    }

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize a 2D array with sample data
        int[][] arr = {
            {1, 2, 3, 7},
            {4, 5, 3, 8},
            {7, 8, 9, 9}
        };

        // Call the method to display the array by columns
        displayByColumn(arr);
    }
}
