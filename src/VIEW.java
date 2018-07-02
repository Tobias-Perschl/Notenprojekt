import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VIEW extends JFrame {

    private List<FACH> faecher = new ArrayList<>();
    private JList faecherJlist = new JList(faecher.toArray());

    public VIEW(){
        super("Notenprogramm");
        setSize(1000, 1280);
        setVisible(true);
        setLayout(null);

        faecher.add(new FACH("Mathematik", Color.BLUE));
        faecher.add(new FACH("Deutsch", Color.BLUE));
        faecher.add(new FACH("Religionslehre", Color.BLUE));
        faecher.add(new FACH("Geschichte + Sozialkunde", Color.BLUE));
        faecher.add(new FACH("Sport", Color.BLUE));
        faecher.add(new FACH("Englisch", Color.BLUE));
        faecher.add(new FACH("Latein", Color.BLUE));
        faecher.add(new FACH("Italienisch", Color.BLUE));
        faecher.add(new FACH("Franzoesisch", Color.BLUE));
        faecher.add(new FACH("Physik", Color.BLUE));
        faecher.add(new FACH("Informatik", Color.BLUE));
        faecher.add(new FACH("Wirtschaft und Recht", Color.BLUE));
        faecher.add(new FACH("Geographie", Color.BLUE));
        faecher.add(new FACH("Kunst", Color.BLUE));
        faecher.add(new FACH("Musik", Color.BLUE));
        //TODO 1. und 2. HJ normal W-Seminar Arbeit doppelt
        faecher.add(new FACH("W-Seminar", Color.BLUE));
        //TODO BUS und Praxis
        faecher.add(new FACH("P-Seminar", Color.BLUE));

        faecherJlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        faecherJlist.setListData(faecher.toArray());

        JScrollPane listScrollPane = new JScrollPane();
        listScrollPane.getViewport().setView(faecherJlist);
        listScrollPane.setBounds(20, 20, 200, 1000);
        add(listScrollPane);

    }
}