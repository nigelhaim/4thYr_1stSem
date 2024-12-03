/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sebastian_mp_tlc;

/**
 *
 * @author nigel
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Date;

public class Sebastian_MP_TLC extends Frame{

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
        GeneralPath road1 = new GeneralPath();
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


        //car
        GeneralPath car = new GeneralPath();
        car.moveTo(60,120);
        car.lineTo(80,120);
        car.quadTo(90,140,100,120);
        car.lineTo(160,120);
        car.quadTo(170,140,180,120);
        car.lineTo(200,120);
        car.curveTo(195,100,200,80,160,80);
        car.lineTo(110,80);
        car.lineTo(90,100);
        car.lineTo(60,100);
        car.lineTo(60,120);
        
        AffineTransform translate= new AffineTransform();
        g2d.setPaint(Color.blue);
        translate.setToTranslation(1100,230);
        
        AffineTransform scaling = new AffineTransform();
        g2d.setPaint(Color.blue);
        scaling.setToScale(-1,1);
        g2d.fill(scaling.createTransformedShape(car));

        g2d.setPaint(Color.blue);
        translate.setToTranslation(200,310);
        
        GeneralPath car1 = new GeneralPath();
        car1.moveTo(710,500);
        car1.lineTo(780,500);
        car1.lineTo(780,650);
        car1.lineTo(710,650);
        car1.lineTo(710,500);
        g2d.setColor(Color.RED);
        g2d.fill(car1);
    
       Rectangle2D.Double car2 = new Rectangle2D.Double(540,100,60,100);
        g2d.setColor(Color.RED);
        g2d.fill(car2);
      
        //Draw a car
        //ALl are stopped
        for(int m = 10; m >=0 ; m--){
            g2d.setColor(Color.BLACK);
            g2d.fill(QuadOne_Timer_BL);
            g2d.fill(QuadTwo_Timer_BL);
            g2d.fill(QuadThree_Timer_BL);
            g2d.fill(QuadFour_Timer_BL);

            g2d.fill(QuadOne_yellow);
            g2d.fill(QuadTwo_yellow);
            g2d.fill(QuadThree_yellow);
            g2d.fill(QuadFour_yellow);

            g2d.fill(QuadOne_green);
            g2d.fill(QuadTwo_green);
            g2d.fill(QuadThree_green);
            g2d.fill(QuadFour_green);

            g2d.setColor(Color.RED);
            g2d.fill(QuadOne_red);
            g2d.fill(QuadTwo_red);
            g2d.fill(QuadThree_red);
            g2d.fill(QuadFour_red);

            g2d.setColor(Color.RED);
            QuadOneSLtime = Integer.toString(m);
            QuadTwoSLtime = Integer.toString(m);
            QuadThreeSLtime = Integer.toString(m);
            QuadFourSLtime = Integer.toString(m);
            g2d.drawString(QuadOneSLtime, 1120, 220);
            g2d.drawString(QuadTwoSLtime, 320, 220);
            g2d.drawString(QuadThreeSLtime, 320, 620);
            g2d.drawString(QuadFourSLtime, 1120, 620);
            sustain(1000);
        }
        for (int x = 0; x < 90 ; x++){
            // set
            g2d.setColor(Color.BLACK);
            g2d.fill(QuadOne_Timer_BL);
            g2d.fill(QuadTwo_Timer_BL);
            g2d.fill(QuadThree_Timer_BL);
            g2d.fill(QuadFour_Timer_BL);

            g2d.fill(QuadOne_red);
            g2d.fill(QuadTwo_red);
            g2d.fill(QuadThree_red);
            g2d.fill(QuadFour_red);

            g2d.fill(QuadOne_yellow);
            g2d.fill(QuadTwo_yellow);
            g2d.fill(QuadThree_yellow);
            g2d.fill(QuadFour_yellow);

            g2d.fill(QuadOne_green);
            g2d.fill(QuadTwo_green);
            g2d.fill(QuadThree_green);
            g2d.fill(QuadFour_green);
            g2d.setColor(Color.PINK);
                g2d.fill(car1);
                g2d.fill(car2);
            //Set car right and left to go 
            //Set car up and down to stop
            //Set Quadrant 2 and 4 to greeen
            //Set Quadrant 1 and 3 to red
            for(int y = 10; y >= 0; y--){
                g2d.setColor(Color.BLACK);
                g2d.fill(QuadOne_Timer_BL);
                g2d.fill(QuadTwo_Timer_BL);
                g2d.fill(QuadThree_Timer_BL);
                g2d.fill(QuadFour_Timer_BL);

                g2d.setColor(Color.RED);
                g2d.fill(QuadOne_red);
                g2d.fill(QuadThree_red);
                QuadOneSLtime = Integer.toString(y);
                QuadThreeSLtime = Integer.toString(y);
                AffineTransform moveRight = new AffineTransform();
                AffineTransform moveLeft = new AffineTransform();
                g2d.setColor(Color.RED);
                QuadOneSLtime = Integer.toString(y);
                QuadThreeSLtime = Integer.toString(y);
                g2d.drawString(QuadOneSLtime, 1120, 220);
                g2d.drawString(QuadThreeSLtime, 320, 620);
                g2d.setColor(Color.RED);

                g2d.setColor(Color.PINK);
                g2d.fill(car1);
                g2d.fill(car2);
                if(y <=3){
                    g2d.setColor(Color.YELLOW);
                    g2d.fill(QuadTwo_yellow);
                    g2d.fill(QuadFour_yellow);
                    g2d.setColor(Color.BLACK);
                    g2d.fill(QuadTwo_green);
                    g2d.fill(QuadFour_green);
                    g2d.setColor(Color.YELLOW);
                    QuadTwoSLtime = Integer.toString(y);
                    QuadFourSLtime = Integer.toString(y);
                    g2d.drawString(QuadTwoSLtime, 320, 220);
                    g2d.drawString(QuadFourSLtime, 1120, 620);
                    int goRight = 1150;
                    
                    g2d.setColor(Color.blue);
                    moveRight.setToTranslation(1100,230);
                    int goLeft = 220;
                    if(y==3){
                        for(int z = 0; z < 26; z++){
                                g2d.setColor(Color.blue);
                                moveRight.setToTranslation(goRight,230);
                                g2d.fill(moveRight.createTransformedShape(car));
                                g2d.setColor(Color.blue);
                                moveLeft.setToTranslation(goLeft,315);
                                g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                                runCars(25);
                                //Right Car
                                goRight = goRight - 2;
                                g2d.setColor(Color.GRAY);
                                g2d.fill(moveRight.createTransformedShape(car));
                                //Left 
                                goLeft = goLeft + 2;
                                g2d.setColor(Color.GRAY);
                                g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                            g2d.setColor(Color.blue);
                            moveLeft.setToTranslation(270,315);
                            g2d.fill(moveRight.createTransformedShape(car));
                            g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                        }
                    }
                                g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                                g2d.fill(moveRight.createTransformedShape(car));
                                //Left 
                        sustain(900);
                    }
                else{
                    g2d.setColor(Color.BLACK);
                    g2d.fill(QuadTwo_yellow);
                    g2d.fill(QuadFour_yellow);
                    g2d.setColor(Color.GREEN);
                    g2d.fill(QuadTwo_green);
                    g2d.fill(QuadFour_green);
                    QuadTwoSLtime = Integer.toString(y-3);
                    QuadFourSLtime = Integer.toString(y-3);
                    g2d.drawString(QuadTwoSLtime, 320, 220);
                    g2d.drawString(QuadFourSLtime, 1120, 620);
                    int goRight = 1150;
                    int goLeft = 220;
                    for(int z = 0; z < 25; z++){
                            g2d.setColor(Color.GRAY);
                            g2d.fill(road);
                            g2d.setColor(Color.YELLOW);
                            g2d.draw(road1);
                            g2d.setColor(Color.blue);
                            g2d.setColor(Color.PINK);
                g2d.fill(car1);
                g2d.fill(car2);
                        //Right Car
                        g2d.setColor(Color.blue);
                        moveRight.setToTranslation(goRight,230);
                        g2d.fill(moveRight.createTransformedShape(car));
                        g2d.setColor(Color.blue);
                        moveLeft.setToTranslation(goLeft,315);
                        g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                        
                        runCars(60);
                        //Right Car
                        goRight = goRight - 50;
                        g2d.setColor(Color.GRAY);
                        g2d.fill(moveRight.createTransformedShape(car));
                        //Left Car
                        goLeft = goLeft + 50;
                        g2d.setColor(Color.GRAY);
                        g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                        
                    }
                }
                // sustain(900);
            }

            //Set car right and left to stop 
            //Set car up and down to go
            //Set Quadrant 2 and 4 to red
            //Set Quadrant 1 and 3 to green
            for(int y = 10; y >= 0; y--){
                g2d.setColor(Color.BLACK);
                g2d.fill(QuadOne_Timer_BL);
                g2d.fill(QuadTwo_Timer_BL);
                g2d.fill(QuadThree_Timer_BL);
                g2d.fill(QuadFour_Timer_BL);

                g2d.fill(QuadOne_red);
                g2d.fill(QuadThree_red);
                g2d.fill(QuadTwo_yellow);
                g2d.fill(QuadFour_yellow);


                g2d.setColor(Color.RED);
                g2d.fill(QuadTwo_red);
                g2d.fill(QuadFour_red);
                QuadTwoSLtime = Integer.toString(y);
                QuadFourSLtime = Integer.toString(y);

                g2d.setColor(Color.RED);
                QuadTwoSLtime = Integer.toString(y);
                QuadFourSLtime = Integer.toString(y);
                g2d.drawString(QuadTwoSLtime, 320, 220);
                g2d.drawString(QuadFourSLtime, 1120, 620);
                if(y<=3){
                    g2d.setColor(Color.YELLOW);
                    g2d.fill(QuadOne_yellow);
                    g2d.fill(QuadThree_yellow);
                    g2d.setColor(Color.BLACK);
                    g2d.fill(QuadOne_green);
                    g2d.fill(QuadThree_green);
                    g2d.setColor(Color.YELLOW);
                    QuadOneSLtime = Integer.toString(y);
                    QuadThreeSLtime = Integer.toString(y);
                    g2d.drawString(QuadOneSLtime, 1120, 220);
                    g2d.drawString(QuadThreeSLtime, 320, 620);
            int yup = 50;
            int ydown = -50;
            AffineTransform movedown = new AffineTransform();
            AffineTransform moveup = new AffineTransform();
            if(y==3){
            for(int z = 0; z < 25; z++){
                g2d.setColor(Color.PINK);
                moveup.setToTranslation(00,yup);
                g2d.fill(moveup.createTransformedShape(car1));
                movedown.setToTranslation(00,ydown);
                g2d.fill(movedown.createTransformedShape(car2));
                runCars(25);
                yup = yup - 2;
                g2d.setColor(Color.GRAY);
                g2d.fill(moveup.createTransformedShape(car1));
                ydown = ydown + 2;
                g2d.setColor(Color.GRAY);
                g2d.fill(movedown.createTransformedShape(car2));
            }

            }
            g2d.setColor(Color.PINK);

                g2d.fill(moveup.createTransformedShape(car1));
                g2d.fill(movedown.createTransformedShape(car2));
            
                sustain(900);
                }
                else{
                    g2d.setColor(Color.BLACK);
                    g2d.fill(QuadOne_yellow);
                    g2d.fill(QuadThree_yellow);
                    g2d.setColor(Color.GREEN);
                    g2d.fill(QuadOne_green);
                    g2d.fill(QuadThree_green);
                    g2d.setColor(Color.GREEN);
                    QuadOneSLtime = Integer.toString(y-3);
                    QuadThreeSLtime = Integer.toString(y-3);
                    g2d.drawString(QuadOneSLtime, 1120, 220);
                    g2d.drawString(QuadThreeSLtime, 320, 620);
                    int yup = 0;
                    int ydown = 0;
                    AffineTransform movedown = new AffineTransform();
                    AffineTransform moveup = new AffineTransform();
                    for(int z = 0; z < 25; z++){
                        g2d.setColor(Color.PINK);
                        moveup.setToTranslation(00,yup);
                        g2d.fill(moveup.createTransformedShape(car1));
                        g2d.setColor(Color.PINK);
                        movedown.setToTranslation(00,ydown);
                        g2d.fill(movedown.createTransformedShape(car2));
                        runCars(50);
                        //Right Car
                        yup = yup - 50;
                        g2d.setColor(Color.GRAY);
                        g2d.fill(moveup.createTransformedShape(car1));
                        //Left Car
                        ydown = ydown + 50;
                        g2d.setColor(Color.GRAY);
                        g2d.fill(movedown.createTransformedShape(car2));
                        
                    }
                }

            }
        }
    }  
        public void sustain(long t)
    {
        long finish = (new Date()).getTime() + t;
        while((new Date()).getTime() <finish){
 
        }
    }
 
     public void runCars(long t1){
        long finishGo = (new Date()).getTime() + t1;
        while((new Date()).getTime() < finishGo){
        }    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Sebastian_MP_TLC s = new Sebastian_MP_TLC();
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
