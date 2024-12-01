public class Main {

    /**
     * This method calculates the sum of the surrounding elements for each element in a 2D array.
     * If the sum equals the element itself, it is added to the result array.
     *
     * @param arr the 2D array of integers
     * @return an array of integers where each element is equal to the sum of its surrounding elements
     */
    public static int[] getSurroundSumEquals(int[][] arr) {
        // Initialize the result array with the maximum possible size
        int[] equals = new int[arr.length * arr[0].length];
        int index = 0;
        int sum;

        // Iterate over each element in the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = 0;

                // Calculate the sum of surrounding elements based on the position of the element
                if (i == 0) {
                    if (j == 0) {
                        sum += arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j];
                    } else if (j == arr[i].length - 1) {
                        sum += arr[i][j - 1] + arr[i + 1][j - 1] + arr[i + 1][j];
                    } else {
                        sum += arr[i][j - 1] + arr[i][j + 1] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                    }
                } else if (i == arr.length - 1) {
                    if (j == 0) {
                        sum += arr[i][j + 1] + arr[i - 1][j + 1] + arr[i - 1][j];
                    } else if (j == arr[i].length - 1) {
                        sum += arr[i][j - 1] + arr[i - 1][j - 1] + arr[i - 1][j];
                    } else {
                        sum += arr[i][j - 1] + arr[i][j + 1] + arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1];
                    }
                } else {
                    if (j == 0) {
                        sum += arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j];
                    } else if (j == arr[i].length - 1) {
                        sum += arr[i - 1][j] + arr[i - 1][j - 1] + arr[i][j - 1] + arr[i + 1][j - 1] + arr[i + 1][j];
                    } else {
                        sum += arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j - 1] + arr[i][j + 1] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                    }
                }

                // If the sum equals the element, add it to the result array
                if (sum == arr[i][j]) {
                    equals[index++] = arr[i][j];
                }
            }
        }

        return equals;
    }

    /**
     * The main method to test the getSurroundSumEquals function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] array = {
            {1, 31, 3, 4, 5, 6, 33},
            {8, 9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 200, 26, 27, 28},
            {29, 30, 31, 32, 33, 34, 35},
            {36, 37, 38, 39, 40, 41, 42},
            {117, 44, 45, 209, 47, 48, 49}
        };

        // Call the getSurroundSumEquals function and store the result
        int[] equals = getSurroundSumEquals(array);

        // Print the result array
        for (int i = 0; i < equals.length; i++) {
            if (equals[i] == 0) {
                break;
            }
            System.out.print(equals[i] + " ");
        }
    }
}
