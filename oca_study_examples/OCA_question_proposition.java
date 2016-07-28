package oca_study_examples;
import static java.lang.System.*; //static import, one can use static members of the class
                                // without the class name or instances of the class

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-18
 */
public class OCA_question_proposition
{
    public static String noReturn()
    {
        try
        {
            return "Doodoo";
        }
        finally //within a try/catch/finally or try/finally block
                //the return is not performed until whatever is
                //in the finally block has run
        {
            out.print("A delayed return - ");
        }
    }
    public static void main(String[] args)
    {
        out.print("fatty");
        OUTER_LOOP: for (int x = 0;;)
        {
            ++x;
            out.println(" owls");
            INNER_LOOP: for (; ; )
            {
                int y = (12 == 12) ? 0 : 23;
                if (y != 100)
                {
                    out.println("Breaking out!");
                    break OUTER_LOOP; //labels can be used to direct the
                                        //running of code for break and continue functions
                }

            }
        }
        out.println(noReturn());
    }
}
