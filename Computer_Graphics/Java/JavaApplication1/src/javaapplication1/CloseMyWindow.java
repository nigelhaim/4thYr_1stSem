package javaapplication1;
import java.awt.event.*;

public class CloseMyWindow extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}