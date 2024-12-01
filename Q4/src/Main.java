import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    /**
     * Finds the maximum character in a string.
     * 
     * @param str the input string
     * @return the maximum character in the string
     */
    public static char getMaxChar(String str) {
        char maxChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > maxChar) {
                maxChar = str.charAt(i);
            }
        }

        return maxChar;
    }

    /**
     * Generates a random string of uppercase letters of given length.
     * 
     * @param num the length of the string to generate
     * @return the generated random string
     */
    public static String getString(int num) {
        String str = "";

        for (int i = 0; i < num; i++) {
            str += (char)(Math.random() * 26 + 'A');
        }

        return str;
    }

    public static void main(String[] args) {
        int num;
        String str;

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        num = input.nextInt();

        // Generate a random string of the given length
        str = getString(num);
        System.out.println("Random string: " + str);

        // Find and print the maximum character in the generated string
        System.out.println("Max character: " + getMaxChar(str));
    }
}
