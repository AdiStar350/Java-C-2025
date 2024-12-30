public class Main {
    /**
     * Checks if the arr1 is arr2 reversed or the other way around.
     * 
     * @param arr1 (int[])
     * @param arr2 (int[])
     * @return (boolean)
     * @complexity O(n).
     */
    public static boolean is1reversed2(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length / 2; i++) {
            if (arr1[i] != arr2[arr1.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if the b is contained in a.
     * 
     * @param a (int[])
     * @param b (int[])
     * @return (boolean)
     * @complexity O(n*m).
     */
    public static boolean what(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        boolean f;

        for (int i = 0; i < n - m + 1; i++) {
            f = true;

            for (int k = m - 1; k >= 0; k--) {
                if (a[i + k] != b[k]) {
                    f = false;
                }
            }
            if (f) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 25, 3, 8, 10, 4, 20, 5};
        int[] b = {5, 20, 4, 10, 8, 3, 25, 1};

        int[] c = {8, 6, 7, 10, 13, 2};
        int[] d = {8, 6, 7, 10};

        System.out.println(is1reversed2(a, b));
        System.out.println(what(c, d));
    }
}
