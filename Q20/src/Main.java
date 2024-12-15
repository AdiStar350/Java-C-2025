public class Main {
    public static int M1(int x, int y) {
        if (y == 0) {
            System.out.println(x);
            return x;
        } else if (y > 0) {
            return 1 + M1(x, y - 1);
        } else {
            return -1 + M1(x, y + 1);
        }
    }

    public static int M2(int x, int y) {
        if (y == 0) {
            System.out.println(x);
            return x;
        } else if (y > 0) {
            return M2(x + 1, y - 1);
        } else {
            return M2(x - 1, y + 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(M1(2, 2));
        System.out.println(M1(3, -2));
        System.out.println(M2(1, 1));
        System.out.println(M2(1, -1));
    }
}
