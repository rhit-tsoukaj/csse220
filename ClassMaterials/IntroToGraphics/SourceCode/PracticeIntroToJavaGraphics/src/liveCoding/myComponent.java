package liveCoding;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class myComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        super.paintComponent(g);
        drawTranslateRotate(g);
        drawSimpleSquare(g);
        drawUsingColors(g);
        drawSomeText(g);
    }
    private void drawTranslateRotate(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        Rectangle2D rect = new Rectangle2D.Double(150, 300, 150, 40);
        g2d.fill(rect);
        int xOffset = 200;
        int yOffset = 0;
        g2d.translate(xOffset, yOffset);
        g2d.fill(rect);
        g2d.rotate(30*Math.PI/180); //convert degrees to radians
        g2d.fill(rect);

        g2d.rotate(-30*Math.PI/180);
        g2d.translate(400, 250);
        for (int angleDegrees = 0; angleDegrees <= 180; angleDegrees+= 30) {
            Line2D line = new Line2D.Double(0, 0, 100, 0);
            g2d.rotate(30*Math.PI/180);
            g2d.draw(line);

        }

//        g2d.rotate(-30*Math.PI/180); //convert degrees to radians
//        g2d.translate(-xOffset, -yOffset);


    }
    private void drawSomeText(Graphics g) {
        String message = "Can't wait for the bonfire Friday!";
        Graphics2D g2d = (Graphics2D)g;
        Font originalFont = g2d.getFont();
        System.out.println(originalFont);
        g2d.setFont(new Font("Consolas", Font.PLAIN, 24));
        g2d.drawString(message, 200, 450);
        g2d.setFont(originalFont);
    }
    private void drawUsingColors(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Color originalColor = g2d.getColor();
        Color yell = new Color(180, 180, 0);
        g2d.setColor(yell);
        Rectangle2D yellRect = new Rectangle2D.Double(100, 100, 50, 50);
        g2d.fill(yellRect);
        Rectangle2D yellRect2 = new Rectangle2D.Double(200, 100, 50, 50);
        g2d.fill(yellRect2);
        Rectangle2D yellRect3 = new Rectangle2D.Double(100, 200, 150, 50);
        g2d.fill(yellRect3);
        g2d.setColor(new Color(128,0, 0));
        Ellipse2D redCircle = new Ellipse2D.Double(300, 100, 75, 75);
        g2d.fill(redCircle);
        g2d.setColor(originalColor);
    }
    private void drawSimpleSquare(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        int width = 20;
        int x = 5;
        int y = 5;
        Rectangle2D rect = new Rectangle2D.Double(x, y, width, width);
        g2d.draw(rect);
    }
}
