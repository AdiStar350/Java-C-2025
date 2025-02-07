public class Main {
    /**
     * Checks if the array elements are ordered by
     * their remainder dividing with k.
     * 
     * @param arr (int[])
     * @param k (int)
     * @return (boolean)
     * @complexity O(n).
     */
    public static boolean isOrderedByK(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % k > arr[i + 1] % k) {
                return false;
            }
        }

        return true;
    }

    /**
     * Orders an array by their remainder when dividing by k.
     * 
     * @param arr (int[])
     * @param k (int)
     * @return (int[])
     * @complexity O(n^2).
     */
    public static int[] orderByK(int[] arr, int k) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % k > arr[j] % k) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 8, 9, 13, 15};

        arr = orderByK(arr, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
