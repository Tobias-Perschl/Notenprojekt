import java.util.Date;

public class NOTE implements DATENELEMENT{
    private int punkte;
    private double note;
    private Date datum;
    private String bemerkung;
    private boolean schriftlich;

    public NOTE(int punkte, Date datum, String bemerkung, boolean schriftlich){
        this.punkte=punkte;
        this.datum=datum;
        this.bemerkung=bemerkung;
        this.schriftlich=schriftlich;

    }


    public double NoteGeben() {

        if(note==0) {
            switch (punkte) {
                case 15:
                     note = 0.66;
                     break;
                case 14:
                    note = 1.00;
                    break;
                case 13:
                    note = 1.33;
                    break;
                case 12:
                    note = 1.66;
                    break;
                case 11:
                    note = 2.00;
                    break;
                case 10:
                    note = 2.33;
                    break;
                case 9:
                    note = 2.66;
                    break;
                case 8:
                    note = 3.00;
                    break;
                case 7:
                    note = 3.33;
                    break;
                case 6:
                    note = 3.66;
                    break;
                case 5:
                    note = 4.00;
                    break;
                case 4:
                    note = 4.33;
                    break;
                case 3:
                    note = 4.66;
                    break;
                case 2:
                    note = 5.00;
                    break;
                case 1:
                    note = 5.33;
                    break;
                case 0:
                    note = 6.00;
                    break;
            }
        }

        return note;
    }

    public Date DatumGeben() {
        return datum;
    }


    public String BemerkungGeben() {
        return bemerkung;
    }

    public void BemerkungSetzen(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public void DatumSetzen(Date datum) {
        this.datum = datum;
    }

    public void NoteSetzen(double note) {
        this.note = note;
    }

    public void PunkteSetzen(int punkte) {
        this.punkte = punkte;
    }

    public void SchriftlichSetzen(boolean schriftlich) {
        this.schriftlich = schriftlich;
    }

    public int PunkteGeben(){
        return punkte;
    }

    public void InformationAusgeben(){

    }
    public boolean IstGleich(DATENELEMENT d){
        return d.equals(this);
    }
    public boolean IstGroesser(DATENELEMENT d){
        return ((NOTE)d).PunkteGeben() > PunkteGeben();
    }
}