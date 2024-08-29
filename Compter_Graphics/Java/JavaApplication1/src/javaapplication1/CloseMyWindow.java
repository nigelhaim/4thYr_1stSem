import java.awt.event.*;

public class CloseMyWindow extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        Syystem.exit(0);
    }
}