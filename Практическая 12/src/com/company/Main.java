package com.company;

import javax.swing.*;

public class Main {
    private JFrame window;
    public Main()
    {
        window = new JFrame("Работа с меню и действиями мыши");
        window.setSize(800,800);
        window.add(new Panel());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
