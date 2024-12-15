public class Main {
    public static boolean is(int num, int digit) {
		boolean ans = num % 10 == digit;

		if (ans || num < 10) {
            return (ans);
        }

		return (is(num / 10, digit));
	}

    public static void main(String[] args) {
        System.out.println(is(16, 2));
        System.out.println(is(75, 7));
    }
}
