public class Main {
    // -> a
    /**
     * Prints the given number x, x times.
     *
     * @param x (int) - the number to be printed
     * @complexity O(n)
     */
    public static void f1(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(x);
        }
    }

    // -> b
    /**
     * Prints the given number x, x times.
     *
     * @param x (int) - the number to be printed
     * @complexity O(n)
     */
    public static void f2(int x) {
        for (int i = x; i >= 0; i--) {
            System.out.println(x);
        }     
    }

    // -> c
    /**
     * Prints the string "hello world", x^2 times.
     *
     * @param x (int)
     * @complexity O(n^2)
     */
    public static void f3(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= x; j++) {
                System.out.println("hello world");
            }
        }
    }

    // -> d
    /**
     * Prints the string "hello world", x * y times.
     *
     * @param x (int)
     * @param y (int)
     * @complexity O(n * m)
     */
    public static void f4(int x, int y) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                System.out.println("hello world");
            }
        }
    }

    // -> e
    /**
     * Prints the element in the array of index if its in range.
     * 
     * @param arr (int[])
     * @param index (int) - index for the array
     * @complexity O(1)
     */
    public static void f5(int[] arr, int index) {
        if (index < 0 || index > arr.length) {
            return;
        }

        System.out.println(arr[index]);
    }

    // -> f
    /**
     * Prints the index of the array if its equal to num.
     * 
     * @param arr (int[])
     * @param num (int)
     * @complexity O(n)
     */
    public static void f6(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                System.out.println(i);
            }
        }       
    }

    // -> g
    /**
     * A binary search between 2 indexes of an array - first and last, looking for key.
     * 
     * @param arr (int[])
     * @param first (int) - index in the array.
     * @param last (int) - index in the array.
     * @param key (int) - an integer to search for
     * @complexity O(log(n))
     */
    public static void f7(int[] arr, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
               if (arr[mid] < key) {
                      first = mid + 1;
               } else if (arr[mid] == key) {
                      System.out.println("Element is found at index: " + mid);
                      break;
               } else {
                      last = mid - 1;
               }

               mid = (first + last) / 2;
        }
    }

    // -> h
    /**
     * @param n (int)
     * @complexity O(log(n))
     */
    public static void f8(int n) {
        int k = 2;
        
        while (k < n) {
            k *= 2;
        } 
    }

    public static void main(String[] args) {
    }
}
