
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Oval {
	int x;
	int y;
	int width;
	int height;
	Color color;
	int xDirection = 0;
	int yDirection = 0;
	final int SIZE = 50;

	/**
	 * Initialize a new box with its center located at (startX, startY), filled
	 * with startColor.
	 */
	public Oval(int startX, int startY, int width, int height, Color startColor) {
		x = startX;
		y = startY;
		height = 120;
		width = 80;
		color = startColor;
	}

	public Oval(int startX, int startY, Color startColor) {
		x = startX;
		y = startY;
		color = startColor;
	}

	/** Draws the box at its current position on to surface. */
	public void draw(Graphics surface) {
		// Draw the object
		surface.setColor(color);
		surface.drawOval(x - SIZE, y - SIZE, SIZE, SIZE);
		surface.fillOval(x - SIZE, y - SIZE, SIZE, SIZE);
		//surface.fillRect(x - SIZE / 2, y - SIZE / 2, SIZE, SIZE);
		surface.setColor(Color.BLACK);
		((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
		//surface.drawRect(x - SIZE / 2, y - SIZE / 2, SIZE, SIZE);
		// Move the center of the object each time we draw it
		x += xDirection;
		y += yDirection;
		// If we have hit the edge and are moving in the wrong direction,
		// reverse direction
		// We check the direction because if a box is placed near the wall, we
		// would get "stuck"
		// rather than moving in the right direction
		if ((x - SIZE / 2 <= 0 && xDirection < 0) || (x + SIZE / 2 >= SimpleDraw.WIDTH && xDirection > 0)) {
			xDirection = -xDirection;
		}
		if ((y - SIZE / 2 <= 0 && yDirection < 0) || (y + SIZE / 2 >= SimpleDraw.HEIGHT && yDirection > 0)) {
			yDirection = -yDirection;
		}
	}

	public void setMovementVector(int xIncrement, int yIncrement) {
		xDirection = xIncrement;
		yDirection = yIncrement;
	}
}
