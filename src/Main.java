import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Витя on 19.09.2018.
 */
public class Main {
    private static List<Film> myFilms = new ArrayList();

    public static void main(String[] args) {
hui revert
        System.out.println("Hello, my friend. It's me, your personal journal! :)");
        Menu.startMenu();
    }


    public static void createFilm() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("If you want add film, please write me film's: ");
            System.out.print("name: ");
            String name = scanner.nextLine();
            System.out.print("genre: ");
            String genre[] = scanner.nextLine().split(" ");
            System.out.print("description: ");
            String description = scanner.nextLine();
            System.out.print("actors: ");
            String actors[] = scanner.nextLine().split(", ");
            System.out.print("country: ");
            String country = scanner.nextLine();
            System.out.print("year: ");
            int year = scanner.nextInt();
            myFilms.add(new Film(name, genre, description, actors, country, year));
            System.out.println("Your film successful created. :)");
            Tests.testFilm(myFilms.get(myFilms.size()-1));
        } catch (Throwable e) {
            System.out.println("Something went wrong: " + e.getMessage() + ". Try again...");
        }
    }
}
