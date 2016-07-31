package oca_study_examples.exceptions;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-29
 */
public class ProperSyntax
{
    static int x;

    public static String highLow()
    {

        try
        {
            System.out.println("Trying");
            if (x == 0)
                return "High";
            return "Low";


        }
        catch (RuntimeException e)
        {
            System.err.println("Exception detected: " + e);
        }
        finally
        {
            System.out.println("Dead bird");
//            System.exit(0);
        }

        return null;
    }

    public static void main(String[] args)
    {
        System.out.println(highLow());
    }
}
