package org;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FACH {
    List<NOTE> muendliche11_1 = new ArrayList<>();
    List<NOTE> muendliche11_2 = new ArrayList<>();
    List<NOTE> muendliche12_1 = new ArrayList<>();
    List<NOTE> muendliche12_2 = new ArrayList<>();

    List<NOTE> schriftliche11_1 = new ArrayList<>();
    List<NOTE> schriftliche11_2 = new ArrayList<>();
    List<NOTE> schriftliche12_1 = new ArrayList<>();
    List<NOTE> schriftliche12_2 = new ArrayList<>();

    String name;
    Color farbe;

    public FACH(String name, Color farbe) {
        this.name = name;
        this.farbe = farbe;
    }

    public void MuendlicheNoteHinzufuegen(NOTE note, int halbjahr) {
        note.SchriftlichSetzen(false);
        switch (halbjahr) {
            case 1:
                muendliche11_1.add(note);
                break;
            case 2:
                muendliche11_2.add(note);
                break;
            case 3:
                muendliche12_1.add(note);
                break;
            case 4:
                muendliche12_2.add(note);
                break;
        }

    }

    public void SchriftlicheNoteHinzufuegen(NOTE note, int halbjahr) {
        note.SchriftlichSetzen(true);
        switch (halbjahr) {
            case 1:
                schriftliche11_1.add(note);
                break;
            case 2:
                schriftliche11_2.add(note);
                break;
            case 3:
                schriftliche12_1.add(note);
                break;
            case 4:
                schriftliche12_2.add(note);
                break;
        }
    }


    public Object[] Muendliche11_1Geben() {
        return muendliche11_1.toArray();
    }
    public Object[] Muendliche11_2Geben() {
        return muendliche11_2.toArray();
    }

    public Object[] Muendliche12_1Geben() {
        return muendliche12_1.toArray();
    }

    public Object[] Muendliche12_2Geben() {
        return muendliche12_2.toArray();
    }

    public Object[] Schriftliche11_1Geben() {
        return schriftliche11_1.toArray();
    }

    public Object[] Schriftliche11_2Geben() {
        return schriftliche11_2.toArray();
    }

    public Object[] Schriftliche12_1Geben() {
        return schriftliche12_1.toArray();
    }

    public Object[] Schriftliche12_2Geben() {
        return schriftliche12_2.toArray();
    }

    @Override
    public String toString() {
        return name;
    }

    private double DurschnittNoteBerechnen(List<NOTE> muendliche, List<NOTE> schriftliche){
        double muendlichGesamt=0;
        double schriftlichGesamt=0;

        for(NOTE note : muendliche){
            muendlichGesamt+=note.NoteGeben();
        }

        for(NOTE note : schriftliche){
            schriftlichGesamt+=note.NoteGeben();
        }

        return (muendlichGesamt/muendliche.size()+schriftlichGesamt/schriftliche.size())/2;
    }

    public double DurschnittNote11_1(){
        return DurschnittNoteBerechnen(muendliche11_1, schriftliche11_1);
    }

    public double DurschnittNote11_2(){
        return DurschnittNoteBerechnen(muendliche11_2, schriftliche11_2);
    }

    public double DurschnittNote12_1(){
        return DurschnittNoteBerechnen(muendliche12_1, schriftliche12_1);
    }

    public double DurschnittNote12_2(){
        return DurschnittNoteBerechnen(muendliche12_2, schriftliche12_2);
    }

    public double GesamtNotenDurschnitt(){
        return (DurschnittNote11_1()+DurschnittNote11_2()+DurschnittNote12_1()+DurschnittNote12_2())/4;
    }
}