package oca_study_examples.polymorphism;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-27
 */
public class Primate {
    public boolean hasHair() {
        return true;
    }
}
interface HasTail {
    public boolean isTailStriped();
}
class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());


        Lemur lemur2 = (Lemur) primate;
        System.out.println(lemur2.isTailStriped());


        Primate primate2 = new Primate();
        Lemur lemur3 = (Lemur) primate2; // Throws ClassCastException at runtime
                                        // The object primate2 references is not an instance of Lemur
    }
}