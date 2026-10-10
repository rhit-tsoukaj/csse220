import javax.swing.*;
import java.awt.*;
/**
 * Draws some Hounds, Foxes, and background on a graphics area.
 *
 * @author John Tsoukalis
 */
public class HoundComponent extends JComponent  {

    /**
     * Draws Fox and Hounds objects to the screen. Also Changes Backgrounds.
     */

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2 = (Graphics2D) graphics;

        graphics2.setColor(new Color(173, 216, 230));
        graphics2.fillRect(0, 0, getWidth(), getHeight());

        Color houndBrown = new Color(124, 71, 0); // C35817 in hex
        Hound hound1 = new Hound(150, 150, houndBrown);
        hound1.drawOn(graphics2);

        Color foxOrange = new Color(195, 88, 23); // C35817 in hex
        Fox fox1 = new Fox(300, 400, foxOrange);
        fox1.drawOn(graphics2);
    }

}
