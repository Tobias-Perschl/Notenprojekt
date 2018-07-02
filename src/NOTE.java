import java.util.Date;

public class NOTE{
    int punkte;
    double note;
    Date datum;
    String bemerkung;
    boolean schriftlich;
    public NOTE(){

    }
    double NoteGeben(){

        switch(punkte){
            case 15:
                return 0.66;
        }

        switch(punkte){
            case 14:
                return 1.00;
        }

        switch(punkte){
            case 13:
                return 1.33;
        }

        switch(punkte){
            case 12:
                return 1.66;
        }

        switch(punkte){
            case 11:
                return 2.00;
        }

        switch(punkte){
            case 10:
                return 2.33;
        }

        switch(punkte){
            case 9:
                return 2.66;
        }

        switch(punkte){
            case 8:
                return 3.00;
        }

        switch(punkte){
            case 7:
                return 3.33;
        }

        switch(punkte){
            case 6:
                return 3.66;
        }

        switch(punkte){
            case 5:
                return 4.00;
        }

        switch(punkte){
            case 4:
                return 4.33;
        }

        switch(punkte){
            case 3:
                return 4.66;
        }

        switch(punkte){
            case 2:
                return 5.00;
        }

        switch(punkte){
            case 1:
                return 5.33;
        }

        switch(punkte){
            case 0:
                return 6.00;
        }
    int PunkteGeben(){
        return punkte;
    }
}