public class Main {
    /**
     * Takes a number and gets the sum of its digits excluding
     * the first and last digits, called clean weight.
     * 
     * @param num (int)
     * @return (int)
     */
    public static int getCleanWeight(int num) {
        int cleanWeight = 0;
        num /= 10;

        while (num > 9) {
            cleanWeight += (num % 10);
            num /= 10;
        }

        return cleanWeight;
    }

    /**
     * Checks if the all the integers in the array have an
     * ascending clean weight.
     * 
     * @param arr (int[])
     * @return (boolean)
     * @complexity O(n * m)
     */
    public static boolean isCleanAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (getCleanWeight(arr[i]) >= getCleanWeight(arr[i + 1])) {
                return false;
            }
        }

        return true;
    }

    /**
     * Takes two arrays that are ascending clean weight,
     * displays all integers with distinct clean weight.
     * 
     * @param arr1 (int[])
     * @param arr2 (int[])
     * @complexity O(n * m)
     */
    public static void displayDistinctCleanWeight(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;

        while (i < arr1.length || j < arr2.length) {
            if (getCleanWeight(arr1[i]) == getCleanWeight(arr2[j])) {
                i++;
                j++;
            } else if (getCleanWeight(arr1[i]) < getCleanWeight(arr2[j])) {
                System.out.println(arr1[i]);
                i++;
            } else {
                System.out.println(arr2[j]);
                j++;
            }
        }
    }

    public static void main(String[] args) {
    }
}
