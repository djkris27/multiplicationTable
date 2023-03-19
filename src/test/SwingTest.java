package test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonCounter implements ActionListener {
    private int counter = 0;
    private JLabel jLabel = new JLabel("Przycisk naciśnięto 0 razy.");

    @Override
    public void actionPerformed(ActionEvent a){
        if (a.getActionCommand().equals("Dodaj 1"))
            counter++;
        else
            counter--;
        jLabel.setText("Przycisk naciśnięto " + counter + " razy.:)");
    }

    public int getCounter(){
        return counter;
    }

    public JLabel getjLabel(){
        return jLabel;
    }
}
public class SwingTest{
    ButtonCounter buttonCounter = new ButtonCounter();


    SwingTest(){
        JFrame window = new JFrame("\"Pierwsza\" aplikacja okienkowa napisana przeze mnie w Javie:-p");
        window.setLayout(new FlowLayout());
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(buttonCounter.getjLabel());
        JButton buttonAdd = new JButton("Dodaj 1");
        JButton buttonSubstract = new JButton("Odejmij 1");
        window.add(buttonAdd);
        window.add(buttonSubstract);
        buttonAdd.addActionListener(buttonCounter);
        buttonSubstract.addActionListener(buttonCounter);

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
