package oca_study_examples.MyLambda;
import java.util.Comparator;

import static java.lang.String.*;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-25
 */
public class Something
{
    static int x = 10;
    static int y = 20;
    public static void main(String[] args)
    {
//      Different lambda expression
        printing((a, b) -> a + b);
        printing((a, b) -> a - b);
        printing((a, b) -> a * a);

//        Anonymous class
        printing(new Inter() {
            @Override
            public int meth(int x, int y)
            {
                return x + y;
            }
        });

    }
    private static void printing(Inter d)
    {
        System.out.println(d.meth(x, y));
    }
}
