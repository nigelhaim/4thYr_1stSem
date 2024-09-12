package sebastian_nh_mp2;

/**
 *
 * @author nigel
 */

import java.awt.*;
import java.awt.geom.*;
public class Sebastian_NH_MP2 extends Frame{

    /**
     * @param args the command line arguments
     */

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(8.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.BOLD, 25));

        // Create Tree
        GeneralPath gp = new GeneralPath();
        gp.moveTo(300, 100);
        gp.lineTo(250, 250);
        gp.lineTo(350, 250);
        gp.lineTo(300, 100);

        gp.moveTo(300, 175);
        gp.lineTo(190, 400);
        gp.lineTo(410, 400);
        gp.lineTo(300, 175);

        gp.moveTo(300, 200);
        gp.lineTo(140, 550);
        gp.lineTo(460, 550);
        gp.lineTo(300, 200);

        Area treeArea = new Area(gp);
        g2d.setPaint(Color.GREEN);
        g2d.draw(treeArea);
        g2d.fill(treeArea);

        // Create base
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(315, 555);
        gp2.lineTo(315, 585);
        gp2.lineTo(285, 585);
        gp2.lineTo(285, 555);

        Area baseArea = new Area(gp2);
        g2d.setPaint(Color.GRAY);
        g2d.draw(baseArea);
        g2d.fill(baseArea);

        // Create star
        GeneralPath gp3 = new GeneralPath();
        gp3.moveTo(300, 100);
        gp3.lineTo(320, 80);
        gp3.lineTo(300, 70);
        gp3.lineTo(280, 80);
        gp3.lineTo(300, 100);

        Area starArea = new Area(gp3);
        g2d.setPaint(Color.YELLOW);
        g2d.draw(starArea);
        g2d.fill(starArea);
    }


    public static void main(String[] args){
        Sebastian_NH_MP2 mp = new Sebastian_NH_MP2();
        mp.setTitle("Nigel Haim N. Sebastian | 4CSC | MP 2 | Christmas tree");
        mp.setSize(800, 800);
        mp.setVisible(true);
    }
    
}
