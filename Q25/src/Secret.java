public class Secret {
    public static boolean secret(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return false;
        } else if (s2.length() == 0) {
            return true;
        }

        for (int i = 0, j = 0; i < s1.length() && j < s2.length() ; i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            } else {
                if (j > 0) {
                    return false;
                }
            }
        }

        return true;
    }

        

    public static void main(String[] args) {
        System.out.println(secret("HELLO", "HELP"));
        System.out.println(secret("MYJOBTEST", "JOB"));
        
    }
}