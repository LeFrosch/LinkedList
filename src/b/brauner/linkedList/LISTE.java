package b.brauner.linkedList;

public class LISTE
{
    private LISTENELEMENT anfang;

    public LISTE()
    {
        anfang = new ABSCHLUSS();
    }

    public void VorneEinfuegen(DATENELEMENT element)
    {
        anfang = new KNOTEN(element, anfang);
    }

    public void InformationAusgeben()
    {
        System.out.println("--- START ---");
        anfang.InformationAusgeben();
    }

    public void HintenEinfuegen(DATENELEMENT elemnt)
    {
        anfang = anfang.HintenEinfuegen(elemnt);
    }

    public void EinfuegenVor(DATENELEMENT element, DATENELEMENT vergleich)
    {
        anfang = anfang.EinfuegenVor(element, vergleich);
    }

    public void SorteirtEinfuegen(DATENELEMENT element)
    {
        anfang = anfang.SorteirtEinfuegen(element);
    }

    public void KnotenEntfernen(DATENELEMENT element)
    {
        anfang = anfang.KnotenEntfernen(element);
    }

    public DATENELEMENT AnfangEntfernen()
    {
        DATENELEMENT element = anfang.DatenelementGeben();
        anfang = anfang.NachfolgerGeben();

        return element;
    }

    public DATENELEMENT EndeEntfernen()
    {
        DATENELEMENT element = anfang.EndeGeben(null);
        anfang = anfang.KnotenEntfernen(element);

        return element;
    }

    public DATENELEMENT Suchen(String vergleich)
    {
        return anfang.Suchen(vergleich);
    }

    public int LeangeGeben()
    {
        return anfang.RestlaengeGeben();
    }
}
