/**
 * The Movie class represents a movie with a year, name, lead actor, duration, and genre.
 */
public class Movie {
    private int year;
    private String name;
    private String lead;
    private int time;
    private String genre;

    /**
     * Default constructor initializing the movie with default values.
     */
    public Movie() {
        this.year = 0;
        this.name = "NONE";
        this.lead = "John Doe";
        this.time = 0;
        this.genre = "None";
    }

    /**
     * Parameterized constructor initializing the movie with specified values.
     * 
     * @param year  the release year of the movie
     * @param name  the name of the movie
     * @param lead  the lead actor of the movie
     * @param time  the duration of the movie in minutes
     * @param genre the genre of the movie
     */
    public Movie(int year, String name, String lead, int time, String genre) {
        this.year = year;
        this.name = name;
        this.lead = lead;
        this.time = time;
        this.genre = genre;
    }

    /**
     * Gets the release year of the movie.
     * 
     * @return the release year of the movie
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the release year of the movie.
     * 
     * @param year the release year to set
     */
    public void setYear(int year) {
        if (year > 999) {
            this.year = year;
            return;
        }
        
        System.out.println("That year is not valid.");
    }

    /**
     * Gets the name of the movie.
     * 
     * @return the name of the movie
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the movie.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the lead actor of the movie.
     * 
     * @return the lead actor of the movie
     */
    public String getLead() {
        return lead;
    }

    /**
     * Sets the lead actor of the movie.
     * 
     * @param lead the lead actor to set
     */
    public void setLead(String lead) {
        if (lead.matches("^[a-zA-Z]$")) {
            this.lead = lead;
            return;
        }

        System.out.println("This name is not valid.");        
    }

    /**
     * Gets the duration of the movie in minutes.
     * 
     * @return the duration of the movie in minutes
     */
    public int getTime() {
        return time;
    }

    /**
     * Sets the duration of the movie in minutes.
     * 
     * @param time the duration to set
     */
    public void setTime(int time) {
        if (time > 0) {
            this.time = time;
            return;
        }

        System.out.println("this time is invalid.");
    }

    /**
     * Gets the genre of the movie.
     * 
     * @return the genre of the movie
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the genre of the movie.
     * 
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        if (genre.matches("^[a-zA-Z]$")) {
            this.genre = genre;
            return;
        }

        System.out.println("This genre is not valid.");
    }

    /**
     * Returns a string representation of the movie.
     * 
     * @return a string representation of the movie
     */
    @Override
    public String toString() {
        return String.format("%d, %s, %s, %d, %s", this.year, this.name, this.lead, this.time, this.genre);
    }
}
