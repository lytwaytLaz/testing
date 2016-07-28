package oca_study_examples.interfaces;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-27
 */
interface CanBurrow // default abstract access modifiers assumed, default could be public
{
    int MIN_DEPTH = 2; // public static final assumed
    int getMaximumDepth(); // public abstract assumed
    default void canJump() // default method must have body and the default modifier
    {
        System.out.println("Hell no!");
    }
    static void canFly() // can't be inherited, accessed without instance of the class using it
    {
        System.out.println("Crash and burn");
    }
}
