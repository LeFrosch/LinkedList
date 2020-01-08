package b.brauner.linkedList;

public class ABSCHLUSS extends LISTENELEMENT
{
    @Override
    public void InformationAusgeben()
    {
        System.out.println("---- END ----");
    }

    @Override
    public DATENELEMENT DatenelementGeben()
    {
        return null;
    }

    @Override
    public LISTENELEMENT NachfolgerGeben()
    {
        return this;
    }

    @Override
    public KNOTEN HintenEinfuegen(DATENELEMENT elemnt)
    {
        return new KNOTEN(elemnt, this);
    }

    @Override
    public KNOTEN EinfuegenVor(DATENELEMENT element, DATENELEMENT vergleich)
    {
        return HintenEinfuegen(element);
    }

    @Override
    public KNOTEN SorteirtEinfuegen(DATENELEMENT element)
    {
        return HintenEinfuegen(element);
    }

    @Override
    public LISTENELEMENT KnotenEntfernen(DATENELEMENT element)
    {
        return this;
    }

    @Override
    public DATENELEMENT EndeGeben(DATENELEMENT element)
    {
        return element;
    }

    @Override
    public DATENELEMENT Suchen(String vergleich)
    {
        return null;
    }

    @Override
    public int RestlaengeGeben()
    {
        return 0;
    }
}
