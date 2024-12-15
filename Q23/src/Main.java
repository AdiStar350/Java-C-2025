public class Main {
    public static boolean secret(int n1, int n2) {
        if (n1 < 10) {
            return n1 == n2;
        } else if (n1 % 10 == n2) {
            return true;
        }
        return secret(n1 / 10, n2);
    }

    public static void main(String[] args) {
        System.out.println(secret(528, 5));
    }
}
