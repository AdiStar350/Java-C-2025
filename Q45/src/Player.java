/**
 * Represents a player in the game.
 */
public class Player {
    // Player's name
    private String name;
    // Player's gender
    private char gender;
    // Player's abilities
    private String abilities;
    // Player's finisher move
    private String finisher;
    // Player's health points
    private int hp;

    /**
     * Default constructor initializing the player with default values.
     */
    public Player() {
        this.name = "John Doe";
        this.gender = 'X';
        this.abilities = "NONE";
        this.finisher = "NONE";
        this.hp = -1;
    }

    /**
     * Constructor initializing the player with specified values.
     * 
     * @param name the name of the player
     * @param gender the gender of the player
     * @param abilities the abilities of the player
     * @param finisher the finisher move of the player
     * @param hp the health points of the player
     */
    public Player(String name, char gender, String abilities, String finisher, int hp) {
        this.name = name;
        this.gender = gender;
        this.abilities = abilities;
        this.finisher = finisher;
        this.hp = hp;
    }

    /**
     * Gets the name of the player.
     * 
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     * 
     * @param name the new name of the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the gender of the player.
     * 
     * @return the gender of the player
     */
    public char getGender() {
        return gender;
    }

    /**
     * Sets the gender of the player.
     * 
     * @param gender the new gender of the player
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * Gets the abilities of the player.
     * 
     * @return the abilities of the player
     */
    public String getAbilities() {
        return abilities;
    }

    /**
     * Sets the abilities of the player.
     * 
     * @param abilities the new abilities of the player
     */
    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    /**
     * Gets the finisher move of the player.
     * 
     * @return the finisher move of the player
     */
    public String getFinisher() {
        return finisher;
    }

    /**
     * Sets the finisher move of the player.
     * 
     * @param finisher the new finisher move of the player
     */
    public void setFinisher(String finisher) {
        this.finisher = finisher;
    }

    /**
     * Gets the health points of the player.
     * 
     * @return the health points of the player
     */
    public int getHp() {
        return hp;
    }

    /**
     * Sets the health points of the player.
     * 
     * @param hp the new health points of the player
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Returns a string representation of the player.
     * 
     * @return a string representation of the player
     */
    @Override
    public String toString() {
        return "Player [name=" + name + ", gender=" + gender + ", abilities=" + abilities + ", finisher=" + finisher
                + ", hp=" + hp + "]";
    }

    /**
     * Uses a potion to increase the player's health points.
     * 
     * @param potion the amount of health points to increase
     */
    public void usePotion(int potion) {
        this.hp += potion;
    }
}
