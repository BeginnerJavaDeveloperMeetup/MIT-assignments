import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class myString implements Sprite {
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
    
    public myString(String string, int x, int y, Color color) {
        this.str = string;
        this.x = 100;
        this.y = 130;
    	this.color = color;
    }


	public void draw(Graphics surface, int x, int y) {
        // Draw the object
		surface.setColor(color);
        surface.drawString(str, x, y);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
    }

    public int getWidth() {
       return width;
    }

    public int getHeight() {
        return height;
    }
}
