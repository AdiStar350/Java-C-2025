public class Main {
    public static double check(int[] a, int p, int q) {
        if (p == q) {
            return a[p];
        }

        if (p + 1 == q) {
            return (double)(a[p] + a[q]) / 2;
        }

        return check(a, p + 1, q - 1);
    }

    public static boolean secret(int[] a, int p) {
        if (p == a.length - 1) {
            return true;
        }

        return a[p] > check(a, p + 1, a.length - 1) && secret(a, p + 1);
    }
    
    public static void main(String[] args) {

    }
}
