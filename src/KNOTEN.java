
/**
 * Beschreiben Sie hier die Klasse KNOTEN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KNOTEN extends LISTENELEMENT
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private LISTENELEMENT nachfolger;
    private DATENELEMENT daten;

    /**
     * Konstruktor für Objekte der Klasse KNOTEN
     */
    public KNOTEN(DATENELEMENT d, LISTENELEMENT nf)     {
        daten = d;
        nachfolger = nf;
    }

    LISTENELEMENT NachfolgerGeben() {
        return nachfolger;
    }

    DATENELEMENT DatenelementGeben() {
        return daten;
    }

    int RestlaengeGeben() {   
        return nachfolger.RestlaengeGeben() +1;
    }


    KNOTEN HintenEinfuegen(DATENELEMENT dNeu)  {
        nachfolger.HintenEinfuegen(dNeu);
        return this;
    }

    LISTENELEMENT KnotenEntfernen(DATENELEMENT d)  {
        if (daten == d) {
            return nachfolger;
        }
        else {
            nachfolger = nachfolger.KnotenEntfernen(d);
            return this;
        }
    }

    DATENELEMENT EndeGeben(DATENELEMENT d)  {
        return nachfolger.EndeGeben(d);
    }

    KNOTEN EinfuegenVor(DATENELEMENT dNeu, DATENELEMENT dVor)  {
        if (daten == dVor) {
            return new KNOTEN(dNeu, this);
        }
        else {
            nachfolger = nachfolger.EinfuegenVor(dNeu, dVor);
            return this;
        }
    }

    KNOTEN EinfuegenSortiert(DATENELEMENT dNeu) {
        if (daten.IstGroesser(dNeu)) {  
            return new KNOTEN(dNeu, this);
        }
        else {
            nachfolger = nachfolger.EinfuegenSortiert(dNeu);
            return this;
        }
    }

    void InformationAusgeben() {
        daten.InformationAusgeben();
        nachfolger.InformationAusgeben();
    }   
}