
/**
 * Beschreiben Sie hier die Klasse LISTE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LISTE
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    protected LISTENELEMENT anfang;

    /**
     * Konstruktor für Objekte der Klasse LISTE
     */
    public LISTE()
    {
        anfang = new ABSCHLUSS();
    }

    int LaengeGeben() {       
        return anfang.RestlaengeGeben();
    }

    void VorneEinfuegen(DATENELEMENT dNeu) {
        anfang = new KNOTEN(dNeu, anfang);
    }

    void HintenEinfuegen(DATENELEMENT dNeu)  {
        anfang = anfang.HintenEinfuegen(dNeu);
    }

    DATENELEMENT VorneEntfernen()  {
        DATENELEMENT d = anfang.DatenelementGeben();
        anfang = anfang.NachfolgerGeben();
        return d;   
    }

    void KnotenEntfernen(DATENELEMENT d)  {
        anfang = anfang.KnotenEntfernen(d);       
    }

    DATENELEMENT EndeEntfernen()  {
        DATENELEMENT d = anfang.EndeGeben(null);
        anfang = anfang.KnotenEntfernen(d);
        return d;
    }

    DATENELEMENT Suchen(String suchStr) {
        return anfang.Suchen(suchStr);
    }

    boolean  IstVorhanden(String suchStr) {
        return anfang.IstVorhanden(suchStr);
    }

    void EinfuegenVor(DATENELEMENT dNeu, 
    DATENELEMENT dVor)  {
        anfang = anfang.EinfuegenVor(dNeu, dVor);
    }

    void EinfuegenSortiert(DATENELEMENT dNeu) {
        anfang = anfang.EinfuegenSortiert(dNeu);             
    }
    
    void InformationAusgeben()  {
        anfang.InformationAusgeben();
    }


}
