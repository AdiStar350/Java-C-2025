/**
 * Represents an Engine with a number and volume.
 */
public class Engine {
    private int number;
    private int volume;

    /**
     * Default constructor initializing the engine with default values.
     */
    public Engine() {
        this.number = 0;
        this.volume = 0;
    }

    /**
     * Constructor initializing the engine with specified number and volume.
     * 
     * @param number the number of the engine
     * @param volume the volume of the engine
     */
    public Engine(int number, int volume) {
        this.number = number;
        this.volume = volume;
    }

    /**
     * Gets the number of the engine.
     * 
     * @return the number of the engine
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the number of the engine.
     * 
     * @param number the number of the engine
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Gets the volume of the engine.
     * 
     * @return the volume of the engine
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the engine.
     * 
     * @param volume the volume of the engine
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * Returns a string representation of the engine.
     * 
     * @return a string representation of the engine
     */
    @Override
    public String toString() {
        return "Engine [number=" + number + ", volume=" + volume + "]";
    }
}