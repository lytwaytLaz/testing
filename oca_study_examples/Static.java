package oca_study_examples;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-18
 */
public class Static {
    private static String name = "Static class";
    public static void first() { }
    public static void second() { }
    public static void third() { System.out.println(name); }
    public static void main(String args[]) {
        first();
        second();
        third(); // DOES NOT COMPILE
    }
}
