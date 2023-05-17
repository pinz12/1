
/**
 * Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Main
{
    public static void main(String args[])
    {
        int ob = 50;
        int summe = 0;

        int obereGrenze = 20;
        for(int i = 0; i <= obereGrenze; i++)

        {
            summe = summe + i;
        }
        
        int mult = 1;

        for(int i = 2; i <= obereGrenze; i++)

        {
            mult *= i;
        }
        
        System.out.println("Summe: " + summe + "Mult: " + mult);
    }
}
