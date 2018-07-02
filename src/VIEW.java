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

        faecher.add(new FACH("Mathe", Color.BLUE));

        faecherJlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        faecherJlist.setListData(faecher.toArray());

        JScrollPane listScrollPane = new JScrollPane();
        listScrollPane.getViewport().setView(faecherJlist);
        listScrollPane.setBounds(20, 20, 200, 1000);
        add(listScrollPane);

    }
}
