package test;

import javax.swing.*;
import java.awt.*;

public class MultiplicationTestSwingComponent {
    JLabel [] labels;
    JTextArea [] results;
    MultiplicationTest multiplicationTestRoot;
    public MultiplicationTestSwingComponent(MultiplicationTest multiplicationTestRootFrom){
        multiplicationTestRoot = multiplicationTestRootFrom;
        labels = new JLabel[multiplicationTestRootFrom.getQuantity()];
        results = new JTextArea[multiplicationTestRootFrom.getQuantity()];
        for (int i = 0; i < multiplicationTestRootFrom.getQuantity(); i++){
            labels[i] = new JLabel();
            labels[i].setText(multiplicationTestRootFrom.getMultiplicationTable()[i].toString());
            results[i] = new JTextArea();
            results[i].setColumns(3);
        }
    }

    public void add(JFrame component){
        for (int i = 0; i < multiplicationTestRoot.getQuantity(); i++){
            component.add(labels[i]);
            component.add(results[i]);
        }
    }
}
