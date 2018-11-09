import java.util.Scanner;

/**
 * This class describes object "Film".
 * He have fields: name, county, description, genre, actors, year.
 * And method "get" for all fields.
 */

public class Film {
    private String name;
    private String country;
    private String description;
    private String[] genre;
    private String[] actors;
    private int year;

    public Film(String name, String[] genre, String description, String[] actors, String country, int year){
        this.name = name;
        this.genre = genre;
        this.description = description;
        this.actors = actors;
        this.country = country;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }
    public String[] getGenre() {
        return this.genre;
    }
    public String getDescription() { return  this.description; }
    public String[] getActors() {
        return this.actors;
    }
    public String getCountry() {
        return this.country;
    }
    public int getYear() {
        return this.year;
    }
}
