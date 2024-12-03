/**
 * Main class containing methods to check for prime numbers and prime twins.
 */
public class Main {
    
    /**
     * Checks if a number is prime.
     * 
     * @param n the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        // If the number is less than 2, it is not prime
        if (n < 2) {
            return false;
        }

        // Check for factors from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            // If a factor is found, the number is not prime
            if (n % i == 0) {
                return false;
            }
        }

        // If no factors are found, the number is prime
        return true;
    }

    /**
     * Checks if the array contains any prime twins.
     * 
     * @param arr the array to check
     * @return true if the array contains prime twins, false otherwise
     */
    public static boolean hasPrimeTwins(int[] arr) {
        // Initialize a flag to indicate if prime twins are found
        boolean found = false;

        // Iterate through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the current and next elements are prime twins
            if (isPrime(arr[i]) && isPrime(arr[i + 1]) && Math.abs(arr[i] - arr[i + 1]) == 2) {
                // Print the pair of prime twins
                System.out.format("\nThe pair of prime twins is: %d, %d\n", arr[i], arr[i + 1]);
                // Set the flag to true
                found = true;
            } 
        }

        // Return the flag indicating if prime twins are found
        return found;
    }
    
    /**
     * Main method to test the prime twins functionality.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Define an array of integers
        int[] arr = {11, 13, 21, 3, 5, 7};
        // Check if the array has prime twins
        boolean found = hasPrimeTwins(arr);

        // Print the result
        System.out.println("\nHas prime twins? " + found);
    }
}
