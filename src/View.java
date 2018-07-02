import javax.swing.*;

public class View extends JFrame {

    private JList<FACH> faecher;

    public View(){
        super("Notenprogramm");
        setSize(1000, 1280);
        setVisible(true);

        faecher = new JList<>();
        faecher.setBounds(20,20,200,1000);
    }
}
