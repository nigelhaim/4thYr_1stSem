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
        g2d.scale(1.5,1.5);
        BasicStroke bs = new BasicStroke(5.0f);
        g2d.setStroke(bs);
        g2d.setFont(new Font("Arial", Font.BOLD, 25));

        Color background_color = new Color(87, 92, 97);
        
        //Create neck
        Color neck_color = new Color(185,136,103);
        GeneralPath neck_path = new GeneralPath();
        neck_path.moveTo(277, 348);
        neck_path.quadTo(255,323,247,284); //Head is attached here
        neck_path.quadTo(234, 310, 219, 330);
        neck_path.quadTo(207, 348, 183, 351);
        neck_path.quadTo(173,354, 157,353);
        neck_path.quadTo(149, 351, 141, 349);
        neck_path.lineTo(158, 374);
        neck_path.curveTo(120, 447, 168, 485, 277, 348);
        g2d.setPaint(Color.BLACK);
        g2d.draw(neck_path);
        g2d.setPaint(neck_color);
        g2d.fill(neck_path);

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
        tshirt_path.lineTo(363, 550);
        tshirt_path.lineTo(29, 550);
        g2d.setPaint(Color.BLACK);
        g2d.draw(tshirt_path);
        g2d.setPaint(tshirt_color);
        g2d.fill(tshirt_path);

        //Create Hand
        Color hand_color = new Color(233,171,155);
        GeneralPath hand_path = new GeneralPath();
        hand_path.moveTo(116, 550);
        hand_path.lineTo(82, 539);
        hand_path.quadTo(76, 538, 68, 540);
        hand_path.lineTo(58, 550);
        hand_path.lineTo(116, 550);
        g2d.setPaint(Color.BLACK);
        g2d.draw(hand_path);
        g2d.setPaint(hand_color);
        g2d.fill(hand_path);

        //Create Sling
        Color sling_color = new Color(105,116,126);
        GeneralPath sling_path = new GeneralPath();
        sling_path.moveTo(68, 539);
        sling_path.quadTo(93,447,121,409);
        sling_path.quadTo(135,393,152,380);
        sling_path.quadTo(144,401,139,412);
        sling_path.quadTo(118,461,90,541);
        sling_path.quadTo(76,538,68,539);
        g2d.setPaint(Color.BLACK);
        g2d.draw(sling_path);
        g2d.setPaint(sling_color);
        g2d.fill(sling_path);
        
        //Create Side burns 
        Color sideburns_color = new Color(64,64,62);
        GeneralPath sideburns_path = new GeneralPath();
        //Left Sideburn
        sideburns_path.moveTo(67, 197);
        sideburns_path.lineTo(58,170);
        sideburns_path.lineTo(76, 152);
        sideburns_path.lineTo(77, 154);
        sideburns_path.lineTo(75, 178);
        sideburns_path.lineTo(67, 197);

        //Right Sideburn
        sideburns_path.moveTo(213, 135);
        sideburns_path.lineTo(263, 176);
        sideburns_path.lineTo(260,208);
        sideburns_path.lineTo(245, 212);
        sideburns_path.lineTo(244, 184);
        sideburns_path.lineTo(214, 161);
        sideburns_path.lineTo(213, 135);
        g2d.setPaint(sideburns_color);
        g2d.draw(sideburns_path);
        g2d.setPaint(sideburns_color);
        g2d.fill(sideburns_path);


    
        //Create Head
        Color head_color = new Color(233,171,155);
        GeneralPath head_path = new GeneralPath();
        head_path.moveTo(247, 284);
        head_path.quadTo(234, 310, 219, 330);
        head_path.quadTo(207, 348, 183, 351);
        head_path.quadTo(173,354, 157,353);
        head_path.quadTo(149, 351, 141, 349);
        head_path.quadTo(116,330, 105,321);
        head_path.quadTo(90, 302, 81, 274);
        head_path.quadTo(70, 246, 69, 227);
        head_path.lineTo(69, 214);
        head_path.quadTo(68, 202, 68, 197);
        head_path.quadTo(71, 185, 75, 179);
        head_path.lineTo(77,154);
        head_path.quadTo(78,149,81,144);
        head_path.quadTo(87, 139, 97, 131);
        head_path.quadTo(111, 128, 123, 123);
        head_path.quadTo(143, 120, 158, 121);   
        head_path.quadTo(172,124,192,129);
        head_path.quadTo(201, 131, 212, 135);
        head_path.lineTo(214, 159);
        head_path.quadTo(229, 170, 244, 183);
        head_path.quadTo(243, 196, 244, 204);
        head_path.lineTo(245, 225);
        head_path.quadTo(247,216,253,211);
        head_path.quadTo(255,211,262,209);
        head_path.quadTo(262,208,265, 209);
        head_path.quadTo(270,213,273,219);
        head_path.quadTo(274, 225, 273, 233);
        head_path.quadTo(270,242,264,258);
        head_path.quadTo(263,264,262,268);
        head_path.quadTo(260, 270, 256, 272);   
        head_path.quadTo(253, 272, 249, 270);
        head_path.quadTo(249, 277, 247, 284);
        head_path.quadTo(236, 307, 218, 331);
        g2d.setPaint(Color.BLACK);
        g2d.draw(head_path);
        g2d.setPaint(head_color);
        g2d.fill(head_path);

        
    }
    public static void main(String[] args) {
        Color backgrond_color = new Color(87, 92, 97); 
        Sebastian_Self_Portrait gp = new Sebastian_Self_Portrait();
        gp.setTitle("Sebastian Self Portrait project");
        // gp.setSize(370,569);
        gp.setSize(900,900);
        gp.setBackground(backgrond_color);
        gp.setVisible(true);

    }
    
}
