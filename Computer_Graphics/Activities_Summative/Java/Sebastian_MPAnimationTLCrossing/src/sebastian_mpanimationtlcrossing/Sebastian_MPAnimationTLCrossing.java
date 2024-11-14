/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sebastian_mpanimationtlcrossing;

/**
 *
 * @author nigel
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Date;

public class Sebastian_MPAnimationTLCrossing extends Frame{

    /**
     * @param args the command line arguments
     */
    public void paint (Graphics g){
            
       Graphics2D g2d = (Graphics2D) g;
       BasicStroke stroke = new BasicStroke(5.0f);
        g2d.setStroke(stroke);
        
        g2d.setPaint(Color.BLACK);
        GeneralPath road = new GeneralPath();
        road.moveTo(0,300);
        road.lineTo(500,300);
        road.lineTo(500,0);
        road.lineTo(800,0);
        road.lineTo(800,300);
        road.lineTo(1300,300);
        road.lineTo(1300,450);
        road.lineTo(800,450);
        road.lineTo(800,800);
        road.lineTo(500,800);
        road.lineTo(500,450);
        road.lineTo(0,450);
        road.lineTo(0,300);
        g2d.draw(road);
        g2d.setPaint(Color.GRAY);
        g2d.fill(road);
      
        g2d.setPaint(Color.YELLOW);
        GeneralPath road1 = new GeneralPath ();
        road1.moveTo(645,0);
        road1.lineTo(645,300);
        road1.moveTo(655,0);
        road1.lineTo(655,300);
        road1.moveTo(645,450);
        road1.lineTo(645,800);
        road1.moveTo(655,450);
        road1.lineTo(655,800);
        road1.moveTo(0,370);
        road1.lineTo(500,370);
        road1.moveTo(0,380);
        road1.lineTo(500,380);
        road1.moveTo(800,370);
        road1.lineTo(1300,370);
        road1.moveTo(800,380);
        road1.lineTo(1300,380);
        g2d.draw(road1);

        //Stoplight QUADRANT TWO ============================================================
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke (3.0f));
        Rectangle2D.Double QuadTwoSL = new Rectangle2D.Double(200,100,90,180);
        Color darkyellow = new Color(189,145,0);
        g2d.setColor(darkyellow);
        g2d.fill(QuadTwoSL);
        g2d.draw(QuadTwoSL);
        g2d.setColor(Color.BLACK);
        
        Rectangle2D.Double QuadTwoSLBorder = new Rectangle2D.Double(200,100,90,180);
        g2d.draw(QuadTwoSLBorder);

        Rectangle2D.Double QuadTwo_timer = new Rectangle2D.Double(290,120,150,140);
        g2d.setColor(darkyellow);
        g2d.fill(QuadTwo_timer);
        g2d.setColor(Color.BLACK);
        g2d.draw(QuadTwo_timer);

        Rectangle2D.Double QuadTwo_Timer_BL = new Rectangle2D.Double(300,130,130,120);
        g2d.setColor(Color.BLACK);
        g2d.fill(QuadTwo_Timer_BL);
        g2d.draw(QuadTwo_Timer_BL);

        Rectangle2D.Double QuadTwo_RedBox = new Rectangle2D.Double(200,100,90,50);
        g2d.draw(QuadTwo_RedBox);
        Ellipse2D.Double QuadTwo_red = new Ellipse2D.Double(230,110,30,30);
        g2d.draw(QuadTwo_red);
        g2d.fill(QuadTwo_red);

        Rectangle2D.Double QuadTwo_YellowBox = new Rectangle2D.Double(200,160,90,50);
        g2d.draw(QuadTwo_YellowBox);
        Ellipse2D.Double QuadTwo_yellow = new Ellipse2D.Double(230,170,30,30);
        g2d.draw(QuadTwo_yellow);
        g2d.fill(QuadTwo_yellow);
 
        Rectangle2D.Double QuadTwo_GreenBox = new Rectangle2D.Double(200,220,90,50);
        g2d.draw(QuadTwo_GreenBox);
        Ellipse2D.Double QuadTwo_green = new Ellipse2D.Double(230,230,30,30);
        g2d.draw(QuadTwo_green);
        g2d.fill(QuadTwo_green);

        g2d.setColor(Color.RED);
        String QuadTwoSLtime = "00";
        g2d.setFont(new Font("Arial", Font.BOLD, 80));
        g2d.drawString(QuadTwoSLtime, 320, 220);
    
        //Stoplight QUADRANT THREE ============================================================
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke (3.0f));
        Rectangle2D.Double QuadThreeSL = new Rectangle2D.Double(200,500,90,180);
        g2d.setColor(darkyellow);
        g2d.fill(QuadThreeSL);
        g2d.draw(QuadThreeSL);
        g2d.setColor(Color.BLACK);

        Rectangle2D.Double QuadThreeSLBorder = new Rectangle2D.Double(200,500,90,180);
        g2d.draw(QuadThreeSLBorder);

        Rectangle2D.Double QuadThree_timer = new Rectangle2D.Double(290,520,150,140);
        g2d.setColor(darkyellow);
        g2d.fill(QuadThree_timer);
        g2d.setColor(Color.BLACK);
        g2d.draw(QuadThree_timer);

        Rectangle2D.Double QuadThree_Timer_BL = new Rectangle2D.Double(300,530,130,120);
        g2d.setColor(Color.BLACK);
        g2d.fill(QuadThree_Timer_BL);
        g2d.draw(QuadThree_Timer_BL);

        Rectangle2D.Double QuadThree_RedBox = new Rectangle2D.Double(200,500,90,50);
        g2d.draw(QuadThree_RedBox);
        Ellipse2D.Double QuadThree_red = new Ellipse2D.Double(230,510,30,30);
        g2d.draw(QuadThree_red);
        g2d.fill(QuadThree_red);

        Rectangle2D.Double QuadThree_YellowBox = new Rectangle2D.Double(200,560,90,50);
        g2d.draw(QuadThree_YellowBox);
        Ellipse2D.Double QuadThree_yellow = new Ellipse2D.Double(230,570,30,30);
        g2d.draw(QuadThree_yellow);
        g2d.fill(QuadThree_yellow);

        Rectangle2D.Double QuadThree_GreenBox = new Rectangle2D.Double(200,620,90,50);
        g2d.draw(QuadThree_GreenBox);
        Ellipse2D.Double QuadThree_green = new Ellipse2D.Double(230,630,30,30);
        g2d.draw(QuadThree_green);
        g2d.fill(QuadThree_green);

        g2d.setColor(Color.RED);
        String QuadThreeSLtime = "00";
        g2d.setFont(new Font("Arial", Font.BOLD, 80));
        g2d.drawString(QuadThreeSLtime, 320, 620);

        //Stoplight QUADRANT FOUR ============================================================
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke (3.0f));
        Rectangle2D.Double QuadFourSL = new Rectangle2D.Double(1000,500,90,180);
        g2d.setColor(darkyellow);
        g2d.fill(QuadFourSL);
        g2d.draw(QuadFourSL);

        g2d.setColor(Color.BLACK);
        Rectangle2D.Double QuadFourSLBorder = new Rectangle2D.Double(1000,500,90,180);
        g2d.draw(QuadFourSLBorder);

        Rectangle2D.Double QuadFour_timer = new Rectangle2D.Double(1090,520,150,140);
        g2d.setColor(darkyellow);
        g2d.fill(QuadFour_timer);
        g2d.setColor(Color.BLACK);
        g2d.draw(QuadFour_timer);

        Rectangle2D.Double QuadFour_Timer_BL = new Rectangle2D.Double(1100,530,130,120);
        g2d.setColor(Color.BLACK);
        g2d.fill(QuadFour_Timer_BL);
        g2d.draw(QuadFour_Timer_BL);

        Rectangle2D.Double QuadFour_RedBox = new Rectangle2D.Double(1000,500,90,50);
        g2d.draw(QuadFour_RedBox);
        Ellipse2D.Double QuadFour_red = new Ellipse2D.Double(1030,510,30,30);
        g2d.draw(QuadFour_red);
        g2d.fill(QuadFour_red);

        Rectangle2D.Double QuadFour_YellowBox = new Rectangle2D.Double(1000,560,90,50);
        g2d.draw(QuadFour_YellowBox);
        Ellipse2D.Double QuadFour_yellow = new Ellipse2D.Double(1030,570,30,30);
        g2d.draw(QuadFour_yellow);
        g2d.fill(QuadFour_yellow);

        Rectangle2D.Double QuadFour_GreenBox = new Rectangle2D.Double(1000,620,90,50);
        g2d.draw(QuadFour_GreenBox);
        Ellipse2D.Double QuadFour_green = new Ellipse2D.Double(1030,630,30,30);
        g2d.draw(QuadFour_green);
        g2d.fill(QuadFour_green);

        g2d.setColor(Color.RED);
        String QuadFourSLtime = "00";
        g2d.setFont(new Font("Arial", Font.BOLD, 80));
        g2d.drawString(QuadFourSLtime, 1120, 620);

        //Stoplight QUADRANT ONE ============================================================
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke (3.0f));
        Rectangle2D.Double QuadOneSL = new Rectangle2D.Double(1000,100,90,180);
        g2d.setColor(darkyellow);
        g2d.fill(QuadOneSL);
        g2d.draw(QuadOneSL);

        g2d.setColor(Color.BLACK);
        Rectangle2D.Double QuadOneSLBorder = new Rectangle2D.Double(1000,100,90,180);
        g2d.draw(QuadOneSLBorder);

        Rectangle2D.Double QuadOne_timer = new Rectangle2D.Double(1090,120,150,140);
        g2d.setColor(darkyellow);
        g2d.fill(QuadOne_timer);
        g2d.setColor(Color.BLACK);
        g2d.draw(QuadOne_timer);

        Rectangle2D.Double QuadOne_Timer_BL = new Rectangle2D.Double(1100,130,130,120);
        g2d.setColor(Color.BLACK);
        g2d.fill(QuadOne_Timer_BL);
        g2d.draw(QuadOne_Timer_BL);

        Rectangle2D.Double QuadOne_RedBox = new Rectangle2D.Double(1000,100,90,50);
        g2d.draw(QuadOne_RedBox);
        Ellipse2D.Double QuadOne_red = new Ellipse2D.Double(1030,110,30,30);
        g2d.draw(QuadOne_red);
        g2d.fill(QuadOne_red);

        Rectangle2D.Double QuadOne_YellowBox = new Rectangle2D.Double(1000,160,90,50);
        g2d.draw(QuadOne_YellowBox);
        Ellipse2D.Double QuadOne_yellow = new Ellipse2D.Double(1030,170,30,30);
        g2d.draw(QuadOne_yellow);
        g2d.fill(QuadOne_yellow);

        Rectangle2D.Double QuadOne_GreenBox = new Rectangle2D.Double(1000,220,90,50);
        g2d.draw(QuadOne_GreenBox);
        Ellipse2D.Double QuadOne_green = new Ellipse2D.Double(1030,230,30,30);
        g2d.draw(QuadOne_green);
        g2d.fill(QuadOne_green);

        g2d.setColor(Color.RED);
        String QuadOneSLtime = "00";
        g2d.setFont(new Font("Arial", Font.BOLD, 80));
        g2d.drawString(QuadOneSLtime, 1120, 220);


    }  
    public static void main(String[] args) {
        // TODO code application logic here
        Sebastian_MPAnimationTLCrossing s = new Sebastian_MPAnimationTLCrossing();
        s.setTitle("Traffic Light Crossing");
        s.setSize(1300,700); 
        s.setBackground(new Color(170,215,165));
        s.setVisible(true);
        s.setPreferredSize(new Dimension(500,500));
        s.addWindowListener
            (   new WindowAdapter() 
                {   public void windowClosing( WindowEvent e )
                    {
                    System.exit(0);
                    }
                }
            ); 
    }
    
}
