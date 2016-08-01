package oca_study_examples.method_overloading_overriding;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-21
 */
public class MethOverload
{
    public static void Balloon(int number)
    {
        System.out.println("int ");
    }
    public static void Balloon()
    {
        System.out.println("null ");
    }
    public static void Balloon(Integer number)
    {
        System.out.println("Integer ");
    }
    public static void Balloon(Integer number, String flingPoop)
    {
        System.out.println("Integer + String ");
    }

    public static void main(String[] args)
    {
        Balloon(8);
        Balloon();
        Balloon(new Integer(9));
        Balloon(new Integer(8), "poop");
    }

}
