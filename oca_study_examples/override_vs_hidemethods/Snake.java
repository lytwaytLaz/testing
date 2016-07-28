package oca_study_examples.override_vs_hidemethods;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-26
 */
class Snake extends Reptile {
    protected boolean hasLegs() {
        return false;
    }
    protected double getWeight() throws InsufficientDataException{
        return 2;
    }
}