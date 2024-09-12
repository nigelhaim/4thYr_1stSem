package javaapplication1;
import java.awt.*;
import java.awt.geom.*;

public class genpath_java extends Frame {    
    // {
    //     // add WindowListener(new CloswMyWindow());

    // }

    public void paint(Graphics g){     
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(10.0f);
        g2d.setStroke(bs);

        Creating General Path 
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(50,50); //initial point 
        gp1.lineTo(50,200); // creating line thru GP
        gp1.quadTo(150,500,250,200); //creating quadcurve thru GP
        gp1.curveTo(350,100,150,150,100,100); //creating cubic curve thru GP
        gp1.lineTo(50,50); //closing the gp1 object

        g2d.setPaint(Color.RED);
        g2d.draw(gp1);
        g2d.setPaint(Color.YELLOW); 
        g2d.fill(gp1);

        GeneralPath car = new GeneralPath();
        car.moveTo(60, 120);//initial point
        car.lineTo(80, 120);//front underbody
        car.quadTo(90, 140, 100, 120);// front wheel 
        car.lineTo(160, 120);//middle underbody 
        car.quadTo(170, 140, 180, 120);//rear wheel
        car.lineTo(200, 120);//rear underbody
        car.curveTo(190, 100, 200, 80, 160, 80); //rear 
        car.lineTo(100, 80);//roof
        car.lineTo(60, 100);//bonnet
        car.lineTo(60, 120);//closing the car object
        g2d.setPaint(Color.PINK);
        g2d.fill(car);
    }

    public static void main(String[] args){
        genpath_java gp = new genpath_java();
        gp.setTitle("General Path in Java");
        gp.setBackground(Color.GRAY);
        gp.setSize(1000, 1000);
        gp.setForeground(Color.GREEN);
        gp.setVisible(true);
    }
}