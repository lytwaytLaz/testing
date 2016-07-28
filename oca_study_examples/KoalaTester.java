package oca_study_examples;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-07-18
 */


public class KoalaTester {
    public static void main(String[] args) {
        //Example 1
        Koala.main(new String[0]); // call static method

        //Example 2
        Koala k = new Koala();
        System.out.println(k.count); // k is a Koala reference
        k = null;
        System.out.println(k.count); // k is still a Koala reference

        //Example 3
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count);
    }
}
