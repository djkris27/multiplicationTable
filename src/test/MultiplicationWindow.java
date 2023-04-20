package test;

import javax.swing.*;
import java.awt.*;

public class MultiplicationWindow  {
    private WindowRoot windowRoot;


    MultiplicationWindow(){
        windowRoot = new WindowRoot();
    }

    
    public static void main (String [] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MultiplicationWindow();
            }
        });
    }
}
