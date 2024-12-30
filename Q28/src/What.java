public class What {
    public static boolean what(String s1, String s2) {
        int i = 0, j = 0;

        if (s1.length() == 0) {
            return true;
        }

        if (s2.length() == 0 || s2.length() < s1.length()) {
            return false;
        }

        while (i < s1.length() && j < s2.length()) { 
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i == s1.length();
    }

    public static void main(String[] args) {
        System.out.println(what("HELLO", "HERLOLOR"));
    }
}
