import java.awt.*;

/**
 * Class representing a Hound, drawn as a rectangular face with scalene triangular ears.
 *
 * @author John Tsoukalis
 * <br>
 * **************************************************************************************
 * REQUIRED HELP CITATION
 *         "only used CSSE220 materials"
 * **************************************************************************************
 */

public class Hound {
    private static final int HEIGHT = 160;
    private static final int WIDTH = 110;

    private static final int EAR_HEIGHT = 20;
    private static final int EAR_WIDTH = 20;
    private static final Color EAR_COLOR = Color.BLACK;

    private Color color;

    private int x;
    private int y;

    public Hound(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void drawOn(Graphics2D g2) {
        g2.translate(x, y);

        int[] xPoints = {0, WIDTH, WIDTH, 0};
        int[] yPoints = {0, 0, HEIGHT, HEIGHT};

        // TODO: Construct a Polygon for the fox face, then fill it with the fox's color.
        Polygon houndFace = new Polygon(xPoints, yPoints, 4);
        g2.setColor(color);
        g2.fill(houndFace);

        // Draw the fox ears
        int[] leftEarXPoints = {0, 0, -50};
        int[] leftEarYPoints = {0, HEIGHT+20, HEIGHT-30};

        int[] rightEarXPoints = {WIDTH, WIDTH, WIDTH+50};
        int[] rightEarYPoints = {0, HEIGHT+20, HEIGHT-30};

        // TODO: Construct Polygons for the left and right ears, then fill them with EAR_COLOR.
        Polygon lHoundEar = new Polygon(leftEarXPoints, leftEarYPoints, 3);
        Polygon rHoundEar = new Polygon(rightEarXPoints, rightEarYPoints, 3);

        g2.setColor(EAR_COLOR);
        g2.fill(lHoundEar);
        g2.fill(rHoundEar);

        // Undo translation
        g2.translate(-x, -y);
    }
}

