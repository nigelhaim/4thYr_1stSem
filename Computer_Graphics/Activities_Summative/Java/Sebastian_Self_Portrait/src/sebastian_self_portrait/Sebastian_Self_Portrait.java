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

        Color hair_color = new Color(40,36,37);
        GeneralPath hair_path = new GeneralPath();
        hair_path.moveTo(67, 197);
        hair_path.quadTo(57,168,53, 150);
        hair_path.quadTo(51,141,58,119);
        hair_path.quadTo(94, 77, 108, 71);
        hair_path.quadTo(155, 54, 189, 63);
        hair_path.quadTo(204, 66, 214, 71);
        hair_path.quadTo(243, 94, 260, 115);
        hair_path.quadTo(260, 114, 268, 136);
        hair_path.quadTo(266, 166, 261, 207);
        g2d.setPaint(hair_color);
        g2d.draw(hair_path);
        g2d.setPaint(hair_color);
        g2d.fill(hair_path);

        
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

        //Create hair 
        GeneralPath hair_path_outline = new GeneralPath();
        hair_path_outline.moveTo(67, 197);
        hair_path_outline.quadTo(57,168,53, 150);
        hair_path_outline.quadTo(51,141,58,119);
        hair_path_outline.quadTo(94, 77, 108, 71);
        hair_path_outline.quadTo(155, 54, 189, 63);
        hair_path_outline.quadTo(204, 66, 214, 71);
        hair_path_outline.quadTo(243, 94, 260, 115);
        hair_path_outline.quadTo(260, 114, 268, 136);
        hair_path_outline.quadTo(266, 166, 261, 207);
        g2d.setPaint(Color.BLACK);
        g2d.draw(hair_path_outline);
        // g2d.setPaint(hair_color);
        // g2d.fill(hair_path);

    
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

        BasicStroke bs_nose = new BasicStroke(3.0f);
        g2d.setStroke(bs_nose);
        //Create Nose 
        Color nose_color = new Color(168,110,90);
        QuadCurve2D.Double nose_path_left = new QuadCurve2D.Double(177, 254, 176,260, 160, 263);
        g2d.setPaint(nose_color);
        g2d.draw(nose_path_left);

        QuadCurve2D.Double hole_path_left = new QuadCurve2D.Double(129, 261, 138,261, 139, 262);
        g2d.setPaint(nose_color);
        g2d.draw(hole_path_left);

        QuadCurve2D.Double nose_path_right = new QuadCurve2D.Double(121, 260, 124,266, 131, 267);
        g2d.setPaint(nose_color);
        g2d.draw(nose_path_right);

        QuadCurve2D.Double hole_path_right = new QuadCurve2D.Double(160, 258, 162,256, 166, 257);
        g2d.setPaint(nose_color);
        g2d.draw(hole_path_right);

        BasicStroke bs_reg = new BasicStroke(5.0f);
        g2d.setStroke(bs_reg);

        //Create Eyeglasses
        Color eyeglasses_color = new Color(251,232,209);
        GeneralPath eyeglasses_path = new GeneralPath();
        eyeglasses_path.moveTo(256, 210);
        eyeglasses_path.quadTo(247, 207, 233, 206);
        eyeglasses_path.lineTo(217,206);
        eyeglasses_path.quadTo(210, 198, 201, 194);
        eyeglasses_path.lineTo(176, 194);
        eyeglasses_path.quadTo(157, 200, 152, 210);
        eyeglasses_path.quadTo(139,209,129,212);
        eyeglasses_path.quadTo(124, 206, 112, 202);
        eyeglasses_path.lineTo(91,202);
        eyeglasses_path.quadTo(76, 207, 70, 215);
        eyeglasses_path.lineTo(70, 227);
        eyeglasses_path.quadTo(74, 255, 94, 258);
        eyeglasses_path.quadTo(103, 259, 113, 258); 
        eyeglasses_path.quadTo(124, 252, 130, 246); 
        eyeglasses_path.quadTo(131,242,133,231);
        eyeglasses_path.lineTo(133, 216);
        eyeglasses_path.quadTo(143, 213, 151, 214);
        eyeglasses_path.quadTo(157, 246, 177, 250);
        eyeglasses_path.quadTo(183,251,191,250);
        eyeglasses_path.quadTo(213, 242, 215, 231);
        eyeglasses_path.quadTo(216, 223, 216, 210); 
        eyeglasses_path.lineTo(256, 210);
        g2d.setPaint(Color.BLACK);
        g2d.draw(eyeglasses_path);
        g2d.setPaint(eyeglasses_color);
        g2d.fill(eyeglasses_path);

        Color glasses_color = new Color(77,60,54);  
        GeneralPath glasses_path = new GeneralPath();
        //left side
        glasses_path.moveTo(91, 207);   
        glasses_path.lineTo(111,205);
        glasses_path.quadTo(123,209,129,216);
        glasses_path.lineTo(129, 229);
        glasses_path.quadTo(129, 238, 126, 245);
        glasses_path.quadTo(120, 251, 112, 253);
        glasses_path.quadTo(102, 256, 94, 253);
        glasses_path.quadTo(79, 246, 76, 234);
        glasses_path.quadTo(72, 222, 76, 215);
        glasses_path.quadTo(80, 207, 91, 207);

        //right side 
        glasses_path.moveTo(178, 199);
        glasses_path.lineTo(200, 197);
        glasses_path.quadTo(207, 199, 212, 208);
        glasses_path.lineTo(212, 220);
        glasses_path.quadTo(211, 240, 191, 245);   
        glasses_path.quadTo(188, 247, 177, 245);
        glasses_path.quadTo(184, 247, 177, 245);
        glasses_path.quadTo(160,238,157,224);
        glasses_path.quadTo(155, 214, 157, 224);
        glasses_path.quadTo(157, 214, 157, 209);    
        glasses_path.quadTo(166,199,178,199);

        g2d.setPaint(Color.BLACK);
        g2d.draw(glasses_path);
        g2d.setPaint(glasses_color);
        g2d.fill(glasses_path);

        GeneralPath lips_path = new GeneralPath();
        lips_path.moveTo(192,286);
        lips_path.quadTo(149, 310, 126, 291);
        lips_path.lineTo(192, 286);
        g2d.setPaint(Color.BLACK);
        g2d.draw(lips_path);
        g2d.setPaint(Color.WHITE);
        g2d.fill(lips_path);

    
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
