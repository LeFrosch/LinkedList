package b.brauner;

import b.brauner.linkedList.LISTE;

public class Main
{
    public static void main(String[] args)
    {
        LISTE l = new LISTE();

        for (int i = 100; i > 80; i--)
        {
            l.VorneEinfuegen(new KATZE(Character.toString((char) i)));
        }

        KATZE lezte = new KATZE("Lezte");
        l.HintenEinfuegen(lezte);
        l.EinfuegenVor(new KATZE("Vorlezte"), lezte);

        l.SorteirtEinfuegen(new KATZE("Sortiert"));

        l.InformationAusgeben();

        System.out.print("\nErstes Element: ");
        l.AnfangEntfernen().InformationAusgeben();

        System.out.print("\nLeztes Element: ");
        l.EndeEntfernen().InformationAusgeben();

        System.out.print("\nSuchen von \"Sortiert\": ");
        l.Suchen("Sortiert").InformationAusgeben();

        System.out.println("\nLänge: " + l.LeangeGeben());
    }
}
