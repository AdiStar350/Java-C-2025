public class Main {
    /**
     * Given an array of integers, return the maximum element in the array if known that what(a) == true.
     * 
     * @param a (int[]) an array of integers.
     * @return the maximum element in the array.
     * @complexity O(1).
     */
    public static int getMaxElement(int[] a) {
        return a[1] > a[a.length - 1] ? a[1] : a[a.length - 1];
    }

    /**
     * A zigzag array is an array where the elements in the even indexes are ascending and the elements in the odd indexes are descending.
     * 
     * @param a (int[]) an array of integers.
     * @return true if the array is a zigzag array, false otherwise.
     */
    public static boolean what(int[] a) {
        for (int i = 2; i < a.length - 1; i++) {
            if (a[i] < a[i - 2]) {
                return false;
            }

            i++;

            if (a[i] > a[i - 2]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 25, 3, 8, 10, 4, 20, 5};
        int[] b = {9, 6, 10, 3, 12, 1, 16, 0, 18, -5};

        System.out.println(what(a)); // => returns false
        System.out.println(what(b)); // => returns true
    }
}
