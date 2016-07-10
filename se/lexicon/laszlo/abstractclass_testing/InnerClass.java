package se.lexicon.laszlo.abstractclass_testing;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-12
 */
abstract class InnerClass
{
    //an abstract class may or may not have an abstract method
    //this is not an abstract method and can't be because it
    //has a method body
    public void innerMethod_1()
    {
        System.out.println("This if from the non abstract " +
                            "innerMethod_1 of the abstract class InnerClass");
    }
    //an abstract inner method (no method body), used by
    // se.lexicon.laszlo1.abstractclass_testing.AnonTest-class
    public abstract void innerMethod_2();
}
