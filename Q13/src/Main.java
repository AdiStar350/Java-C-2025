public class Main {

    /**
     * Scrambles the given 2D character array by filling it with random uppercase letters,
     * ensuring no letter is repeated.
     *
     * @param arr the 2D character array to be scrambled
     * @return a new 2D character array filled with random uppercase letters
     */
    public static char[][] scrambleArr(char[][] arr) {
        // Array to keep track of the count of each letter used
        int[] usedCount = new int[26];
        // Array to store the scrambled characters
        char[][] scrambled = new char[arr.length][arr[0].length];
        // Generate a random character to exclude initially
        char randomChar = (char) (Math.random() * 26 + 'A');

        // Print the excluded character
        System.out.println("Excluded: " + randomChar);
        // Mark the excluded character as used
        usedCount[randomChar - 'A']++;

        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Generate a new random character until an unused one is found
                do { 
                    randomChar = (char) (Math.random() * 26 + 'A');
                } while (usedCount[randomChar - 'A'] != 0);

                // Mark the character as used and assign it to the scrambled array
                usedCount[randomChar - 'A']++;
                scrambled[i][j] = randomChar;
            }
        }

        // Return the scrambled array
        return scrambled;
    }

    /**
     * The main method to test the scrambleArr function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Initialize a 5x5 character array
        char[][] arr = new char[5][5];
        // Scramble the array
        char[][] scrambled = scrambleArr(arr);

        // Print the scrambled array
        for (int i = 0; i < scrambled.length; i++) {
            for (int j = 0; j < scrambled[i].length; j++) {
                System.out.print(scrambled[i][j] + " ");
            }
            System.out.println();
        }
    }
}
