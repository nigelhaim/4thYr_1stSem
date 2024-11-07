import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class DigitalClock extends JFrame {

    private JLabel setTimeLabel;
    private JTextField hour, minutes, second;
    private JButton button;

    Graphics2D graphics2D;
    Line2D.Double longHand;
    Line2D.Double shortHand;
    Line2D.Double secondHand;

    private DigitalClock() {
        super("Clock");
        setSize(700, 800);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create a custom clock panel
        ClockPanel clockPanel = new ClockPanel();
        clockPanel.setBounds(0, 0, 700, 600); // Set bounds for the clock panel
        add(clockPanel);

        // Add input fields and button
        setTimeLabel = new JLabel("Set Time: ");
        add(setTimeLabel);
        setTimeLabel.setLocation(100, 650);
        setTimeLabel.setSize(100, 50);

        hour = new JTextField("00");
        add(hour);
        hour.setLocation(150, 650);
        hour.setSize(50, 50);

        minutes = new JTextField("00");
        add(minutes);
        minutes.setLocation(200, 650);
        minutes.setSize(50, 50);

        second = new JTextField("00");
        add(second);
        second.setLocation(250, 650);
        second.setSize(50, 50);

        button = new JButton("Set");
        button.addActionListener(e -> {
            // Repaint the clock with the updated time
            clockPanel.repaint();
            System.out.println(hour.getText() + " : " + minutes.getText() + " : " + second.getText());
        });
        add(button);
        button.setLocation(300, 650);
        button.setSize(100, 50);

        setVisible(true);
    }



    // Custom JPanel for the clock
    class ClockPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (g instanceof Graphics2D) {

                Color BG = new Color(23, 23, 23); // Background color
                Color FG = new Color(0, 255, 213); // Foreground color for clock elements
                graphics2D = (Graphics2D) g;
                BasicStroke basicStroke = new BasicStroke(5.0f);

                // Fill the background
                graphics2D.setPaint(BG);
                graphics2D.fillRect(0, 0, getWidth(), getHeight());

                graphics2D.setStroke(basicStroke);

                // Draw clock elements
                Ellipse2D.Double clock = new Ellipse2D.Double(100, 100, 500, 500);
                graphics2D.setPaint(FG);
                graphics2D.draw(clock);

                Ellipse2D.Double center = new Ellipse2D.Double(340, 340, 20, 20);
                graphics2D.setPaint(FG);
                graphics2D.fill(center);

                drawClockNumbers(graphics2D, FG);
                String Str = "Sebastian, Nigel Haim | 4CSC";
                graphics2D.drawString(Str, 10, 10);

                drawLongHand();
                drawShortHands();
                drawSecondHands();
            }
        }

        public void drawClockNumbers(Graphics2D graphics2D, Color FG) {
            // Draw the hour lines
            Line2D.Double hour12 = new Line2D.Double(350, 120, 350, 180);
            graphics2D.setPaint(FG);
            graphics2D.draw(hour12);

            Line2D.Double hour1 = new Line2D.Double(465, 150, 435, 200);
            graphics2D.draw(hour1);

            Line2D.Double hour2 = new Line2D.Double(550, 235, 500, 265);
            graphics2D.draw(hour2);

            Line2D.Double hour3 = new Line2D.Double(580, 350, 520, 350);
            graphics2D.draw(hour3);

            Line2D.Double hour4 = new Line2D.Double(550, 465, 500, 435);
            graphics2D.draw(hour4);

            Line2D.Double hour5 = new Line2D.Double(465, 550, 435, 500);
            graphics2D.draw(hour5);

            Line2D.Double hour6 = new Line2D.Double(350, 580, 350, 520);
            graphics2D.draw(hour6);

            Line2D.Double hour7 = new Line2D.Double(235, 550, 265, 500);
            graphics2D.draw(hour7);

            Line2D.Double hour8 = new Line2D.Double(150, 465, 200, 435);
            graphics2D.draw(hour8);

            Line2D.Double hour9 = new Line2D.Double(120, 350, 180, 350);
            graphics2D.draw(hour9);

            Line2D.Double hour10 = new Line2D.Double(150, 235, 200, 265);
            graphics2D.draw(hour10);

            Line2D.Double hour11 = new Line2D.Double(235, 150, 265, 200);
            graphics2D.draw(hour11);
        }

        public void drawLongHand() {
            BasicStroke basicStroke2 = new BasicStroke(7.0f);
            graphics2D.setStroke(basicStroke2);
            longHand = new Line2D.Double(350, 350, 350, 150);
            graphics2D.setPaint(Color.GRAY);
            double deg = (Integer.parseInt(hour.getText()) * 30) +
                    (Integer.parseInt(minutes.getText()) / 2);
            graphics2D.draw(rotate(longHand, deg));
        }

        public void drawShortHands() {
            BasicStroke basicStroke2 = new BasicStroke(7.0f);
            graphics2D.setStroke(basicStroke2);
            shortHand = new Line2D.Double(350, 350, 250, 200);
            graphics2D.setPaint(Color.BLUE);
            double deg = Integer.parseInt(minutes.getText()) * 6;
            graphics2D.draw(rotate(longHand, deg));
        }

        public void drawSecondHands() {
            BasicStroke basicStroke2 = new BasicStroke(7.0f);
            graphics2D.setStroke(basicStroke2);
            secondHand = new Line2D.Double(350, 350, 450, 200);
            graphics2D.setPaint(Color.BLUE);
            double deg = Integer.parseInt(second.getText()) * 6;
            graphics2D.draw(rotate(longHand, deg));
        }

        public Shape rotate(Shape shape, double deg) {
            AffineTransform transform = new AffineTransform();
            transform.rotate(Math.toRadians(deg), 350, 350);
            return transform.createTransformedShape(shape);
        }
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}
