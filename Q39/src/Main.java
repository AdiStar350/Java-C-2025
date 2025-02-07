public class Main {
    public static void main(String[] args) {
        // Create a default user
        User u1 = new User();
        
        // Create a user with specified username, password, and security level
        User u2 = new User("AdiStrasser", "A03D05I00", 5);

        // Print details of the default user
        System.out.format("%s, %s, %d\n", u1.getUsername(), u1.getPassword(), u1.getSecurityLevel());
        
        // Print details of the specified user
        System.out.format("%s, %s, %d\n", u2.getUsername(), u2.getPassword(), u2.getSecurityLevel());

        // Update the default user's details
        u1.setUsername("MikeHunt");

        u1.setPassword("696969");
        u1.setSecurityLevel(3);

        // Print updated details of the default user
        System.out.format("%s, %s, %d\n", u1.getUsername(), u1.getPassword(), u1.getSecurityLevel());

        // Upgrade the security level.
        u1.upgradeSecurity();
        
        // Print updated details of the default user
        System.out.format("%s, %s, %d\n", u1.getUsername(), u1.getPassword(), u1.getSecurityLevel());
    }
}
