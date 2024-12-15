public class Main {
    public static boolean mystery(String s1, String s2) {
        if (s2.length() > s1.length()) {
            return false;
        } else if (s2.length() == 0) {
            return true;
        } else if (s1.charAt(0) != s2.charAt(0)) {
            return false;
        }
        return mystery(s1.substring(1), s2.substring(1));
    }

    public static boolean secret (String s1, String s2) {
        if (s2.length() == 0) {
            return true;
        } else if (s1.length() < s2.length()) { 
            return false;
        }
        return mystery(s1,s2) || secret(s1.substring(1), s2);
    }

    public static void main(String[] args) {

    }
}
