import java.awt.*;
import java.awt.geom.*;

public class LongExam extends Frame{
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(10.0f);
        g2d.setStroke(bs);

        //Creating General Path for the shirt 

        GeneralPath shirt = new GeneralPath();
        shirt.moveTo(100,250); 
        shirt.lineTo(150,250);
        shirt.lineTo(150,200);
        shirt.lineTo(200,200);
        shirt.lineTo(200,500);
        shirt.lineTo(400,500);
        shirt.lineTo(400,200);
        shirt.lineTo(450,200);
        shirt.lineTo(450,250);
        shirt.lineTo(500,250);
        shirt.lineTo(500,150);
        shirt.lineTo(450,100);
        shirt.lineTo(150,100);
        shirt.lineTo(100,150);
        shirt.lineTo(100,250);

        g2d.setPaint(Color.BLACK);
        g2d.draw(shirt);
        g2d.setPaint(Color.MAGENTA);
        g2d.fill(shirt);


    }
    public static void main(String[] args){
        LongExam gp = new LongExam();
        gp.setTitle("Sebastian_LongExam");
        gp.setBackground(Color.WHITE);
        gp.setSize(600, 600);
        gp.setForeground(Color.BLACK);
        gp.setVisible(true);
    }
}