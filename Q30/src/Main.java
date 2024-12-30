public class Main {
    public static String what(String s, int k) {
        if (s.length() == k) {
            return "";
        }

        if (s.charAt(k) >= 'A' && s.charAt(k) <= 'Z') {
            return s.charAt(k) + what(s, k + 1);
        }

        if (s.charAt(k) >= 'a' && s.charAt(k) <= 'z') {
            return what(s, k + 1) + s.charAt(k);
        }

        return what(s, k + 1);
    }
    
    public static void main(String[] args) {
        System.out.println(what("A3BC12eDba",0));
    }
}
