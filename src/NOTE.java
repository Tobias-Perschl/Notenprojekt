import java.util.Date;

public class NOTE{
    int punkte;
    double note;
    Date datum;
    String bemerkung;
    boolean schriftlich;
    public NOTE(){

    }
    double NoteGeben() {

        switch (punkte) {
            case 15:
                return 0.66;
            case 14:
                return 1.00;
            case 13:
                return 1.33;
            case 12:
                return 1.66;
            case 11:
                return 2.00;
            case 10:
                return 2.33;
            case 9:
                return 2.66;
            case 8:
                return 3.00;
            case 7:
                return 3.33;
            case 6:
                return 3.66;
            case 5:
                return 4.00;
            case 4:
                return 4.33;
            case 3:
                return 4.66;
            case 2:
                return 5.00;
            case 1:
                return 5.33;
            case 0:
                return 6.00;
            default:
                return 0;
        }
    }

    int PunkteGeben(){
        return punkte;
    }
}