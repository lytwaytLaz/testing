package oca_study_examples.method_overloading_overriding;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-28
 */
public class MethOverride
{
    public Object Clown(String name)
    {
        System.out.println("The clown " + name);
        return name;
    }

    public static void main(String[] args)
    {
        MethOverride over = new Meth();
        over.Clown("Trump");

    }
}

class Meth extends MethOverride
{

//    For a method override there are some rules
//    1. Must have same signature (arguments)
//    2. Be at least as accessible as parent
//    3. Must not declare new or broader exceptions
//    4. Must use covariant return types
//        (smae type or subclasses of parent return types)
    @Override
    public String Clown(String name)
    {
        System.out.println("this is child");
        return "Am I funny to you?";
    }
}
