package se.lexicon.laszlo.abstractclass_testing;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-12
 */
public class AnonTest
{
    public static void main(String[] args)
    {
        InnerClass inner = new InnerClass()
        {
            //comment out the below method innerMethod_1 to see what happens
            @Override
            public void innerMethod_1()
            {
                System.out.println("Overriding innerMethod_1 " +
                                    "of abstract class InnerClass");
            }
            @Override
            public void innerMethod_2()
            {
                System.out.println("Overriding innerMethod_2 " +
                                    "of abstract class InnerClass");
            }
        };

        inner.innerMethod_1();
        inner.innerMethod_2();

    }
}
