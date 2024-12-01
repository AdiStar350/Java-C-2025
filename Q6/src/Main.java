public class Main {

    /**
     * Calculates the number of grades within a specified range.
     *
     * @param arr   the array of grades
     * @param grade the grade to calculate the range around
     * @return the count of grades within the range
     */
    public static int getGradeRange(int[] arr, int grade) {
        // Define the minimum and maximum range
        int min = grade - 5, max = grade + 5;
        int count = 0;

        // Iterate through the array and count grades within the range
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                count++;
            }
        }

        // Return the count of grades within the range
        return count;
    }

    public static void main(String[] args) {
        // Initialize an array to hold grades
        int[] arr = new int[200];
        int count, grade;

        // Populate the array with random grades between 0 and 100
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
        }

        // Print the grades
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Generate a random grade between 5 and 95
        grade = (int) (Math.random() * 91 + 5);

        // Get the count of grades within the specified range
        count = getGradeRange(arr, grade);

        // Print the result
        System.out.println("\nNumber of students in the grade range of " + (grade - 5) + " - " + (grade + 5) + ": " + count);
    }
}
