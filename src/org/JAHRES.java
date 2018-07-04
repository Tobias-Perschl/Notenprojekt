package org;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Philipp on 04.07.2018.
 * package pane
 */
public class JAHRES extends JPanel {
    private HALBJAHRES HBJ1;
    private HALBJAHRES HBJ2;

    public JAHRES (String jahr) {
        setLayout(null);
        setPreferredSize(new Dimension(220, 1100));
        HBJ1 = new HALBJAHRES();
        HBJ2 = new HALBJAHRES();

        HBJ1.setBounds(0,35,(int)HBJ1.getPreferredSize().getWidth(), (int)HBJ1.getPreferredSize().getHeight());
        HBJ2.setBounds((int)HBJ1.getPreferredSize().getWidth()+5,35,(int)HBJ1.getPreferredSize().getWidth(), (int)HBJ1.getPreferredSize().getHeight());

        JLabel jahrJLabel = new JLabel(jahr);

        jahrJLabel.setBounds(80,0,30,30);

        add(HBJ1);
        add(HBJ2);
        add(jahrJLabel);
    }

    public void AktualisiereJahre(Object[] muendlich1, Object[] muendlich2, Object[] schriftlich1, Object[] schriftlich2){
        HBJ1.AktualisiereHalbjahr(schriftlich1, muendlich1);
        HBJ1.AktualisiereHalbjahr(schriftlich2, muendlich2);
    }
}
