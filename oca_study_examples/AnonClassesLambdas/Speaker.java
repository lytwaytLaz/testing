package oca_study_examples.AnonClassesLambdas;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-23
 */
abstract class Speaker extends Exception
{
    abstract void speak();
}
class ACDemo
{
    public static void main(final String[] args)
    {
        new Speaker()
        {
            String msg = (args.length == 1) ? args[0] : "nothing to say";
            @Override
            void speak()
            {
                System.out.println(msg);
            }
        }
                .speak();
    }
}