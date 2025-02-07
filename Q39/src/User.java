/**
 * The User class represents a user with a username, password, and security level.
 */
public class User {
    private String username;
    private String password;
    private int securityLevel;

    /**
     * Default constructor initializing the user with default values.
     */
    public User() {
        this.username = "empty";
        this.password = "empty";
        this.securityLevel = -1;
    }

    /**
     * Parameterized constructor initializing the user with specified values.
     * 
     * @param username the username of the user
     * @param password the password of the user
     * @param securityLevel the security level of the user
     */
    public User(String username, String password, int securityLevel) {
        this.username = username;
        this.password = password;
        this.securityLevel = securityLevel;
    }

    /**
     * Gets the username of the user.
     * 
     * @return the username of the user
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Sets the username of the user.
     * 
     * @param username the new username of the user
     */
    public void setUsername(String username) {
        System.out.format("Username updated: %s\n", username);
        this.username = username;
    }

    /**
     * Gets the password of the user.
     * 
     * @return the password of the user
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Sets the password of the user. The password must be at least 6 characters long.
     * 
     * @param password the new password of the user
     */
    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Enter a password with a least 6 characters");
            return;
        }

        System.out.format("Password updated: %s\n", password);
        this.password = password;
    }

    /**
     * Gets the security level of the user.
     * 
     * @return the security level of the user
     */
    public int getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * Sets the security level of the user. The security level must be between 1 and 5.
     * 
     * @param securityLevel the new security level of the user
     */
    public void setSecurityLevel(int securityLevel) {
        if (securityLevel < 1 || securityLevel > 5) {
            System.out.println("Enter a valid level between 1 - 5");
            return;
        }

        System.out.format("Security level updated: %d\n", securityLevel);
        this.securityLevel = securityLevel;
    }

    /**
     * Raises the security level by one if its not at max.
     */
    public void upgradeSecurity() {
        if (this.securityLevel == 5) {
            System.out.println("The security is at max level");
            return;
        }

        this.securityLevel++;
        System.out.format("Security level updated: %d\n", this.securityLevel);
    }
}
