/**
 * Abstrakte Klasse LISTENELEMENT - beschreiben Sie hier die Klasse
 * 
 * @author (Ihr Name)
 * @version (eine Version-Nummer oder ein Datum)
 */
public abstract class LISTENELEMENT
{
    abstract int RestlaengeGeben();
    abstract KNOTEN HintenEinfuegen(DATENELEMENT dNeu);
    abstract LISTENELEMENT NachfolgerGeben();
    abstract DATENELEMENT DatenelementGeben();
    abstract DATENELEMENT EndeGeben(DATENELEMENT d);
    abstract LISTENELEMENT KnotenEntfernen(DATENELEMENT d);
    abstract DATENELEMENT Suchen(String suchStr);
    abstract DATENELEMENT SortSuchen(String suchStr);
    abstract boolean IstVorhanden(String suchStr);  
    abstract boolean SortIstVorhanden(String suchStr);  
    abstract KNOTEN EinfuegenVor(DATENELEMENT dNeu, DATENELEMENT dVor);    
    abstract KNOTEN EinfuegenSortiert(DATENELEMENT dNeu); 
    abstract void InformationAusgeben();
}



