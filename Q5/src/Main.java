/**
 * The Main class contains methods to generate random grades and display their distribution.
 */
public class Main {
    /**
     * Displays the distribution of grades in ranges of 10.
     *
     * @param grades an array of integer grades
     */
    public static void displayGrades(int[] grades) {
        // Array to count occurrences of each grade
        int[] count = new int[101];
        int min = 0, max = 9;
        int range;

        // Count occurrences of each grade
        for (int i = 0; i < grades.length; i++) {
            count[grades[i]]++;
        }

        // Display the count of grades in ranges of 10
        while (max < 100) {
            range = 0;
            System.out.printf("%4d - %4d | ", min, max);

            for (int i = min; i <= max; i++) {
                range += count[i];
            }

            System.out.printf("%2d\n", range);

            min += 10;
            max += 10;
        }

        // Display the count of grades that are exactly 100
        System.out.printf("%11d | %2d\n", 100, count[100]);
    }

    /**
     * Generates random grades between 0 and 100.
     *
     * @param grades an array to store the generated grades
     * @return the array with generated grades
     */
    public static int[] getRandomGrades(int[] grades) {
        // Generate random grades
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) (Math.random() * 101);
        }

        return grades;
    }

    /**
     * The main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Initialize an array to store grades
        int[] grades = new int[200];
        // Generate random grades
        grades = getRandomGrades(grades);
        // Display the distribution of grades
        displayGrades(grades);
    }
}
