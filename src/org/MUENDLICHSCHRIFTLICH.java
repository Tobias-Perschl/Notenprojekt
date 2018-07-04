package org;

import org.FACH;
import org.NOTE;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Philipp on 04.07.2018.
 * package pane
 */
public class MUENDLICHSCHRIFTLICH extends JPanel {

    private JLabel muendlichSchriftlichJLabel = new JLabel();

    private JList notenJList = new JList();

    public MUENDLICHSCHRIFTLICH(boolean schriftlich){

        setLayout(null);

        setPreferredSize(new Dimension(45,1000));

        notenJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane listScrollPane = new JScrollPane();
        listScrollPane.getViewport().setView(notenJList);
        listScrollPane.setBounds(0, 30, 30, 900);
        add(listScrollPane);

        muendlichSchriftlichJLabel.setText(schriftlich ? "S" : "M");
        muendlichSchriftlichJLabel.setBounds(10,0,30,30);
        add(muendlichSchriftlichJLabel);
    }

    public void AktualisiereMuendlichSchriflich(Object noten[]){
        notenJList.setListData(noten);
        repaint();
        validate();
    }
}
