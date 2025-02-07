import java.util.Arrays;

/**
 * Represents a Plane with a manufacturer, model, and an array of engines.
 */
public class Plane {
    private String manufacturer;
    private String model;
    private Engine[] engines;
    private int numOfEngines;

    /**
     * Default constructor initializing the plane with default values.
     */
    public Plane() {
        this.manufacturer = "NONE";
        this.model = "NONE";
        this.engines = new Engine[4];
        this.numOfEngines = 0;
    }

    /**
     * Constructor initializing the plane with specified manufacturer and model.
     * 
     * @param manufacturer the manufacturer of the plane
     * @param model the model of the plane
     */
    public Plane(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engines = new Engine[4];
        this.numOfEngines = 0;
    }

    /**
     * Gets the manufacturer of the plane.
     * 
     * @return the manufacturer of the plane
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the manufacturer of the plane.
     * 
     * @param manufacturer the manufacturer of the plane
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Gets the model of the plane.
     * 
     * @return the model of the plane
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the plane.
     * 
     * @param model the model of the plane
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the array of engines of the plane.
     * 
     * @return the array of engines
     */
    public Engine[] getEngines() {
        return engines;
    }

    /**
     * Gets the number of engines currently added to the plane.
     * 
     * @return the number of engines
     */
    public int getNumOfEngines() {
        return this.numOfEngines;
    }

    /**
     * Returns a string representation of the plane.
     * 
     * @return a string representation of the plane
     */
    @Override
    public String toString() {
        return "Plane [manufacturer=" + manufacturer + ", model=" + model + ", engines=" + Arrays.toString(engines)
                + "]";
    }

    /**
     * Adds an engine to the plane if it meets the criteria.
     * 
     * @param e the engine to be added
     * @return true if the engine was added, false otherwise
     */
    public boolean addEngine(Engine e) {
        if (this.numOfEngines == this.engines.length) {
            return false;
        } else if (this.numOfEngines == 0) {
            this.engines[numOfEngines++] = e;
            return true;
        } else if (this.engines[0].getVolume() == e.getVolume()) {
            this.engines[numOfEngines++] = e;
            return true;
        }

        return false;
    }
}
