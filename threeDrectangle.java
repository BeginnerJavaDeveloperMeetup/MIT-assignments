import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class threeDrectangle implements Sprite {
    private int width;
    private int height;
    private Color color;
    boolean raised;

    /**
     * Create a box that has dimensions width and height, filled with
     * startColor.
     */
    public threeDrectangle(int width, int height, Color color, boolean raised) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.raised = true;
    }

    public void draw(Graphics surface, int x, int y) {
        // Draw the object
        surface.setColor(color);
        surface.fill3DRect(x, y, width, height, true);
        surface.setColor(Color.MAGENTA);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.draw3DRect(x, y, width, height, true);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}