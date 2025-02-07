public class Main {
    /**
     * Compares two movies and returns the one with the longer duration.
     * 
     * @param m1 the first movie
     * @param m2 the second movie
     * @return the movie with the longer duration
     */
    public static Movie getLongerMovie(Movie m1, Movie m2) {
        return m1.getTime() > m2.getTime() ? m1 : m2;
    }

    public static void main(String[] args) {
        // Create two movie objects
        Movie m1 = new Movie(1999 ,"American Pie", "Jason Biggs", 95, "Comedy");
        Movie m2 = new Movie(2014 ,"Interstellar", "Matthew McConaughey", 169, "Science Fiction");
        
        // Print the movie with the longer duration
        System.out.println(getLongerMovie(m1, m2));
    }
}
