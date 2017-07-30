import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	ArrayList<Bouncer> myBouncer = new ArrayList<Bouncer>();
	// Bouncer movingSprite;
	//
	ArrayList<StraightMover> myMover = new ArrayList<StraightMover>();
	// Bouncer mover;

	/** Initializes this class for drawing. */
	public DrawGraphics() {
		Rectangle box = new Rectangle(15, 20, Color.RED);
		myBouncer.add(new Bouncer(20, 30, box));
		myBouncer.get(0).setMovementVector(2, 3);

		Rectangle box1 = new Rectangle(75, 40, Color.GREEN);
		myBouncer.add(new Bouncer(10, 40, box1));
		myBouncer.get(1).setMovementVector(1, 4);
		
		Rectangle box2 = new Rectangle(10, 40, Color.BLUE);
		myMover.add(new StraightMover(40, 80, box2));
		myMover.get(0).setMovementVector(4, 1);
		
		Rectangle box3 = new Rectangle(100, 60, Color.RED);
		myMover.add(new StraightMover(80, 20, box3));
		myMover.get(1).setMovementVector(3, 1);

		Oval myOval = new Oval(60, 40, Color.ORANGE);
		myBouncer.add(new Bouncer(60, 60, myOval));
		myBouncer.get(2).setMovementVector(2, 4);
		
		Oval myOval2 = new Oval(55, 20, Color.PINK);
		myMover.add(new StraightMover(50, 180, myOval2));
		myMover.get(2).setMovementVector(2, 4);
		
		Oval myOval3 = new Oval(85, 40, Color.yellow);
		myMover.add(new StraightMover(30, 100, myOval3));
		myMover.get(3).setMovementVector(4, 1);

		threeDrectangle threeD = new threeDrectangle(50, 60, Color.MAGENTA, true);
		myBouncer.add(new Bouncer(60, 80, threeD));
		myBouncer.get(3).setMovementVector(3, 3);
		
		threeDrectangle threeD1 = new threeDrectangle(100, 20, Color.BLUE, true);
		myBouncer.add(new Bouncer(100, 40, threeD1));
		myBouncer.get(4).setMovementVector(5, 2);
		
		threeDrectangle threeD2 = new threeDrectangle(40, 30, Color.green, true);
		myMover.add(new StraightMover(20, 60, threeD2));
		myMover.get(4).setMovementVector(5, 3);

		myString str1 = new myString("Java is fun :)", 80, 100, Color.blue);
		myBouncer.add(new Bouncer(20, 100, str1));
		myBouncer.get(5).setMovementVector(1, 4);
		
		myString str2 = new myString("Go JAVA", 40, 100, Color.black);
		myBouncer.add(new Bouncer(10, 80, str2));
		myBouncer.get(6).setMovementVector(6, 4);

	}

	/** Draw the contents of the window on surface. */
	public void draw(Graphics surface) {

		for (StraightMover sprite : myMover) {
			sprite.draw(surface);
		}
		for (Bouncer movingSprite : myBouncer) {
			movingSprite.draw(surface);
		}
	}
}
