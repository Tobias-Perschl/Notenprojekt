
/**
 * Beschreiben Sie hier die Klasse ABSCHLUSS.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ABSCHLUSS extends LISTENELEMENT
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    /**
     * Konstruktor für Objekte der Klasse ABSCHLUSS
     */
    public ABSCHLUSS() {        
    }

    LISTENELEMENT NachfolgerGeben() {
        return this;
    }

    DATENELEMENT DatenelementGeben() {
        return null;
    }

    int RestlaengeGeben()  {
        return 0;
    }

    DATENELEMENT Suchen(String suchStr) {
        return null;
    }

    DATENELEMENT SortSuchen(String suchStr) {
        return null;
    }

    boolean IstVorhanden(String suchStr) {
        return false;
    }

    boolean SortIstVorhanden(String suchStr) {
        return false;
    }

    KNOTEN HintenEinfuegen(DATENELEMENT dNeu)  {
        return new KNOTEN(dNeu, this);
    }

    LISTENELEMENT KnotenEntfernen(DATENELEMENT d)  {
        return this; 
    }

    DATENELEMENT EndeGeben(DATENELEMENT d)  {
        return d;
    }
    
    KNOTEN EinfuegenVor(DATENELEMENT dNeu, DATENELEMENT dVor)  {
        return new KNOTEN(dNeu, this);                          
    }             

    KNOTEN EinfuegenSortiert(DATENELEMENT dNeu) {
        return new KNOTEN(dNeu, this);                
    }
    
    void InformationAusgeben() {
    }

}
