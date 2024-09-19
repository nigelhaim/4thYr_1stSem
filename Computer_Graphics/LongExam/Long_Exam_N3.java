import java.awt.*;
import java.awt.geom.*;

public class Long_Exam_N3 extends Frame{
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(10.0f);
        g2d.setStroke(bs);
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

        GeneralPath boat = new GeneralPath();
        boat.moveTo(100, 350); 
        boat.lineTo(150, 450);
        boat.lineTo(450, 450); 
        boat.lineTo(500, 350); 
        boat.lineTo(305, 350); 
        boat.lineTo(295, 350); 
        boat.lineTo(295, 150); 
        boat.lineTo(305, 150); 
        boat.lineTo(305, 200); 
        boat.lineTo(405, 200); 
        boat.lineTo(305, 150); 
        boat.lineTo(305, 350); 
        boat.lineTo(100, 350); 

        Area a = new Area(shirt);
        Area b = new Area(boat);
        Area symmetricDifference = new Area(a);
        Area intersection = new Area(a);
        symmetricDifference.add(b); 
        intersection.intersect(b); 
        symmetricDifference.subtract(intersection);
        g2d.setColor(Color.ORANGE); 
        g2d.fill(symmetricDifference);
        g2d.setColor(Color.BLACK);
        g2d.draw(shirt);
        g2d.draw(boat);
    }
public static void main(String[] args){
        Long_Exam_N3 gp = new Long_Exam_N3();
        gp.setTitle("Sebastian_LongExam");
        gp.setBackground(Color.WHITE);
        gp.setSize(600, 600);
        gp.setForeground(Color.BLACK);
        gp.setVisible(true);
    }
}