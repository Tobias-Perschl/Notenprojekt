
/**
 * Beschreiben Sie hier die Klasse PATIENT.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PATIENT implements DATENELEMENT
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private String grund;

    /**
     * Konstruktor für Objekte der Klasse PATIENT
     */
    public PATIENT(String n, String g)
    {
        // Instanzvariable initialisieren
        name = n;
        grund = g;
    }

    public boolean SchluesselIstGleich(String s) {
        if (name.compareTo(s) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean SchluesselIstGroesser(String s) {
        if (name.compareTo(s) > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void InformationAusgeben()  {
        System.out.println("Name: " + name +
            " Grund: " + grund);
    }

    public boolean IstGleich(DATENELEMENT d)  {
        PATIENT p = (PATIENT) d;
        if (name.compareTo(p.name) == 0) {
            return true;
        }
        else {
            return false;
        }      
    }

    public boolean IstGroesser(DATENELEMENT d) {
        PATIENT p = (PATIENT) d;
        if (name.compareTo(p.name) > 0) {
            return true;
        }
        else {
            return false;
        }     
    }

    public String NameGeben()  {
        return name;
    }

    public String GrundGeben()  {
        return grund;
    }

}
