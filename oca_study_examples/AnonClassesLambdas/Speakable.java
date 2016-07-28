package oca_study_examples.AnonClassesLambdas;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-23
 */
interface Speakable
{
    void speak();
}
class ACDemo2
{
    public static void main(final String[] args)
    {
        new Speakable()
        {
            String msg = (args.length == 1) ? args[0] : "nothing to say too";
            @Override
            public void speak()
            {
                System.out.println(msg);
            }
        }
                .speak();
    }
}
