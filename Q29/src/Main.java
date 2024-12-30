public class Main {
    public static boolean what(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.length() == 0) {
            return true;
        }

        int place = s2.indexOf(s2.charAt(0));
        
        if (place < 0) {
            return false;
        }

        String a = s2.substring(0, place);
        String b= s2.substring(place + 1);
        String c = a.concat(b);

        return what(s1.substring(1), c);
    }
    
    public static void main(String[] args) {

    }
}
