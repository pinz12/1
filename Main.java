
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
        int summe = 0;
        for(int i = 0; i <= 10; i++)
        {
            summe = summe + i;
        }
        
        int mult = 1;
        for(int i = 2; i <= 10; i++)
        {
            mult *= i;
        }
        
        System.out.println("Summe: " + summe + "Mult: " + mult);
    }
}
