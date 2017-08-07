import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {

    private LoadSquare sourceSqr;

    /** Initializes this class for drawing. */
    public DrawGraphics(LoadSquare myChkSqr) {

        sourceSqr = myChkSqr;
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {

        int tX = 10;
        int tY = 10;

        //surface.drawLine(50, 50, 250, 250);

        Rectangle box = new Rectangle(30, 30, Color.GREEN);

        for(int i = 0; i < sourceSqr.arraySize; i++){
            for (int ii = 0; ii < sourceSqr.arraySize; ii++) {

                box.draw(surface, tX, tY);

                MyString newStr = new MyString(Integer.toString(sourceSqr.magicArray[i][ii]),10, 10, Color.BLUE);
                newStr.draw(surface, (tX + (box.getWidth()/2) + 6), (tY + (box.getHeight()/2) + 5) );

                tY = tY + box.getHeight();
            }

            tX = tX + box.getWidth();
            tY = 10;
        }

    }
}
/*
 // Draw the object
		surface.setColor(color);
        surface.drawString(str, x, y);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
 */