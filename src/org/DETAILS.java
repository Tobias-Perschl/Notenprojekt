package org;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Philipp on 02.07.2018.
 * package pane
 */
public class DETAILS extends JPanel {

    private JLabel gesmatSchnitt = new JLabel("Gesamtdurchshnitt: ");

    private JAHRES Q11;
    private JAHRES Q12;


    public DETAILS(){
        setLayout(null);
        setPreferredSize(new Dimension(2000,2000));
        Q11 = new JAHRES("Q11");
        Q12 = new JAHRES("Q12");

        Q11.setBounds(20,0, (int)Q11.getPreferredSize().getWidth(),(int)Q11.getPreferredSize().getHeight());
        Q12.setBounds((int)Q11.getPreferredSize().getWidth()+50,0, (int)Q11.getPreferredSize().getWidth(),(int)Q11.getPreferredSize().getHeight());

        add(Q11);
        add(Q12);
    }

    public void AktualisiereDetails(FACH fach){
        Q11.AktualisiereJahre(fach.Muendliche11_1Geben(), fach.Muendliche11_2Geben(), fach.Schriftliche11_1Geben(), fach.Schriftliche11_2Geben());
        Q12.AktualisiereJahre(fach.Muendliche12_1Geben(), fach.Muendliche12_2Geben(), fach.Schriftliche12_1Geben(), fach.Schriftliche12_2Geben());
    }
}
