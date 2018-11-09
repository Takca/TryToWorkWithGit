import javax.swing.*;
import java.awt.*;

/**
 * Created by Витя on 26.09.2018.
 */
public class Frame {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }

    public static void createGUI(){
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame frame = new JFrame("Journal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setPreferredSize(new Dimension(500, 300));

        frame.pack();
        frame.setVisible(true);
        mainMenu(frame);
    }

    public static void mainMenu(JFrame frame) {
        JPanel panel = new JPanel();
        frame.add(panel);

        JButton filmsJB = new JButton("Фильмы");
        JButton booksJB = new JButton("Книги");
        JButton quotesJB = new JButton("Цитаты");

        filmsJB.setSize(100, 50);
        booksJB.setSize(10, 5);
        quotesJB.setSize(10, 5);

        panel.add(filmsJB);
        panel.add(booksJB);
        panel.add(quotesJB);
    }
}
