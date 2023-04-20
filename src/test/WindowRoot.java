package test;

import javax.swing.*;
import java.awt.*;

public class WindowRoot {

    //Main Window:
    private JFrame window;
    private MenuSection menuSection;
    private ParametersSection parametersSection;
    private TestSection testSection;



    public WindowRoot(){
        window = new JFrame();
        window.setTitle("Tabliczka mnożenia");
        window.setLayout(new BorderLayout());
        window.setSize(500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        menuSection = new MenuSection(window);
        parametersSection = new ParametersSection(window);
        testSection = new TestSection(window);

        setVisible();
    }

    public void setVisible(){
        window.setVisible(true);
    }

}
