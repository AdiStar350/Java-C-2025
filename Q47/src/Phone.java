/**
 * Represents a phone with a manufacturer, storage capacity, and operating system.
 */
public class Phone {
    private String manufacturer;
    private int storage;
    private OS os;

    /**
     * Default constructor initializing the phone with default values.
     */
    public Phone() {
        this.manufacturer = "NONE";
        this.storage = 0;
        this.os = new OS();
    }

    /**
     * Parameterized constructor initializing the phone with specified values.
     * 
     * @param manufacturer the manufacturer of the phone
     * @param storage the storage capacity of the phone
     * @param os the operating system of the phone
     */
    public Phone(String manufacturer, int storage, OS os) {
        this.manufacturer = manufacturer;
        this.storage = storage;
        this.os = os;
    }

    /**
     * Gets the manufacturer of the phone.
     * 
     * @return the manufacturer of the phone
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the manufacturer of the phone.
     * 
     * @param manufacturer the manufacturer of the phone
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets the storage capacity of the phone.
     * 
     * @return the storage capacity of the phone
     */
    public int getStorage() {
        return storage;
    }

    /**
     * Sets the storage capacity of the phone.
     * 
     * @param storage the storage capacity of the phone
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * Gets the operating system of the phone.
     * 
     * @return the operating system of the phone
     */
    public OS getOs() {
        return os;
    }

    /**
     * Sets the operating system of the phone.
     * 
     * @param os the operating system of the phone
     */
    public void setOs(OS os) {
        this.os = os;
    }

    /**
     * Returns a string representation of the phone.
     * 
     * @return a string representation of the phone
     */
    @Override
    public String toString() {
        return "Phone [manufacturer=" + manufacturer + ", storage=" + storage + ", os=" + os + "]";
    }
}
