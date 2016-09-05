package oca_study_examples.mylambda;
/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-08-25
 */
public class Something
{
//  interface or abstract class can be either separate or inner
    public interface Inter
    {
        int meth(int x, int y);
    }
    static int x = 10;
    static int y = 20;
    public static void main(String[] args)
    {
//      Different lambda expression
        printing(10, (a, b) -> {a++; System.out.println(a + a + b); return a + b;});
//        printing((a, b) -> a - b);
//        printing((a, b) -> a * a);

//      Anonymous class, same function as the lambdas
        printing(12, new Inter() {
            @Override
            public int meth(int x, int y)
            {
                x += 12;
                return x + y;
            }
        });

    }
    private static void printing(int z, Inter d)
    {
        System.out.println(d.meth(x, y) + z);
    }
}
