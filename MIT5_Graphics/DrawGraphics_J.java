
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;

// This DrawGraphics class was made by Jen.

public class DrawGraphics_J extends DrawGraphics {
	BouncingBox box;
	Oval oval;
	ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();
	ArrayList<Oval> ovals = new ArrayList<Oval>();
	
	/** Initializes this class for drawing. */
	public DrawGraphics_J() {
		box = new BouncingBox(200, 50, Color.RED);
		boxes.add(new BouncingBox(10, 10, Color.BLUE));
		boxes.add(new BouncingBox(100, 100, Color.GREEN));
		boxes.add(new BouncingBox(200, 200, Color.YELLOW));
		boxes.add(new BouncingBox(100, 100, Color.BLACK));
		boxes.add(new BouncingBox(100, 100, Color.ORANGE));
		boxes.add(new BouncingBox(100, 100, Color.magenta));
		boxes.get(0).setMovementVector(1, 0);
		boxes.get(1).setMovementVector(-3, -2);
		boxes.get(2).setMovementVector(0, -2);
		boxes.get(3).setMovementVector(1, 0);
		boxes.get(4).setMovementVector(-3, -2);
		boxes.get(5).setMovementVector(0, -1);
		oval = new Oval(180,200, 80,90, Color.RED);
		ovals.add(new Oval(140,80,20,80,Color.GREEN));
		ovals.get(0).setMovementVector(2, -2);
		
	}

	/**
	 * Draw the contents of the window on surface. Called 20 times per second.
	 */
	public void draw(Graphics surface) {
		surface.drawLine(50, 50, 250, 250);
		box.draw(surface);
		surface.drawOval(100, 80, 75, 110);
		surface.setColor(Color.cyan);
		surface.fillOval(100, 80, 75, 110);
		surface.draw3DRect(150, 200, 120, 80, true);
		surface.setColor(Color.pink);
		surface.fill3DRect(150, 200, 120, 80, true);
		surface.setColor(Color.BLUE);
		surface.drawString("Hello There!!!", 100, 150);
		
		for(BouncingBox box: boxes){
			box.draw(surface);
		}
		
		for(Oval oval: ovals){
			oval.draw(surface);
		}
	}
}
