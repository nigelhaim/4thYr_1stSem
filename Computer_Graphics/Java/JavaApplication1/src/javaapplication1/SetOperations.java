package pkg4csc_graphics;

import java.awt.*;
import java.awt.geom.*;

public class SetOperations extends Frame {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(7.0f);
        g2d.setStroke(bs);

        Ellipse2D.Double e1 = new Ellipse2D.Double(40, 40, 300, 200);
        Ellipse2D.Double circ = new Ellipse2D.Double(80, 100, 200, 200);
        Rectangle2D.Double rect = new Rectangle2D.Double(230, 100, 200, 300);
        Rectangle2D.Double sq = new Rectangle2D.Double(200, 150, 200, 200);

        // g2d.draw(e1);
        // g2d.draw(circ);
        g2d.draw(rect);
        g2d.draw(sq);

        Area e = new Area(e1);
        Area c = new Area(circ);
        Area r = new Area(rect);
        Area s = new Area(sq);
        g2d.setPaint(Color.yellow);
        // e.add(r);
        // g2d.fill(e);

        // c.intersect(s);
        // g2d.fill(c);

        // c.subtract(s);
        // g2d.fill(c);

        // s.subtract(c);
        // g2d.fill(s);

        r.exclusiveOr(s);
        g2d.fill(r);
    }

    public static void main(String[] args) {
        SetOperations s = new SetOperations();
        s.setTitle("String and Graphics 2D in Java");
        s.setBackground(Color.BLACK);
        s.setSize(1000, 1000);
        s.setForeground(Color.WHITE);
        s.setVisible(true);
    }
}
