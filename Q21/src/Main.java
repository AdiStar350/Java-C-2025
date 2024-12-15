public class Main {
    public static void myStringFunction(String str) {
		if (str.length() > 0) {
			char ch = str.charAt(0);
			myStringFunction(str.substring(1));
			System.out.print(ch);
		}
	}

    public static void main(String[] args) {
        myStringFunction("Adi");
    }
}
