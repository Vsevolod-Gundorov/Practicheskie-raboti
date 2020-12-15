package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Panel extends JPanel
{
    public Panel()
    {
        TextDocument obj = new TextDocument();
        JPanel pnl = new JPanel();
        add(pnl);
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem cNew = new JMenuItem("New");
        JMenuItem cSave = new JMenuItem("Save");
        JMenuItem cExit = new JMenuItem("Exit");
        JMenuItem cOpen= new JMenuItem("Open");
        add(bar);
        bar.add(menu);
        menu.add(cNew);
        menu.add(cSave);
        menu.add(cExit);
        menu.add(cOpen);

        cNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try {
                    obj.createFile();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        cSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            obj.saveFileInformation();
            }
        });

        cExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        cOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    obj.openFile();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

    }
}
