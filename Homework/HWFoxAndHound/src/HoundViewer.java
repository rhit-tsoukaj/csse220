import javax.swing.*;
import java.awt.*;

/**
 * Draws a fox and hound, via the HoundComponent and Fox and Hound classes.
 *
 * @author John Tsoukalis
 */

public class HoundViewer {
    public static final Dimension HOUND_VIEWER_SIZE = new Dimension(600, 800);

    /**
     * Constructs and displays the JFrame which displays Fox and Hound objects via a
     * HoundComponent object.
     *
     * @param args
     *            Command-line arguments, ignored here.
     */

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(HOUND_VIEWER_SIZE);
        frame.setTitle("I see hounds and foxes!");

        frame.add(new HoundComponent());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
