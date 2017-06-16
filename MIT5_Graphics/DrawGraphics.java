import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    ArrayList<BouncingOval> ovals = new ArrayList<BouncingOval>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        int x = (int)(Math.random() * 3 + 1) - 3;
        int y = (int)(Math.random() * 3 + 1) - 3;
        for(int i = 0; i < 20; i++) {
            int random = (int)(Math.random() * 10 + 1);
            BouncingBox box = new BouncingBox(x, y, new Color((int)(Math.random()* 0x1000000)));
            box.setMovementVector(x + 1 + random, y + 3 + random);
            boxes.add(box);

            BouncingOval oval = new BouncingOval(x + 4, y + 4, new Color((int)(Math.random()* 0x1000000)));
            oval.setMovementVector(x - 2 + random, y + 1 + random);
            ovals.add(oval);
        }
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        for(int i = 0; i < 20; i++) {
            boxes.get(i).draw(surface);
            ovals.get(i).draw(surface);
        }
        /*
        surface.drawLine(50, 50, 250, 250);
        box.draw(surface);
        surface.drawOval(20, 20, 100, 30);
        surface.setColor(Color.blue);
        surface.fillOval(21, 21, 99, 29);
        surface.setColor(Color.green);
        surface.fillRoundRect(20, 100, 50, 50, 2, 2);
        surface.setColor(Color.cyan);
        int[] xCoords = {20, 40, 60, 80, 100, 120, 140, 50, 20};
        int[] yCoords = {220, 240, 260, 280, 100, 120, 140, 130, 20};
        surface.drawPolygon(xCoords, yCoords, 9);
*/
    }
} 