import java.awt.*;

public class FACH {
    LISTE[] muendliche;
    LISTE[] schriftliche;
    String name;
    Color farbe;

    public FACH(String name, Color farbe) {
        this.name = name;
        this.farbe = farbe;
        muendliche = new LISTE[3];
        schriftliche = new LISTE[3];
    }

    public void MuendlicheNoteHinzufuegen(){

    }


    public void SchriftlicheNoteHinzufuegen(){

    }

    @Override
    public String toString() {
        return name;
    }
}