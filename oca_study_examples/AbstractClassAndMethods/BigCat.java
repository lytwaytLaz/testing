package oca_study_examples.AbstractClassAndMethods;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-27
 */
public abstract class BigCat extends Animal {
    public abstract void roar();

    @Override
    public int getNumLegs()
    {
        return 4;
    }
}