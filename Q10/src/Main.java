/**
 * Main class to find the day with the maximum temperature.
 */
public class Main {

    /**
     * Finds the index of the day with the maximum temperature.
     *
     * @param temp 2D array of temperatures for each hour of each day.
     * @return the index of the day with the maximum temperature.
     */
    public static int getMaxTempIndex(int[][] temp) {
        int maxTempIndex = 0, maxTemp = 0;

        // Iterate through each day
        for (int i = 0; i < temp.length; i++) {
            // Iterate through each hour of the day
            for (int j = 0; j < temp[i].length; j++) {
                // Check if the current temperature is greater than the max temperature found so far
                if (temp[i][j] > maxTemp) {
                    maxTemp = temp[i][j];
                    maxTempIndex = i;
                }
            }
        }

        return maxTempIndex;
    }

    /**
     * Main method to generate random temperatures and find the day with the maximum temperature.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int[][] temp = new int[7][24];

        // Generate random temperatures for each hour of each day
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j] = (int) (Math.random() * 81 - 40);
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nThe max temperature was measured on: ");

        // Determine the day with the maximum temperature and print it
        switch (getMaxTempIndex(temp)) {
            case 0:
                System.out.println("Sunday.");
                break;
            case 1:
                System.out.println("Monday.");
                break;
            case 2:
                System.out.println("Tuesday.");
                break;
            case 3:
                System.out.println("Wednesday.");
                break;
            case 4:
                System.out.println("Thursday.");
                break;
            case 5:
                System.out.println("Friday.");
                break;
            default:
                System.out.println("Saturday.");
                break;
        }
    }
}
