package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CountPuschButton implements ActionListener {
    public static int counter = 0;

    @Override
    public void actionPerformed(ActionEvent a){
        
    }
}
public class SwingTest {
    JLabel etykieta;
    SwingTest(){
        JFrame window = new JFrame("\"Pierwsza\" aplikacja okienkowa napisana przeze mnie w Javie:-p");
        window.setLayout(new FlowLayout());
        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        etykieta = new JLabel("Test aplikacji okienkowej. Ilość naciśnięć przycisku: 0");
        window.add(etykieta);
        JButton button = new JButton("Naciśnij mnie.");
        window.add(button);
        button.addActionListener(new CountPuschButton());

        window.setVisible(true);
    }



    public static void main (String [] args){
        System.out.println("Hello World! We Love You;)");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTest();
            }
        });
    }
}
