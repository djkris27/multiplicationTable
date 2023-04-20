package test;

import javax.swing.*;
import java.awt.*;

public class ParametersSection {
    private JPanel parametersSection;
    private JTextArea nameTextArea, maxNumberArea, maxResultArea;


    public ParametersSection(JFrame window){
        //Left frame:
        parametersSection = new JPanel(new FlowLayout());
        JLabel nameLabel = new JLabel("Imię: ");
        parametersSection.add(nameLabel);
        nameTextArea = new JTextArea();
        nameTextArea.setToolTipText("Podaj swoje imię.");
        parametersSection.add(nameTextArea);
        nameTextArea.setText("Anonymous");
        JLabel maxNumberLabel = new JLabel("Maksymalny czynnik: ");
        parametersSection.add(maxNumberLabel);
        maxNumberArea = new JTextArea();
        maxNumberArea.setToolTipText("Podaj maksymalny czynnik mnożenia, tzn. \n przy mnożeniu x * y = z \n podaj największą liczbę, jaką magą być x lub y");
        maxNumberArea.setText("10");
        parametersSection.add(maxNumberArea);
        JLabel maxResultLabel = new JLabel("Maksymalny wynik: ");
        parametersSection.add(maxResultLabel);
        maxResultArea = new JTextArea();
        maxResultArea.setToolTipText("Podaj maksymalny wynik mnożenia, tzn. \n przy mnożeniu x * y = z \n podaj największą liczbę, jaką może być z");
        maxResultArea.setText("100");
        parametersSection.add(maxResultArea);


        window.setContentPane(parametersSection);
    }

}
