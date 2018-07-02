
/**
 * Tragen Sie hier eine Beschreibung des Interface DATENELEMENT ein.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public interface DATENELEMENT
{
    void InformationAusgeben();
    boolean SchluesselIstGleich(String s);
    boolean SchluesselIstGroesser(String s);
    boolean IstGleich(DATENELEMENT d);
    boolean IstGroesser(DATENELEMENT d);

}
