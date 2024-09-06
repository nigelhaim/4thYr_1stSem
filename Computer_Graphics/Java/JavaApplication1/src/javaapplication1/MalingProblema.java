package javaapplication1;
import java.awt.*;
import java.awt.geom.*;

public class MalingProblema extends Frame {
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;   
        BasicStroke bs = new BasicStroke(8.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.BOLD, 25));

        GeneralPath gp = new GeneralPath();
        gp.moveTo(250, 280); 
        gp.lineTo(350, 280);
        gp.quadTo(390, 280, 390, 320);
        gp.quadTo(390, 360, 350, 360);
        gp.lineTo(250, 360);
        gp.lineTo(250, 460);
        gp.quadTo(250, 500, 210, 500);
        gp.quadTo(170, 500, 170, 460);
        gp.lineTo(170, 360);
        gp.lineTo(70, 360);
        gp.quadTo(30, 360, 30, 320);
        gp.quadTo(30, 280, 70, 280);
        gp.lineTo(170, 280);
        gp.lineTo(170, 180);
        gp.quadTo(170, 140, 210, 140);
        gp.quadTo(250, 140, 250, 180);
        gp.lineTo(250, 280);
        g2d.setPaint(Color.BLACK);
        g2d.draw(gp);

    }

    public static void main(String[] args) {
        MalingProblema mp = new MalingProblema();
        mp.setTitle("Maling Problema");
        mp.setBackground(Color.WHITE);
        mp.setSize(800, 500);
        mp.setForeground(Color.BLACK);
        mp.setVisible(true);
    }
}