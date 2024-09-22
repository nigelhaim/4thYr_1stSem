import java.awt.*;
import java.awt.geom.*;

public class LongExam_Boat extends Frame{
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(1.0f);
        g2d.setStroke(bs);

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
        g2d.setPaint(Color.BLACK);
        g2d.draw(boat);
        g2d.setColor(Color.GREEN);
        g2d.fill(boat);
        
    }
public static void main(String[] args){
        LongExam_Boat gp = new LongExam_Boat();
        gp.setTitle("Sebastian_LongExam");
        gp.setBackground(Color.WHITE);
        gp.setSize(600, 600);
        gp.setForeground(Color.BLACK);
        gp.setVisible(true);
    }
}