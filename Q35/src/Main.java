public class Main {
    /**
     * The function takes an array and a number and checks how many
     * pairs can be made that if added they are smaller then the number
     * 
     * @param arr (int[])
     * @param num (int)
     * @return c (int) - The count of pairs.
     * @complexity O(n)
     */
    public static int what(int[] arr, int num) {
        int c = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] >= num) {
                right--;
            } else {
                c += (right - left);
                left++;
            }
        }

        return c;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 11, 18, 21, 27, 35};

        System.out.println(what(arr, 7));
        System.out.println(what(arr, 26));
    }
}
