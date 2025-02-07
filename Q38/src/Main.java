public class Main {
    /**
     * Checks if 2 numbers are permutations of one another.
     * 
     * @param num1 (int)
     * @param num2 (int)
     * @return (boolean)
     * @complexity O(n)
     */
    public static boolean isPerm(int num1, int num2) {
        int[] count = new int[9];

        if (num1 == num2) {
            return false;
        }

        while (num1 > 0) {
            count[num1 % 10 - 1]++;
            num1 /= 10;
        }

        while (num2 > 0) {
            count[num2 % 10 - 1]--;
            num2 /= 10;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if a 2D array is permutation array.
     * 
     * @param arr (int[])
     * @return (boolean)
     * @complexity O(n * m * x^2)
     */
    public static boolean isPermArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (!isPerm(arr[i][j], arr[i][k])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPerm(312, 123));
        System.out.println(isPerm(3214, 1234));
        System.out.println(isPerm(1323, 1223));
        System.out.println(isPerm(123, 123));


    }
}
