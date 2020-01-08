package b.brauner.linkedList;

public abstract class LISTENELEMENT
{
    public abstract void InformationAusgeben();

    public abstract DATENELEMENT DatenelementGeben();

    public abstract LISTENELEMENT NachfolgerGeben();

    public abstract KNOTEN HintenEinfuegen(DATENELEMENT elemnt);

    public abstract KNOTEN EinfuegenVor(DATENELEMENT element, DATENELEMENT vergleich);

    public abstract KNOTEN SorteirtEinfuegen(DATENELEMENT element);

    public abstract LISTENELEMENT KnotenEntfernen(DATENELEMENT element);

    public abstract DATENELEMENT EndeGeben(DATENELEMENT element);

    public abstract DATENELEMENT Suchen(String vergleich);

    public abstract int RestlaengeGeben();
}
