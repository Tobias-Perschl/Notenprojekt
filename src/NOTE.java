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

        if(punkte == 15){
            return 0.66;
        }
        if(punkte == 14){
            return 1.0;
        }
        if(punkte == 13){
            return 1.33;
        } if(punkte == 12){
            return 1.66;
        }
        if(punkte == 12){
            return 1.66;
        }
        if(punkte == 11){
            return 2.00;
        }
        if(punkte == 10){
            return 2.33;
        }
        if(punkte == 9){
            return 2.66;
        }
        if(punkte == 8){
            return 3.00;
        }
        if(punkte == 7){
            return 3.33;
        }
        if(punkte == 6){
            return 3.66;
        }
        if(punkte == 5){
            return 4.00;
        }
        if(punkte == 4){
            return 4.33;
        }
        if(punkte == 3){
            return 4.66;
        }
        if(punkte == 2){
            return 5.0;
        }
        if(punkte == 1){
            return 5.33;
        }
        if(punkte == 0){
            return 5.66;
        }

        return 0;

    }
    int PunkteGeben(){
        return punkte;
    }
}