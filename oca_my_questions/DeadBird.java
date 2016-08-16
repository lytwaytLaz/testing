package oca_my_questions;

import javax.sql.rowset.serial.SerialRef;

import static java.lang.System.out;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-28
 */
public class DeadBird
{
    static String birdStatus = "Extinct";
    public static String getName()
    {
        try
        {
            System.out.print(birdStatus);
            return "Dodo";
        }
        catch (Exception e)
        {
            System.err.print(e);
        }
        finally //within a try/finally or try/catch/finally block
        //the return is not performed until whatever is
        //in the finally block has run
        {
            System.out.print("Bird");
        }
        return null;
    }

    public static void main(String[] args)
    {
        out.print(getName());
    }
}