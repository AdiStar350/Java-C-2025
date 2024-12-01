public class Main {

    /**
     * Scrambles the elements of a given 2D array.
     *
     * @param arr the 2D array to be scrambled
     * @return a new 2D array with scrambled elements
     */
    public static int[][] scrambleMatrix(int[][] arr) {
        // Initialize indices and arrays for scrambled matrix and used positions
        int indexI = 0, indexJ = 0;
        int[][] scrambled = new int[arr.length][arr[0].length];
        int[][] usedCounter = new int[arr.length][arr[0].length];

        // Iterate over each element in the original array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Find a random unused position in the scrambled array
                do {
                    indexI = (int) (Math.random() * arr.length);
                    indexJ = (int) (Math.random() * arr[i].length);
                } while (usedCounter[indexI][indexJ] != 0);
                
                // Mark the position as used and assign the value
                usedCounter[indexI][indexJ]++;
                scrambled[i][j] = arr[indexI][indexJ]; 
            }
        }

        // Return the scrambled array
        return scrambled;
    }

    /**
     * Main method to test the scrambleMatrix function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] arr = {
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28},
            {29, 30, 31, 32, 33, 34, 35},
            {36, 37, 38, 39, 40, 41, 42},
            {43, 44, 45, 46, 47, 48, 49}
        };

        // Scramble the array
        int[][] scrambled = scrambleMatrix(arr);

        // Print the scrambled array
        for (int i = 0; i < scrambled.length; i++) {
            for (int j = 0; j < scrambled[i].length; j++) {
                System.out.print(scrambled[i][j] + " ");
            }
            System.out.println();
        }
    }
}
