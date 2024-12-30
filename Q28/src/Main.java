public class Main {
    public static boolean what(String s1, String s2) {
        if (s1.length() == 0) {
            return true;
        }

        if (s2.length() == 0) {
            return false;
        }

        if (s1.charAt(0) == s2.charAt(0)) {
            return what(s1.substring(1), s2.substring(1));
        }

        return what(s1, s2.substring(1));
    }
    
    public static void main(String[] args) {

    }
}
