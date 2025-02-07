/**
 * Represents an operating system with a name and version.
 */
public class OS {
    private String name;
    private String version;

    /**
     * Default constructor initializing the OS with default values.
     */
    public OS() {
        this.name = "NONE";
        this.version = "0";
    }

    /**
     * Parameterized constructor initializing the OS with specified values.
     * 
     * @param name the name of the operating system
     * @param version the version of the operating system
     */
    public OS(String name, String version) {
        this.name = name;
        this.version = version;
    }

    /**
     * Gets the name of the operating system.
     * 
     * @return the name of the operating system
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the operating system.
     * 
     * @param name the name of the operating system
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the version of the operating system.
     * 
     * @return the version of the operating system
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version of the operating system.
     * 
     * @param version the version of the operating system
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Returns a string representation of the operating system.
     * 
     * @return a string representation of the operating system
     */
    @Override
    public String toString() {
        return "OS [name=" + name + ", version=" + version + "]";
    }
}
