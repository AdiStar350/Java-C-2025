/**
 * Represents a Smartphone with various attributes.
 */
public class Smartphone {
    private String manufacturer;
    private String model;
    private String comInterface;
    private float rad;
    private float price;
    private boolean isTaxed;

    /**
     * Default constructor initializing the smartphone with default values.
     */
    public Smartphone() {
        this.manufacturer = "unknown";
        this.model = "unknown";
        this.comInterface = "unknown";
        this.rad = -1f;
        this.price = 0f;
        this.isTaxed = false;
    }

    /**
     * Parameterized constructor initializing the smartphone with given values.
     * 
     * @param manufacturer the manufacturer of the smartphone
     * @param model the model of the smartphone
     * @param comInterface the communication interface of the smartphone
     * @param rad the range of the smartphone
     * @param price the price of the smartphone
     */
    public Smartphone(String manufacturer, String model, String comInterface, float rad, float price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.comInterface = comInterface;
        this.rad = rad;
        this.price = price;
        this.isTaxed = false;
    }

    /**
     * Gets the manufacturer of the smartphone.
     * 
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the manufacturer of the smartphone.
     * 
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets the model of the smartphone.
     * 
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the smartphone.
     * 
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the communication interface of the smartphone.
     * 
     * @return the communication interface
     */
    public String getComInterface() {
        return comInterface;
    }

    /**
     * Sets the communication interface of the smartphone.
     * 
     * @param comInterface the communication interface to set
     */
    public void setComInterface(String comInterface) {
        this.comInterface = comInterface;
    }

    /**
     * Gets the range of the smartphone.
     * 
     * @return the range
     */
    public float getRad() {
        return rad;
    }

    /**
     * Sets the range of the smartphone.
     * 
     * @param rad the range to set
     */
    public void setRad(float rad) {
        if (rad <= 2f && rad >= 0.1f) {
            this.rad = rad;
            return;
        }
        
        System.out.println("Not a valid SAR value.");
    }

    /**
     * Gets the price of the smartphone.
     * 
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the price of the smartphone. If the price is negative, it prints an error message.
     * 
     * @param price the price to set
     */
    public void setPrice(float price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
            return;
        }

        this.price = price;
    }

    /**
     * Checks if the smartphone is taxed.
     * 
     * @return true if taxed, false otherwise
     */
    public boolean getIsTaxed() {
        return this.isTaxed;
    }

    public void setIsTaxed(boolean isTaxed) {
        this.isTaxed = isTaxed;
    }

    /**
     * Applies tax to the smartphone if it is not already taxed.
     * 
     * @return true if tax was applied, false if already taxed
     */
    public boolean isTaxForSmartphone() {
        if (!this.isTaxed) {
            this.price *= (1 + this.rad / 100);
            this.isTaxed = true;
            return true;
        }
        
        return false;
    }

    /**
     * Returns a string representation of the smartphone.
     * 
     * @return a string representation of the smartphone
     */
    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + "\nModel: " + model + "\nCommunication Interface: " + comInterface + "\nRange: " + rad + "\nPrice: " + price;
    }
}
