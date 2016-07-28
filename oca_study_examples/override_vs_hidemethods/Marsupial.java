package oca_study_examples.override_vs_hidemethods;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-26
 */
public class Marsupial {
    public static boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}

