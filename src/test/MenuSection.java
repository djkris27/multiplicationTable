package test;

import javax.swing.*;

public class MenuSection {
    private JMenuBar jMenu;

    public MenuSection(JFrame getWindow){
        jMenu = new JMenuBar();
        getWindow.setJMenuBar(jMenu);
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
    }
}
