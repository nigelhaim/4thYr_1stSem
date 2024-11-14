import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class MovingCar extends JPanel {
    private double translateX = 0;
    private double translateY = 50;
    //private double rotationAngle = 0;
    //private double scale = 1.5;

    public MovingCar() {
        Timer timer = new Timer(10, e -> {
            //Update transformations for animation
           translateX += 1;
           //rotationAngle += Math.toRadians(3);
            //scale = 1.0 + 0.5 * Math.sin(System.currentTimeMillis() * 0.002);
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Clear the background
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Apply transformations
        AffineTransform transform = new AffineTransform();
       transform.translate(translateX, translateY);
       //transform.rotate(rotationAngle, 50, 15); // Rotating around the car's center (50, 25)
        //transform.scale(scale, scale);

        // Draw the car shape
        g2d.setTransform(transform);
        g2d.setColor(Color.RED);
        g2d.fillRect(0, 0, 100, 50); // Body of the car

        // Wheels
        g2d.setColor(Color.BLACK);
        g2d.fillOval(10, 40, 20, 20); // Rear wheel
        g2d.fillOval(70, 40, 20, 20); // Front wheel
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Car Animation");
        MovingCar a= new MovingCar();
        frame.add(a);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}