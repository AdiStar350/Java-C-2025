/**
 * The Car class represents a car with a license plate, make year, and engine volume.
 */
public class Car {
    private String licensePlate;
    private int makeYear;
    private int engineVolume;

    /**
     * Default constructor for the Car class.
     * Initializes the car with default values.
     */
    public Car() {
        this.licensePlate = "NONE";
        this.makeYear = -1;
        this.engineVolume = -1;
    }

    /**
     * Parameterized constructor for the Car class.
     * @param licensePlate (String) The license plate of the car
     * @param makeYear (int) The make year of the car
     * @param engineVolume (int) The engine volume of the car
     */
    public Car(String licensePlate, int makeYear, int engineVolume) {
        this.licensePlate = licensePlate;
        this.makeYear = makeYear;
        this.engineVolume = engineVolume;
    }

    /**
     * Gets the license plate of the car.
     * @return The license plate of the car
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * Sets the license plate of the car.
     * @param licensePlate The new license plate of the car
     */
    public void setLicensePlate(String licensePlate) {
        if (!licensePlate.matches("^([a-zA-Z0-9]{3}-[a-zA-Z0-9]{3}|[a-zA-Z0-9]{2}-[a-zA-Z0-9]{3}-[a-zA-Z0-9]{2})$")) {
            System.out.println("License plate must be 7 - 8 characters long");
            return;
        }

        System.out.format("License plate updated: %s\n", licensePlate);
        this.licensePlate = licensePlate;
    }

    /**
     * Gets the make year of the car.
     * @return The make year of the car
     */
    public int getMakeYear() {
        return this.makeYear;
    }

    /**
     * Sets the make year of the car.
     * @param makeYear The new make year of the car
     */
    public void setMakeYear(int makeYear) {
        if (makeYear > 2025 || makeYear < 1886) {
            System.out.println("Year must be valid");
            return;
        }

        System.out.format("Make year updated: %s\n", makeYear);
        this.makeYear = makeYear;
    }

    /**
     * Gets the engine volume of the car.
     * @return The engine volume of the car
     */
    public int getEngineVolume() {
        return this.engineVolume;
    }

    /**
     * Sets the engine volume of the car.
     * @param engineVolume The new engine volume of the car
     */
    public void setEngineVolume(int engineVolume) {
        if (engineVolume > 8400 || engineVolume < 49) {
            System.out.println("Engine volume must be valid");
            return;
        }

        System.out.format("Engine volume updated: %s\n", engineVolume);
        this.engineVolume = engineVolume;
    }

    /**
     * Checks if the license plate of this car matches with another car.
     * @param c The car to compare with
     * @return True if the license plates match, false otherwise
     */
    public boolean matchLicensePlate(Car c) {
        return this.licensePlate.equals(c.licensePlate);
    }
}
