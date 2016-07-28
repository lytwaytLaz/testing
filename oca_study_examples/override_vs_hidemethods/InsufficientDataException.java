package oca_study_examples.override_vs_hidemethods;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-26
 */
public class InsufficientDataException extends Exception {
    public static void main(String[] args) throws InsufficientDataException
    {
        Snake plisken = new Snake();
        System.out.println(plisken.getWeight());
    }
}