
import java.awt.*;

public class MyString implements Sprite {
    public String str;
    public int x;
    public int y;
    private int height;
    private int width;
    private Color color;

    /**
     * Create a box that has dimensions width and height, filled with
     * startColor.
     */

    public MyString(String string, int x, int y, Color color) {
        this.str = string;
        this.x = x;
        this.y = y;
        this.color = color;
    }


    public void draw(Graphics surface, int x, int y) {
        // Draw the object
        FontMetrics fontMetrics = surface.getFontMetrics();
        surface.setColor(color);
        surface.drawString(str, (x - fontMetrics.stringWidth(str)), y);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}