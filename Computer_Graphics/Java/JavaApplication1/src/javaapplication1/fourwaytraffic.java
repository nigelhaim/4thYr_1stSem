
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Date;

public class fourwaytraffic extends Frame {
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
        
    //Stoplight
        g2d.setPaint(Color.GRAY);
        Rectangle2D.Double stoplight_1 = new Rectangle2D.Double(200,100,100,150);
        g2d.fill(stoplight_1);
        
        Rectangle2D.Double stoplight_2 = new Rectangle2D.Double(1000,100,100,150);
        g2d.fill(stoplight_2);
        
        Rectangle2D.Double stoplight_3 = new Rectangle2D.Double(200,500,100,150);
        g2d.fill(stoplight_3);
        
        Rectangle2D.Double stoplight_4 = new Rectangle2D.Double(1000,500,100,150);
        g2d.fill(stoplight_4);
        
        g2d.setPaint(Color.RED);
        Ellipse2D.Double red_1 = new Ellipse2D.Double(230,105,40,40);
        g2d.draw(red_1);
        Ellipse2D.Double red_2 = new Ellipse2D.Double(1030,105,40,40);
        g2d.draw(red_2);
        Ellipse2D.Double red_3 = new Ellipse2D.Double(230,505,40,40);
        g2d.draw(red_3);
        Ellipse2D.Double red_4 = new Ellipse2D.Double(1030,505,40,40);
        g2d.draw(red_4);
        
        g2d.setPaint(Color.YELLOW);
        Ellipse2D.Double yellow_1 = new Ellipse2D.Double(230,155,40,40);
        g2d.draw(yellow_1);
        Ellipse2D.Double yellow_2 = new Ellipse2D.Double(1030,155,40,40);
        g2d.draw(yellow_2);
        Ellipse2D.Double yellow_3 = new Ellipse2D.Double(230,555,40,40);
        g2d.draw(yellow_3);
        Ellipse2D.Double yellow_4 = new Ellipse2D.Double(1030,555,40,40);
        g2d.draw(yellow_4);
        
        g2d.setPaint(Color.GREEN);
        Ellipse2D.Double green_1 = new Ellipse2D.Double(230,205,40,40);
        g2d.draw(green_1);
        Ellipse2D.Double green_2 = new Ellipse2D.Double(1030,205,40,40);
        g2d.draw(green_2);
        Ellipse2D.Double green_3 = new Ellipse2D.Double(230,605,40,40);
        g2d.draw(green_3);
        Ellipse2D.Double green_4 = new Ellipse2D.Double(1030,605,40,40);
        g2d.draw(green_4);
        
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
        
        g2d.setPaint(Color.red);
        translate.setToTranslation(200,310);
      
        //Up and Down
        GeneralPath car1 = new GeneralPath();
        car1.moveTo(710,500);
        car1.lineTo(780,500);
        car1.lineTo(780,650);
        car1.lineTo(710,650);
        car1.lineTo(710,500);
        g2d.setPaint(Color.RED);
        g2d.fill(car1);
    
       Rectangle2D.Double car2 = new Rectangle2D.Double(540,100,60,100);
        g2d.setPaint(Color.red);
        g2d.fill(car2);
        
         for(int x = 0; x < 90; x++){
            //If Right is Green, Left Stop
           g2d.setColor(Color.red);
            g2d.fill(red_4);
            g2d.fill(red_2);
            g2d.setColor(Color.GREEN);
            g2d.fill(green_1);
            g2d.fill(green_3);
            g2d.setColor(Color.BLACK);
            g2d.fill(yellow_3);
            g2d.fill(red_1);
            g2d.fill(red_3);
            g2d.fill(yellow_1);
            g2d.fill(yellow_4);
            g2d.fill(yellow_2);
            g2d.fill(green_4);
            g2d.fill(green_2);
            int goRight = 1150;
            int goLeft = 220;
            AffineTransform moveRight = new AffineTransform();
            AffineTransform moveLeft = new AffineTransform();
            g2d.setPaint(Color.GREEN);
            g2d.fill(car1);
            g2d.fill(car2);
            for(int y = 0; y < 25; y++){
                //Right Car
                g2d.setColor(Color.blue);
                moveRight.setToTranslation(goRight,230);
                g2d.fill(moveRight.createTransformedShape(car));
                g2d.setColor(Color.blue);
                moveLeft.setToTranslation(goLeft,315);
                g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                
                runCars(50);
                //Right Car
                goRight = goRight - 50;
                g2d.setColor(Color.GRAY);
                g2d.fill(moveRight.createTransformedShape(car));
                //Left Car
                goLeft = goLeft + 50;
                g2d.setColor(Color.GRAY);
                g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                
            }
            g2d.setColor(Color.yellow);
            g2d.fill(yellow_1);
            g2d.fill(yellow_3);
            g2d.setColor(Color.RED);
            g2d.fill(red_4);
            g2d.fill(red_2);
            g2d.setColor(Color.BLACK);
            g2d.fill(green_1);
            g2d.fill(green_3);
            g2d.fill(red_1);
            g2d.fill(red_3);
            g2d.fill(yellow_4);
            g2d.fill(yellow_2);
            g2d.fill(green_4);
            g2d.fill(green_2);
            
            goRight = 1150;
            
            g2d.setColor(Color.blue);
            moveRight.setToTranslation(1100,230);
            goLeft = 220;
           for(int y = 0; y < 26; y++){
                g2d.setColor(Color.blue);
                moveRight.setToTranslation(goRight,230);
                g2d.fill(moveRight.createTransformedShape(car));
                g2d.setColor(Color.blue);
                moveLeft.setToTranslation(goLeft,315);
                g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
                runCars(50);
                //Right Car
                goRight = goRight - 2;
                g2d.setColor(Color.GRAY);
                g2d.fill(moveRight.createTransformedShape(car));
                //Left 
                goLeft = goLeft + 2;
                g2d.setColor(Color.GRAY);
                g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
            }
           
            g2d.setColor(Color.blue);
            moveLeft.setToTranslation(270,315);
            g2d.fill(moveRight.createTransformedShape(car));
            g2d.fill(moveLeft.createTransformedShape(scaling.createTransformedShape(car)));
            
           //If Right is Red = Left is Go
            g2d.setColor(Color.GREEN);
            
            g2d.setColor(Color.RED);
            g2d.fill(red_1);
            g2d.fill(red_3);
            g2d.setColor(Color.BLACK);
            g2d.fill(green_1);
            g2d.fill(green_3);
            g2d.fill(yellow_1);
            g2d.fill(yellow_3);
           
            goLeft = 220;
         
            g2d.setColor(Color.red);
            g2d.fill(red_1);
            g2d.fill(red_3);
            g2d.setColor(Color.GREEN);
            g2d.fill(green_4);
            g2d.fill(green_2);
            g2d.setColor(Color.BLACK);
            g2d.fill(yellow_3);
            g2d.fill(yellow_1);
            g2d.fill(yellow_4);
            g2d.fill(yellow_2);
            g2d.fill(red_2);
            g2d.fill(red_4);
                    
            int yup = 0;
            int ydown = 0;
            AffineTransform movedown = new AffineTransform();
            AffineTransform moveup = new AffineTransform();
            for(int y = 0; y < 25; y++){
                g2d.setColor(Color.GREEN);
                moveup.setToTranslation(00,yup);
                g2d.fill(moveup.createTransformedShape(car1));
                g2d.setColor(Color.GREEN);
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
            g2d.setColor(Color.yellow);
            g2d.fill(yellow_2);
            g2d.fill(yellow_4);
            g2d.setColor(Color.RED);
            g2d.fill(red_3);
            g2d.fill(red_1);
            g2d.setColor(Color.BLACK);
            g2d.fill(green_1);
            g2d.fill(green_3);
            
            g2d.fill(yellow_3);
            g2d.fill(yellow_1);
            g2d.fill(green_4);
            g2d.fill(green_2);
            
            yup = 50;
            ydown = -50;
            for(int y = 0; y < 25; y++){
                g2d.setColor(Color.GREEN);
                moveup.setToTranslation(00,yup);
                g2d.fill(moveup.createTransformedShape(car1));
                movedown.setToTranslation(00,ydown);
                g2d.fill(movedown.createTransformedShape(car2));
                runCars(50);
                yup = yup - 2;
                g2d.setColor(Color.GRAY);
                g2d.fill(moveup.createTransformedShape(car1));
                ydown = ydown + 2;
                g2d.setColor(Color.GRAY);
                g2d.fill(movedown.createTransformedShape(car2));
            }
            
            g2d.setColor(Color.GREEN);
            moveup.setToTranslation(1050,230);
            g2d.fill(moveup.createTransformedShape(car2));
           
            g2d.setColor(Color.GREEN);
            movedown.setToTranslation(220,315);
            g2d.fill(movedown.createTransformedShape(scaling.createTransformedShape(car1)));
            
           //Right = Red, Left=Go
            g2d.setColor(Color.GREEN);
            g2d.setColor(Color.RED);
            g2d.fill(red_1);
            g2d.fill(red_3);
            g2d.setColor(Color.BLACK);
            g2d.fill(green_1);
            g2d.fill(green_3);
            g2d.fill(yellow_1);
            g2d.fill(yellow_3);
           
            goLeft = 220;
        }
}  
    
     public void runCars(long t1){
        long finishGo = (new Date()).getTime() + t1;
        while((new Date()).getTime() < finishGo){
        }    
    }
     public static void main(String[] args) {
       fourwaytraffic s = new fourwaytraffic();
       s.setTitle("FourWayTraffic");
       s.setSize (1300,700);
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


