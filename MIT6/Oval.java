
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval implements Sprite {
	private int width, height;
	private Color color;

	public Oval(int width, int height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	@Override
	public void draw(Graphics surface, int x, int y) {
		surface.setColor(color);
		surface.fillOval(x, y, width, height);
		((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
		surface.drawOval(x, y, width, height);
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

}
