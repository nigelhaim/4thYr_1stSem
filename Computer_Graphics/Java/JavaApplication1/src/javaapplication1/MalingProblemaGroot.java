package javaapplication1;
import java.awt.*;
import java.awt.geom.*;

public class MalingProblemaGroot extends Frame{

    public void paint(Graphics g){
        Graphics2D g2d  = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(8.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.BOLD, 25));
        //Create Tree
        GeneralPath gp = new GeneralPath();
        gp.moveTo(300, 100);
        gp.lineTo(250, 250);
        gp.lineTo(350, 250);
        gp.lineTo(300, 100);
        g2d.draw(gp);

        gp.moveTo(300, 175);
        gp.lineTo(190, 400);
        gp.lineTo(410, 400);
        gp.lineTo(300, 175);
        g2d.draw(gp);
        
        gp.moveTo(300, 200);
        gp.lineTo(140, 550);
        gp.lineTo(460, 550);
        gp.lineTo(300, 200);
        g2d.setPaint(Color.GREEN);
        g2d.draw(gp);
        g2d.fill(gp);
        


        //create base
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(315, 555);
        gp2.lineTo(315, 585);
        gp2.lineTo(285, 585);
        gp2.lineTo(285, 555);
        g2d.setPaint(Color.GRAY);
        g2d.draw(gp2);
        g2d.fill(gp2);

        //create star
        GeneralPath gp3 = new GeneralPath();
        gp3.moveTo(300, 100);
        gp3.lineTo(320, 80);
        gp3.lineTo(300, 70);
        gp3.lineTo(280, 80);
        gp3.lineTo(300, 100);
        g2d.setPaint(Color.YELLOW);
        g2d.draw(gp3);
        g2d.fill(gp3);

    }

    public static void main(String[] args) {
        MalingProblemaGroot mp = new MalingProblemaGroot();
        mp.setTitle("Maling Problema Tree");
        mp.setBackground(Color.WHITE);
        mp.setSize(1000, 1000);
        mp.setForeground(Color.BLACK);
        mp.setVisible(true);
    }
}