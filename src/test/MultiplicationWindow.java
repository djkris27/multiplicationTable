package test;

import javax.swing.*;
import java.awt.*;

public class MultiplicationWindow {
    MultiplicationWindow(){
        //Main frame
        JFrame window = new JFrame("Tabliczka mnożenia");
        window.setLayout(new FlowLayout());
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Menu bar
        JMenuBar jMenu = new JMenuBar();
        window.add(jMenu);
        JMenu file = new JMenu("Plik");
        jMenu.add(file);
        JMenuItem newItem = new JMenuItem("Nowy");
        JMenuItem openItem = new JMenuItem("Otwórz");
        JMenuItem saveItem = new JMenuItem("Zapisz");
        JMenuItem exitItem = new JMenuItem("Wyjdź");
        file.add(newItem);
        file.add(openItem);
        file.add(saveItem);
        file.add(exitItem);

        //Left frame:
        JFrame leftFrame = new JFrame();
        window.add(leftFrame);
        JLabel nameLabel = new JLabel("Imię: ");
        JTextArea nameTextArea = new JTextArea();


        JFrame rightFrame = new JFrame();
        window.add(rightFrame);



        window.setVisible(true);
    }

    public static void main (String [] args){
        System.out.println("Hello World! We Love You;)");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MultiplicationWindow();
            }
        });
    }
}
