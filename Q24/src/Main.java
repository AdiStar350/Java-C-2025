public class Main {
    public static int what(int num) {
        return what (num, 1) ;
    }

    private static int what(int num, int c) {
        int a;
        if (num < 10) {
            return c;
        } else if (num % 10 == num / 10 % 10) {
            a = what (num / 10, c + 1);
        } else {
            a = what (num/10, 1);
        }
        return Math.max (a, c) ;
    }

    public static int secret(int[] arr) {
        return secret(arr, 0, arr.length - 1);
    }

    private static int secret(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        } else if (what(arr[left]) < what(arr[right])) {
            return secret(arr, left + 1, right);
        }
        return secret(arr, left, right - 1);
    }

    public static void main(String[] args) {
        
    }
}
