package sebastian_mpanimationtl;
import java.awt.*;
import java.awt.geom.*;
import java.util.Date;
/**
 *
 * @author nigel
 */
public class Sebastian_MPAnimationTL extends Frame {

    /**
     * @param args the command line arguments
     */
 
    public void paint (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke (3.0f));
        Rectangle2D.Double leftstoplight = new Rectangle2D.Double(50,100,120,300);
        Color darkyellow = new Color(189,145,0);
        g2d.setColor(darkyellow);
        g2d.fill(leftstoplight);
        g2d.draw(leftstoplight);
        g2d.setColor(Color.BLACK);

        Rectangle2D.Double rightstoplight = new Rectangle2D.Double(250,100,120,300);
        g2d.setColor(darkyellow);
        g2d.fill(rightstoplight);
        g2d.draw(rightstoplight);
        g2d.setColor(Color.BLACK);

        Rectangle2D.Double leftborder = new Rectangle2D.Double(50,100,120,300);
        g2d.draw(leftborder);

        Rectangle2D.Double rightborder = new Rectangle2D.Double(250,100,120,300);
        g2d.draw(rightborder);

        //Draw bottom timer box 
        Rectangle2D.Double Left_bottomtimer = new Rectangle2D.Double(50,400,120,100);
        g2d.setColor(darkyellow);
        g2d.fill(Left_bottomtimer);
        g2d.setColor(Color.BLACK);
        g2d.draw(Left_bottomtimer);
        

        Rectangle2D.Double Right_bottomtimer = new Rectangle2D.Double(250,400,120,100);
        g2d.setColor(darkyellow);
        g2d.fill(Right_bottomtimer);
        g2d.setColor(Color.BLACK);
        g2d.draw(Right_bottomtimer);

        Rectangle2D.Double leftRedBox = new Rectangle2D.Double(50,100,120,90);
        g2d.draw(leftRedBox);
        Ellipse2D.Double leftred = new Ellipse2D.Double(80,110,60,60);
        g2d.draw(leftred);
        g2d.fill(leftred);

        Rectangle2D.Double leftYellowBox = new Rectangle2D.Double(50,200,120,90);
        g2d.draw(leftYellowBox);
        Ellipse2D.Double leftyellow = new Ellipse2D.Double(80,210,60,60);
        g2d.draw(leftyellow);
        g2d.fill(leftyellow);
 
        Rectangle2D.Double leftGreenBox = new Rectangle2D.Double(50,300,120,90);
        g2d.draw(leftGreenBox);
        Ellipse2D.Double leftgreen = new Ellipse2D.Double(80,310,60,60);
        g2d.draw(leftgreen);
        g2d.fill(leftgreen);
 
        Rectangle2D.Double rightRedBox = new Rectangle2D.Double(250,100,120,90);
        g2d.draw(rightRedBox);
        Ellipse2D.Double rightred = new Ellipse2D.Double(280,110,60,60);
        g2d.draw(rightred);
        g2d.fill(rightred);
        Rectangle2D.Double rightYellowBox = new Rectangle2D.Double(250,200,120,90);
        g2d.draw(rightYellowBox);
        Ellipse2D.Double rightyellow = new Ellipse2D.Double(280,210,60,60);
        g2d.draw(rightyellow);
        g2d.fill(rightyellow);

        Rectangle2D.Double rightGreenBox = new Rectangle2D.Double(250,300,120,90);
        g2d.draw(rightGreenBox);
        Ellipse2D.Double rightgreen = new Ellipse2D.Double(280,310,60,60);
        g2d.draw(rightgreen);
        g2d.fill(rightgreen);

        //Create Timer for left stoplight
        String lefttime = "00";
        g2d.setFont(new Font("Arial", Font.BOLD, 80));
        g2d.drawString(lefttime, 65, 480);


        String righttime = "00";
        g2d.setFont(new Font("Arial", Font.BOLD, 80));
        g2d.drawString(righttime, 265, 480);

        for (int x = 33; x>=0; x--){
            g2d.setColor(Color.red);
            g2d.fill(leftred);
            g2d.fill(rightred);
            g2d.setColor(darkyellow);
            g2d.fill(Left_bottomtimer);
            g2d.fill(Right_bottomtimer);
            g2d.setColor(Color.red);
            righttime = Integer.toString(x);
            lefttime = Integer.toString(x);
            g2d.drawString(righttime, 265, 480);
            g2d.drawString(lefttime, 65, 480);
            sustain(1000);
        }
        int redTime = 33;
        int yellowTime = 3;
        int greenTime = 30;
        for(int x = 0; x<90; x++)
        {
        g2d.setColor(Color.black);
        g2d.fill(leftred);
        g2d.fill(rightred);
        g2d.fill(leftyellow);
        g2d.fill(rightyellow);
        g2d.fill(leftgreen);
        g2d.fill(rightgreen);

            for(int y= 33; y > 0; y-- ){
                g2d.setColor(darkyellow);
                g2d.fill(Left_bottomtimer);
                g2d.fill(Right_bottomtimer);
                g2d.setColor(Color.red);
                g2d.fill(rightred);
                if(y <= 3){
                    g2d.setColor(Color.black);
                    g2d.fill(leftgreen);
                    g2d.setColor(Color.yellow);
                    g2d.fill(leftyellow);
                    lefttime = Integer.toString(y);
                    g2d.setColor(Color.yellow);
                    g2d.drawString(lefttime, 65, 480);
                }
                else{
                    lefttime = Integer.toString(y-3);
                    g2d.setColor(Color.green);
                    g2d.drawString(lefttime, 65, 480);
                    g2d.fill(leftgreen);
                }
                righttime = Integer.toString(y);
                g2d.setColor(Color.red);
                g2d.drawString(righttime, 265, 480);

                sustain(1000);
            }
        g2d.setColor(Color.black);
        g2d.fill(leftred);
        g2d.fill(rightred);
        g2d.fill(leftyellow);
        g2d.fill(rightyellow);
        g2d.fill(leftgreen);
        g2d.fill(rightgreen);

            for(int z = 33; z>0; z--){
                g2d.setColor(darkyellow);
                g2d.fill(Left_bottomtimer);
                g2d.fill(Right_bottomtimer);
                g2d.setColor(Color.red);
                g2d.fill(leftred);
                if(z <= 3){
                    g2d.setColor(Color.black);
                    g2d.fill(rightgreen);
                    g2d.setColor(Color.yellow);
                    g2d.fill(rightyellow);
                    righttime = Integer.toString(z);
                    g2d.setColor(Color.yellow);
                    g2d.drawString(righttime, 265, 480);
                }
                else{
                    righttime = Integer.toString(z-3);
                    g2d.setColor(Color.green);
                    g2d.drawString(righttime, 265, 480);
                    g2d.fill(rightgreen);
                }
                lefttime = Integer.toString(z);
                g2d.setColor(Color.red);
                g2d.drawString(lefttime, 65, 480);
                sustain(1000);
            }
            
        }
    }
        public void sustain(long t)
    {
        long finish = (new Date()).getTime() + t;
        while((new Date()).getTime() <finish){
 
        }
    }
 
    public static void main (String[] argv){
    Sebastian_MPAnimationTL t = new Sebastian_MPAnimationTL();
    t.setVisible(true);
    t.setTitle("Stoplight");
    t.setSize(600, 600);
    }
}
