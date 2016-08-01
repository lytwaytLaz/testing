package oca_study_examples.polymorphism;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-27
 */
public class Rodent {
}
class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara)rodent; // Throws ClassCastException at runtime
    }
}