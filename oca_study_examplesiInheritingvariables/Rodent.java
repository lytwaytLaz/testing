package oca_study_examplesiInheritingvariables;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-26
 */
public class Rodent {
    protected int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}