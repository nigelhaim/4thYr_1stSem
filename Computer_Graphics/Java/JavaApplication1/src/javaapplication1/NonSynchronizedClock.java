
import java.awt.*;
import java.awt.image.*;

public class BufferedImageDrawer extends Frame
{
  public BufferedImage bi;

  public Graphics2D g2dbi;

  private Graphics2D g2d;
  public BufferedImageDrawer(BufferedImage buffIm, int width, int height)
  {
    bi = buffIm;
 g2dbi = bi.createGraphics();

    this.setTitle("Double-Buffering");
    this.setSize(width,height);
    this.setVisible(true);
  }
  public void paint(Graphics g)
  {
    update(g);
  }
  public void update(Graphics g)
  {
    g2d = (Graphics2D) g;
    g2d.drawImage(bi,0,0,null);
  }


}
// ==================================================================

import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import java.awt.image.BufferedImage;

public class DoubleBufferingClockExample extends TimerTask
{
  private BufferedImageDrawer buffid;
  private BufferedImage bg;
  private double frameSize;
  private double handLength;
  private double handWidth;
  private Rectangle2D.Double clockFrame;
  private Rectangle2D.Double clockHand;
  private AffineTransform singleRotation;
  private AffineTransform accumulatedRotation;
  private AffineTransform singleTranslation;
  private AffineTransform accumulatedTranslation;
  private AffineTransform handTransform;

  DoubleBufferingClockExample(BufferedImageDrawer bid, BufferedImage backGround,
                              int height,int delay)
  {
    buffid = bid;
    buffid.g2dbi.setStroke(new BasicStroke(3.0f));
    buffid.g2dbi.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                  RenderingHints.VALUE_ANTIALIAS_ON);
    AffineTransform yUp = new AffineTransform();
    yUp.setToScale(1, -1);
    AffineTransform translate = new AffineTransform();
    translate.setToTranslation(0, height);
    yUp.preConcatenate(translate);
    buffid.g2dbi.transform(yUp);
    buffid.g2dbi.setPaint(Color.black);
    bg = backGround;
    frameSize = 100;
    handLength = 40;
    handWidth = 5;
    clockFrame = new Rectangle2D.Double(-frameSize/2,-frameSize/2,
                                        frameSize,frameSize);
    clockHand = new Rectangle2D.Double(-handWidth/2,0,
                                       handWidth,handLength);
    singleRotation = new AffineTransform();
    singleRotation.setToRotation(-delay*Math.PI/30000);
    accumulatedRotation = new AffineTransform();
    singleTranslation = new AffineTransform();
    singleTranslation.setToTranslation(2,1);
    accumulatedTranslation = new AffineTransform();
    accumulatedTranslation.setToTranslation(150,150);
    handTransform = new AffineTransform();
  }
  public void run()
  {
     handTransform.setTransform(accumulatedRotation);
     handTransform.preConcatenate(accumulatedTranslation);
     buffid.g2dbi.drawImage(bg,0,0,null);
     buffid.g2dbi.draw(accumulatedTranslation.createTransformedShape(clockFrame));
     buffid.g2dbi.fill(handTransform.createTransformedShape(clockHand));
     buffid.repaint();
     accumulatedTranslation.preConcatenate(singleTranslation);
    accumulatedRotation.preConcatenate(singleRotation);
  }
  public static void main(String[] argv)
  {
    int width = 780;
    int height = 530;
    int delay = 50;
    BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    BufferedImage backGround = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    Graphics2D g2dBackGround = backGround.createGraphics();
    g2dBackGround.setStroke(new BasicStroke(3.0f));
    g2dBackGround.setPaint(Color.white);
    g2dBackGround.fill(new Rectangle(0,0,width,height));
    Rectangle2D.Double windowFrame = new Rectangle2D.Double(50,50,
                                width-100,height-100);
    g2dBackGround.setPaint(Color.black);
    g2dBackGround.draw(windowFrame);
    BufferedImageDrawer bid = new BufferedImageDrawer(bi,width,height);
    DoubleBufferingClockExample dbce = new DoubleBufferingClockExample(bid,backGround,height,delay);
    Timer t = new Timer();
    t.scheduleAtFixedRate(dbce,0,delay);
  }
}

// ===================================================================================
import java.awt.*;
import java.awt.geom.*;
import java.util.Date;

public class NonSynchronizedClock extends Frame
{

  private int windowWidth;
  private int windowHeight;
  NonSynchronizedClock(int width, int height)
  {
    windowWidth = width;
    windowHeight = height;
  }
  public void paint(Graphics g)
  {
    Graphics2D g2d = (Graphics2D) g;
    g2d.setStroke(new BasicStroke(3.0f));
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    AffineTransform yUp = new AffineTransform();
    yUp.setToScale(1,-1);
    AffineTransform translate = new AffineTransform();
    translate.setToTranslation(0,windowHeight);
    yUp.preConcatenate(translate);
    g2d.transform(yUp);
    Rectangle2D.Double windowFrame = new Rectangle2D.Double(50,50,
                                                            windowWidth-100,
                                                            windowHeight-100);
    double frameSize = 100;
    double handLength = 40;
    double handWidth = 5;
    Rectangle2D.Double clockFrame = new Rectangle2D.Double(-frameSize/2,
                                                           -frameSize/2,
                                                           frameSize,
                                                           frameSize);
    Rectangle2D.Double clockHand = new Rectangle2D.Double(-handWidth/2,
                                                          0,
                                                          handWidth,
                                                          handLength);
    AffineTransform singleRotation = new AffineTransform();
    singleRotation.setToRotation(-Math.PI/180);
    AffineTransform accumulatedRotation = new AffineTransform();
    AffineTransform singleTranslation = new AffineTransform();
    singleTranslation.setToTranslation(2,1);
    AffineTransform accumulatedTranslation = new AffineTransform();
    accumulatedTranslation.setToTranslation(150,150);
    AffineTransform handTransform = new AffineTransform();
    for (int i=0; i<250; i++)
    {
       handTransform.setTransform(accumulatedRotation);
       handTransform.preConcatenate(accumulatedTranslation);
       clearWindow(g2d);
       g2d.draw(windowFrame);
       g2d.draw(accumulatedTranslation.createTransformedShape(clockFrame));
       g2d.fill(handTransform.createTransformedShape(clockHand));
       accumulatedTranslation.preConcatenate(singleTranslation);
       accumulatedRotation.preConcatenate(singleRotation);
       sustain(100);
    }
  }

  public void clearWindow(Graphics2D g)
  {
    g.setPaint(Color.white);
    g.fill(new Rectangle(0,0,windowWidth,windowWidth));
    g.setPaint(Color.black);
  }
  public void sustain(long t)
  {
    long finish = (new Date()).getTime() + t;
    while( (new Date()).getTime() < finish ){}
  }
  public static void main(String[] argv)
  {
    int width = 780;
    int height = 530;
    NonSynchronizedClock f = new NonSynchronizedClock(width,height);
    f.setTitle("Animation based on geometric transformations");
    f.setSize(width,height);
    f.setVisible(true);
  }
}


code for animation (transformation & buffering).txt
Displaying code for animation (transformation & buffering).txt.