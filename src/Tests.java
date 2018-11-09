/**
 * Created by Витя on 25.09.2018.
 */
public class Tests {
    public static void testFilm(Film film) {
        System.out.println("Name: " + film.getName());
        System.out.print("Genre: ");
        for (int i = 0; i < film.getGenre().length - 1; i++) {
            System.out.print(film.getGenre()[i] + ", ");
        }
        System.out.println(film.getGenre()[film.getGenre().length - 1]);
        System.out.println("Description: " + film.getDescription());
        System.out.print("Actors: ");
        for (int i = 0; i < film.getActors().length - 1; i++) {
            System.out.print(film.getActors()[i] + ", ");
        }
        System.out.println(film.getActors()[film.getActors().length - 1]);
        System.out.println("Country: " + film.getCountry());
        System.out.println("Year: " + film.getYear());
    }
}
