public class Main {
    /**
     * Checks if the string in the even indexes are not uppercase letters and the odd indexes are uppercase letters.
     * 
     * @param str
     * @return true if the string match the conditions, false otherwise.
     * @complexity O(n).
     */
    public static boolean secret(String str) {
        for (int i = 0; i < str.length(); i += 2) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                return false;
            }
        }

        for (int i = 1; i < str.length(); i += 2) {
            if (str.charAt(i) < 'A' || str.charAt(i) > 'Z') {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if the secret function returns different value for each even indexes 
     * and the same for odd indexes.
     * 
     * @note There can be adjacent indexes that are the same, because the function
     * checks the n index with n + 1 and n + 2 with n + 3, but not n + 1 with n + 2.
     * 
     * @param arr
     * @return true if the conditions are met, false otherwise.
     * @complexity O(n * m) - the mystery function is dependent of the array length (n),
     *      the secret function is called, and its dependent on the string length (m).
     */
    public static boolean mystery(String[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (secret(arr[i]) == secret(arr[i + 1])) {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {
        String a = "aAxT3Z"; // true
        String[] arr = {"aAxT3Z", "Thghj6", "44444", "zMlF7", "A", ""}; // true

        System.out.println(secret(a));
        System.out.println(mystery(arr));

    }
}
