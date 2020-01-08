package b.brauner;

import b.brauner.linkedList.DATENELEMENT;

public class KATZE implements DATENELEMENT
{
    private String name;

    public KATZE(String name)
    {
        this.name = name;
    }

    public String NameGeben()
    {
        return name;
    }

    @Override
    public void InformationAusgeben()
    {
        System.out.println(name);
    }

    @Override
    public boolean IstKleinerAls(DATENELEMENT vergleich)
    {
        KATZE andere = (KATZE) vergleich;
        return name.compareTo(andere.NameGeben()) < 0;
    }

    @Override
    public boolean SchluesselIstGleich(String s)
    {
        return name.equals(s);
    }
}
