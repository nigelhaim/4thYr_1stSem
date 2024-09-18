/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sebastian_self_portrait;
import java.awt.*;
import java.awt.geom.*;
/**
 *
 * @author nigel
 */

public class Sebastian_Self_Portrait extends Frame{

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(8.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.BOLD, 25));

        //Create T-Shirt
        Color tshirt_color = new Color(44, 40, 45);
        GeneralPath tshirt_path = new GeneralPath();
        tshirt_path.moveTo(29, 550);
        tshirt_path.lineTo(29, 551);        
        tshirt_path.lineTo(50, 447);
        tshirt_path.lineTo(68, 423);
        tshirt_path.lineTo(91, 409);
        tshirt_path.lineTo(152, 380);
        tshirt_path.quadTo(151, 401, 172, 416);
        tshirt_path.quadTo(229,391, 277,348);
        tshirt_path.lineTo(293, 357);
        tshirt_path.lineTo(306, 358);
        tshirt_path.quadTo(312,360, 318,364);
        tshirt_path.quadTo(334,373,362,384);
        g2d.draw(tshirt_path);
    }
    public static void main(String[] args) {
        Color backgrond_color = new Color(87, 92, 97); 
        Sebastian_Self_Portrait gp = new Sebastian_Self_Portrait();
        gp.setTitle("Sebastian Self Portrait project");
        gp.setSize(370,569);
        gp.setBackground(backgrond_color);
        gp.setVisible(true);

    }
    
}
