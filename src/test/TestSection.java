package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSection implements ActionListener {
    private MultiplicationTest multiplicationTestRoot;
    public static boolean start = false;
    private JButton startCheckBotton;
    private JFrame thisWindow;

    public TestSection(JFrame window){
        startCheckBotton = new JButton("START");
        startCheckBotton.addActionListener(this);
        thisWindow = window;
        window.add(startCheckBotton);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (!start){
            //start test and show multiplications
            start = true;
            startTest();
            startCheckBotton.setText("Sprawdź");
        }
        else {
            //check and show score
        }
    }

    private void startTest(){
        multiplicationTestRoot = new MultiplicationTest("Kris", 10, 100, 10);
        MultiplicationTestSwingComponent testComponents = new MultiplicationTestSwingComponent(multiplicationTestRoot);

        testComponents.add(thisWindow);
        thisWindow.setVisible(true);
    }
}
