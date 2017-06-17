import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

// This DrawGraphics class was made by Cheryl.

public class DrawGraphics_C extends DrawGraphics{
    BouncingBox box;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
    ArrayList<Oval_C> ovals = new ArrayList<Oval_C>();

    /** Initializes this class for drawing. */
    public DrawGraphics_C() {
        int x = (int)(Math.random() * 3 + 1) - 3;
        int y = (int)(Math.random() * 3 + 1) - 3;
        for(int i = 0; i < 20; i++) {
            int random = (int)(Math.random() * 10 + 1);
            BouncingBox box = new BouncingBox(x, y, new Color((int)(Math.random()* 0x1000000)));
            box.setMovementVector(x + 1 + random, y + 3 + random);
            boxes.add(box);

            Oval_C oval = new Oval_C(x + 4, y + 4, new Color((int)(Math.random()* 0x1000000)));
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
    }
} 