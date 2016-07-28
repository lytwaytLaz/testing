package oca_study_examples;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-18
 */

public class Gorilla {
    public static int count;
    public static void addGorilla() { count++; }
    public static void babyGorilla() { count++; }
    public void announceBabies() {
        addGorilla();
        babyGorilla();
         }
    public static void announceBabiesToEveryone() {
        addGorilla();
        babyGorilla(); // DOES NOT COMPILE if babyGorilla method non-static, static can't call non-static
         }
    public static int total;
    public static int average = total / count; // DOES NOT COMPILE if total is non-static static can't call non-static
}
