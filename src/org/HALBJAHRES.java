package org;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Philipp on 04.07.2018.
 * package pane
 */
public class HALBJAHRES extends JPanel {

    private MUENDLICHSCHRIFTLICH schriftlich;
    private MUENDLICHSCHRIFTLICH muendlich;

    public HALBJAHRES(){
        setLayout(null);

        setPreferredSize(new Dimension(100,1000));

        schriftlich= new MUENDLICHSCHRIFTLICH(true);
        muendlich= new MUENDLICHSCHRIFTLICH(false);
        schriftlich.setBounds(0,0,(int)schriftlich.getPreferredSize().getWidth(), (int)schriftlich.getPreferredSize().getHeight());
        muendlich.setBounds((int)schriftlich.getPreferredSize().getWidth()+5,0,(int)schriftlich.getPreferredSize().getWidth(), (int)schriftlich.getPreferredSize().getHeight());

        add(schriftlich);
        add(muendlich);
    }

    public void AktualisiereHalbjahr(Object[] schriftlich, Object[] muendlich){
        this.schriftlich.AktualisiereMuendlichSchriflich(schriftlich);
        this.muendlich.AktualisiereMuendlichSchriflich(muendlich);
    }
}
