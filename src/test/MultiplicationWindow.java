package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationWindow implements ActionListener {
    private boolean start = false;
    private JFrame window;
    private JMenuBar jMenu;
    private JPanel leftPanel;
    private JTextArea nameTextArea, maxNumberArea, maxResultArea;
    MultiplicationTest test;

    MultiplicationWindow(){
        //Main frame
        window = new JFrame("Tabliczka mnożenia");
        window.setLayout(new BorderLayout());
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Menu bar
        jMenu = new JMenuBar();
//        window.add(jMenu);
        window.setJMenuBar(jMenu);
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
        leftPanel = new JPanel(new FlowLayout());
        JLabel nameLabel = new JLabel("Imię: ");
            leftPanel.add(nameLabel);
        nameTextArea = new JTextArea();
            nameTextArea.setToolTipText("Podaj swoje imię.");
            leftPanel.add(nameTextArea);
            nameTextArea.setText("Anonymous");
        JLabel maxNumberLabel = new JLabel("Maksymalny czynnik: ");
            leftPanel.add(maxNumberLabel);
        maxNumberArea = new JTextArea();
            maxNumberArea.setToolTipText("Podaj maksymalny czynnik mnożenia, tzn. \n przy mnożeniu x * y = z \n podaj największą liczbę, jaką magą być x lub y");
            maxNumberArea.setText("10");
            leftPanel.add(maxNumberArea);
        JLabel maxResultLabel = new JLabel("Maksymalny wynik: ");
            leftPanel.add(maxResultLabel);
        maxResultArea = new JTextArea();
            maxResultArea.setToolTipText("Podaj maksymalny wynik mnożenia, tzn. \n przy mnożeniu x * y = z \n podaj największą liczbę, jaką może być z");
            maxResultArea.setText("100");
            leftPanel.add(maxResultArea);
        JButton start_check = new JButton("START");
            start_check.addActionListener(this);
            leftPanel.add(start_check);

        window.setContentPane(leftPanel);
//
//
//        JFrame rightFrame = new JFrame();
//        window.add(rightFrame);



        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (!start){
            //start test and show multiplications
            start = true;
            startTest();
        }
        else {
            //check and show score
        }
    }

    private void startTest(){
        test = new MultiplicationTest(nameTextArea.getText(), 10, 100, 10);
        for (int i = 0; i < test.getQuantity(); i++){

        }

//        test = new JLabel[5];
//        for (int i = 0; i < test.length; i++){
//            test[i] = new JLabel();
//            test[i].setText("Jestem etykietą nr " + i);
//            leftPanel.add(test[i]);
//            window.setVisible(true);
//        }
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
