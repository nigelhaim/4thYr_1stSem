/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sebastian_nh_mc1;

/**
 *
 * @author nigel
 */
import java.awt.*;
import java.awt.geom.*;
public class Sebastian_NH_MC1 extends Frame {

    /**
     * @param args the command line arguments
     */

    public void paint(Graphics g){

        //Global Variables
        Color lines_color = Color.black;
        Color EllipseCircle_color = Color.yellow;
        Color CubicCurve_color = Color.blue;
        Color Arc_color = Color.orange;
        Color QuadCurve_color = Color.green;
        Color Rectangle_color = Color.red;
        Color String_color = Color.black;

        int line_width = 5;  
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(7.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Times", Font.BOLD, 16));
        g2d.drawString("Nigel Haim N. Sebastian | 4CSC", 10, 50);
        g2d.drawString("MP 1", 10, 80);

        //Draw a lines
        Line2D.Double l1 = new Line2D.Double(50, 475, 500, 125);
        Line2D.Double l2 = new Line2D.Double(500, 125, 300, 300);
        Line2D.Double l3 = new Line2D.Double(300, 300, 450, 500);
        Line2D.Double l4 = new Line2D.Double(450, 500, 200, 375);
        Line2D.Double l5 = new Line2D.Double(200, 375, 50, 475);

        g2d.setPaint(lines_color);

        g2d.draw(l1);
        g2d.draw(l2);
        g2d.draw(l3);
        g2d.draw(l4);
        g2d.draw(l5);

        g2d.drawString("Line1", 500, 125);
        g2d.drawString("Line2", 300, 300);
        g2d.drawString("Line3", 450, 500);
        g2d.drawString("Line4", 200, 375);
        g2d.drawString("Line5", 50, 475);

        //Draw Quadratic Curve

        QuadCurve2D.Double q1 = new QuadCurve2D.Double(175, 500, 200, 300, 400, 550);
        g2d.setPaint(QuadCurve_color);
        g2d.draw(q1);
        g2d.setPaint(String_color);
        g2d.drawString("Quadratic Curve", 175, 500);
        
        //Draw Cubic Curve
        CubicCurve2D.Double c1 = new CubicCurve2D.Double(375,300, 450, 550, 550, 450, 575, 350);
        g2d.setPaint(CubicCurve_color);
        g2d.draw(c1);
        g2d.setPaint(String_color);
        g2d.drawString("Cubic Curve", 375, 300);
        
        //Draw Rectangle
        Rectangle2D.Double r1 = new Rectangle2D.Double(100, 100, 150, 200);
        g2d.setPaint(Rectangle_color);
        g2d.draw(r1);
        g2d.setPaint(String_color);
        g2d.drawString("Rectangle", 100, 100);

        //Draw Ellipse 
        Ellipse2D.Double e1 = new Ellipse2D.Double(100, 60, 120, 90);
        g2d.setPaint(EllipseCircle_color);
        g2d.draw(e1);
        g2d.setPaint(String_color);
        g2d.drawString("Ellipse", 100, 60);

        //Draw an Arc
        Rectangle2D.Double r2 = new Rectangle2D.Double(300,50, 100, 75);
        Arc2D.Double a1 = new Arc2D.Double(r2, 15, 75, Arc2D.PIE);
        g2d.setPaint(Arc_color);
        g2d.draw(a1);
        g2d.setPaint(String_color);
        g2d.drawString("Arc", 300, 50);

    }

    public static void main(String[] args) {
        Sebastian_NH_MC1 frame = new Sebastian_NH_MC1();
        frame.setTitle("Nigel Haim N. Sebastian | 4CSC | MP 1");
        frame.setBackground(Color.white);
        frame.setSize(700,700);
        frame.setVisible(true);
    }
    
}
