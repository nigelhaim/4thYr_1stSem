package javaapplication1;

import java.awt.*;
import java.awt.geom.*;

public class String_and_graphics_2d extends Frame{
    public void paint(Graphics g){
        //Create the canvas and put the heading title
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(7.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Serif", Font.BOLD, 24));
        g2d.drawString("Welcome 4CSC in Graphics using Java", 50, 75); 

        //Draw a line 
        Line2D.Double l1 = new Line2D.Double(75, 120, 250, 350);
        g2d.draw(l1);

        //Draw a quad curve
        QuadCurve2D.Double q1 = new QuadCurve2D.Double(75, 120, 150, 400, 250, 350);
        g2d.setPaint(Color.pink);
        g2d.draw(q1);

        //Draw a cubic curve
        CubicCurve2D.Double c1 = new CubicCurve2D.Double(75, 120, 120, 20, 300, 200, 250, 350);
        g2d.setPaint(Color.orange);
        g2d.draw(c1);

        //Draw a rectangle
        Rectangle2D.Double r1 = new Rectangle2D.Double(250, 100, 300, 175);
        g2d.setPaint(Color.green);
        g2d.draw(r1);
        g2d.setPaint(Color.red);
        g2d.fill(r1);

        //Draw an ellipse
        Ellipse2D.Double e1 = new Ellipse2D.Double(300, 150, 350, 225);
        g2d.setPaint(Color.yellow);
        g2d.draw(e1);
        
        //Draw an arc
        // Arc2D.Double a1 = new Arc2D.Double(300, 150, 350, 225, 0, 90, Arc2D.PIE);
        Arc2D.Double a1 = new Arc2D.Double(r1, 30, 70, Arc2D.PIE);
        g2d.setPaint(Color.magenta);
        g2d.draw(a1);

        Arc2D.Double a2 = new Arc2D.Double(r1, 120, 60, Arc2D.CHORD);
        g2d.setPaint(Color.white);
        g2d.draw(a2);

        //Draw an open arc
        Arc2D.Double a3 = new Arc2D.Double(r1, 190, 70, Arc2D.OPEN);
        g2d.setPaint(Color.blue);
        g2d.draw(a3);    

        //Draw a circle
    //     Ellipse2D.Double c2 = new Ellipse2D.Double(300, 300, 300, 300);
    //     g2d.setPaint(Color.lightGray);
    //     g2d.draw(c2);
    }

    public static void main(String[] args) {
        String_and_graphics_2d s = new String_and_graphics_2d();
        s.setTitle("String and Graphics 2D in Java");
        s.setBackground(Color.black);
        s.setSize(900, 900);
        s.setForeground(Color.cyan);
        s.setVisible(true);
    }
}