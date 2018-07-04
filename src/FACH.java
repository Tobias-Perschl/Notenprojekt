import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FACH {
    List<NOTE>[] muendliche;
    List<NOTE>[] schriftliche;
    String name;
    Color farbe;

    public FACH(String name, Color farbe) {
        this.name = name;
        this.farbe = farbe;
        muendliche = new ArrayList[3];
        schriftliche = new ArrayList[3];
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