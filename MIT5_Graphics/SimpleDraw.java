import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

/** Displays a window and delegates drawing to DrawGraphics. */
public class SimpleDraw extends JPanel implements Runnable {    
    private static final long serialVersionUID = -7469734580960165754L;
    private boolean animate = true;
    private final int FRAME_DELAY = 50; // 50 ms = 20 FPS
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;
    private DrawGraphics draw;

    
    public SimpleDraw(DrawGraphics drawer) {
        this.draw = drawer;
    }

    /** Paint callback from Swing. Draw graphics using g. */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Enable anti-aliasing for better looking graphics
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        draw.draw(g2);
    }

    /** Enables periodic repaint calls. */
    public synchronized void start() {
        animate = true;
    }

    /** Pauses animation. */
    public synchronized void stop() {
        animate = false;
    }

    private synchronized boolean animationEnabled() {
        return animate;
    }

    public void run() {
        while (true) {
            if (animationEnabled()) {
                repaint();
            }

            try {
                Thread.sleep(FRAME_DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // setFrame: Originally part of main() - sets the details of the box
    // input: a frame (window), content (details of the bouncing objects inside it)
    public static void setFrame(JFrame frame, SimpleDraw content) {
        Color bgColor = Color.white;
        frame.setBackground(bgColor);
        content.setBackground(bgColor);
        content.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setContentPane(content);
        frame.setResizable(false);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
            public void windowDeiconified(WindowEvent e) { content.start(); }
            public void windowIconified(WindowEvent e) { content.stop(); }
        });

        new Thread(content).start();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        final SimpleDraw content_C = new SimpleDraw(new DrawGraphics_C());
        final SimpleDraw content_J = new SimpleDraw(new DrawGraphics_J());

        JFrame frame_C = new JFrame("Cheryl's Box!");
        setFrame(frame_C, content_C);

        JFrame frame_J = new JFrame("Jen's Box!");
        setFrame(frame_J, content_J);

        // Add more below - requires a different frame and content name
        // note that different DrawGraphics files must be named differently (filename, class name, constructor)
        // and the "public class DrawGraphics..." bit should have "extends DrawGraphics" after it
    }
} 