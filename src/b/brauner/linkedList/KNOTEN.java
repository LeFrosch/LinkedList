package b.brauner.linkedList;

public class KNOTEN extends LISTENELEMENT
{
    private DATENELEMENT daten;
    private LISTENELEMENT nachfolger;

    public KNOTEN(DATENELEMENT daten, LISTENELEMENT nachfolger)
    {
        this.daten = daten;
        this.nachfolger = nachfolger;
    }

    public DATENELEMENT DatenelementGeben()
    {
        return daten;
    }

    @Override
    public LISTENELEMENT NachfolgerGeben()
    {
        return nachfolger;
    }

    @Override
    public void InformationAusgeben()
    {
        daten.InformationAusgeben();
        nachfolger.InformationAusgeben();
    }

    @Override
    public KNOTEN HintenEinfuegen(DATENELEMENT elemnt)
    {
        nachfolger = nachfolger.HintenEinfuegen(elemnt);
        return this;
    }

    @Override
    public KNOTEN EinfuegenVor(DATENELEMENT element, DATENELEMENT vergleich)
    {
        if (daten == vergleich)
        {
            return new KNOTEN(element, this);
        }
        else
        {
            nachfolger = nachfolger.EinfuegenVor(element, vergleich);
            return this;
        }
    }

    @Override
    public KNOTEN SorteirtEinfuegen(DATENELEMENT element)
    {
        if (daten.IstKleinerAls(element))
        {
            nachfolger = nachfolger.SorteirtEinfuegen(element);
            return this;
        }
        else
        {
            return new KNOTEN(element, this);
        }
    }

    @Override
    public LISTENELEMENT KnotenEntfernen(DATENELEMENT element)
    {
        if (daten == element)
        {
            return nachfolger;
        }
        else
        {
            nachfolger = nachfolger.KnotenEntfernen(element);
            return this;
        }
    }

    @Override
    public DATENELEMENT EndeGeben(DATENELEMENT element)
    {
        return nachfolger.EndeGeben(daten);
    }

    @Override
    public DATENELEMENT Suchen(String vergleich)
    {
        if (daten.SchluesselIstGleich(vergleich))
        {
            return daten;
        }
        else
        {
            return nachfolger.Suchen(vergleich);
        }
    }

    @Override
    public int RestlaengeGeben()
    {
        return nachfolger.RestlaengeGeben() + 1;
    }
}
