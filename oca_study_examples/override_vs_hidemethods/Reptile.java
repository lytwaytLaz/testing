package oca_study_examples.override_vs_hidemethods;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-26
 */
class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }
    protected static double getWeight() throws InsufficientDataException {
        return 6;
    }
}