/**
 * Represents a game with a name, minimum age requirement, number of players, and price.
 */
public class Game {
    private String name;
    private int minAge;
    private int numPlayers;
    private double price;

    /**
     * Default constructor initializing the game with default values.
     */
    public Game() {
        this.name = "NONE";
        this.minAge = 0;
        this.numPlayers = 0;
        this.price = 0;
    }

    /**
     * Parameterized constructor to initialize the game with specified values.
     *
     * @param name the name of the game
     * @param minAge the minimum age required to play the game
     * @param numPlayers the number of players required to play the game
     * @param price the price of the game
     */
    public Game(String name, int minAge, int numPlayers, double price) {
        this.name = name;
        this.minAge = minAge;
        this.numPlayers = numPlayers;
        this.price = price;
    }

    /**
     * Gets the name of the game.
     *
     * @return the name of the game
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the game.
     *
     * @param name the new name of the game
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the minimum age required to play the game.
     *
     * @return the minimum age required to play the game
     */
    public int getMinAge() {
        return minAge;
    }

    /**
     * Sets the minimum age required to play the game.
     *
     * @param minAge the new minimum age required to play the game
     */
    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    /**
     * Gets the number of players required to play the game.
     *
     * @return the number of players required to play the game
     */
    public int getNumPlayers() {
        return numPlayers;
    }

    /**
     * Sets the number of players required to play the game.
     *
     * @param numPlayers the new number of players required to play the game
     */
    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    /**
     * Gets the price of the game.
     *
     * @return the price of the game
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the game.
     *
     * @param price the new price of the game
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns a string representation of the game.
     *
     * @return a string representation of the game
     */
    @Override
    public String toString() {
        return "Game [name=" + name + ", minAge=" + minAge + ", numPlayers=" + numPlayers + ", price=" + price + "]";
    }

    /**
     * Determines if this game can replace another game based on minimum age and price.
     *
     * @param other the other game to compare with
     * @return true if this game can replace the other game, false otherwise
     * @complexity O(1)
     */
    public boolean canReplace(Game other) {
        return this.minAge == other.minAge && this.price >= other.price;
    }
}