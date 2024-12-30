public class Main {
    public static double sod(int n) {
        return sod(n, 0, 0);
    }

    private static double sod(int n, int c, double a) {
        if (n == 0 && c == 0) {
            return 0;
        }

        if (n == 0) {
            return a / c;
        }

        return sod(n / 10, c + 1, a + (n % 10));
    }

    public static boolean secret(int[] a) {
        return secret(a, a.length - 1);
    }

    public static boolean secret(int[] a, int m) {
        if (m == 0) {
            return true;
        }

        return secret(a, m - 1) && (sod(a[m]) - sod(a[m - 1]) == 1);
    }
    
    public static void main(String[] args) {
        
    }
}
