import java.util.Scanner;

/**
 * Created by Витя on 25.09.2018.
 */
public class Menu {
    static Scanner scanner = new Scanner(System.in);;
    public static void startMenu() {

        System.out.println("---");
        System.out.println("1. Films");
        System.out.println("2. Books");

        System.out.print("Choose category: ");
        try {
            switch (scanner.nextInt()) {
                case 1:
                    filmsMenu();
                    break;
                case 2:
                    System.out.println("Under construction...");
                    break;
                default:
                    System.out.println("Unknown command :/");
                    break;
            }
        } catch (Throwable e){
            System.out.println("Something went wrong: " + e.getMessage() + ". Try again...");
        }
    }

    public static void filmsMenu(){
        System.out.println("---");
        System.out.println("1. Add film");
        System.out.print("What do you want? ");
        try {
            switch (scanner.nextInt()) {
                case 1:
                    Main.createFilm();
                    break;
                default:
                    System.out.println("Unknown command :/");
            }
        } catch (Throwable e){
            System.out.println("Something went wrong: " + e.getMessage() + ". Try again...");
        }
    }
}
