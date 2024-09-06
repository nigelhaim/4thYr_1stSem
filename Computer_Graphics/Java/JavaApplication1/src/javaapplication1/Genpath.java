package javaapplication1;
import java.awt.*;
import java.awt.geom.*;

public class Genpath extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(8.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.BOLD, 25));
        
       GeneralPath gp = new GeneralPath();
       gp.moveTo(50, 50); // width, width
       gp.lineTo(50, 200);
       gp.quadTo(150, 500, 250, 200);
       gp.curveTo(350, 100, 150, 150, 100, 100);
       gp.lineTo(50, 50);
       g2d.setPaint(Color.ORANGE);
       g2d.draw(gp);
       g2d.setPaint(Color.PINK);
       g2d.fill(gp);
        
        // Draw the car with the given parameters
        GeneralPath car = new GeneralPath();
        car.moveTo(60, 120);
        car.lineTo(80, 120);
        // front wheel:
        car.quadTo(90, 140, 100, 120); // control point, terminal point
        car.lineTo(160, 120);
        // rear wheel:
        car. quadTo(170, 150, 180, 120);
        car.lineTo(200, 120);
        car.curveTo(195, 100, 200, 80, 160, 80);
        // control point, control point
        
        // roof:
        car.lineTo(100, 80);
        // windshield:
        car.lineTo(90, 100);
        car.lineTo(60, 100);
        // closing of the image:
        car.lineTo(60, 120);
        g2d.setPaint(Color.BLUE);
        g2d.fill(car);
        //g2d.draw(car);
    }
    
    
    public static void main(String[] args) {
       Genpath gp = new Genpath();
        gp.setTitle("General Path Shapes in Java");
        gp.setBackground(Color.BLACK);
        gp.setSize(800, 500);
        gp.setForeground(Color.BLUE);
        gp.setVisible(true);
    }
    
}
