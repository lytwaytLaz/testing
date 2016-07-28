package oca_study_examples;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-21
 */
public class InitializationOrder
{
    private static int COUNT = 0;

    static
    {
        System.out.println(COUNT);
    }

    private String name = "Torchie";

    {
        System.out.println(name);
    }

    {
        COUNT++;
        System.out.println(COUNT);
    }

    public InitializationOrder()
    {
        System.out.println("constructor");
    }

    public static void main(String[] args)
    {
        System.out.println("read to construct");
        new InitializationOrder();
    }
}